package shen.gen;



import com.mentics.shen.*;

public class ShenTypecheckAndLoad {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-typecheck-and-load");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1663) throws Exception {
return defined(v1663);
}};
public static Object defined(final Object v1663) throws Exception {
final Object f4238 = Nl.LAMBDA.apply(1);
final Object f4239 = Gensym.LAMBDA.apply(RuntimeContext.symbol("A"));
final Object f4240 = ShenTypecheckAndEvaluate.LAMBDA.apply(v1663, f4239);
final Object f4241 = Do.LAMBDA.apply(f4238, f4240);

    return f4241;

}
}
