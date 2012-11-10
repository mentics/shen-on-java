package com.mentics.shen;

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
            CharSequenceCompiler compiler) throws CharSequenceCompilerException {
        if (srcDir != null) {
//            System.out.println("wrote out "+className);
            StringUtil.writeToFile(classContent, new File(srcDir, StringUtil.lastToken(".", className) + ".java"));
        }

        DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
        Map<String, byte[]> newClasses = compiler.compileToBytes(Lang.mapOf(className, (CharSequence) classContent),
                diagnostics);

        boolean retry = false;
        List<String> errors = new ArrayList<>();
        if (!diagnostics.getDiagnostics().isEmpty()) {
            for (Diagnostic<? extends JavaFileObject> d : diagnostics.getDiagnostics()) {
                if (d.getKind() == Diagnostic.Kind.ERROR) {
//                     System.out.println("Found error: " + d.getCode()); // compiler.err.cant.resolve.location
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
                        int numParams = Lang.methodParamCount(classContent, StringUtil.lastToken(".", missingClassFQN)
                                + ".LAMBDA.apply");
                        if (numParams != -1) {
                            newClasses.putAll(createStubFunction(srcDir, missingClassFQN, numParams, compiler));
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
            newClasses.putAll(compileTask(srcDir, className, classContent, compiler));
        } else if (errors.size() > 0) {
            throw new ShenException(errors.toString());
        }
        return newClasses;
    }

    private static Map<String, byte[]> createStubFunction(String srcDir, String missingClassFQN, int numParams,
            CharSequenceCompiler compiler) throws CharSequenceCompilerException {
        StringBuilder classContent = new StringBuilder();
        String sig = "";
        for (int i = 0; i < numParams; i++) {
            sig += "Object arg" + i + ", ";
        }
        if (numParams > 0) {
            sig = sig.substring(0, sig.length() - 2);
        }
        classContent.append("package " + StringUtil.removeLastToken(".", missingClassFQN) + ";");
        classContent.append("import com.mentics.shen.*;");
        classContent.append("public class " + StringUtil.lastToken(".", missingClassFQN) + " {");
        classContent.append("public static final Lambda LAMBDA = new Lambda" + numParams + "() {");
        classContent.append("public Object apply(" + sig + ") {");
        classContent.append("  throw new ShenException(\"Function " + missingClassFQN + " is not defined.\");");
        classContent.append("} }; }");
        return compileTask(srcDir, missingClassFQN, classContent.toString(), compiler);
    }
}
