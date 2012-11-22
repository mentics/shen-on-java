package com.mentics.shenj;

import java.io.File;


public class REPL {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            File f = new File(args[0]);
            if (f.exists()) {
                ShenjRuntime.loadImage(new File(args[0]));
            } else {
                ShenjRuntime.newEmpty();
            }
        } else {
            ShenjRuntime.loadDefaultImage();
        }
        ShenjRuntime.compileContext.apply("shen.gen.ShenShen");
    }
}
