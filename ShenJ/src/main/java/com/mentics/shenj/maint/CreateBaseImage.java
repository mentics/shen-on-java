package com.mentics.shenj.maint;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.StringUtil.*;
import static java.lang.Thread.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;

import org.junit.Assert;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.DirectClassLoader;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;
import com.mentics.util.ReflectionUtil;


public class CreateBaseImage {
    public static void main(String[] args) throws Exception {
        evalContext = DirectClassLoader.fromPropFile(new File("global-props.kryo"));

        registerClassesInDir(new File("target/classes/shen/gen/"));

        System.out.println("num classes: " + ShenjRuntime.compileContext.classes.size());
        System.out.println("props: " + evalContext.getGlobalProps());
        System.out.println("functions: " + evalContext.getFunctions());
        try (Output out = new Output(new FileOutputStream("shenj-base.image"))) {
            evalContext.saveImage(out);
        }

        Map<Symbol, Lambda> funcs = evalContext.getFunctions();
        Assert.assertNotNull(funcs.get(symbol("kl-to-java-traverse")));
        Assert.assertNotNull(funcs.get(symbol("shen-timer-macro")));

        // Test load
        try (Input in = new Input(new FileInputStream("shenj-base.image"))) {
            DirectClassLoader dcl = DirectClassLoader.loadFromImage(in);
            Map<Symbol, Lambda> functions = dcl.getFunctions();
            Assert.assertNotNull(functions.get(symbol("kl-to-java-traverse")));
            Assert.assertNotNull(functions.get(symbol("shen-timer-macro")));
            System.out.println("num classes: " + dcl.classes.size());
            System.out.println("props: " + dcl.getGlobalProps());
            System.out.println("functions: " + functions);
        }
    }

    private static void registerClassesInDir(File dir) throws Exception, Exception {
        File[] files = dir.listFiles();
        for (File f : files) {
            String name = f.getName();
            if (name.endsWith(".class")) {
                String fqn = "shen.gen." + removeLastToken(".class", name);
                ClassLoader loader = currentThread().getContextClassLoader();
                Class<?> c = loader.loadClass(fqn);
                byte[] bytes = ReflectionUtil.loadBytesForClass(loader, fqn);
                // System.out.println("registering: "+c.getSimpleName());
                ShenjRuntime.compileContext.classes.put(fqn, bytes);
                Context.registerLambda(c.getDeclaredFields());
            }
        }
    }


    // public static void main(String[] args) throws Exception {
    // File dir = new File("src/main/shen/platform/shen/gen/");
    // File[] files = dir.listFiles();
    // for (int max = 0; max < files.length; max++) {
    // String lastName = null;
    // for (int i = 0; i < max; i++) {
    // File f = files[i];
    // String name = f.getName();
    // if (name.endsWith(".java")) {
    // Class c = Thread.currentThread().getContextClassLoader()
    // .loadClass("shen.gen." + UpdateImage.removeLastToken(".java", name));
    // // System.out.println("registering: "+c.getSimpleName());
    // RuntimeContext.registerLambda(c.getDeclaredFields());
    // }
    // lastName = name;
    // }
    //
    // // Primitives.loadPrimitives();
    // System.out.println(RuntimeContext.functions);
    // RuntimeContext.saveImage(new FileOutputStream("shenj-base.image"));
    // // UpdateImage.writeObjects(new FileOutputStream("shenj-base.image"), RuntimeContext.globalProperties,
    // // RuntimeContext.functions);
    // // Assert.assertNotNull(RuntimeContext.functions.get(RuntimeContext.symbol("kl-to-java-traverse")));
    // // Assert.assertNotNull(RuntimeContext.functions.get(RuntimeContext.symbol("shen-timer-macro")));
    //
    // System.out.println("i=" + max + ", name=" + lastName + ", functions.size="
    // + RuntimeContext.functions.size());
    // RuntimeContext.loadImage(new FileInputStream("shenj-base.image"));
    // }
    // }
}
