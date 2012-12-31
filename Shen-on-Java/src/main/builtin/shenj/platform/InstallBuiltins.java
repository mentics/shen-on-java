package shenj.platform;


import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.maint.InstallBuiltinsInImage.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.cl.DirectClassLoader;
import com.mentics.shenj.inner.Context;


public class InstallBuiltins {

    public static final Symbol SYMBOL = symbol("install-builtins");

    public static Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            processAllBuiltinDirs((DirectClassLoader) Context.class.getClassLoader());
            return true;
        }
    };
}
