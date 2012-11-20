package com.mentics.shenj;

import java.io.File;


public class REPL {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            ShenjRuntime.loadImage(new File(args[0]));
        } else {
            ShenjRuntime.loadDefaultImage();
        }
        ShenjRuntime.compileContext.apply("shen.gen.ShenShen");
    }
}
