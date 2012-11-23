package shen.gen;

import static com.mentics.shenj.ShenjRuntime.*;

import java.io.FileOutputStream;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;


public class SaveImage {

    public static final Symbol SYMBOL = symbol("save-image");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6932) throws Exception {
            return defined(v6932);
        }
    };


    public static Object defined(final Object v6932) throws Exception {
        try (Output out = new Output(new FileOutputStream((String) v6932))) {
            getCurrentContext().saveImage(out);
        }
        return true;
    }
}
