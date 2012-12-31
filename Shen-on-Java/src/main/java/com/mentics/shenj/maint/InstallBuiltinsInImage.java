package com.mentics.shenj.maint;

import static com.mentics.util.ReflectionUtil.*;
import static com.mentics.util.StringUtil.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.CharSequenceCompilerException;
import com.mentics.shenj.cl.DirectClassLoader;


public class InstallBuiltinsInImage {
    public static void main(String[] args) throws Exception {
        String path = "default.image";
        DirectClassLoader dcl = null;
        try (Input in = new Input(new FileInputStream(path))) {
            dcl = DirectClassLoader.loadFromImage(threadClassLoader(), in);
        }
        if (dcl != null) {
            dcl.runClass("shenj.root.InstallPrimitives");
            processAllBuiltinDirs(dcl);
            try (Output out = new Output(new FileOutputStream(path))) {
                dcl.saveImage(out);
            }
        }
    }

    public static void processAllBuiltinDirs(DirectClassLoader dcl) throws CharSequenceCompilerException {
        processDir(dcl, new File("src/main/builtin/shenj/platform/"));
        processDir(dcl, new File("src/main/builtin/shenj/root/"));
        processDir(dcl, new File("src/main/builtin/shenj/reflect/"));
    }

    public static void processDir(DirectClassLoader dcl, File dir) throws CharSequenceCompilerException {
        for (File f : dir.listFiles()) {
            if (f.getName().endsWith("java")) {
                String t0 = removeLastToken(".", f.getPath());
                String pathName = t0.substring("src/main/builtin/".length());
                String fqn = pathName.replace(File.separatorChar, '.');
                System.out.println("compiling: " + fqn);
                Map<String, byte[]> builtins = dcl.compile(null, fqn, readFully(f));
                dcl.register(fqn, builtins);
            }
        }
    }
}
