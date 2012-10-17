package com.mentics.shen;

import org.junit.Test;


public class TestKlstuff {
    @Test
    public void testToEval() throws Exception {
        RuntimeContext.globalProperties.put(RuntimeContext.symbol("shen-*system*"), Nil.NIL);
//        System.out.println(ToEval.run());
    }

    @Test
    public void test() throws Exception {
        System.out.println(shen.gen.Vector.defined((Object) 128.0));
    }
}
