package shenj.root;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.Symbol;


public class SubstringQ {
    public static final Symbol SYMBOL = symbol("substring?");

    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object search, final Object string) throws Exception {
            return ((String) string).indexOf((String) search) >= 0;
        }
    };
}
