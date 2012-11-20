package com.mentics.shenj;

import static com.mentics.shenj.EvalStuff.*;
import static com.mentics.shenj.ShenException.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.io.Input;


public class ShenjRuntime {
    // static {
    // System.out.println("Loading shenjruntime: " + ShenjRuntime.class.toString() + ", "
    // + ShenjRuntime.class.getClassLoader().toString());
    // }

    public static Map<String, Symbol> symbols = new HashMap<>();
    public static DirectClassLoader compileContext;
    public static DirectClassLoader evalContext;

    public static final String GEN_SOURCE_DIRECTORY = "*gen-source-directory*";
    public static final Symbol SRC_DIR_SYM = symbol(GEN_SOURCE_DIRECTORY);

    public static int gensymCounter = 0;


    public static Object doEval(final Object aClassName, final Object classContent) throws Exception {
        String className = (String) aClassName;
        // System.out.println("******************************************************************");
        // System.out.println("doEval("+className+", \n"+classContent);
        // System.out.println("******************************************************************");
        // Map<String, byte[]> newClasses =
        evalContext = compileTask((String) evalContext.getGlobalProps().get(SRC_DIR_SYM), (String) className,
                (String) classContent, evalContext);
        // TODO: fix this when work with packages
        if (!className.startsWith("shen.gen.")) {
            className = "shen.gen." + className;
        }
        return evalContext.runClass((String) className);
    }


    // Public Methods //

    public static Symbol symbol(String name) {
        Symbol s = symbols.get(name);
        if (s == null) {
            s = new Symbol(name);
            symbols.put(name, s);
        }
        return s;
    }


    public static void loadImage(File file) {
        try (Input in = new Input(new FileInputStream(file))) {
            setContexts(DirectClassLoader.loadFromImage(in));
        } catch (Exception e) {
            rethrow(e);
        }
    }

    public static void loadDefaultImage() {
        setContexts(DirectClassLoader.loadDefaultImage());
    }


    // Local Methods //

    private static void setContexts(DirectClassLoader dcl) {
        compileContext = dcl;
        evalContext = dcl.copy(false);
    }

    // public static void compileAndRegister(String className, String classContent) {
    // CharSequenceCompiler compiler = new CharSequenceCompiler(compileContext, null);
    // Map<String, byte[]> newClasses = compileTask(null, className, classContent, compiler);
    //
    // }
}
