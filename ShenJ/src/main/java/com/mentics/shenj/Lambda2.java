package com.mentics.shenj;

public abstract class Lambda2 extends Lambda1 {
    @Override
    public Object apply(final Object x0) throws Exception {
        return new Lambda1() {
            @Override
            public Object apply(final Object x1) throws Exception {
                return Lambda2.this.apply(x0, x1);
            }
        };
    }

    @Override
    public abstract Object apply(Object x0, Object x1) throws Exception;
}