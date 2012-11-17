package com.mentics.shenj.maint;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.CharSequenceCompiler;
import com.mentics.shenj.EvalStuff;
import com.mentics.shenj.ShenException;


public class InstallBuiltins {
    public static void main(String[] args) throws Exception {
        String path = "shen-test.image";
        loadImage(new File(path));
        CharSequenceCompiler compiler = new CharSequenceCompiler(evalContext, null);
        File dir = new File("src/main/builtin/shen/gen/");
        Map<String, byte[]> builtins = new HashMap<>();
        for (File f : dir.listFiles()) {
            if (f.getName().endsWith("java")) {
                String t0 = removeLastToken(".", f.getPath());
                String pathName = t0.substring("src/main/builtin/".length());
                String fqn = pathName.replace(File.separatorChar, '.');
                Map<String, byte[]> newClasses = EvalStuff.compileTask(null, fqn, readFully(f), evalContext);
                builtins.putAll(newClasses);
            }
        }
        evalContext.registerAll(builtins);
        if (evalContext.classes.get("shen.gen.EvalKl") == null) {
            throw new ShenException("Could not find saveimage class after installing builtins.");
        }
        evalContext.evalClass("shen.gen.StringLength");
        try {
            evalContext.evalClass("class.doesnt.Exist");
            throw new ShenException("Exception expected for non-existent class.");
        } catch (Throwable t) {
            // ignore, expected
        }
        try (Output out = new Output(new FileOutputStream(path))) {
            evalContext.saveImage(out);
        }
    }
}
