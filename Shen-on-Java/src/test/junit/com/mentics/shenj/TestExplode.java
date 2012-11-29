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
        // ShenjRuntime.evalContext.evalClass("shenj.root.ToEval");
        String content = StringUtil.readFully(new File("java/platform/shenj/root/ToEval.java"));
        Object result = ShenjRuntime.doEval("shenj.root.ToEval", content);
        System.out.println(result);

        // Object result = ShenjRuntime.doEval("Eval", "(+ 2 2)");
        // assertEquals(4, result);
    }

    @Test
    public void testImagePersists() throws Exception {
        String code = "package shenj.root; import com.mentics.shenj.*; public class ToEval {public final static Lambda LAMBDA = new Lambda0() {public Object apply() { return 17; }};}";
        System.out.println(code);
        ShenjRuntime.doEval("shenj.root.ToEval", code);
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
        String code = "package shenj.root;\r\n" + "\r\n" + "\r\n" + "\r\n"
                + "import static com.mentics.shenj.Lang.*;\r\n" + "import static com.mentics.shenj.ShenjRuntime.*;\r\n"
                + "import static com.mentics.shenj.inner.Context.*;\r\n" + "\r\n"
                + "import static com.mentics.shenj.inner.Primitives.*;\r\n" + "\r\n" + "\r\n"
                + "import com.mentics.shenj.*;\r\n" + "import com.mentics.shenj.inner.*;\r\n" + "\r\n"
                + "public class ToEval {\r\n" + "  public static Object run() throws Exception {\r\n"
                + "final Object f1316 = ShenEvalWithoutMacros.LAMBDA.apply();\r\n" + ";\r\n" + "    return f1316;\r\n"
                + "  }\r\n" + "}";
        ShenjRuntime.doEval("shenj.root.ToEval", code);
    }

    @Test
    public void testShenCredits() throws Exception {
        ShenjRuntime.loadImage(new File("shen-test.image"));
        String code = "package shenj.root;\r\n"
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
        Object o = ShenjRuntime.doEval("shenj.root.ShenCredits", code);
        System.out.println(o);
    }

    @Test
    public void testShenWalk() throws Exception {
        ShenjRuntime.loadImage(new File("shen-test.image"));
        String code = "package shenj.root;\r\n" + "\r\n" + "\r\n" + "\r\n"
                + "import static com.mentics.shenj.Lang.*;\r\n" + "import static com.mentics.shenj.ShenjRuntime.*;\r\n"
                + "import static com.mentics.shenj.inner.Context.*;\r\n" + "\r\n"
                + "import static com.mentics.shenj.inner.Primitives.*;\r\n" + "\r\n" + "\r\n"
                + "import com.mentics.shenj.*;\r\n" + "import com.mentics.shenj.inner.*;\r\n" + "\r\n"
                + "import shenj.root.*;\r\n" + "\r\n" + "\r\n" + "public class ShenWalk {\r\n" + "\r\n" + "\r\n"
                + "public static final Symbol SYMBOL = symbol(\"shen-walk\");\r\n" + "\r\n"
                + "public static Lambda LAMBDA = new Lambda2() {\r\n" + "\r\n"
                + "public Object apply(final Object v670, final Object v671) throws Exception {\r\n" + "\r\n" + "\r\n"
                + "\r\n" + "final Object i734;\r\n" + "if ((boolean)(v671 instanceof Cons)) {\r\n"
                + "final Lambda l737 = new Lambda1() {\r\n"
                + "  public Object apply(final Object z) throws Exception {\r\n"
                + "final Object f738 = shenj.root.ShenWalk.LAMBDA.apply(v670, z);\r\n" + "\r\n"
                + "    return f738;\r\n" + "}\r\n"
                + "};final Object f736 = shenj.root.Map.LAMBDA.apply(l737, v671);\r\n"
                + "final Object f735 = dispatch(v670).apply(f736);\r\n" + "\r\n" + "i734 = f735;\r\n" + "} else {\r\n"
                + "\r\n" + "final Object i739;\r\n" + "if ((boolean)true) {\r\n"
                + "final Object f740 = dispatch(v670).apply(v671);\r\n" + "\r\n" + "i739 = f740;\r\n" + "} else {\r\n"
                + "\r\n" + "throw new SimpleError((String)\"True condition not found.\");\r\n" + "\r\n" + "\r\n"
                + "}\r\n" + "i734 = i739;\r\n" + "\r\n" + "}\r\n" + "    return i734;\r\n" + "\r\n" + "\r\n"
                + "}};\r\n" + "}";
        Object o = ShenjRuntime.doEval("shenj.root.ShenWalk", code);
        System.out.println(o);
    }

    @Test
    public void testEval() throws Exception {
        ShenjRuntime.loadImage(new File("shen-test.image"));
        String code = "package shenj.root;\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"\r\n" + 
        		"import static com.mentics.shenj.Lang.*;\r\n" + 
        		"import static com.mentics.shenj.ShenjRuntime.*;\r\n" + 
        		"import static com.mentics.shenj.inner.Context.*;\r\n" + 
        		"import static com.mentics.shenj.inner.Primitives.*;\r\n" + 
        		"\r\n" + 
        		"import com.mentics.shenj.*;\r\n" + 
        		"import com.mentics.shenj.inner.*;\r\n" + 
        		"\r\n" + 
        		"import shenj.root.*;\r\n" + 
        		"\r\n" + 
        		"public class Eval {\r\n" + 
        		"\r\n" + 
        		"public static final Symbol SYMBOL = symbol(\"eval\");\r\n" + 
        		"public static Lambda LAMBDA = new Lambda1() {\r\n" + 
        		"public Object apply(final Object v651) throws Exception {\r\n" + 
        		"final Lambda l762 = new Lambda1() {\r\n" + 
        		"  public Object apply(final Object v652) throws Exception {\r\n" + 
        		"final Object f763 = shenj.root.Macroexpand.LAMBDA.apply(v652);\r\n" + 
        		"\r\n" + 
        		"    return f763;\r\n" + 
        		"}\r\n" + 
        		"};final Object f761 = shenj.root.ShenWalk.LAMBDA.apply(l762, v651);\r\n" + 
        		"\r\n" + 
        		"final Object macroexpand760 = f761;\r\n" + 
        		"final Object f765 = shenj.root.ShenPackagedQ.LAMBDA.apply(macroexpand760);\r\n" + 
        		"\r\n" + 
        		"final Object i764;\r\n" + 
        		"if ((boolean)f765) {\r\n" + 
        		"final Lambda l767 = new Lambda1() {\r\n" + 
        		"  public Object apply(final Object v653) throws Exception {\r\n" + 
        		"final Object f768 = shenj.root.ShenEvalWithoutMacros.LAMBDA.apply(v653);\r\n" + 
        		"\r\n" + 
        		"    return f768;\r\n" + 
        		"}\r\n" + 
        		"};final Object f769 = shenj.root.ShenPackageContents.LAMBDA.apply(macroexpand760\r\n" + 
        		");\r\n" + 
        		"final Object f766 = shenj.root.Map.LAMBDA.apply(l767, f769);\r\n" + 
        		"\r\n" + 
        		"i764 = f766;\r\n" + 
        		"} else {\r\n" + 
        		"final Object f770 = shenj.root.ShenEvalWithoutMacros.LAMBDA.apply(macroexpand760\r\n" + 
        		");\r\n" + 
        		"\r\n" + 
        		"i764 = f770;\r\n" + 
        		"\r\n" + 
        		"}\r\n" + 
        		"\r\n" + 
        		"    return i764;\r\n" + 
        		"\r\n" + 
        		"}};\r\n" + 
        		"}";
        Object o = ShenjRuntime.doEval("shenj.root.Eval", code);
        System.out.println(o);
    }
}
