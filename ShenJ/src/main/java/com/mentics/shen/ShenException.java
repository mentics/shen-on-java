package com.mentics.shen;

public class ShenException extends RuntimeException {
    public ShenException(String msg) {
        super(msg);
    }

    public ShenException(Exception e) {
        super(e);
    }

    public static void rethrow(Exception e) {
        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        } else {
            throw new ShenException(e);
        }
    }
}
