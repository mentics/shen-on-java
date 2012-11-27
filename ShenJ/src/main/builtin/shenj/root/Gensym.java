package shenj.root;


import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;


public class Gensym {
    public static final Symbol SYMBOL = symbol("gensym");
    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v735) throws Exception {
            return defined(v735);
        }
    };

    public static Object defined(final Object v735) throws Exception {
        String v = v735.toString() + (++gensymCounter);
//        System.out.println("Using gensym: " + v + "  loader: " + Gensym.class.getClassLoader().toString());
        return v;
    }
}