package com.mentics.shenj;

import java.util.HashMap;
import java.util.Map;


public class ShenjRuntime {
    // static {
    // System.out.println("Loading shenjruntime: " + ShenjRuntime.class.toString() + ", "
    // + ShenjRuntime.class.getClassLoader().toString());
    // }

    public static Map<String, Symbol> symbols = new HashMap<>();
    // public static CLProvider topLevel;
    // public static ThreadLocal<CLProvider> currentContext = new ThreadLocal<>();

    public static final String GEN_SOURCE_DIRECTORY = "shenj.platform/*java-source-directory*";
    public static final Symbol GEN_SOURCE_DIRECTORY_SYM = symbol(GEN_SOURCE_DIRECTORY);

    public static final String GENERATE_JAVA_ONLY = "shenj.platform/*generate-java-only*";
    public static final Symbol GENERATE_JAVA_ONLY_SYM = symbol(GENERATE_JAVA_ONLY);

    public static int gensymCounter = 0;


    // Public Methods //

    public static Symbol symbol(String name) {
        Symbol s = symbols.get(name);
        if (s == null) {
            s = new Symbol(name);
            symbols.put(name, s);
        }
        return s;
    }

    // public static void loadImage(File file) {
    // topLevel = newProviderFromFile(file);
    // // currentContext.set(topLevel);
    // }
    //
    // public static void loadDefaultImage() {
    // topLevel = CLProvider.newDefault(threadClassLoader());
    // // currentContext.set(topLevel);
    // }
    //
    // public static void newEmpty() {
    // topLevel = new CLProvider(DirectClassLoader.createEmptyImage(threadClassLoader()));
    // // currentContext.set(topLevel);
    // }

    // public static CLProvider getCurrentContext() {
    // return currentContext.get();
    // }
    //
    // public static void setCurrentContext(CLProvider context) {
    // currentContext.set(context);
    // }


    // Local Methods //

    // private static CLProvider newProviderFromFile(File file) {
    // try (Input in = new Input(new FileInputStream(file))) {
    // return CLProvider.newFromImage(threadClassLoader(), in);
    // } catch (Exception e) {
    // rethrow(e);
    // return null; // unreachable code
    // }
    // }
}
