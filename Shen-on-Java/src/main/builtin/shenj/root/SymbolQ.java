package shenj.root;


import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.inner.Primitives.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;


public class SymbolQ {
    public static final Symbol SYMBOL = symbol("symbol?");
    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v1799) throws Exception {
            return v1799 instanceof Symbol;
        }
    };
}