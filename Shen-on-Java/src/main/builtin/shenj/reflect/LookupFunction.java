package shenj.reflect;


import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;


public class LookupFunction {
    public static final Symbol SYMBOL = symbol("shenj.reflect/lookup-function");
    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object key) throws Exception {
            Lambda l = ShenjRuntime.getCurrentContext().getFunctions().get(key);
            if (l == null) {
                String s = key.toString();
                if (s.startsWith("shenj.dot/")) {
                    
                }
            }
            return l != null ? l : Nil.NIL;
        }
    };
}