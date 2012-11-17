package shen.gen;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;


public class StringLength {
    public static final Symbol SYMBOL = symbol("string-length");

    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6940) throws Exception {
            return defined(v6940);
        }
    };


    public static Object defined(final Object v6940) throws Exception {
        return ((String) v6940).length();
    }
}
