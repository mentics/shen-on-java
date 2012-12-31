package shenj.root;

import static com.mentics.shenj.ShenjRuntime.*;

import com.mentics.shenj.Lambda;
import com.mentics.shenj.Lambda1;
import com.mentics.shenj.ShenjRuntime;
import com.mentics.shenj.Symbol;
import com.mentics.shenj.inner.Context;


public class EvalKl {
    public static final Symbol SYMBOL = ShenjRuntime.symbol("eval-kl");

    public static Lambda LAMBDA = new Lambda1() {
        public Object apply(Object ast) throws Exception {
            return defined(ast);
        }
    };


    public static Object defined(Object ast) throws Exception {
        final Object javaInfo = Context.apply("shenj.root.ParsedKlToJava", ast);

        final Object javaCode = ((Object[]) javaInfo)[1];// Fst.LAMBDA.apply(javaInfo);
        final Object[] tuple2 = (Object[]) ((Object[]) javaInfo)[2];// Second.LAMBDA.apply(javaInfo);
        final Object javaExpr = tuple2[1];
        final Object unit4044 = Context.apply("shenj.root.ToJavaUnit", javaCode, javaExpr);
        Object className = ((Object[]) unit4044)[1];// Fst.LAMBDA.apply(unit4044);
        final Object classContent = ((Object[]) unit4044)[2];// Second.LAMBDA.apply(unit4044);

        return Context.doEval(className, classContent);
    }
}
