package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.SwitchError;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.cl.DirectClassLoader;


public class SetContext {

    public static final Symbol SYMBOL = symbol("set-context");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object dcl) throws Exception {
            // ShenjRuntime.setCurrentContext((CLProvider) context);
            // return context;
            throw new SwitchError((DirectClassLoader) dcl, false);
        }
    };
}
