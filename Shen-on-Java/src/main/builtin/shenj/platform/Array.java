package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;


public class Array {
    public static final Symbol SYMBOL = symbol("shenj.platform/array");
    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object list) throws Exception {
            assert list instanceof Cons;
            return ((Cons) list).toArray();
        }
    };
}
