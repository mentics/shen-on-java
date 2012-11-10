package com.mentics.shen;

import static com.mentics.shen.Primitives.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class RuntimeContextTest {
    @Test
    public void testEvalKl() throws Exception {
        RuntimeContext.loadImage(Thread.currentThread().getContextClassLoader()
                .getResourceAsStream("shenj/platform/image/shenj-base.image"));
        System.out.println(RuntimeContext.classes.size());
        assertEquals(3, evalKl(3));
        assertEquals(17.8, evalKl(17.8));
        assertEquals("purple", evalKl("purple"));
        assertEquals(new Symbol("blue"), evalKl(new Symbol("blue")));
    }
}
