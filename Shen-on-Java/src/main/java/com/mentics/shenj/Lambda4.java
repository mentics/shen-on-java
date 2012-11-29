package com.mentics.shenj;

public abstract class Lambda4 extends Lambda3 {
    @Override
    public Object apply(final Object x0, final Object x1, final Object x2) throws Exception {
        return new Lambda1() {
            @Override
            public Object apply(final Object x3) throws Exception {
                return Lambda4.this.apply(x0, x1, x2, x3);
            }
        };
    }

    @Override
    public abstract Object apply(Object x0, Object x1, Object x2, Object x3) throws Exception;
}