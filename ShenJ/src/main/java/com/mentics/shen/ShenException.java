package com.mentics.shen;

public class ShenException extends RuntimeException {
    public ShenException(String msg) {
        super(msg);
    }

    public ShenException(Throwable e) {
        super(e);
    }

    public static void rethrow(Exception e) {
        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        } else if (e instanceof ShenException) {
            throw (ShenException)e;
        } else if (e.getCause() != null) {
            throw new ShenException(e.getCause());
        } else {
            throw new ShenException(e);
        }
    }
}
