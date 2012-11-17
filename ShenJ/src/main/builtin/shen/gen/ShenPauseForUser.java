package shen.gen;


import static com.mentics.shenj.ShenjRuntime.*;

import java.util.Scanner;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.Lang;
import com.mentics.shenj.SimpleError;
import com.mentics.shenj.Symbol;


public class ShenPauseForUser {
    public static final Symbol SYMBOL = symbol("shen-pause-for-user");
    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v812) throws Exception {
            return defined(v812);
        }
    };


    public static Object defined(final Object v812) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            char c = s.next().charAt(0);
            // while (System.in.available() > 0) {
            // System.in.read(); // flush the buffer
            // }
            // char c = (char) System.in.read();
            // while (System.in.available() > 0) {
            // System.in.read(); // flush the buffer
            // }
            if ((boolean) Lang.equals(c, 'a')) {
                throw new SimpleError("input aborted");
            } else {
                System.out.println();
            }
        }

        return "";
    }
}
