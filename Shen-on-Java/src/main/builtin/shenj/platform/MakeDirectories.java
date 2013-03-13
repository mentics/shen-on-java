package shenj.platform;

import java.io.File;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class MakeDirectories {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("shenj.platform/make-directories");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object path) throws Exception {
            assert path instanceof String;
            return new File((String) path).mkdirs();
        }
    };
}
