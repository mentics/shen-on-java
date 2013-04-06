package com.mentics.ecj;

import static org.junit.Assert.*;

import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.eclipse.jdt.internal.compiler.ICompilerRequestor;
import org.junit.Test;

public class EclipseCompilerTest {
    @Test
    public void testCompile() {
        String code = "package test; public class TestClass { public int meth(String param) { return param.length(); }}";
        String filename = "TestClass.java";
        ICompilerRequestor requestor = new ICompilerRequestor() {
            @Override
            public void acceptResult(CompilationResult result) {
                assertEquals(0, result.problemCount);
            }
        };
        EclipseCompiler.compile(code, filename, requestor);
    }
    
    @Test
    public void testCascadeCompile() {
        String code = "package test; public class TestClass { public Object meth(String param) throws Exception { return test.pkg.NotFound.LAMBDA.apply(\"blue\"); }}";
        String filename = "TestClass.java";
        ICompilerRequestor requestor = new ICompilerRequestor() {
            @Override
            public void acceptResult(CompilationResult result) {
//                System.out.println(result);
                assertEquals(0, result.problemCount);
            }
        };
        EclipseCompiler.compile(code, filename, requestor);
    }
}
