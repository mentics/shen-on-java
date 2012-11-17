package shen.gen;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.Symbol;


public class UseCompileContext {

    public static final Symbol SYMBOL = symbol("use-compile-context");

    public static final Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            return defined();
        }
    };


    public static Object defined() throws Exception {
        evalContext = compileContext;
        return true;
    }
}
