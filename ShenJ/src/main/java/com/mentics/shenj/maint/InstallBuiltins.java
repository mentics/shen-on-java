package com.mentics.shenj.maint;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.DirectClassLoader;
import com.mentics.shenj.EvalStuff;
import com.mentics.shenj.ShenException;


public class InstallBuiltins {
    public static void main(String[] args) throws Exception {
        String path = "shen-test.image";
        loadImage(new File(path));
        DirectClassLoader loader = compileContext;
        File dir = new File("src/main/builtin/shen/gen/");
        Map<String, byte[]> builtins = new HashMap<>();
        for (File f : dir.listFiles()) {
            if (f.getName().endsWith("java")) {
                String t0 = removeLastToken(".", f.getPath());
                String pathName = t0.substring("src/main/builtin/".length());
                String fqn = pathName.replace(File.separatorChar, '.');
                loader = EvalStuff.compileTask(null, fqn, readFully(f), loader);
                // builtins.putAll(newClasses);
            }
        }
        loader = loader.registerAll(builtins);
        if (loader.classes.get("shen.gen.EvalKl") == null) {
            throw new ShenException("Could not find evalkl class after installing builtins.");
        }
        if (loader.classes.get("shen.gen.NewEmptyContext") == null) {
            throw new ShenException("Could not find newemptycontext class after installing builtins.");
        }
        loader.runClass("shen.gen.StringLength");
        try {
            loader.runClass("class.doesnt.Exist");
            throw new ShenException("Exception expected for non-existent class.");
        } catch (Throwable t) {
            // ignore, expected
        }
        try (Output out = new Output(new FileOutputStream(path))) {
            loader.saveImage(out);
        }
    }
}
