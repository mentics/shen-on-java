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
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.cl.CLProvider;


public class InstanceMethodArgInfoTest {
    @BeforeClass
    public static void classSetUp() {
//        currentContext.set(new CLProvider(createEmptyImage(threadClassLoader())));
    }

    @Test
    public void test() throws Exception {
        assertArrayEquals(
                tuple("void", "(boolean)\"title\""),
                (Object[]) InstanceMethodArgInfo.LAMBDA.apply("setVisible",
                        Cons.makeCons(SPLITTER, "symbol(\"javax.swing.JFrame\")", "\"title\"")));
    }

    @Test
    public void testHard() throws Exception {
        try {
            InstanceMethodArgInfo.LAMBDA.apply("foo", Cons.makeCons(SPLITTER,
                    "symbol(\"shenj.platform.TestOverride\")", "\"one\"", "\"two\"", "\"three\""));
            fail("Should have raised ambiguous constructor");
        } catch (ShenException e) {
            assertTrue(e.getMessage().startsWith("Ambiguous method"));
        }

        InstanceMethodArgInfo.LAMBDA.apply("foo", Cons.makeCons(SPLITTER, "symbol(\"shenj.platform.TestOverride\")",
                "\"one\"", ShenjUtil.SPLITTER, "int", "\"two\"", ShenjUtil.SPLITTER, "Object", "\"three\""));
    }
}
