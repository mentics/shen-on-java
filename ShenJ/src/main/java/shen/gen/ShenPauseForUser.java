package shen.gen;


import java.util.Scanner;

import com.mentics.shen.Lambda;
import com.mentics.shen.Lambda1;
import com.mentics.shen.Lang;
import com.mentics.shen.RuntimeContext;
import com.mentics.shen.SimpleError;
import com.mentics.shen.Symbol;


public class ShenPauseForUser {
    public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pause-for-user");
    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(final Object v812) throws Exception {
            return defined(v812);
        }
    };


    public static Object defined(final Object v812) throws Exception {
        Scanner s = new Scanner(System.in);
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

        return "";
    }
}
