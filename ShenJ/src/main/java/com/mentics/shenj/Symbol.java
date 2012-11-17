package com.mentics.shenj;


public class Symbol {
    private String label;


    Symbol() {
    }

    public Symbol(String label) {
        this.label = label;
    }

    public int hashCode() {
        return label.hashCode();
    }

    public boolean equals(Object o) {
        return o != null && o instanceof Symbol && ((Symbol) o).label.equals(label);
    }

    public String toString() {
        return label;
    }
}
