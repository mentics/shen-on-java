package shenj.root;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.cl.CLProvider;


public class SetContext {

    public static final Symbol SYMBOL = symbol("set-context");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6932) throws Exception {
            return defined(v6932);
        }
    };


    public static Object defined(final Object context) throws Exception {
        ShenjRuntime.setCurrentContext((CLProvider) context);
        return context;
    }
}
