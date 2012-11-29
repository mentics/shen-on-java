package com.mentics.shenj;

public abstract class Lambda3 extends Lambda2 {
    @Override
    public Object apply(final Object x0, final Object x1) throws Exception {
        return new Lambda1() {
            @Override
            public Object apply(final Object x2) throws Exception {
                return Lambda3.this.apply(x0, x1, x2);
            }
        };
    }

    @Override
    public abstract Object apply(Object x0, Object x1, Object x2) throws Exception;
}