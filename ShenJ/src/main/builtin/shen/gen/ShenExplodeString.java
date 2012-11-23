package shen.gen;


import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Nil;
import com.mentics.shenj.Symbol;


public class ShenExplodeString {
    public static final Symbol SYMBOL = symbol("shen-explode-string");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v705) throws Exception {
            return defined(v705);
        }
    };


    public static Object defined(final Object v705) throws Exception {
        String s = (String) v705;
        int len = s.length();
        if (len == 0) {
            return Nil.NIL;
        }
        Cons result = new Cons(s.substring(len - 1, len), Nil.NIL);
        for (int i = len - 2; i >= 0; i--) {
            result = new Cons(s.substring(i, i + 1), result);
        }
        return result;
        // final Object i13116;
        // if ((boolean) Lang.equals("", v705)) {
        //
        // i13116 = Nil.NIL;
        // } else {
        //
        // final Object i13115;
        // if ((boolean) true) {
        //
        //
        // final Object s13111 = ((String) v705).substring(((Number) 0).intValue(), ((Number) 0).intValue() + 1);
        //
        //
        // final Object ss13112 = ((String) v705).substring(1);
        //
        // final Object i13114;
        // if ((boolean) Lang.equals(ss13112, RuntimeContext.symbol("shen-eos"))) {
        //
        // i13114 = Nil.NIL;
        // } else {
        //
        // final Object f13113 = ShenExplodeString.LAMBDA.apply(ss13112);
        //
        //
        // i13114 = new Cons(s13111, f13113);
        //
        // }
        //
        //
        // i13115 = i13114;
        // } else {
        //
        // throw new SimpleError((String) "True condition not found.");
        //
        //
        // }
        // i13116 = i13115;
        //
        // }
        // return i13116;
        //
    }
}
