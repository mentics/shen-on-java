package com.mentics.shenj;

public abstract class Lambda5 extends Lambda4 {
    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3) throws Exception {
        return new Lambda1() {
            @Override
            public Object apply(final Object x4) throws Exception {
                return Lambda5.this.apply(x0, x1, x2, x3, x4);
            }
        };
    }

    @Override
    public abstract Object apply(Object x0, Object x1, Object x2, Object x3, Object x4) throws Exception;
}