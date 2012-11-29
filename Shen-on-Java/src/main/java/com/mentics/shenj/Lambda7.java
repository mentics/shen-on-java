package com.mentics.shenj;

public abstract class Lambda7 extends Lambda6 {
    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4,
            final Object x5) throws Exception {
        return new Lambda1() {
            @Override
            public Object apply(final Object x6) throws Exception {
                return Lambda7.this.apply(x0, x1, x2, x3, x4, x5, x6);
            }
        };
    }

    @Override
    public abstract Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5, Object x6)
            throws Exception;
}