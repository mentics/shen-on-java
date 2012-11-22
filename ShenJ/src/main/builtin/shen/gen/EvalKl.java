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
        final Object javaInfo = ShenjRuntime.compileContext.apply("shen.gen.ParsedKlToJava", ast);

        final Object f4045 = ((Object[])javaInfo)[1];//   Fst.LAMBDA.apply(javaInfo);
        final Object f4046 = ((Object[])javaInfo)[2];//Second.LAMBDA.apply(javaInfo);
        final Object unit4044 = ShenjRuntime.compileContext.apply("shen.gen.ToJavaUnit", f4045, f4046);
        final Object className = ((Object[])unit4044)[1];//Fst.LAMBDA.apply(unit4044);
        final Object classContent = ((Object[])unit4044)[2];//Second.LAMBDA.apply(unit4044);

        return ShenjRuntime.doEval(className, classContent);
    }

}
    