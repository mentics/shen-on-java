package shenj.root;


import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

import com.mentics.shenj.*;
import com.mentics.shenj.inner.Context;


public class InstallBuiltins {

    public static final Symbol SYMBOL = ShenjRuntime.symbol("install-builtins");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object basePath) throws Exception {
            return defined(basePath);
        }
    };


    public static Object defined(Object basePath) throws Exception {
        File dir = new File(Context.globalProperties.get(symbol("*home-directory*")) + (String)basePath);
        System.out.println("installing builtins from : "+dir);
        int i=0;
        for (File f : dir.listFiles()) {
            if (f.getName().endsWith("java")) {
                String t0 = removeLastToken(".", f.getPath());
                String pathName = t0.substring("src/main/builtin/".length());
                String fqn = pathName.replace(File.separatorChar, '.');
                Map<String, byte[]> builtins = getCurrentContext().compileTask(null, fqn, readFully(f));
                getCurrentContext().register(fqn, builtins);
                i++;
            }
        }
        return i;
//        if (!Lang.equals(2, compileContext.apply("shenj.root.EvalKl", 2))) {
//            throw new ShenException("Could not find evalkl class after installing builtins.");
//        }
//        if (null == compileContext.apply("shenj.root.NewEmptyContext")) {
//            throw new ShenException("Could not find newemptycontext class after installing builtins.");
//        }
//        // compileContext.runClass("shenj.root.StringLength");
//        try {
//            compileContext.apply("class.doesnt.Exist");
//            throw new ShenException("Exception expected for non-existent class.");
//        } catch (Throwable t) {
//            // ignore, expected
//        }
//        try (Output out = new Output(new FileOutputStream(path))) {
//            compileContext.saveImage(out);
//        }
    }
}
