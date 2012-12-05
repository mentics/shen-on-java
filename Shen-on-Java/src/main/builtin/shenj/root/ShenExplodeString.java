package shenj.root;


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
        }
    };
}
