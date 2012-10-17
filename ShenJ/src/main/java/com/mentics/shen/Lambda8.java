package com.mentics.shen;

public abstract class Lambda8 extends Lambda7 {
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4,
                        final Object x5, final Object x6) throws Exception {
        return new Lambda1() {
            public Object apply(Object x7) throws Exception {
                return Lambda8.this.apply(x0, x1, x2, x3, x4, x5, x6, x7);
            }
        };
    }

    public abstract Object
            apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5, Object x6, Object x7) throws Exception;
}