package shenj.reflect;


import static com.mentics.shenj.Nil.*;
import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.cl.CLProvider;


public class LookupFunction {
    public static final Symbol SYMBOL = symbol("shenj.reflect/lookup-function");
    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object key) throws Exception {
            CLProvider context = ShenjRuntime.getCurrentContext();
            Lambda l = context.getFunctions().get(key);
            if (l == null) {
                String s = key.toString();
                String className = ShenjUtil.removeDotPkg(s.replaceAll("\\#", ""));
                className = className.replace("..", ".");
                try {
                    return context.loadClass(className) != null ? symbol(className) : NIL;
                } catch (ClassNotFoundException e) {
                    try {
                        return context.loadClass("java.lang." + className) != null ? symbol("java.lang."+className) : NIL;
                    } catch (ClassNotFoundException e2) {
                        // ignore
                    }
                    // if (s.startsWith("shenj.dot/")) {
                    // Object t = Primitives.evalKl(makeCons(symbol("parse-java-call-symbol"),
                    // makeCons(symbol("intern"), s))) == Nil.NIL ? Nil.NIL : key;
                    // if (symbol("static-method").equals(ShenjUtil.first(t))) {
                    //
                    // }
                    // }
                }
            }
            return l != null ? key : Nil.NIL;
        }
    };
}