package shen.gen;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class NewSubContext {

    public static final Symbol SYMBOL = ShenjRuntime.symbol("new-sub-context");

    public static Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            return defined();
        }
    };


    public static Object defined() throws Exception {
        return ShenjRuntime.getCurrentContext().newEmpty();
    }
}
