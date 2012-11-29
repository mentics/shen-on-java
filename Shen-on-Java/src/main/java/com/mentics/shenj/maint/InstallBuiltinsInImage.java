package com.mentics.shenj.maint;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.CharSequenceCompilerException;


public class InstallBuiltinsInImage {
    public static void main(String[] args) throws Exception {
//        String path = "shen-test.image";
        String path = "bootstrapped.image";
        loadImage(new File(path));
        getCurrentContext().loadPrimitives();
        processDir(new File("src/main/builtin/shenj/platform/"));
        processDir(new File("src/main/builtin/shenj/root/"));
        try (Output out = new Output(new FileOutputStream(path))) {
            getCurrentContext().saveImage(out);
        }
    }

    public static void processDir(File dir) throws CharSequenceCompilerException {
        for (File f : dir.listFiles()) {
            if (f.getName().endsWith("java")) {
                String t0 = removeLastToken(".", f.getPath());
                String pathName = t0.substring("src/main/builtin/".length());
                String fqn = pathName.replace(File.separatorChar, '.');
                System.out.println("compiling: " + fqn);
                Map<String, byte[]> builtins = getCurrentContext().compileTask(null, fqn, readFully(f));
                getCurrentContext().register(fqn, builtins);
            }
        }
    }
}
