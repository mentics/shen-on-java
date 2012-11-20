package com.mentics.shenj.maint;



public class CreateBaseImage {
//    public static void main(String[] args) throws Exception {
//        evalContext = DirectClassLoader.fromPropFile(new File("global-props.kryo"));
//
//        registerClassesInDir(new File("target/classes/shen/gen/"));
//
//        System.out.println("num classes: " + ShenjRuntime.compileContext.classes.size());
//        System.out.println("props: " + evalContext.getGlobalProps());
//        System.out.println("functions: " + evalContext.getFunctions());
//        try (Output out = new Output(new FileOutputStream("shenj-base.image"))) {
//            evalContext.saveImage(out);
//        }
//
//        Map<Symbol, Lambda> funcs = evalContext.getFunctions();
//        Assert.assertNotNull(funcs.get(symbol("kl-to-java-traverse")));
//        Assert.assertNotNull(funcs.get(symbol("shen-timer-macro")));
//
//        // Test load
//        try (Input in = new Input(new FileInputStream("shenj-base.image"))) {
//            DirectClassLoader dcl = DirectClassLoader.loadFromImage(in);
//            Map<Symbol, Lambda> functions = dcl.getFunctions();
//            Assert.assertNotNull(functions.get(symbol("kl-to-java-traverse")));
//            Assert.assertNotNull(functions.get(symbol("shen-timer-macro")));
//            System.out.println("num classes: " + dcl.classes.size());
//            System.out.println("props: " + dcl.getGlobalProps());
//            System.out.println("functions: " + functions);
//        }
//    }
//
//    private static void registerClassesInDir(File dir) throws Exception, Exception {
//        File[] files = dir.listFiles();
//        for (File f : files) {
//            String name = f.getName();
//            if (name.endsWith(".class")) {
//                String fqn = "shen.gen." + removeLastToken(".class", name);
//                ClassLoader loader = currentThread().getContextClassLoader();
//                Class<?> c = loader.loadClass(fqn);
//                byte[] bytes = ReflectionUtil.loadBytesForClass(loader, fqn);
//                // System.out.println("registering: "+c.getSimpleName());
//                ShenjRuntime.compileContext.classes.put(fqn, bytes);
//                Context.registerLambda(c.getDeclaredFields());
//            }
//        }
//    }
}
