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
        System.out.println(ShenjUtil.second(shenToJava(code)));
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
        Object[] result = (Object[]) getCurrentContext().apply("shenj.root.ToJavaUnit", ShenjUtil.first(tuple), ShenjUtil.second(tuple));
        System.out.println(ShenjUtil.first(result));
        System.out.println(ShenjUtil.second(result));
        return doEval(ShenjUtil.first(result), ShenjUtil.second(result));
    }
}
