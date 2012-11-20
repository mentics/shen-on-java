package com.mentics.shenj;

import java.util.Map;


public class MapUtil {
    public static <K, V> boolean containsAny(Map<K, V> classes, Iterable<K> search) {
        for (K key : search) {
            if (classes.containsKey(key)) {
                return true;
            }
        }
        return false;
    }
}
