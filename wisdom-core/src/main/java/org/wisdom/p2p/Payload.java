package org.wisdom.p2p;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.InvalidProtocolBufferException;

public class Payload {
    private long createdAt;
    private WisdomOuterClass.Code code;
    private Peer remote;
    private long ttl;
    private long nonce;
    private byte[] signature;

    private AbstractMessage body;

    private WisdomOuterClass.Message message;

    public WisdomOuterClass.Message getMessage() {
        return message;
    }

    public Payload(WisdomOuterClass.Message msg) throws Exception {
        createdAt = msg.getCreatedAt().getSeconds();
        code = msg.getCode();
        remote = Peer.parse(msg.getRemotePeer());
        ttl = msg.getTtl();
        nonce = msg.getNonce();
        signature = msg.getSignature().toByteArray();
        message = msg;
        parseBody();
    }

    public AbstractMessage getBody() {
        return body;
    }

    private void parseBody() throws InvalidProtocolBufferException {
        if (body != null) {
            return;
        }
        switch (code) {
            case PING:
                body = WisdomOuterClass.Ping.parseFrom(message.getBody());
                return;
            case PONG:
                body = WisdomOuterClass.Pong.parseFrom(message.getBody());
                return;
            case LOOK_UP:
                body = WisdomOuterClass.Lookup.parseFrom(message.getBody());
                return;
            case PEERS:
                body = WisdomOuterClass.Peers.parseFrom(message.getBody());
                return;
            case GET_STATUS:
                body = WisdomOuterClass.GetStatus.parseFrom(message.getBody());
                return;
            case STATUS:
                body = WisdomOuterClass.Status.parseFrom(message.getBody());
                return;
            case GET_BLOCKS:
                body = WisdomOuterClass.GetBlocks.parseFrom(message.getBody());
                return;
            case BLOCKS:
                body = WisdomOuterClass.Blocks.parseFrom(message.getBody());
                return;
            case PROPOSAL:
                body = WisdomOuterClass.Proposal.parseFrom(message.getBody());
                return;
            case TRANSACTIONS:
                body = WisdomOuterClass.Transactions.parseFrom(message.getBody());
                return;
            case GET_TREE_NODES:
                body = WisdomOuterClass.GetTreeNodes.parseFrom(message.getBody());
                return;
            case TREE_NODES:
                body = WisdomOuterClass.TreeNodes.parseFrom(message.getBody());
                return;
            case GET_MERKELE_TRANSACTIONS:
                body = WisdomOuterClass.GetMerkleTransactions.parseFrom(message.getBody());
                return;
            case MERKLE_TRANSACTIONS:
                body = WisdomOuterClass.MerkleTransactions.parseFrom(message.getBody());
                return;
            default:
                body = WisdomOuterClass.Nothing.newBuilder().build();
        }
    }

    public WisdomOuterClass.Ping getPing() {
        return (WisdomOuterClass.Ping) body;
    }

    public WisdomOuterClass.Pong getPong() {
        return (WisdomOuterClass.Pong) body;
    }

    public WisdomOuterClass.Lookup getLookup() {
        return (WisdomOuterClass.Lookup) body;
    }

    public WisdomOuterClass.Peers getPeers() {
        return (WisdomOuterClass.Peers) body;
    }

    public WisdomOuterClass.GetStatus getGetStatus() {
        return (WisdomOuterClass.GetStatus) body;
    }

    public WisdomOuterClass.Status getStatus() {
        return (WisdomOuterClass.Status) body;
    }

    public WisdomOuterClass.GetBlocks getGetBlocks() {
        return (WisdomOuterClass.GetBlocks) body;
    }

    public WisdomOuterClass.Blocks getBlocks() {
        return (WisdomOuterClass.Blocks) body;
    }

    public WisdomOuterClass.Proposal getProposal() {
        return (WisdomOuterClass.Proposal) body;
    }

    public WisdomOuterClass.Transaction getTransaction() {
        return (WisdomOuterClass.Transaction) body;
    }

    public WisdomOuterClass.TreeNodes getTreeNodes() {
        return (WisdomOuterClass.TreeNodes) body;
    }

    public WisdomOuterClass.GetTreeNodes getGetTreeNodes() {
        return (WisdomOuterClass.GetTreeNodes) body;
    }

    public WisdomOuterClass.GetMerkleTransactions getGetMerkleTransactions() {
        return (WisdomOuterClass.GetMerkleTransactions) body;
    }

    public WisdomOuterClass.MerkleTransactions getMerkleTransactions() {
        return (WisdomOuterClass.MerkleTransactions) body;
    }


    public Peer getRemote() {
        return remote;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public WisdomOuterClass.Code getCode() {
        return code;
    }

    public long getTtl() {
        return ttl;
    }

    public long getNonce() {
        return nonce;
    }

    public byte[] getSignature() {
        return signature;
    }
}
