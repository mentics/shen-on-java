package com.mentics.shenj;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;

import org.junit.Before;
import org.junit.Test;

import com.esotericsoftware.kryo.io.Output;


public class TestExplode {
    @Before
    public void setUp() {
        // ShenjRuntime.loadDefaultImage();
    }

    @Test
    public void testKlToJava() throws Exception {
        ShenjRuntime.loadImage(new File("shen-test.image"));
//        Object result = ShenjRuntime.doEval("Eval", "(+ 2 2)");
//        assertEquals(4, result);
    }

    @Test
    public void testImagePersists() throws Exception {
        ShenjRuntime.emptyImage();
        String code = "package shen.gen; import com.mentics.shenj.*; public class ToEval {public final static Lambda LAMBDA = new Lambda0() {public Object apply() { return 17; }};}";
        System.out.println(code);
        ShenjRuntime.doEval("shen.gen.ToEval", code);
        try (Output out = new Output(new FileOutputStream("test.image"))) {
            ShenjRuntime.evalContext.saveImage(out);
        }

        ShenjRuntime.emptyImage();

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
        ShenjRuntime.emptyImage();
        String code = "package shen.gen;\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"import static com.mentics.shenj.Lang.*;\r\n" + 
        		"import static com.mentics.shenj.ShenjRuntime.*;\r\n" + 
        		"import static com.mentics.shenj.inner.Context.*;\r\n" + 
        		"\r\n" + 
        		"import static com.mentics.shenj.inner.Primitives.*;\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"import com.mentics.shenj.*;\r\n" + 
        		"import com.mentics.shenj.inner.*;\r\n" + 
        		"\r\n" + 
        		"public class ToEval {\r\n" + 
        		"  public static Object run() throws Exception {\r\n" + 
        		"final Object f1316 = ShenEvalWithoutMacros.LAMBDA.apply();\r\n" + 
        		";\r\n" + 
        		"    return f1316;\r\n" + 
        		"  }\r\n" + 
        		"}";
        ShenjRuntime.doEval("shen.gen.ToEval", code);
    }
}
