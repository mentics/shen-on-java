package shen.gen;

import com.mentics.shen.Lambda;
import com.mentics.shen.Lambda1;
import com.mentics.shen.RuntimeContext;
import com.mentics.shen.Symbol;


public class StringLength {
    public static final Symbol SYMBOL = RuntimeContext.symbol("string-length");

    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6940) throws Exception {
            return defined(v6940);
        }
    };


    public static Object defined(final Object v6940) throws Exception {
        return ((String) v6940).length();
    }
}
