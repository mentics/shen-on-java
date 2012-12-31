package shenj.root;

import static com.mentics.shenj.ShenjRuntime.*;

import java.io.FileOutputStream;

import com.esotericsoftware.kryo.io.Output;
import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;


public class SaveImage {

    public static final Symbol SYMBOL = symbol("save-image");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v6932) throws Exception {
            try (Output out = new Output(new FileOutputStream((String) v6932))) {
                Context.saveImage(out);
            }
            return true;
        }
    };
}
