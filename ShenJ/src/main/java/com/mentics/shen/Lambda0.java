package com.mentics.shen;

import java.lang.reflect.InvocationTargetException;
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
            } catch (Exception e) {
                throw new Error(e);
            }
        }
    }


//    public static Object callLambda(Lambda lam, Object[] args) {
//        try {
//            return LAMBDA_METHODS[args.length].invoke(lam, args);
//        } catch (InvocationTargetException ite) {
//            Throwable realE = ite.getCause();
//            if (realE instanceof RuntimeException) {
//                throw (RuntimeException) realE;
//            } else {
//                throw new ShenException(ultimateCause(realE), Context.copyThreadTrace());
//            }
//        } catch (Exception e) {
//            if (e instanceof RuntimeException) {
//                throw (RuntimeException) e;
//            } else {
//                throw new RuntimeException(ultimateCause(e));
//            }
//        }
//    }

//    public static Throwable ultimateCause(Throwable t) {
//        if (t.getCause() != null) {
//            return ultimateCause(t.getCause());
//        } else {
//            return t;
//        }
//    }


    // Public Methods //

    public Object apply() throws Exception {
        return this;
    }

    public Object apply(Object x0) throws Exception {
        return ((Lambda0) apply()).apply(x0);
    }

    public Object apply(Object x0, Object x1) throws Exception {
        return ((Lambda0) apply(x0)).apply(x1);
    }

    public Object apply(Object x0, Object x1, Object x2) throws Exception {
        return ((Lambda0) apply(x0, x1)).apply(x2);
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3) throws Exception {
        return ((Lambda0) apply(x0, x1, x2)).apply(x3);
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3)).apply(x4);
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3, x4)).apply(x5);
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5, Object x6) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3, x4, x5)).apply(x6);
    }

    public Object apply(Object x0, Object x1, Object x2, Object x3, Object x4, Object x5, Object x6, Object x7) throws Exception {
        return ((Lambda0) apply(x0, x1, x2, x3, x4, x5, x6)).apply(x7);
    }
}