package com.mentics.shenj;

import java.io.File;


public class REPL {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            ShenjRuntime.loadImage(new File(args[0]));
        } else {
            ShenjRuntime.loadDefaultImage();
        }

        // Context.globalProperties.put(ShenjRuntime.SRC_DIR_SYM, "java/shen/gen/");
        // // globalProperties.put(symbol("*home-directory*"), new File(".").getAbsolutePath());
        ShenjRuntime.evalContext.run("shen.gen.ShenShen");
    }
}
