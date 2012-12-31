package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;
import static com.mentics.shenj.cl.DirectClassLoader.*;
import static com.mentics.util.ReflectionUtil.*;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenException;
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.cl.CLProvider;


public class StaticMethodArgInfoTest {
    @BeforeClass
    public static void classSetUp() {
//        currentContext.set(new CLProvider(createEmptyImage(threadClassLoader())));
    }

    @Test
    public void test() throws Exception {
        assertArrayEquals(tuple("double", ""),
                (Object[]) StaticMethodArgInfo.LAMBDA.apply("java.lang.Math.random", Nil.NIL));
    }

    @Test
    public void testHard() throws Exception {
        try {
            StaticMethodArgInfo.LAMBDA.apply("shenj.platform.TestOverride.bar",
                    Cons.makeCons("\"one\"", "\"two\"", "\"three\""));
            fail("Should have raised ambiguous constructor");
        } catch (ShenException e) {
            assertTrue(e.getMessage().startsWith("Ambiguous static method"));
        }

        StaticMethodArgInfo.LAMBDA.apply("shenj.platform.TestOverride.bar", Cons.makeCons("\"one\"", "\"two\"",
                ShenjUtil.SPLITTER, "String", "\"three\"", ShenjUtil.SPLITTER, "int"));
    }
}
