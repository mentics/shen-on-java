package shen.gen;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;


public class EvalKl {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("eval-kl");

    public static final Lambda LAMBDA = new Lambda1() {
        public Object apply(Object ast) throws Exception {
            return defined(ast);
        }
    };


    public static Object defined(Object ast) throws Exception {
        final Object javaInfo = ParsedKlToJava.LAMBDA.apply(ast);

        final Object f4045 = Fst.LAMBDA.apply(javaInfo);
        final Object f4046 = Second.LAMBDA.apply(javaInfo);
        final Object unit4044 = ToJavaUnit.LAMBDA.apply(f4045, f4046);
        final Object className = Fst.LAMBDA.apply(unit4044);
        final Object classContent = Second.LAMBDA.apply(unit4044);

        return ShenjRuntime.doEval(className, classContent);
    }

}
