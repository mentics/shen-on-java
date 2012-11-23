package com.mentics.shenj;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.util.ReflectionUtil.*;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.io.Input;
import com.mentics.shenj.cl.CLProvider;
import com.mentics.shenj.cl.DirectClassLoader;


public class ShenjRuntime {
    // static {
    // System.out.println("Loading shenjruntime: " + ShenjRuntime.class.toString() + ", "
    // + ShenjRuntime.class.getClassLoader().toString());
    // }

    public static Map<String, Symbol> symbols = new HashMap<>();
    public static CLProvider topLevel;
    public static ThreadLocal<CLProvider> currentContext = new ThreadLocal<>();
    // public static CLProvider compileContext;
    // public static CLProvider evalContext;

    public static final String GEN_SOURCE_DIRECTORY = "*gen-source-directory*";
    public static final Symbol SRC_DIR_SYM = symbol(GEN_SOURCE_DIRECTORY);

    public static int gensymCounter = 0;


    public static Object doEval(final Object className, Object classContent) throws Exception {
        // classContent = ((String)classContent).replace("new Lambda() { public Object",
        // "new Lambda0() { public Object");
        return currentContext.get().eval((String) className, (String) classContent);
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
        topLevel = newProviderFromFile(file);
        currentContext.set(topLevel);
    }

    public static void loadDefaultImage() {
        topLevel = CLProvider.newDefault(threadClassLoader());
        currentContext.set(topLevel);
    }

    public static void newEmpty() {
        topLevel = new CLProvider(DirectClassLoader.createEmptyImage(threadClassLoader()));
        currentContext.set(topLevel);
    }

    public static CLProvider getCurrentContext() {
        return currentContext.get();
    }

    public static void setCurrentContext(CLProvider context) {
        currentContext.set(context);
    }


    // Local Methods //

    private static CLProvider newProviderFromFile(File file) {
        try (Input in = new Input(new FileInputStream(file))) {
            return CLProvider.newFromImage(threadClassLoader(), in);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }
}
