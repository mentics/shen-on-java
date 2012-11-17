package com.mentics.shenj;

public class SimpleError extends RuntimeException {
    private static final long serialVersionUID = -8519353544055886715L;

    public SimpleError(String msg) {
        super(msg);
    }
}
