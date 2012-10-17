package com.mentics.shen;

import static com.mentics.shen.RuntimeContext.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.FileObject;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;


/**
 * TODO: figure out how to compile direct calls: standard naming convention?
 * static call: [name of call converted to valid unique java identifier].apply(context, ...);
 * then any primitives that we don't encode inline can do the same
 * 
 * 
 * 
 * shen-test.image "
 * Class-name " " File " C:\dev\workspace\ShenJ\target\classes")
 */
public class UpdateImage {
    private static final String COMPILE_TO_DIRECTORY = "*compile-to-directory*";
    private static final Symbol COMPILE_DIR_SYM = symbol(COMPILE_TO_DIRECTORY);
    private static final String GEN_SOURCE_DIRECTORY = "*gen-source-directory*";
    private static final Symbol SRC_DIR_SYM = symbol(GEN_SOURCE_DIRECTORY);
    static Kryo kryo = new Kryo();


    public static void main(String[] args) {
        try {
            if (!(args.length == 2 || args.length == 4)) {
                System.out
                        .println("Usage\n  ...UpdateImage [image file to update] [class to run] [[file to compile] [compile output directory]]");
                System.exit(1);
            }
            // args = new String[] { "shen.image", "Eval", "src/main/shen/gen/Eval.java", "target/classes" };
            // createTestJavaFile("src/main/shen/gen/Eval.java");
            String fileToCompile = args.length > 2 ? args[2] : null;
            String outputDirectory = args.length > 2 ? args[3] : null;

            Object result = run(args[0], args[1], fileToCompile, outputDirectory);
            if (result instanceof Object[]) {
                result = Arrays.toString((Object[]) result);
            }
            String res = result != null ? result.toString() : "null";
            if (res.length() > 100) {
                System.out.println(res.substring(0, 100));
            } else {
                System.out.print(result);
            }

            // System.out.println("updated image: " + imageFilePath);
        } catch (Throwable t) {
            t.printStackTrace(System.out);
        }
    }

    public static Object run(String imageFile, String classToRun, String fileToCompile, String outputDirectory) {
        // System.out.println("base dir: " + new File(".").getAbsolutePath());

        if (fileToCompile != null) {
            compileTask(fileToCompile, outputDirectory);
        }

        loadImage(imageFile);

        globalProperties.put(SRC_DIR_SYM, new File(fileToCompile).getParentFile().getParentFile().getParentFile()
                .getAbsolutePath());
        globalProperties.put(COMPILE_DIR_SYM, new File(outputDirectory).getAbsolutePath());

        Object result = runClassForName(classToRun);

        saveImage(imageFile);

        return result;
    }

    public static Map<String, byte[]> compile(String className, String code) {
        // System.out.println("source-dir: " + globalProperties.get(SRC_DIR_SYM));
        // System.out.println("compile-dir: " + globalProperties.get(COMPILE_DIR_SYM));

        String baseDir = (String) globalProperties.get(SRC_DIR_SYM);
        File sourceDir = new File(baseDir, "shen/gen/"); // shen/gen is hard coded package for now
        String fileToCompile = new File(sourceDir, className + ".java").getAbsolutePath();
        writeFully(fileToCompile, code);

        String compileToDir = (String) globalProperties.get(COMPILE_DIR_SYM);
        List<String> classFiles = compileTask(fileToCompile, compileToDir);
        Map<String, byte[]> map = new HashMap<String, byte[]>();
        for (String classFile : classFiles) {
            if (new File(classFile).exists()) {
                try {
                    byte[] bytes = readBinaryFile(classFile);
                    map.put(convertFileToClassFQN(compileToDir, classFile), bytes);
                    new File(classFile).delete();
                } catch (Exception e) {
                    System.out.println("**** Error processing class file: " + classFile);
                    ShenException.rethrow(e);
                }
            } else {
                System.out.println("Class file logged for adding to DCL not found: " + classFile);
            }
        }
        return map;
    }

    public static String convertFileToClassFQN(String compileToDir, String classFile) {
        String pathClassWithClass = classFile.substring(compileToDir.length() + 1).replace(File.separatorChar, '.');
        String pathClass = pathClassWithClass.substring(0, pathClassWithClass.length() - ".class".length());
        return pathClass;
    }

