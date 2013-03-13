package com.mentics.shenj.inner;

import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.util.ReflectionUtil.*;
import static org.junit.Assert.*;

import org.junit.Test;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Nil;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.cl.DirectClassLoader;


public class EvalKlTest {
    @Test
    public void testEvalKl() throws Exception {
        DirectClassLoader dcl = DirectClassLoader.loadDefaultImage(threadClassLoader());

        assertEquals(3.0, evalKl(dcl, 3.0));
        assertEquals(17.8, evalKl(dcl, 17.8));
        assertEquals("purple", evalKl(dcl, "purple"));
        assertEquals(new Symbol("blue"), evalKl(dcl, new Symbol("blue")));
        assertEquals(4.0, evalKl(dcl, new Cons(symbol("+"), new Cons(2.0, new Cons(2.0, Nil.NIL)))));
    }

    public static Object evalKl(DirectClassLoader dcl, Object o) {
        return dcl.apply("shen.root.EvalKl", o);
    }
}
