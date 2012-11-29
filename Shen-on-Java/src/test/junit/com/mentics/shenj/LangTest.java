package com.mentics.shenj;

import org.junit.Assert;
import org.junit.Test;

import com.mentics.shenj.Lang;


public class LangTest {
    @Test
    public void testCommaCount() {
        Assert.assertEquals(0, Lang.methodParamCount("various \n other\n things \n Kl.defined()", "defined"));
        Assert.assertEquals(1, Lang.methodParamCount("various \n other\n things \n Kl.defined(asdf)", "defined"));
        Assert.assertEquals(
                2,
                Lang.methodParamCount(
                        "various \n other\n things \n ShenShenToKl.defined(((Cons)((Cons)V657).tail).head, ((Cons)((Cons)V657).tail).tail)",
                        "ShenShenToKl.defined"));
    }
}
