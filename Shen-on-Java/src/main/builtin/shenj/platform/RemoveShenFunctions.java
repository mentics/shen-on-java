package shenj.platform;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;


public class RemoveShenFunctions {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("shenj.platform/remove-shen-functions");

    public static Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            return Context.removeShenFunctions();
        }
    };
}
