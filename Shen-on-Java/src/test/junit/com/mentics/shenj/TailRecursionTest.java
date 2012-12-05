package com.mentics.shenj;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.inner.Primitives.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TailRecursionTest {
    @BeforeClass
    public static void setUp() {
        loadDefaultImage();
        getCurrentContext().getGlobalProperties().put(SHOW_EVAL, true);
    }

    @Test
    public void testSimplestCase() throws Exception {
        String code = "(define test   0 -> \"done\"     X -> (test (- X 1)))";
        System.out.println(second(shenToJava(code)));
        // assertEquals(symbol("test"), evalShen(code));
        // // Deliberately cause a stack overflow if TCO isn't working for this case
        // assertEquals("done", evalShen("(test 10000)"));
    }

    // cond, and, or, if, and let
    // Start with if, then let, then and/or

    public static Object evalShen(String code) throws Exception {
        return getCurrentContext().apply("shenj.platform.EvalShen", code);
    }

    public static Object[] shenToJava(String code) throws Exception {
        return (Object[]) getCurrentContext().apply("shenj.platform.ShenToJava", code);
    }

    public static Object evalKl(String code) throws Exception {
        Object[] tuple = (Object[]) getCurrentContext().apply("shenj.root.KlToJavaString", code);
        Object[] result = (Object[]) getCurrentContext().apply("shenj.root.ToJavaUnit", first(tuple), second(tuple));
        System.out.println(first(result));
        System.out.println(second(result));
        return doEval(first(result), second(result));
    }

    public static Object first(Object tuple) {
        return ((Object[]) tuple)[1];
    }

    public static Object second(Object tuple) {
        Object[] t0 = (Object[]) tuple;
        if (t0[2].getClass().isArray()) {
            Object[] t1 = (Object[]) t0[2];
            if (t1[0] == symbol("shen-tuple")) {
                return t1[1];
            } else {
                // The second item in the tuple is an array
                return t1;
            }
        } else {
            return ((Object[]) tuple)[2];
        }
    }

    /**
     * NOTE: 4-tuples will not work here!
     */
    public static Object third(Object tuple) {
        Object[] t0 = (Object[]) tuple;
        return ((Object[]) t0[2])[2];
    }
}
