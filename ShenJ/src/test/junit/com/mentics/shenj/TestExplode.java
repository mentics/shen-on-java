package com.mentics.shenj;

import static com.mentics.shenj.ShenjRuntime.*;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;

import org.junit.Before;
import org.junit.Test;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.util.StringUtil;


public class TestExplode {
    @Before
    public void setUp() {
    }

    @Test
    public void testKlToJava() throws Exception {
        ShenjRuntime.loadImage(new File("shen-test.image"));
        // ShenjRuntime.evalContext.evalClass("shen.gen.ToEval");
        String content = StringUtil.readFully(new File("java/platform/shen/gen/ToEval.java"));
        Object result = ShenjRuntime.doEval("shen.gen.ToEval", content);
        System.out.println(result);

        // Object result = ShenjRuntime.doEval("Eval", "(+ 2 2)");
        // assertEquals(4, result);
    }

    @Test
    public void testImagePersists() throws Exception {
        String code = "package shen.gen; import com.mentics.shenj.*; public class ToEval {public final static Lambda LAMBDA = new Lambda0() {public Object apply() { return 17; }};}";
        System.out.println(code);
        ShenjRuntime.doEval("shen.gen.ToEval", code);
        try (Output out = new Output(new FileOutputStream("test.image"))) {
            getCurrentContext().saveImage(out);
        }

        ShenjRuntime.loadImage(new File("test.image"));

        // Context.globalProperties.put(symbol("blue"), "blue color");
        //
        // Context.saveImage(new File("test-shen.image"));
        //
        // Context.globalProperties.put(symbol("blue"), "empty");
        // assertEquals("empty", Context.globalProperties.get(symbol("blue")));
        //
        // Context.loadImage(new FileInputStream("test-shen.image"));
        //
        // assertEquals("blue color", Context.globalProperties.get(symbol("blue")));
        // new File("test-shen.image").delete();
    }

    @Test
    public void testNum() {
        assertEquals(
                3,
                Lang.methodParamCount(
                        "asdf\r\ni2293 = new Cons(RuntimeContext.symbol(\"do\"), new Cons(new Cons(RuntimeContext.symbol(\"shen-incinfs\"), null), new Cons(ShenCall_the_continuation.defined(ShenChwild.defined(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head), RuntimeContext.symbol(\"ProcessN\"), RuntimeContext.symbol(\"Continuation\")), null)));\r\n",
                        "ShenCall_the_continuation.defined"));
    }

    @Test
    public void testSomething() throws Exception {
        String code = "package shen.gen;\r\n" + "\r\n" + "\r\n" + "\r\n"
                + "import static com.mentics.shenj.Lang.*;\r\n" + "import static com.mentics.shenj.ShenjRuntime.*;\r\n"
                + "import static com.mentics.shenj.inner.Context.*;\r\n" + "\r\n"
                + "import static com.mentics.shenj.inner.Primitives.*;\r\n" + "\r\n" + "\r\n"
                + "import com.mentics.shenj.*;\r\n" + "import com.mentics.shenj.inner.*;\r\n" + "\r\n"
                + "public class ToEval {\r\n" + "  public static Object run() throws Exception {\r\n"
                + "final Object f1316 = ShenEvalWithoutMacros.LAMBDA.apply();\r\n" + ";\r\n" + "    return f1316;\r\n"
                + "  }\r\n" + "}";
        ShenjRuntime.doEval("shen.gen.ToEval", code);
    }

    @Test
    public void testShenCredits() throws Exception {
        ShenjRuntime.loadImage(new File("shen-test.image"));
        String code = "package shen.gen;\r\n"
                + "\r\n"
                + "\r\n"
                + "\r\n"
                + "import static com.mentics.shenj.Lang.*;\r\n"
                + "import static com.mentics.shenj.ShenjRuntime.*;\r\n"
                + "import static com.mentics.shenj.inner.Context.*;\r\n"
                + "\r\n"
                + "import static com.mentics.shenj.inner.Primitives.*;\r\n"
                + "\r\n"
                + "\r\n"
                + "import com.mentics.shenj.*;\r\n"
                + "import com.mentics.shenj.inner.*;\r\n"
                + "\r\n"
                + "public class ShenCredits {\r\n"
                + "\r\n"
                + "\r\n"
                + "public static final Symbol SYMBOL = symbol(\"shen-credits\");\r\n"
                + "\r\n"
                + "public static final Lambda LAMBDA = new Lambda0() {\r\n"
                + "\r\n"
                + "public Object apply() throws Exception {\r\n"
                + "\r\n"
                + "return defined();\r\n"
                + "\r\n"
                + "}};\r\n"
                + "\r\n"
                + "public static Object defined() throws Exception {\r\n"
                + "final Object f971 = Intoutput.LAMBDA.apply(\"~%Shen 2010, copyright (C) 2010 Mark Tarver~%\", Nil.NIL);\r\n"
                + "\r\n"
                + "final Object f974 = Atp.LAMBDA.apply(globalProperties.get(symbol(\"*version*\")), Nil.NIL);\r\n"
                + "final Object f973 = Intoutput.LAMBDA.apply(\"www.shenlanguage.org, ~A~%\", f974);\r\n"
                + "\r\n"
                + "\r\n"
                + "final Object f978 = Atp.LAMBDA.apply(globalProperties.get(symbol(\"*implementation*\")), Nil.NIL);\r\n"
                + "final Object f977 = Atp.LAMBDA.apply(globalProperties.get(symbol(\"*language*\")), f978);\r\n"
                + "final Object f976 = Intoutput.LAMBDA.apply(\"running under ~A, implementation: ~A\", f977);\r\n"
                + "\r\n" + "\r\n"
                + "final Object f981 = Atp.LAMBDA.apply(globalProperties.get(symbol(\"*porters*\")), Nil.NIL);\r\n"
                + "final Object f980 = Atp.LAMBDA.apply(globalProperties.get(symbol(\"*port*\")), f981);\r\n"
                + "final Object f979 = Intoutput.LAMBDA.apply(\"~%port ~A ported by ~A~%\", f980);\r\n"
                + "final Object f975 = Do.LAMBDA.apply(f976, f979);\r\n"
                + "final Object f972 = Do.LAMBDA.apply(f973, f975);\r\n"
                + "final Object f970 = Do.LAMBDA.apply(f971, f972);\r\n" + "\r\n" + "    return f970;\r\n" + "\r\n"
                + "}\r\n" + "}";
        Object o = ShenjRuntime.doEval("shen.gen.ShenCredits", code);
        System.out.println(o);
    }
}
