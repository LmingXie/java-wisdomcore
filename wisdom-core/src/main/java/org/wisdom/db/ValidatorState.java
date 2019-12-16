package org.wisdom.db;

import org.tdf.rlp.RLP;
import org.tdf.rlp.RLPDecoding;
import org.wisdom.util.ByteArrayMap;

import java.util.Map;
import java.util.Objects;

public class ValidatorState {

    @RLP(0)
    @RLPDecoding(as = ByteArrayMap.class)
    private Map<byte[], Long> nonce;

    public Map<byte[], Long> getNonce() {
        return nonce;
    }

    public void setNonce(ByteArrayMap<Long> nonce) {
        this.nonce = nonce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidatorState that = (ValidatorState) o;
        return Objects.equals(nonce, that.nonce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nonce);
    }

    public ValidatorState copy() {
        ValidatorState state = new ValidatorState();
        state.nonce = this.nonce;
        return state;
    }

}
