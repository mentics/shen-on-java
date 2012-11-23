package com.mentics.shenj.maint;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;

import com.esotericsoftware.kryo.io.Output;


public class InstallBuiltinsInImage {
    public static void main(String[] args) throws Exception {
        String path = "after-builtin.image";
        loadImage(new File(path));
        File dir = new File("src/main/builtin/shen/gen/");
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
        // if (!Lang.equals(2, getCurrentContext().apply("shen.gen.EvalKl", 2))) {
        // throw new ShenException("Could not find evalkl class after installing builtins.");
        // }
        // if (null == getCurrentContext().apply("shen.gen.NewEmptyContext")) {
        // throw new ShenException("Could not find newemptycontext class after installing builtins.");
        // }
        // // compileContext.runClass("shen.gen.StringLength");
        // try {
        // getCurrentContext().apply("class.doesnt.Exist");
        // throw new ShenException("Exception expected for non-existent class.");
        // } catch (Throwable t) {
        // // ignore, expected
        // }
        try (Output out = new Output(new FileOutputStream("after-builtin.image"))) {
            getCurrentContext().saveImage(out);
        }
    }
}
