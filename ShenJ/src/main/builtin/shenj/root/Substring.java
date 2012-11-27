package shenj.root;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda3;
import com.mentics.shenj.Symbol;


/**
 * TODO: have this built into the compiler
 */
public class Substring {
    public static final Symbol SYMBOL = symbol("substring");

    public static Lambda LAMBDA = new Lambda3() {
        public Object apply(final Object begin, final Object end, final Object str) throws Exception {
            return ((String) str).substring(((Number) begin).intValue(), ((Number) end).intValue());
        }
    };
}
