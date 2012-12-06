package shenj.root;


import static com.mentics.shenj.ShenjRuntime.*;
import static com.mentics.shenj.maint.InstallBuiltinsInImage.*;

import java.io.File;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda0;
import com.mentics.shenj.Symbol;


public class InstallBuiltins {

    public static final Symbol SYMBOL = symbol("install-builtins");

    public static Lambda LAMBDA = new Lambda0() {
        public Object apply() throws Exception {
            processDir(new File("src/main/builtin/shenj/platform/"));
            processDir(new File("src/main/builtin/shenj/root/"));
            return true;
        }
    };
}
