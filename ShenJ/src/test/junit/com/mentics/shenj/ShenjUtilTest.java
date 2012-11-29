package com.mentics.shenj;

import static com.mentics.shenj.ShenjUtil.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class ShenjUtilTest {
    @Test
    public void test() throws Exception {
        List<String[]> actual = makeTypePairList(new Object[] { "\"blue\"" });
        assertEquals(1, actual.size());
        assertArrayEquals(new String[] { "\"blue\"", "*" }, actual.get(0));

        actual = makeTypePairList(new Object[] { "\"blue\"", "symbol(\":\")", "symbol(\"String\")" });
        assertEquals(1, actual.size());
        assertArrayEquals(new String[] { "\"blue\"", "String" }, actual.get(0));
    }
}
