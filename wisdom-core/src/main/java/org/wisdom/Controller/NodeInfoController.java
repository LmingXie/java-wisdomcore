package org.wisdom.Controller;

import org.apache.commons.codec.binary.Hex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wisdom.ApiResult.APIResult;
import org.wisdom.consensus.pow.ProposersState;
import org.wisdom.core.Block;
import org.wisdom.core.account.Transaction;
import org.wisdom.db.AccountState;
import org.wisdom.db.StateDB;
import org.wisdom.encoding.JSONEncodeDecoder;
import org.wisdom.p2p.Peer;
import org.wisdom.p2p.PeersManager;
import org.wisdom.util.Address;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NodeInfoController {
    @Autowired
    private PeersManager peersManager;

    @Value("${wisdom.version}")
    private String version;

    @Value("${node-character}")
    private String character;

    @Value("${p2p.mode}")
    private String p2pMode;

    @Value("${p2p.enable-discovery}")
    private boolean enableDiscovery;

    @Value("${p2p.max-blocks-per-transfer}")
    private int maxBlocksPerTransfer;

    @Value("${wisdom.consensus.allow-fork}")
    private boolean allowFork;

    @Autowired
    private StateDB stateDB;

    @Autowired
    private JSONEncodeDecoder encodeDecoder;

    @Value("${wisdom.consensus.blocks-per-era}") int blocksPerEra;

    @Value("${wisdom.allow-miner-joins-era}") int allowMinersJoinEra;

    @GetMapping(value = {"/version", "/"}, produces = "application/json")
    public Object getVersion() {
        Map<String, Object> info = new HashMap<>();
        info.put("version", this.version);
        info.put("character", character);
        return APIResult.newFailResult(2000, "SUCCESS", info);
    }

    @GetMapping(value = "/peers/status", produces = "application/json")
    public Object getP2P() {
        Map<String, Object> info = new HashMap<>();
        info.put("peers", peersManager.getPeers().stream().map(Peer::toString).toArray());
        info.put("self", peersManager.getSelfAddress());
        info.put("p2pMode", p2pMode);
        info.put("enableDiscovery", enableDiscovery);
        info.put("maxBlocksPerTransfer", maxBlocksPerTransfer);
        info.put("allowFork", allowFork);
        return APIResult.newFailResult(2000, "SUCCESS", info);
    }

    @GetMapping(value = "/blocks/unconfirmed", produces = "application/json")
    public Object getNotConfirmed() {
        return encodeDecoder.encodeBlocks(stateDB.getAll());
    }

    @GetMapping(value = "/proposers", produces = "application/json")
    public Object getProposers() {
        Block best = stateDB.getBestBlock();
        Map<String, Object> res = new HashMap<>();
        res.put("proposers", stateDB.getProposersFactory().getProposers(best));
        res.put("height", best.nHeight);
        if (allowMinersJoinEra > 0){
            res.put("enableMinerJoins", true);
            res.put("minerJoinsHeight", allowMinersJoinEra * blocksPerEra + 1);
        }else{
            res.put("enableMinerJoins", false);
        }
        ProposersState proposersState = (ProposersState) stateDB.getProposersFactory().getInstance(best);
        res.put("blockList", proposersState.getBlockList());
        res.put("votes", proposersState.getCandidates());
        return res;
    }

    @GetMapping(value = "/account/{account}", produces = "application/json")
    public Object getVotes(@PathVariable("account") String account) {
        Block best = stateDB.getBestBlock();
        byte[] publicKeyHash = null;
        try{
            publicKeyHash = Hex.decodeHex(account);
            if (publicKeyHash.length == Transaction.PUBLIC_KEY_SIZE){
                publicKeyHash = Address.publicKeyToHash(publicKeyHash);
            }
        }catch (Exception e){
            publicKeyHash = Address.addressToPublicKeyHash(account);
        }
        if (publicKeyHash == null){
            return "invalid account";
        }
        AccountState state = stateDB.getAccount(best.getHash(), publicKeyHash);
        return encodeDecoder.encode(state.getAccount());
    }
}
