package shenj.root;


import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Nil;
import com.mentics.shenj.Symbol;


public class Explode {
    public static final Symbol SYMBOL = symbol("explode");
    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v1951) throws Exception {
            final Object f2600 = shenj.root.ShenDotapp.LAMBDA.apply(v1951, "", symbol("shen.a"));
            // Function call: shen.app Args: [V1951 shen.a])
            String s = (String)f2600;
            int len = s.length();
            if (len <= 0) {
                return Nil.NIL;
            }
            Cons c = new Cons(String.valueOf(s.charAt(len-1)).intern(), Nil.NIL);
            for (int i=len-2; i>=0; i--) {
                c = new Cons(String.valueOf(s.charAt(i)).intern(), c);
            }
//            final Object f2599 = shenj.root.ShenDotexplodeH.LAMBDA.apply(f2600);
            // Function call: shen.explode-h Args: [[shen.app V1951 shen.a]])
            return c;
        }
    };
}