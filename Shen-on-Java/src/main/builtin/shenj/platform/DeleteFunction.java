package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class DeleteFunction {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("shenj.platform/delete-function");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object symbol) throws Exception {
            assert symbol instanceof Symbol;
//            return getCurrentContext().deleteFunction((Symbol) symbol);
            return null;
        }
    };
}
