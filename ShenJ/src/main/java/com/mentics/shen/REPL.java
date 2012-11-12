package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;

import java.io.FileInputStream;
import java.io.InputStream;


public class REPL {
    public static void main(String[] args) throws Exception {
        InputStream in = null;
        try {
            if (args.length > 0) {
                in = new FileInputStream(args[0]);
            } else {
                in = Thread.currentThread().getContextClassLoader()
                        .getResourceAsStream("shenj/platform/image/shenj-base.image");
            }
            loadImage(in);
        } catch (Exception e) {
            throw new ShenException(e);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                // ignore
            }
        }
        globalProperties.put(RuntimeContext.SRC_DIR_SYM, "java/shen/gen/");
        // globalProperties.put(symbol("*home-directory*"), new File(".").getAbsolutePath());
        RuntimeContext.newLoader().loadClass("shen.gen.ShenShen").getMethod("defined").invoke(null);
    }
}
