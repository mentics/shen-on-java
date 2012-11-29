package shenj.root;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class Map {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("map");

    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(Object func, Object list) throws Exception {
            return defined(func, list);
        }
    };


    public static Object defined(Object func, Object list) throws Exception {
        if (!(func instanceof Lambda1)) {
            System.out.println("wrong func in map: "+func);
        }
        Lambda1 lam = (Lambda1) func;
        if (list == Nil.NIL) {
            return Nil.NIL;
        } else {
            Cons c = (Cons) list;
            return c.forEach(lam);
        }
    }
}
