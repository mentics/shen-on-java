package com.mentics.shenj.cl;

import static com.mentics.shenj.ShenException.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static java.util.Arrays.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;

import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.CharSequenceCompiler;
import com.mentics.shenj.CharSequenceCompilerException;
import com.mentics.shenj.JavaFileObjectSource;
import com.mentics.shenj.Lang;
import com.mentics.shenj.ShenException;
import com.mentics.util.StringUtil;


public class CLProvider implements JavaFileObjectSource {
    // Static Methods //

    public static CLProvider newEmpty() {
        return new CLProvider(DirectClassLoader.createEmptyImage());
    }

    public static CLProvider newDefault() {
        return new CLProvider(DirectClassLoader.loadDefaultImage());
    }

    public static CLProvider newFromImage(Input in) {
        return new CLProvider(DirectClassLoader.loadFromImage(in));
    }


    private static int id;


    // Instance Fields //

    private DirectClassLoader dcl;


    // Constructors //

    public CLProvider(DirectClassLoader dcl) {
        System.out.println("Creating new CLProvider: " + (++id));
        this.dcl = dcl;
    }


    // Public Methods //

    public Object eval(String className, String classContent) {
        try {
            compileTask((String) dcl.getGlobalProps().get(SRC_DIR_SYM), (String) className, (String) classContent);
            // TODO: fix this when work with packages
            if (!className.startsWith("shen.gen.")) {
                className = "shen.gen." + className;
            }
            return dcl.runClass((String) className);
        } catch (Exception e) {
            rethrow(e);
            return null; // unreachable code
        }
    }

    public void saveImage(Output out) {
        dcl.saveImage(out);
    }

    public Object apply(String className, Object arg) {
        return dcl.apply(className, arg);
    }

    public Object apply(String className) {
        return dcl.apply(className);
    }

    public Object copy() {
        return new CLProvider(dcl.copy(new HashMap<String, byte[]>(), false));
    }

    public void registerAll(Map<String, byte[]> toReg) {
        dcl.registerAll(toReg);
    }


    public Map<String, byte[]> compileTask(String srcDir, final String className, final String classContent)
            throws CharSequenceCompilerException {
        if (srcDir != null) {
            StringUtil.writeToFile(classContent, new File(srcDir, StringUtil.lastToken(".", className) + ".java"));
        }

        CharSequenceCompiler compiler = new CharSequenceCompiler(this, asList("-g"));

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        Map<String, byte[]> newClasses = compiler.compileToBytes(Lang.mapOf(className, (CharSequence) classContent),
                diagnostics);
        dcl = dcl.newWith(newClasses);
        boolean retry = false;
        List<String> errors = new ArrayList<>();
        if (!diagnostics.getDiagnostics().isEmpty()) {
            for (Diagnostic<? extends JavaFileObject> d : diagnostics.getDiagnostics()) {
                if (d.getKind() == Diagnostic.Kind.ERROR) {
                    // System.out.println("Found error: " + d.getCode()); // compiler.err.cant.resolve.location
                    String msg = d.getMessage(null);

                    String missingClassFQN = tryPackage1(msg);
                    if (missingClassFQN == null) {
                        missingClassFQN = tryPackage2(msg);
                    }

                    if (missingClassFQN == null && msg.contains("cannot find symbol")
                            && Pattern.compile("symbol:\\s+?variable").matcher(msg).find()) {
                        // System.out.println(msg);
                        Pattern p = Pattern.compile("location:\\s+?class\\s(.+?)$");
                        Matcher matcher = p.matcher(msg);
                        matcher.find();
                        try {
                            missingClassFQN = matcher.group(1);
                        } catch (Exception e) {
                            System.out.println("could not parse message:\n" + msg);
                            System.out.println("for class contents:\n" + classContent);
                            e.printStackTrace();
                        }
                    }

                    if (missingClassFQN != null) {
                        int numParams = Lang.methodParamCount(classContent, StringUtil.lastToken(".", missingClassFQN)
                                + ".LAMBDA.apply");
                        if (numParams != -1) {
                            // newClasses.putAll();
                            createStubFunction(srcDir, missingClassFQN, numParams);
                            retry = true;
                        } else {
                            errors.add(d.toString());
                        }
                    } else {
                        System.out.println("Couldn't find fqn: " + d);
                        errors.add(d.toString());
                    }
                }
            }
        }
        if (retry) {
            compileTask(srcDir, className, classContent);
            // newClasses.putAll();
        } else if (errors.size() > 0) {
            throw new ShenException(errors.toString());
        }
        return null;
    }

    @Override
    public Collection<JavaFileObject> files(String packageName) {
        return dcl.files(packageName);
    }


    // Local Methods //

    /**
     * symbol: class LAMBDA
     * location: package Map
     */
    private String tryPackage2(String msg) {
        String ret = null;
        Pattern packageErrorPattern = Pattern.compile("location\\: package\\s(.+?)$");
        Matcher packageErrorMatcher = packageErrorPattern.matcher(msg);
        if (packageErrorMatcher.find()) {
            ret = "shen.gen." + packageErrorMatcher.group(1);
            // System.out.println("found package 2: " + ret + " in message: " + msg);
        }
        return ret;
    }

    private String tryPackage1(String msg) {
        String ret = null;
        Pattern packageErrorPattern = Pattern.compile("package\\s(.+?)\\sdoes not exist");
        Matcher packageErrorMatcher = packageErrorPattern.matcher(msg);
        if (packageErrorMatcher.find()) {
            ret = "shen.gen." + packageErrorMatcher.group(1);
        }
        return ret;
    }

    private void createStubFunction(String srcDir, String missingClassFQN, int numParams)
            throws CharSequenceCompilerException {
        // System.out.println("stub compile: " + missingClassFQN);
        StringBuilder classContent = new StringBuilder();
        String sig = "";
        for (int i = 0; i < numParams; i++) {
            sig += "Object arg" + i + ", ";
        }
        if (numParams > 0) {
            sig = sig.substring(0, sig.length() - 2);
        }
        classContent.append("package " + StringUtil.removeLastToken(".", missingClassFQN) + ";");
        classContent.append("import com.mentics.shenj.*;");
        classContent.append("public class " + StringUtil.lastToken(".", missingClassFQN) + " {");
        classContent.append("public static final Lambda LAMBDA = new Lambda" + numParams + "() {");
        classContent.append("public Object apply(" + sig + ") {");
        classContent.append("  throw new ShenException(\"Function " + missingClassFQN + " is not defined.\");");
        classContent.append("} }; }");
        compileTask(srcDir, missingClassFQN, classContent.toString());
    }
}
