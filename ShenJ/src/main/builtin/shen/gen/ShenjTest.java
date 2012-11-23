package shen.gen;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;


public class ShenjTest {
    public static final Symbol SYMBOL = symbol("shenj-test");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object arg) throws Exception {
            return defined(arg);
        }
    };

    public static Lambda LAMBDA2 = new Lambda1() {
        public Object apply(Object arg) throws Exception {
            return defined(arg);
        }
    };


    public static Object defined(Object arg) throws Exception {
        return arg.equals(2);
    }

}
