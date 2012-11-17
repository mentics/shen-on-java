package com.mentics.shenj;

import static com.mentics.shenj.EvalStuff.*;
import static com.mentics.shenj.ShenException.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.io.Input;


public class ShenjRuntime {
    public static Map<String, Symbol> symbols = new HashMap<>();
    public static DirectClassLoader compileContext;
    public static DirectClassLoader evalContext;

    public static final String GEN_SOURCE_DIRECTORY = "*gen-source-directory*";
    public static final Symbol SRC_DIR_SYM = symbol(GEN_SOURCE_DIRECTORY);


    public static Object doEval(final Object aClassName, final Object classContent) throws Exception {
        String className = (String) aClassName;
        // System.out.println("******************************************************************");
        // System.out.println("doEval("+className+", \n"+classContent);
        // System.out.println("******************************************************************");
        Map<String, byte[]> newClasses = compileTask((String) compileContext.getGlobalProps().get(SRC_DIR_SYM),
                (String) className, (String) classContent, compileContext);

        DirectClassLoader cont = evalContext.newWith(newClasses);
        if (compileContext == evalContext) {
            compileContext = cont;
        }
        evalContext = cont;
        // TODO: fix this when work with packages
        if (!className.startsWith("shen.gen.")) {
            className = "shen.gen." + className;
        }
        return evalContext.evalClass((String) className);
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


    public static DirectClassLoader loadImage(File file) {
        try (Input in = new Input(new FileInputStream(file))) {
            evalContext = compileContext = DirectClassLoader.loadFromImage(in);
        } catch (Exception e) {
            rethrow(e);
        }
        return evalContext;
    }

    public static DirectClassLoader loadDefaultImage() {
        return evalContext = compileContext = DirectClassLoader.loadDefaultImage();
    }


    public static DirectClassLoader emptyImage() {
        return evalContext = compileContext = DirectClassLoader.createEmptyImage();
    }


    // public static void compileAndRegister(String className, String classContent) {
    // CharSequenceCompiler compiler = new CharSequenceCompiler(compileContext, null);
    // Map<String, byte[]> newClasses = compileTask(null, className, classContent, compiler);
    //
    // }
}
