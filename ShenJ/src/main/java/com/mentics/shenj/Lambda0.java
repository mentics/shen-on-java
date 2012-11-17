package com.mentics.shenj;

import java.lang.reflect.Method;


public abstract class Lambda0 implements Lambda {
    private static final int SUPPORTED_LAMBDA_ARITY = 8;

    private static Class<?>[][] LAMBDA_PARAM_TYPES = new Class<?>[SUPPORTED_LAMBDA_ARITY][];

    private static final String LAMBDA_METHOD_NAME = "apply";

    public static final Lambda NOOP = new Lambda0() {
    };

    public static Method[] LAMBDA_METHODS = new Method[SUPPORTED_LAMBDA_ARITY];

    static {
        for (int i = 0; i < SUPPORTED_LAMBDA_ARITY; i++) {
            LAMBDA_PARAM_TYPES[i] = new Class[i];
            for (int j = 0; j < i; j++) {
                LAMBDA_PARAM_TYPES[i][j] = Object.class;
            }
            try {
                LAMBDA_METHODS[i] = Lambda.class.getMethod(LAMBDA_METHOD_NAME, LAMBDA_PARAM_TYPES[i]);
            } catch (final Exception e) {
                throw new Error(e);
            }
        }
    }


    // public static Object callLambda(Lambda lam, Object[] args) {
    // try {
    // return LAMBDA_METHODS[args.length].invoke(lam, args);
    // } catch (InvocationTargetException ite) {
    // Throwable realE = ite.getCause();
    // if (realE instanceof RuntimeException) {
    // throw (RuntimeException) realE;
    // } else {
    // throw new ShenException(ultimateCause(realE), Context.copyThreadTrace());
    // }
    // } catch (Exception e) {
    // if (e instanceof RuntimeException) {
    // throw (RuntimeException) e;
    // } else {
    // throw new RuntimeException(ultimateCause(e));
    // }
    // }
    // }

    // public static Throwable ultimateCause(Throwable t) {
    // if (t.getCause() != null) {
    // return ultimateCause(t.getCause());
    // } else {
    // return t;
    // }
    // }


    // Public Methods //

    @Override
    public Object apply() throws Exception {
        return this;
    }

    @Override
    public Object apply(final Object x0) throws Exception {
        return ((Lambda0) apply()).apply(x0);
    }

    @Override
    public Object apply(final Object x0, final Object x1) throws Exception {
        return ((Lambda0) apply(x0)).apply(x1);
    }

    @Override
    public Object apply(final Object x0, final Object x1, final Object x2) throws Exception {
        return ((Lambda0) apply(x0, x1)).apply(x2);
    }

    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3) throws Exception {
        return ((Lambda0) apply(x0, x1, x2)).apply(x3);
    }

    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4)
            throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3)).apply(x4);
    }

    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4,
            final Object x5) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3, x4)).apply(x5);
    }

    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4,
            final Object x5, final Object x6) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3, x4, x5)).apply(x6);
    }

    @Override
    public Object apply(final Object x0, final Object x1, final Object x2, final Object x3, final Object x4,
            final Object x5, final Object x6, final Object x7) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3, x4, x5, x6)).apply(x7);
    }
}