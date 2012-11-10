package com.mentics.shen.maint;

import static com.mentics.shen.RuntimeContext.*;
import static com.mentics.util.StringUtil.*;
import static java.lang.Thread.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import com.mentics.shen.Primitives;
import com.mentics.shen.RuntimeContext;
import com.mentics.shen.Symbol;


public class CreateBaseImage {
    public static void main(String[] args) throws Exception {
        RuntimeContext.globalProperties = (Map<Symbol, Object>) RuntimeContext.readObjects(
                new FileInputStream("global-props.kryo"), HashMap.class).get(0);

        Primitives.loadPrimitives();

//        registerClassesInDir(new File("src/main/shen/gen/shen/gen/"));
        registerClassesInDir(new File("target/classes/shen/gen/"));
//        registerClassesInDir(new File("src/main/shen/compiled-kl/shen/gen/"));

        System.out.println("num classes: " + RuntimeContext.classes.size());
        System.out.println("props: " + RuntimeContext.globalProperties);
        System.out.println("functions: " + RuntimeContext.functions);
        RuntimeContext.saveImage(new FileOutputStream("shenj-base.image"));

        Assert.assertNotNull(RuntimeContext.functions.get(RuntimeContext.symbol("kl-to-java-traverse")));
        Assert.assertNotNull(RuntimeContext.functions.get(RuntimeContext.symbol("shen-timer-macro")));

        // Test load
        RuntimeContext.loadImage(new FileInputStream("shenj-base.image"));
        Assert.assertNotNull(RuntimeContext.functions.get(RuntimeContext.symbol("kl-to-java-traverse")));
        Assert.assertNotNull(RuntimeContext.functions.get(RuntimeContext.symbol("shen-timer-macro")));
        System.out.println("num classes: " + RuntimeContext.classes.size());
        System.out.println("props: " + RuntimeContext.globalProperties);
        System.out.println("functions: " + RuntimeContext.functions);
    }

    private static void registerClassesInDir(File dir) throws Exception, Exception {
        File[] files = dir.listFiles();
        for (File f : files) {
            String name = f.getName();
            if (name.endsWith(".class")) {
                String fqn = "shen.gen." + removeLastToken(".class", name);
                ClassLoader loader = currentThread().getContextClassLoader();
                Class c = loader.loadClass(fqn);
                byte[] bytes = loadBytesForClass(loader, fqn);
                // System.out.println("registering: "+c.getSimpleName());
                RuntimeContext.classes.put(fqn, bytes);
                registerLambda(c.getDeclaredFields());
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
