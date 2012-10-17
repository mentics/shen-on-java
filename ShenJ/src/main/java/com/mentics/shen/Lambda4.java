package com.mentics.shen;

public abstract class Lambda4 extends Lambda3 {
    public Object apply(final Object x0, final Object x1, final Object x2) throws Exception {
        return new Lambda1() {
            public Object apply(Object x3) throws Exception {
                return Lambda4.this.apply(x0, x1, x2, x3);
            }
        };
    }

    public abstract Object apply(Object x0, Object x1, Object x2, Object x3) throws Exception;
}