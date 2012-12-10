package com.mentics.shenj;

import static org.junit.Assert.*;

import org.junit.Test;


public class LangTest {
    @Test
    public void testCommaCount() {
        assertEquals(0, Lang.methodParamCount("various \n other\n things \n Kl.defined()", "defined"));
        assertEquals(1, Lang.methodParamCount("various \n other\n things \n Kl.defined(asdf)", "defined"));
        assertEquals(
                2,
                Lang.methodParamCount(
                        "various \n other\n things \n ShenShenToKl.defined(((Cons)((Cons)V657).tail).head, ((Cons)((Cons)V657).tail).tail)",
                        "ShenShenToKl.defined"));
    }

    @Test
    public void testCast() {
        Object x = Double.valueOf(15d);
        int i = (int) (double) x;
        assertEquals(15, i);
    }

    @Test
    public void testInteger() {
        double d = 5.0d;
        int i = 5;
        assertTrue(i == d);
        double d2 = 5.01d;
        assertTrue(i != d2);
    }

    @Test
    public void testModulus() {
        assertEquals(1.0d, 7.0d % 3.0d, 0.001d);
        assertEquals(2.0d, 8.0d % 3.0d, 0.001d);
    }

    @Test
    public void testDouble() {
        Double d1 = (double) (100 + "blue".length());
        Double d2 = (double) (100 + "fred".length());
        assertTrue((double)d1 == (double)d2);
    }
}
