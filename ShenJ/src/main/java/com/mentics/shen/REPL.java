package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;

import java.io.FileInputStream;


public class REPL {
    // private static final Class<?> = new Class[];

    public static void main(String[] args) throws Exception {
        RuntimeContext.loadImage(new FileInputStream("shenj-base.image"));
        globalProperties.put(RuntimeContext.SRC_DIR_SYM, "java/shen/gen/");
        // globalProperties.put(symbol("*home-directory*"), new File(".").getAbsolutePath());
        RuntimeContext.newLoader().loadClass("shen.gen.ShenShen").getMethod("defined").invoke(null);
        // ShenShen.defined();
    }
}
