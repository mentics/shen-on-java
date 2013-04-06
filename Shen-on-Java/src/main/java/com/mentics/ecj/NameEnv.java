package com.mentics.ecj;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.compiler.CharOperation;
import org.eclipse.jdt.internal.compiler.batch.CompilationUnit;
import org.eclipse.jdt.internal.compiler.batch.FileSystem;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileReader;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFormatException;
import org.eclipse.jdt.internal.compiler.env.NameEnvironmentAnswer;

import com.mentics.shenj.Lang;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.cl.DirectClassLoader;


public class NameEnv extends FileSystem {
    public static List<String> stubsCreated = new ArrayList<>();
    String currentCode;
    public DirectClassLoader dcl;


    protected NameEnv(Classpath[] paths, String[] initialFileNames) {
        super(paths, initialFileNames);
    }

    @Override
    public boolean isPackage(char[][] parentPackageName, char[] packageName) {
        if (super.isPackage(parentPackageName, packageName)) {
            return true;
        } else {
            char[] concatWith = CharOperation.concatWith(parentPackageName, '.');
            // StringBuilder str = new StringBuilder();
            String pkgName = String.valueOf(concatWith) + "." + String.valueOf(packageName);
            String withLambda = pkgName + ".LAMBDA";
            return currentCode.indexOf(pkgName) >= 0 && currentCode.indexOf(withLambda) == -1;
        }
    }

    @Override
    public NameEnvironmentAnswer findType(char[] typeName, char[][] packageName) {
        NameEnvironmentAnswer findType = super.findType(typeName, packageName);
        if (findType != null) {
            // if (String.valueOf(CharOperation.concatWith(packageName, '.')).indexOf("shenj") >= 0) {
            // System.out.println("NameEnv found already loaded: " + String.valueOf(typeName));
            // }
            return findType;
        } else {
            // if ("test".equals(String.valueOf(packageName[0]))) {
            // System.out.println("looking for it");
            // }
            // Create stub then try to find it again.
            String pkgName = String.valueOf(CharOperation.concatWith(packageName, '.'));
            String className = String.valueOf(typeName);
            String fqn = pkgName + "." + className;
            byte[] localClass = dcl.localClass(fqn);
            if (localClass != null) {
                // System.out.println("NameEnv found local class: " + fqn);
                try {
                    return new NameEnvironmentAnswer(new ClassFileReader(localClass, CharOperation.concat(typeName,
                            ".java".toCharArray())), null);
                } catch (ClassFormatException e) {
                    ShenException.rethrow(e);
                }
            }

            // TODO: need a better way of filtering out what is and is not a class and what should be stubbed.
            int numParams = Lang.methodParamCount(currentCode, "." + className + ".LAMBDA.apply");
            if (numParams >= 0) {
                String stubCode = createStubFunction(null, pkgName, className, numParams);

                return new NameEnvironmentAnswer(
                        new CompilationUnit(stubCode.toCharArray(), className + ".java", null), null);
            } else {
                return null;
            }
        }
    }

    @Override
    public NameEnvironmentAnswer findType(char[][] compoundTypeName) {
        NameEnvironmentAnswer findType = super.findType(compoundTypeName);
        if (findType != null) {
            return findType;
        } else {
            // Create stub then try to find it again.
            StringBuilder pkgName = new StringBuilder();
            for (int i = 0; i < compoundTypeName.length - 1; i++) {
                if (i != 0) {
                    pkgName.append('.');
                }
                pkgName.append(compoundTypeName[i]);
            }
            String className = String.valueOf(compoundTypeName[compoundTypeName.length - 1]);

            int numParams = Lang.methodParamCount(currentCode, "." + className + ".LAMBDA.apply");
            if (numParams >= 0) {
                String stubCode = createStubFunction(null, pkgName.toString(), className, numParams);

                return new NameEnvironmentAnswer(
                        new CompilationUnit(stubCode.toCharArray(), className + ".java", null), null);
            } else {
                return null;
            }
        }
    }

    @Override
    public void cleanup() {
        super.cleanup();
    }

    private static String createStubFunction(String srcDir, String pkgName, String className, int numParams) {
        StringBuilder classContent = new StringBuilder();

        String sig = "";
        for (int i = 0; i < numParams; i++) {
            sig += "Object arg" + i + ", ";
        }
        if (numParams > 0) {
            sig = sig.substring(0, sig.length() - 2);
        }
        if (pkgName.length() > 0) {
            classContent.append("package " + pkgName + ";");
        }
        classContent.append("import com.mentics.shenj.*;");
        classContent.append("public class " + className + " {");
        classContent.append("public static boolean STUB = true;");
        classContent.append("public static Lambda LAMBDA = new Lambda" + numParams + "() {");
        classContent.append("public Object apply(" + sig + ") {");
        classContent.append("System.out.println(\"stub cl: \"+this.getClass().getClassLoader().toString());");
        classContent.append("  throw new ShenException(\"Function " + pkgName + "." + className
                + " is not defined.\");");
        classContent.append("} }; }");

//        System.out.println("Created stub function: " + className);
        stubsCreated.add(pkgName + "." + className);
        return classContent.toString();
    }
}