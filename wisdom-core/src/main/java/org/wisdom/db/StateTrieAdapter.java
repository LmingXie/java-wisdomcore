package org.wisdom.db;

import lombok.AccessLevel;
import lombok.Getter;
import org.apache.commons.codec.binary.Hex;
import org.tdf.common.serialize.Codec;
import org.tdf.common.store.MemoryCachedStore;
import org.tdf.common.store.NoDeleteStore;
import org.tdf.common.store.Store;
import org.tdf.common.trie.Trie;
import org.tdf.common.trie.TrieImpl;
import org.tdf.common.util.ByteArrayMap;
import org.tdf.rlp.RLPCodec;
import org.tdf.rlp.RLPElement;
import org.wisdom.core.Block;
import org.wisdom.crypto.HashUtil;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;

public abstract class StateTrieAdapter<T> implements StateTrie<T> {
    private String TRIE;
    private String DELETED;
    private String ROOTS;

    @Getter(AccessLevel.PROTECTED)
    private NoDeleteStore<byte[], byte[]> trieStore;

    @Getter(AccessLevel.PROTECTED)
    private Store<byte[], byte[]> rootStore;

    @Getter(AccessLevel.PROTECTED)
    private Trie<byte[], T> trie;

    protected abstract String getPrefix();

    @Getter(AccessLevel.PROTECTED)
    private AbstractStateUpdater<T> updater;

    public StateTrieAdapter(Class<T> clazz, AbstractStateUpdater<T> updater, Block genesis, DatabaseStoreFactory factory, boolean logDeletes, boolean reset) {
        TRIE = getPrefix() + "-trie";
        DELETED = getPrefix() + "-deleted";
        ROOTS = getPrefix() + "-trie-roots";
        this.updater = updater;
        rootStore = factory.create(ROOTS, reset);
        if (logDeletes) {
            trieStore = new NoDeleteStore<>(
                    factory.create(TRIE, reset),
                    factory.create(DELETED, reset)
            );
        } else {
            trieStore = new NoDeleteStore<>(
                    factory.create(TRIE, reset),
                    Store.getNop()
            );
        }
        trie = TrieImpl.newInstance(
                HashUtil::keccak256,
                trieStore,
                Codec.identity(),
                Codec.newInstance(RLPCodec::encode, x -> RLPElement.fromEncoded(x).as(clazz))
        );

        rootStore.put(genesis.hashPrevBlock, trie.getNullHash());
        if (rootStore.containsKey(genesis.getHash())) return;

        // sync to genesis
        Trie<byte[], T> tmp = trie.revert();
        updater.getGenesisStates().forEach(tmp::put);
        byte[] root = tmp.commit();
        tmp.flush();
        rootStore.put(genesis.getHash(), root);
    }

    public Optional<T> get(byte[] blockHash, byte[] publicKeyHash) {
        byte[] root = getRootStore().get(blockHash)
                .orElseThrow(() -> new RuntimeException(Hex.encodeHexString(blockHash) + " not synced"));
        return getTrie().revert(root).get(publicKeyHash);
    }

    public Map<byte[], T> batchGet(byte[] blockHash, Collection<byte[]> keys) {
        byte[] root = getRootStore().get(blockHash)
                .orElseThrow(() -> new RuntimeException(Hex.encodeHexString(blockHash) + " not synced"));
        Trie<byte[], T> trie = getTrie().revert(root);
        ByteArrayMap<T> m = new ByteArrayMap<>();
        keys.forEach(x ->
                m.put(
                        x, trie.get(x).orElse(updater.createEmpty(x))
                )
        );
        return m;
    }

    protected Trie<byte[], T> commitInternal(byte[] parentRoot, byte[] blockHash, Map<byte[], T> data) {
        Store<byte[], byte[]> cache = new MemoryCachedStore<>(getTrieStore());
        Trie<byte[], T> trie = getTrie().revert(parentRoot, cache);
        for (Map.Entry<byte[], T> entry : data.entrySet()) {
            trie.put(entry.getKey(), entry.getValue());
        }
        byte[] newRoot = trie.commit();
        trie.flush();
        getRootStore().put(blockHash, newRoot);
        return trie;
    }
}
