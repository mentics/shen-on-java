package com.mentics.shenj;

public abstract class Lambda6 extends Lambda5 {
    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4)
            throws Exception {
        return new Lambda1() {
            @Override
            public Object apply(final Object x5) throws Exception {
                return Lambda6.this.apply(x0, x1, x2, x3, x4, x5);
            }
        };
    }

    @Override
    public abstract Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5) throws Exception;
}