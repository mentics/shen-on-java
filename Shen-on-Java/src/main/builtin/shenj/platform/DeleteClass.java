package shenj.platform;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class DeleteClass {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("shenj.platform/delete-class");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object className) throws Exception {
            assert className instanceof String;
            return getCurrentContext().deleteClass((String) className);
        }
    };
}
