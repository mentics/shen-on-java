package shen.gen;



import com.mentics.shen.*;

public class UnifyBang {

public static final Symbol SYMBOL = RuntimeContext.symbol("unify!");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1417, final Object v1418, final Object v1419, final Object v1420) throws Exception {
return defined(v1417, v1418, v1419, v1420);
}};
public static Object defined(final Object v1417, final Object v1418, final Object v1419, final Object v1420) throws Exception {
final Object f3796 = ShenLazyderef.LAMBDA.apply(v1417, v1419);
final Object f3797 = ShenLazyderef.LAMBDA.apply(v1418, v1419);
final Object f3798 = ShenLzyEqualBang.LAMBDA.apply(f3796, f3797, v1419, v1420);

    return f3798;

}
}
