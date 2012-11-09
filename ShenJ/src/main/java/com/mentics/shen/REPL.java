package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;

import java.io.File;
import java.io.FileInputStream;

import shen.gen.ShenShen;


public class REPL {
    public static void main(String[] args) throws Exception {
        RuntimeContext.loadImage(new FileInputStream("shenj-base.image"));
        globalProperties.put(UpdateImage.SRC_DIR_SYM, "src/main/shen/gen/");
        globalProperties.put(UpdateImage.COMPILE_DIR_SYM, "target/classes/");
        globalProperties.put(symbol("*home-directory*"), new File(".").getAbsolutePath());
        ShenShen.defined();
    }
}
