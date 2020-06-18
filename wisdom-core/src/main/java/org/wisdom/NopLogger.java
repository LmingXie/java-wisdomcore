package org.wisdom;

import io.netty.util.internal.logging.InternalLogLevel;
import io.netty.util.internal.logging.InternalLogger;
import org.tdf.common.util.HexBytes;
import org.wisdom.crypto.ed25519.Ed25519;
import org.wisdom.crypto.ed25519.Ed25519PrivateKey;

class NopLogger implements InternalLogger {
    @Override
    public String name() {
        return null;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public void trace(String msg) {

    }

    @Override
    public void trace(String format, Object arg) {

    }

    @Override
    public void trace(String format, Object argA, Object argB) {

    }

    @Override
    public void trace(String format, Object... arguments) {

    }

    @Override
    public void trace(String msg, Throwable t) {

    }

    @Override
    public void trace(Throwable t) {

    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public void debug(String msg) {

    }

    @Override
    public void debug(String format, Object arg) {

    }

    @Override
    public void debug(String format, Object argA, Object argB) {

    }

    @Override
    public void debug(String format, Object... arguments) {

    }

    @Override
    public void debug(String msg, Throwable t) {

    }

    @Override
    public void debug(Throwable t) {

    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public void info(String msg) {

    }

    @Override
    public void info(String format, Object arg) {

    }

    @Override
    public void info(String format, Object argA, Object argB) {

    }

    @Override
    public void info(String format, Object... arguments) {

    }

    @Override
    public void info(String msg, Throwable t) {

    }

    @Override
    public void info(Throwable t) {

    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public void warn(String msg) {

    }

    @Override
    public void warn(String format, Object arg) {

    }

    @Override
    public void warn(String format, Object... arguments) {

    }

    @Override
    public void warn(String format, Object argA, Object argB) {

    }

    @Override
    public void warn(String msg, Throwable t) {

    }

    @Override
    public void warn(Throwable t) {

    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public void error(String msg) {

    }

    @Override
    public void error(String format, Object arg) {

    }

    @Override
    public void error(String format, Object argA, Object argB) {

    }

    @Override
    public void error(String format, Object... arguments) {

    }

    @Override
    public void error(String msg, Throwable t) {

    }

    @Override
    public void error(Throwable t) {

    }

    @Override
    public boolean isEnabled(InternalLogLevel level) {
        return false;
    }

    @Override
    public void log(InternalLogLevel level, String msg) {

    }

    @Override
    public void log(InternalLogLevel level, String format, Object arg) {

    }

    @Override
    public void log(InternalLogLevel level, String format, Object argA, Object argB) {

    }

    @Override
    public void log(InternalLogLevel level, String format, Object... arguments) {

    }

    @Override
    public void log(InternalLogLevel level, String msg, Throwable t) {

    }

    @Override
    public void log(InternalLogLevel level, Throwable t) {

    }

    public static void main(String[] args) {
        byte[] sk = HexBytes.decode("0eb1611befd95a27585c683c0ae0c69a38ea75c3229589b6d222071a15b22d45");
        Ed25519PrivateKey privateKey = new Ed25519PrivateKey(sk);
        System.out.print(HexBytes.fromBytes(privateKey.sign("123".getBytes())));
    }
}
