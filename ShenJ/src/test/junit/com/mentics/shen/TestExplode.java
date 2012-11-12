package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Before;
import org.junit.Test;


public class TestExplode {
    @Before
    public void setUp() {
        RuntimeContext.loadDefaultImage();
    }

    @Test
    public void testKlToJava() throws Exception {
        Object result = RuntimeContext.doEval("Eval", "(+ 2 2)");
        assertEquals(4, result);
    }

    @Test
    public void testImagePersists() throws Exception {
        globalProperties.put(symbol("blue"), "blue color");

        RuntimeContext.saveImage(new File("test-shen.image"));

        globalProperties.put(symbol("blue"), "empty");
        assertEquals("empty", globalProperties.get(symbol("blue")));

        FileInputStream in = new FileInputStream("test-shen.image");
        RuntimeContext.loadImage(in);
        in.close();

        assertEquals("blue color", globalProperties.get(symbol("blue")));
        new File("test-shen.image").delete();
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
        String code = "package shen.gen;\r\n" + "\r\n" + "\r\n" + "\r\n" + "import com.mentics.shen.*;\r\n" + "\r\n"
                + "public class Eval {\r\n" + "\r\n" + "\r\n"
                + "public static final Symbol SYMBOL = RuntimeContext.symbol(\"eval\");\r\n" + "\r\n"
                + "public static final Lambda LAMBDA = new Lambda1() {\r\n" + "\r\n"
                + "public Object apply(final Object v651) throws Exception {\r\n" + "\r\n"
                + "return defined(v651);\r\n" + "\r\n" + "}};\r\n" + "\r\n"
                + "public static Object defined(final Object v651) throws Exception {\r\n"
                + "final Lambda l2085 = new Lambda1() {\r\n"
                + "  public Object apply(final Object v652) throws Exception {\r\n"
                + "    final Object f2084 = Macroexpand.LAMBDA.apply(v652);\r\n" + "\r\n" + "    return f2084;\r\n"
                + "  }\r\n" + "};\r\n" + "final Object f2086 = ShenWalk.LAMBDA.apply(l2085, v651);\r\n" + "\r\n"
                + "final Object macroexpand2083 = f2086;\r\n"
                + "final Object f2087 = ShenPackagedQ.LAMBDA.apply(macroexpand2083);\r\n" + "\r\n"
                + "final Object i2093;\r\n" + "if ((boolean)f2087) {\r\n" + "final Lambda l2089 = new Lambda1() {\r\n"
                + "  public Object apply(final Object v653) throws Exception {\r\n"
                + "    final Object f2088 = ShenEvalWithoutMacros.LAMBDA.apply(v653);\r\n" + "\r\n"
                + "    return f2088;\r\n" + "  }\r\n"
                + "};final Object f2090 = ShenPackageContents.LAMBDA.apply(macroexpand2083);\r\n"
                + "final Object f2091 = Map.LAMBDA.apply(l2089, f2090);\r\n" + "\r\n" + "i2093 = f2091;\r\n"
                + "} else {\r\n" + "final Object f2092 = ShenEvalWithoutMacros.LAMBDA.apply(macroexpand2083);\r\n"
                + "\r\n" + "i2093 = f2092;\r\n" + "\r\n" + "}\r\n" + "\r\n" + "    return i2093;\r\n" + "\r\n"
                + "}\r\n" + "}\r\n" + "";
        RuntimeContext.doEval("Eval", code);
    }
}
