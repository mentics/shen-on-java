package shenj.platform;

import static com.mentics.shenj.Lang.*;
import static com.mentics.shenj.Nil.*;
import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.ShenjUtil.*;


import com.mentics.shenj.Cons;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda2;
import com.mentics.shenj.Nil;
import com.mentics.shenj.ShenjUtil;
import com.mentics.shenj.Symbol;


public class ConstructorArgString {
    public static final Symbol SYMBOL = symbol("shenj.platform/constructor-arg-string");
    public static Lambda LAMBDA = new Lambda2() {
        public Object apply(final Object call, final Object theArgs) throws Exception {
            if (theArgs == Nil.NIL) {
                return "";
            }
            Object[] args = theArgs == NIL ? EMPTY_OBJECT_ARRAY : ((Cons) theArgs).toArray();
            return ShenjUtil.makeConsArgString(call, args);
        }
    };
}