    private static byte[] readBinaryFile(String classFile) {
        InputStream in = null;
        try {
            in = new FileInputStream(classFile);
            byte[] bytes = new byte[1000000];
            int count = in.read(bytes);
            byte[] b = new byte[count];
            System.arraycopy(bytes, 0, b, 0, count);
            return b;
        } catch (IOException e) {
            throw new ShenException(e);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                // ignore
            }
        }
    }

    private static List<String> compileTask(String fileToCompile, String outputDirectory) {
        final List<String> classFiles = new ArrayList<>();
        try {
            // System.out.println("compiling: " + fileToCompile);
            File[] files1 = new File[] { new File(fileToCompile) };

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager inner = compiler.getStandardFileManager(null, null, null);
            JavaFileManager fileManager = new ForwardingJavaFileManager<StandardJavaFileManager>(inner) {
                DirectClassLoader cl = new DirectClassLoader(Thread.currentThread().getContextClassLoader(),
                        RuntimeContext.classes);


                @Override
                public JavaFileObject getJavaFileForOutput(Location location, String className,
                        JavaFileObject.Kind kind, FileObject sibling) throws IOException {
                    JavaFileObject o = super.getJavaFileForOutput(location, className, kind, sibling);
                    classFiles.add(o.getName());
                    return o;
                }

                @Override
                public ClassLoader getClassLoader(Location location) {
                    return cl;
                }

                public Iterable<JavaFileObject> list(Location location, String packageName,
                        Set<JavaFileObject.Kind> kinds, boolean recurse) throws IOException {
                    Iterable<JavaFileObject> superResult = super.list(location, packageName, kinds, recurse);
                    if (kinds.contains(JavaFileObject.Kind.CLASS) && "shen.gen".equals(packageName)) {
//                        System.out.println("returning extra classes");
                        List<JavaFileObject> result = new ArrayList<>();
                        for (String cls : RuntimeContext.classes.keySet()) {
                            result.add(new BinaryJavaFileObject(cls, RuntimeContext.classes.get(cls)));
                        }
                        for (JavaFileObject o : superResult) {
                            result.add(o);
                        }
                        return result;
                    } else {
                        return superResult;
                    }
                }

                @Override
                public String inferBinaryName(Location location, JavaFileObject file) {
                    if (file instanceof BinaryJavaFileObject) {
                        return file.getName();
                    } else {
                        return super.inferBinaryName(location, file);
                    }
                }
            };

            Iterable<? extends JavaFileObject> compilationUnits = inner.getJavaFileObjectsFromFiles(Arrays
                    .asList(files1));
            DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
            StringWriter writer = new StringWriter();
            compiler.getTask(writer, fileManager, diagnostics, Arrays.asList(new String[] { "-d", outputDirectory }),
                    null, compilationUnits).call();

            fileManager.close();

            // TODO: report errors
            boolean retry = false;
            List<String> errors = new ArrayList<>();
            if (!diagnostics.getDiagnostics().isEmpty()) {
                for (Diagnostic<? extends JavaFileObject> d : diagnostics.getDiagnostics()) {
                    if (d.getKind() == Diagnostic.Kind.ERROR) {
                        // System.out.println("code: " + d.getCode()); // compiler.err.cant.resolve.location
                        String msg = d.getMessage(null);
                        Pattern packageErrorPattern = Pattern.compile("package\\s(.+?)\\sdoes not exist");
                        Matcher packageErrorMatcher = packageErrorPattern.matcher(msg);

                        String missingClassFQN = null;
                        if (packageErrorMatcher.find()) {
                            missingClassFQN = "shen.gen." + packageErrorMatcher.group(1);
                        } else if (msg.contains("cannot find symbol")
                                && Pattern.compile("symbol:\\s+?variable").matcher(msg).find()) {
                            // System.out.println(msg);
                            Pattern p = Pattern.compile("location:\\s+?class\\s(.+?)$");
                            Matcher matcher = p.matcher(msg);
                            matcher.find();
                            missingClassFQN = matcher.group(1);
                        }

                        if (missingClassFQN != null) {
                            String code = readFully(fileToCompile);
                            int numParams = Lang.methodParamCount(code, lastToken(".", missingClassFQN)
                                    + ".LAMBDA.apply");
                            if (numParams != -1) {
                                classFiles.addAll(createStubFunction(missingClassFQN, numParams, outputDirectory));
                                retry = true;
                            } else {
                                errors.add(d.toString());
                            }
                        } else {
                            errors.add(d.toString());
                        }
                    }
                }
            }
            if (retry) {
                classFiles.addAll(compileTask(fileToCompile, outputDirectory));
            } else if (errors.size() > 0) {
                throw new ShenException(errors.toString());
            }
        } catch (Exception e) {
            if (e instanceof ShenException) {
                throw (ShenException) e;
            } else {
                throw new ShenException(e);
            }
        }
        return classFiles;
    }

    private static String readFully(String fileToCompile) {
        FileReader r = null;
        try {
            r = new FileReader(fileToCompile);
            char[] buffer = new char[1600000]; // TODO: do it right
            int size = r.read(buffer);
            return new String(buffer, 0, size);
        } catch (IOException e) {
            throw new ShenException(e);
        } finally {
            try {
                r.close();
            } catch (IOException e) {
            }
        }
    }

    private static List<String> createStubFunction(String missingClassFQN, int numParams, String outputDirectory) {
        FileWriter out = null;
        String sig = "";
        for (int i = 0; i < numParams; i++) {
            sig += "Object arg" + i + ", ";
        }
        if (numParams > 0) {
            sig = sig.substring(0, sig.length() - 2);
        }
        String file = "C:/dev/workspace/ShenJ/src/main/shen/gen/" + missingClassFQN.replace('.', '/') + ".java";
        try {
            out = new FileWriter(file);
            out.append("package " + removeLastToken(".", missingClassFQN) + ";");
            out.append("import com.mentics.shen.*;");
            out.append("public class " + lastToken(".", missingClassFQN) + " {");
            out.append("public static final Lambda LAMBDA = new Lambda" + numParams + "() {");
            out.append("public Object apply(" + sig + ") {");
            out.append("  throw new ShenException(\"Function " + missingClassFQN + " is not defined.\");");
            out.append("} }; }");
        } catch (Exception e) {
            throw new ShenException(e);
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }
        return compileTask(file, outputDirectory);
    }

    public static Object runClassForName(String classToRun) {
        try {
            Object result = null;
            Class c = Thread.currentThread().getContextClassLoader().loadClass(classToRun);
            return RuntimeContext.runClass(c);
        } catch (Exception e) {
            e.printStackTrace(System.out);
            throw new ShenException(e);
        }
    }

    public static void writeObjects(OutputStream out, Object... objects) {
        Output output = null;
        try {
            output = new Output(out);
            for (Object o : objects) {
                kryo.writeClassAndObject(output, o);
            }
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public static List<Object> readObjects(InputStream in, Class... classes) {
        List<Object> result = new ArrayList<>();
        Input input = null;
        try {
            input = new Input(in);
            for (Class c : classes) {
                try {
                    result.add(kryo.readClassAndObject(input));
                } catch (Exception e) {
                    e.printStackTrace();
                    result.add(e.getMessage());
                }
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return result;
    }

    public static void saveImage(String imageFilePath) {
        try {
//            System.out.println("saving image: " + imageFilePath);
            RuntimeContext.saveImage(new FileOutputStream(imageFilePath));
        } catch (FileNotFoundException e) {
            throw new ShenException(e);
        }
    }

    static void loadImage(String imageFilePath) {
        try {
//            System.out.println("loading image: " + imageFilePath);
            RuntimeContext.loadImage(new FileInputStream(imageFilePath));
        } catch (FileNotFoundException e) {
            System.out.println("Image file not found: " + imageFilePath);
        }
    }

    public static void testCode(String code, String className) throws IOException {
        File f = new File("src/main/shen/gen/shen/gen/" + className + ".java");
        FileWriter writer = new FileWriter(f);
        writer.write(code);
        writer.close();
        f.deleteOnExit();
        main(new String[] { "shen.image", "shen.gen." + className, f.getAbsolutePath(), "target/classes" });
    }


    public static String lastToken(final String delim, final String str) {
        return !isBlank(str) ? str.substring(str.lastIndexOf(delim) + 1) : "";
    }

    public static String removeLastToken(final String delim, final String name) {
        final int index = name.lastIndexOf(delim);
        if (index != -1) {
            return name.substring(0, index);
        } else {
            return name;
        }
    }

    public static boolean isBlank(final String text) {
        return (text == null) || text.length() == 0;
    }

    public static void writeFully(String path, String code) {
        Writer out = null;
        try {
            out = new FileWriter(path);
            out.write(code);
        } catch (IOException e) {
            throw new ShenException(e);
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                // ignore
            }
        }
    }
}
