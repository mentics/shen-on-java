package com.mentics.shen;

import java.util.Collections;
import java.util.List;


public class Nil {
    public static Nil NIL = new Nil();


    private Nil() {
    }

    public Object tail() {
        throw new RuntimeException("Tail expects non-empty list.");
    }

    public Object head() {
        throw new RuntimeException("Head expects non-empty list.");
    }

    public List<Object> forEach(Lambda1 f) {
        return Collections.EMPTY_LIST;
    }

    @Override
    public boolean equals(Object other) {
        return other == NIL || other instanceof Nil;
    }

    @Override
    public String toString() {
        return "()";
    }
}
