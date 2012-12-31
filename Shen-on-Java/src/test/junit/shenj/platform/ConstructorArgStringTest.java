package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;
import static com.mentics.shenj.cl.DirectClassLoader.*;
import static com.mentics.util.ReflectionUtil.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mentics.shenj.Cons;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.cl.CLProvider;


public class ConstructorArgStringTest {
    @BeforeClass
    public static void classSetUp() {
//        currentContext.set(new CLProvider(createEmptyImage(threadClassLoader())));
    }

    @Test
    public void test() throws Exception {
        assertEquals("(String)\"title\"",
                ConstructorArgString.LAMBDA.apply("javax.swing.JFrame", Cons.makeCons("\"title\"", SPLITTER, "String")));
        assertEquals("\"one\", \"title\"",
                ConstructorArgString.LAMBDA.apply("com.mentics.shenj.Cons", Cons.makeCons("\"one\"", "\"title\"")));
        assertEquals("(java.lang.String)\"one\", (java.lang.Throwable)null",
                ConstructorArgString.LAMBDA.apply("java.lang.Exception", Cons.makeCons("\"one\"", "null")));
    }

    @Test
    public void testHard() throws Exception {
        try {
            ConstructorArgString.LAMBDA.apply("shenj.platform.TestOverride",
                    Cons.makeCons("\"one\"", "\"two\"", "\"three\""));
            fail("Should have raised ambiguous constructor");
        } catch (ShenException e) {
            assertTrue(e.getMessage().startsWith("Ambiguous constructor"));
        }

        assertEquals(
                "(int)\"one\", (Object)\"two\", (java.lang.String)\"three\"",
                ConstructorArgString.LAMBDA.apply("shenj.platform.TestOverride",
                        Cons.makeCons("\"one\"", SPLITTER, "int", "\"two\"", SPLITTER, "Object", "\"three\"")));
    }

    @Test
    public void testReplFailures() throws Exception {
        ConstructorArgString.LAMBDA.apply("javax.swing.JFrame",
                Cons.makeCons("com.mentics.shenj.inner.Context.GLOBAL_PROPERTIES_NAME", SPLITTER, "symbol(\"String\")"));
    }
}