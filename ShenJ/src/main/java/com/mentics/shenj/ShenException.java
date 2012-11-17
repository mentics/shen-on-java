package com.mentics.shenj;

public class ShenException extends RuntimeException {
    private static final long serialVersionUID = -7114753468075079810L;

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
            if (e.getCause() instanceof ShenException) {
                throw (ShenException)e.getCause();
            } else {
                throw new ShenException(e.getCause());
            }
        } else {
            throw new ShenException(e);
        }
    }
}
