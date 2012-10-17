package shen.gen;

import java.io.FileOutputStream;

import com.mentics.shen.Lambda;
import com.mentics.shen.Lambda1;
import com.mentics.shen.RuntimeContext;
import com.mentics.shen.Symbol;


public class SaveImage {

    public static final Symbol SYMBOL = RuntimeContext.symbol("save-image");

    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6932) throws Exception {
            return defined(v6932);

        }
    };


    public static Object defined(final Object v6932) throws Exception {
        RuntimeContext.saveImage(new FileOutputStream((String) v6932));
        return true;
    }
}
