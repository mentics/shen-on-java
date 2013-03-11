package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;
import static org.junit.Assert.*;
import static shenj.platform.SubClassInfo.*;

import org.junit.Test;

import com.mentics.shenj.Cons;
import com.mentics.shenj.ShenjUtil;


public class SubClassInfoTest {
    @Test
    public void test() throws Exception {
        Object[] methods = new Object[] { symbol("run"), symbol(":"), symbol("do-something") };
        assertEquals("public void run() {\n" + "do-something()\n" + "}\n",
                methodStuff("java.lang.Runnable", methods));
    }

    @Test
    public void testWhole() throws Exception {
        Object args = Cons.makeCons(symbol("handle"), symbol(":"), symbol("do-something"));
        assertArrayEquals(ShenjUtil.tuple("", "public void handle(javafx.event.Event arg0) {\n" + "do-something(arg0)\n" + "}\n"),
                (Object[])LAMBDA.apply("javafx.event.EventHandler", args));
    }
}
