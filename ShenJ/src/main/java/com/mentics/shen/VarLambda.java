package com.mentics.shen;

public abstract class VarLambda implements Lambda {
    public abstract Object apply(Object[] args) throws Exception;

    public Object apply() throws Exception {
        return apply(new Object[] {});
    }

    public Object apply(Object x0) throws Exception {
        return apply(new Object[] { x0 });
    }

    public Object apply(Object x0, Object x1) throws Exception {
        return apply(new Object[] { x0, x1 });
    }

    public Object apply(Object x0, Object x1, Object x2) throws Exception {
        return apply(new Object[] { x0, x1, x2 });
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3) throws Exception {
        return apply(new Object[] { x0, x1, x2, x3 });
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4) throws Exception {
        return apply(new Object[] { x0, x1, x2, x3, x4 });
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5) throws Exception {
        return apply(new Object[] { x0, x1, x2, x3, x4, x5 });
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5, Object x6) throws Exception {
        return apply(new Object[] { x0, x1, x2, x3, x4, x5, x6 });
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5, Object x6, Object x7)
            throws Exception {
        return apply(new Object[] { x0, x1, x2, x3, x4, x5, x6, x7 });
    }
}
