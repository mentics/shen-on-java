package shenj.platform;


import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;


public class InstallPrimitives {

    public static final Symbol SYMBOL = ShenjRuntime.symbol("install-primitives");

    public static Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            return defined();
        }
    };


    public static Object defined() throws Exception {
        Context.loadPrimitives();
        return true;
    }
}
