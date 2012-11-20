package shen.gen;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.*;
import com.mentics.shenj.cl.*;


public class SetEvalContext {

    public static final Symbol SYMBOL = symbol("set-eval-context");

    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6932) throws Exception {
            return defined(v6932);
        }
    };


    public static Object defined(final Object context) throws Exception {
        //ShenjRuntime.evalContext.dispose();
        ShenjRuntime.evalContext = (CLProvider) context;
        return context;
    }
}
