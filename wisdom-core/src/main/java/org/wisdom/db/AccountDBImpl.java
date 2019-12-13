package org.wisdom.db;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Component;
import org.tdf.rlp.RLPCodec;
import org.wisdom.core.Block;
import org.wisdom.core.WisdomBlockChain;
import org.wisdom.crypto.HashUtil;
import org.wisdom.store.NoDeleteByteArrayStore;
import org.wisdom.store.NoDeleteStore;
import org.wisdom.store.Store;
import org.wisdom.util.ByteArrayMap;
import org.wisdom.util.trie.*;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;

@Component
public class AccountDBImpl implements AccountDB {
    private static final String TRIE = "trie";

    private static final String DELETED = "deleted";

    private static final String STATE_ROOTS = "state-roots";

    private static final String DB_STATUS = "status";

    private static final byte[] LAST_SYNCED_HEIGHT = "last-confirmed".getBytes(StandardCharsets.US_ASCII);

    private Store<byte[], byte[]> statusStore;

    // block hash -> state root
    private Store<byte[], byte[]> rootStore;

    // removed key in trie store -> dummy
    private Store<byte[], byte[]> deleted;

    // trie store
    private Store<byte[], byte[]> trieStore;

    private NoDeleteStore<byte[], byte[]> noDeleteStore;

    private byte[] nullHash;

    // trie to revert
    private Trie<byte[], AccountState> stateTrie;

    private WisdomBlockChain bc;

    public AccountDBImpl(
            DatabaseStoreFactory factory,
            Block genesis,
            WisdomBlockChain bc
    ){
        trieStore = factory.create(TRIE, false);
        deleted = factory.create(DELETED, false);
        rootStore = factory.create(STATE_ROOTS, false);
        noDeleteStore = new NoDeleteByteArrayStore(trieStore, deleted);
        statusStore = factory.create(DB_STATUS, false);

        stateTrie = TrieImpl.newInstance(
                HashUtil::keccak256,
                noDeleteStore,
                Codec.identity(),
                Codec.newInstance(RLPCodec::encode, (x) -> RLPCodec.decode(x, AccountState.class))
        );

        nullHash = stateTrie.getRootHash();
        // put parent hash of genesis map to null hash
        rootStore.putIfAbsent(genesis.hashPrevBlock, nullHash);
    }

    // sync state trie to best block
    private void sync(){
        long lastSynced = statusStore.get(LAST_SYNCED_HEIGHT)
                .map(bc::getBlock).map(Block::getnHeight).orElse(0L);

    }

    @Override
    public Optional<AccountState> getAccount(byte[] blockHash, byte[] publicKeyHash) {
        byte[] root = rootStore.get(blockHash)
                .orElseThrow(() -> new RuntimeException(Hex.encodeHexString(blockHash) + " not synced"));
        Trie<byte[], AccountState> trie = stateTrie.revert(root, noDeleteStore);
        return trie.get(publicKeyHash);
    }

    @Override
    public Map<byte[], AccountState> getAccounts(byte[] blockHash, Collection<byte[]> publicKeyHashes) {
        byte[] root = rootStore.get(blockHash)
                .orElseThrow(() -> new RuntimeException(Hex.encodeHexString(blockHash) + " not synced"));
        Trie<byte[], AccountState> trie = stateTrie.revert(root, noDeleteStore);
        ByteArrayMap<AccountState> m = new ByteArrayMap<>();
        publicKeyHashes.forEach(x -> {
            Optional<AccountState> account = trie.get(x);
            if (!account.isPresent()) return;
            m.put(x, account.get());
        });
        return m;
    }

    @Override
    public byte[] putAccounts(
            // parent hash
            byte[] parentHash,
            byte[] blockHash,
            // updated account
            Collection<AccountState> accounts
    ) {
        if (rootStore.containsKey(blockHash))
            throw new RuntimeException(Hex.encodeHexString(blockHash) + " has exists");
        byte[] root = rootStore.get(parentHash)
                .orElseThrow(() -> new RuntimeException(Hex.encodeHexString(parentHash) + " not exists"));
        Trie<byte[], AccountState> trie = stateTrie.revert(root, noDeleteStore);
        for (AccountState state : accounts) {
            trie.put(state.getAccount().getPubkeyHash(), state);
        }
        byte[] newRoot = trie.commit();
        trie.flush();
        rootStore.put(blockHash, newRoot);
        return newRoot;
    }
}