package shenj.platform;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.SwitchError;
import com.mentics.shenj.Symbol;


public class UseTopContext {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("use-top-context");

    public static Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            // setCurrentContext(topLevel);
            // return true;
            throw new SwitchError(null, true);
        }
    };
}
