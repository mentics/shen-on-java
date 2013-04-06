package com.mentics.ecj;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.jdt.core.compiler.CharOperation;
import org.eclipse.jdt.internal.compiler.ClassFile;
import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.eclipse.jdt.internal.compiler.Compiler;
import org.eclipse.jdt.internal.compiler.DefaultErrorHandlingPolicies;
import org.eclipse.jdt.internal.compiler.ICompilerRequestor;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import org.eclipse.jdt.internal.compiler.batch.FileSystem;
import org.eclipse.jdt.internal.compiler.batch.FileSystem.Classpath;
import org.eclipse.jdt.internal.compiler.env.ICompilationUnit;
import org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.eclipse.jdt.internal.compiler.problem.DefaultProblemFactory;
import org.eclipse.jdt.internal.compiler.util.Util;

import com.mentics.shenj.ShenException;
import com.mentics.shenj.cl.DirectClassLoader;


public class EclipseCompiler {
    static class ByteClassLoader extends ClassLoader {
        private Map<String, byte[]> classMap;


        public ByteClassLoader(Map<String, byte[]> classMap) {
            super();
            this.classMap = classMap;
        }

        protected Class<?> findClass(String name) throws ClassNotFoundException {
            byte[] bytes = classMap.get(name);
            if (bytes == null) {
                return super.findClass(name);
            } else {
                return defineClass(name, bytes, 0, bytes.length);
            }
        }
    }


    static ArrayList<Classpath> cp;
    static Compiler compiler;
    public static NameEnv env; // TODO: just hacking it for now
    static ICompilationUnit[] compUnit;
    static {
        setup();
    }


    public static void setup() {
        compUnit = new ICompilationUnit[1];
        cp = new ArrayList<FileSystem.Classpath>();
        Util.collectRunningVMBootclasspath(cp);

        String classProp = System.getProperty("java.class.path");
        if (classProp != null) {
            StringTokenizer tokenizer = new StringTokenizer(classProp, File.pathSeparator);
            String token;
            while (tokenizer.hasMoreTokens()) {
                token = tokenizer.nextToken();
                FileSystem.Classpath currentClasspath = FileSystem.getClasspath(token, null, null);
                if (currentClasspath != null) {
                    cp.add(currentClasspath);
                } else if (token.length() != 0) {
                    throw new ShenException("classpath error: " + token);
                }
            }
        }

//        DirectClassLoader dcl = env != null ? env.dcl : null;
//        String code = env != null ? env.currentCode : null;
        env = new NameEnv(cp.toArray(new FileSystem.Classpath[cp.size()]), null);
//        env.dcl = dcl;
//        env.currentCode = code;

        CompilerOptions options = new CompilerOptions();
        Map map = options.getMap();
        map.put(CompilerOptions.OPTION_Compliance, CompilerOptions.VERSION_1_6);
        map.put(CompilerOptions.OPTION_Source, CompilerOptions.VERSION_1_6);
        options.set(map);

        compiler = new Compiler(env, DefaultErrorHandlingPolicies.exitAfterAllProblems(), options, null,
                new DefaultProblemFactory());
    }


    public static Map<String, byte[]> compile(String code, String filename) {
        final Map<String, byte[]> classMap = new HashMap<String, byte[]>();
        ICompilerRequestor requestor = new ICompilerRequestor() {
            @Override
            public void acceptResult(CompilationResult result) {
                if (result.hasErrors()) {
                    System.out.println(result);
                    throw new ShenException(result.toString());
                }
                ClassFile[] cf = result.getClassFiles();
                for (int i = 0; i < cf.length; i++) {
                    String name = String.valueOf(CharOperation.concatWith(cf[i].getCompoundName(), '.'));
                    if (!NameEnv.stubsCreated.contains(name)) {
                        classMap.put(name, cf[i].getBytes());
                    }
                }
            }
        };

        NameEnv.stubsCreated.clear();
        compile(code, filename, requestor);
        return classMap;
    }

    public static void compile(String code, String filename, ICompilerRequestor requestor) {
//        setup();
        compiler.requestor = requestor;
        env.currentCode = code;
        compUnit = new CompilationUnit[] { new CompilationUnit(code.toCharArray(), filename, null) };
        compiler.compile(compUnit);
        compiler.requestor = null;
    }

    // public static void main(String[] args) {
    // // String code = "public class Test { public static void test() { System.out.println(\"Hello, world.\"); }}";
    // // String classname = "Test";
    // // String filename = "Test.java";
    //
    // String code = StringUtil
    // .readFully(new File(
    // "C:\\dev\\git-local\\shenj\\Shen-on-Java\\src\\main\\java\\com\\mentics\\shenj\\inner\\Primitives.java"));
    // final String classname = "com.mentics.shenj.inner.Primitives";
    // String filename = classname + ".java";
    //
    // ICompilerRequestor requestor = new ICompilerRequestor() {
    // @Override
    // public void acceptResult(CompilationResult result) {
    // ClassFile[] cf = result.getClassFiles();
    // HashMap<String, byte[]> classMap = new HashMap<String, byte[]>();
    // classMap.put(classname, cf[0].getBytes());
    // ByteClassLoader cl = new ByteClassLoader(classMap);
    // try {
    // Class<?> c = cl.loadClass(classname);
    // // Method m = c.getMethod("test");
    // // m.invoke(null);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
    // };
    //
    // ICompilerRequestor requestor2 = new ICompilerRequestor() {
    // @Override
    // public void acceptResult(CompilationResult result) {
    // ClassFile[] cf = result.getClassFiles();
    // HashMap<String, byte[]> classMap = new HashMap<String, byte[]>();
    // classMap.put(classname, cf[0].getBytes());
    // }
    // };
    //
    //
    // compile(code, filename, requestor);
    // compile(code, filename, requestor);
    //
    //
    // long start = System.nanoTime();
    // for (int i = 0; i < 1000; i++) {
    // compile(code, filename, requestor);
    // }
    // long end = System.nanoTime();
    // System.out.println("Time per thousand: " + (end - start) / 1000000000.0);
    // }
}
