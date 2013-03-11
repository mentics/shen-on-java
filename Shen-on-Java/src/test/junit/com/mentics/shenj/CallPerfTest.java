package com.mentics.shenj;

import static com.mentics.shenj.ShenjRuntime.*;

import org.junit.Before;
import org.junit.Test;


public class CallPerfTest {
    static final int NUM = 1000000;
    static final int RERUN = 100;


    @Before
    public void setUp() throws Exception {
//        System.gc();
        ShenjTest.LAMBDA2 = ShenjTest.LAMBDA;
        ShenjTest.LAMBDA2.apply(false);
    }

    @Test
    public void testStaticMethodCall() throws Exception {
        boolean result = false;
        result = toTimeStaticMethod(result);
        long t0 = System.nanoTime();
        result = toTimeStaticMethod(result);
        long t1 = System.nanoTime();
        System.out.println("result static method: " + result + ", " + (t1 - t0));
    }

    @Test
    public void testStaticFinalLambda() throws Exception {
        boolean result = false;
        result = toTimeStaticFinalLambda(result);
        long t0 = System.nanoTime();
        result = toTimeStaticFinalLambda(result);
        long t1 = System.nanoTime();
        System.out.println("result static final lambda: " + result + ", " + (t1 - t0));
    }

    @Test
    public void testStaticLambda() throws Exception {
        boolean result = false;
        result = toTimeStaticLambda(result);
        long t0 = System.nanoTime();
        result = toTimeStaticLambda(result);
        long t1 = System.nanoTime();
        System.out.println("result static lambda: " + result + ", " + (t1 - t0));
    }

    @Test
    public void testStaticLambdaChangedOnce() throws Exception {
        boolean result = false;
        result = setIt(1);
        result = toTimeStaticLambda2(result);

        long t0 = System.nanoTime();
        result = toTimeStaticLambda2(result);
        long t1 = System.nanoTime();
        System.out.println("result static lambda changed once: " + result + ", " + (t1 - t0));
    }

    @Test
    public void testStaticLambdaChangedTwice() throws Exception {
        boolean result = false;
        result = setIt(1);
        result = setIt(2);
        result = toTimeStaticLambda2(result);

        long t0 = System.nanoTime();
        result = toTimeStaticLambda2(result);
        long t1 = System.nanoTime();
        System.out.println("result static lambda changed twice: " + result + ", " + (t1 - t0));
    }

    @Test
    public void testStaticLambdaChangedThrice() throws Exception {
        boolean result = false;
        result = setIt(1);
        result = setIt(2);
        result = setIt(1);
        result = toTimeStaticLambda2(result);

        long t0 = System.nanoTime();
        result = toTimeStaticLambda2(result);
        long t1 = System.nanoTime();
        System.out.println("result static lambda changed thrice: " + result + ", " + (t1 - t0));
    }

    @Test
    public void testStaticLambdaChangedFourTimes() throws Exception {
        boolean result = false;
        result = setIt(1);
        result = setIt(2);
        result = setIt(3);
        result = setIt(2);

        result = toTimeStaticLambda2(result);

        long t0 = System.nanoTime();
        result = toTimeStaticLambda2(result);
        long t1 = System.nanoTime();
        System.out.println("result static lambda changed four: " + result + ", " + (t1 - t0));
    }


    public boolean setIt(final Integer value) throws Exception {
        ShenjTest.LAMBDA2 = new Lambda2() {
            @Override
            public Object apply(Object x0, Object x1) throws Exception {
                return x0.equals(value);
//                return ShenjTest.defined(value);
            }
        };
        return (boolean) ShenjTest.LAMBDA2.apply(value, value);
    }


    private boolean toTimeStaticMethod(boolean result) throws Exception {
        for (int rerun = 0; rerun < RERUN; rerun++) {
            for (int num = 0; num < NUM; num++) {
                result &= (boolean) ShenjTest.defined("blue");
            }
        }
        return result;
    }

    private boolean toTimeStaticFinalLambda(boolean result) throws Exception {
        for (int rerun = 0; rerun < RERUN; rerun++) {
            for (int num = 0; num < NUM; num++) {
                result &= (boolean) ShenjTest.LAMBDA.apply("blue");
            }
        }
        return result;
    }

    private boolean toTimeStaticLambda(boolean result) throws Exception {
        for (int rerun = 0; rerun < RERUN; rerun++) {
            for (int num = 0; num < NUM; num++) {
                result &= (boolean) ShenjTest.LAMBDA2.apply("blue");
            }
        }
        return result;
    }

    private boolean toTimeStaticLambda2(boolean result) throws Exception {
        for (int rerun = 0; rerun < RERUN; rerun++) {
            for (int num = 0; num < NUM; num++) {
                result &= (boolean) ShenjTest.LAMBDA2.apply("blue", "blue");
            }
        }
        return result;
    }

    public Object staticMethod(Object param) {
        return param.equals(param);
    }
}


class ShenjTest {
    public static final Symbol SYMBOL = symbol("shenj-test");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object arg) throws Exception {
            return defined(arg);
        }
    };

    public static Lambda LAMBDA2 = new Lambda1() {
        public Object apply(Object arg) throws Exception {
            return defined(arg);
        }
    };


    public static Object defined(Object arg) throws Exception {
        return arg.equals(2);
    }

}
