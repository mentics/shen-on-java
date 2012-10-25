package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;

import java.io.FileInputStream;

import shen.gen.ShenShen;


public class REPL {
    public static void main(String[] args) throws Exception {
        // RuntimeContext.loadImage(Thread.currentThread().getContextClassLoader()
        // .getResourceAsStream("shenj/platform/image/shenj-base.image"));
        RuntimeContext.loadImage(new FileInputStream("shenj-base.image"));
        globalProperties.put(UpdateImage.SRC_DIR_SYM, "src/main/shen/gen/");
        globalProperties.put(UpdateImage.COMPILE_DIR_SYM, "target/classes/");
//        Primitives.loadPrimitives();
        // System.out.println(UpdateImage.readObjects(new FileInputStream("global-props.kryo"), HashMap.class).get(0));
        System.out.println(RuntimeContext.globalProperties);
        System.out.println(RuntimeContext.functions);
        ShenShen.defined();
    }
}
