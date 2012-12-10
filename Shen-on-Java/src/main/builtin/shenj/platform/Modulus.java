package shenj.platform;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class Modulus {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("map");

    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(Object a, Object b) throws Exception {
            return (double) ((int) (double) a % (int) (double) b);
        }
    };
}
