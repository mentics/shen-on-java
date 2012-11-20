package shen.gen;

import static com.mentics.shenj.DirectClassLoader.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class NewEmptyContext {

    public static final Symbol SYMBOL = ShenjRuntime.symbol("new-empty-context");

    public static final Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            return defined();
        }
    };


    public static Object defined() throws Exception {
        return ShenjRuntime.compileContext.createEmptyImage();
    }
}
