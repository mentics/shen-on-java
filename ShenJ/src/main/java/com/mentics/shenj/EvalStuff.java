package com.mentics.shenj;

import static java.util.Arrays.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaFileObject;

import com.mentics.util.StringUtil;


public class EvalStuff {
    public static Map<String, byte[]> compileTask(String srcDir, final String className, final String classContent,
            DirectClassLoader loader) throws CharSequenceCompilerException {
        if (srcDir != null) {
            // System.out.println("wrote out "+className);
            StringUtil.writeToFile(classContent, new File(srcDir, StringUtil.lastToken(".", className) + ".java"));
        }

        // System.out.println("Compiling " + className);
        CharSequenceCompiler compiler = new CharSequenceCompiler(loader, asList("-g"));

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        Map<String, byte[]> newClasses = compiler.compileToBytes(Lang.mapOf(className, (CharSequence) classContent),
                diagnostics);

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
                            newClasses.putAll(createStubFunction(srcDir, missingClassFQN, numParams, loader));
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
            newClasses.putAll(compileTask(srcDir, className, classContent, loader.newWith(newClasses)));
        } else if (errors.size() > 0) {
            throw new ShenException(errors.toString());
        }
        return newClasses;
    }

    /**
     * symbol: class LAMBDA
     * location: package Map
     */
    private static String tryPackage2(String msg) {
        String ret = null;
        Pattern packageErrorPattern = Pattern.compile("location\\: package\\s(.+?)$");
        Matcher packageErrorMatcher = packageErrorPattern.matcher(msg);
        if (packageErrorMatcher.find()) {
            ret = "shen.gen." + packageErrorMatcher.group(1);
            // System.out.println("found package 2: " + ret + " in message: " + msg);
        }
        return ret;
    }

    private static String tryPackage1(String msg) {
        String ret = null;
        Pattern packageErrorPattern = Pattern.compile("package\\s(.+?)\\sdoes not exist");
        Matcher packageErrorMatcher = packageErrorPattern.matcher(msg);
        if (packageErrorMatcher.find()) {
            ret = "shen.gen." + packageErrorMatcher.group(1);
        }
        return ret;
    }

    private static Map<String, byte[]> createStubFunction(String srcDir, String missingClassFQN, int numParams,
            DirectClassLoader loader) throws CharSequenceCompilerException {
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
        return compileTask(srcDir, missingClassFQN, classContent.toString(), loader);
    }
}
