package shen.gen;



import com.mentics.shen.*;

public class ShenEvalWithoutMacros {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-eval-without-macros");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v654) throws Exception {
return defined(v654);
}};
public static Object defined(final Object v654) throws Exception {
final Object f620 = ShenProcInputPlus.LAMBDA.apply(v654);
final Object f621 = ShenElimDefine.LAMBDA.apply(f620);


    return EvalKl.defined(f621);

}
}
