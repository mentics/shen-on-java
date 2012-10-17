package shen.gen;



import com.mentics.shen.*;

public class Unify {

public static final Symbol SYMBOL = RuntimeContext.symbol("unify");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1386, final Object v1387, final Object v1388, final Object v1389) throws Exception {
return defined(v1386, v1387, v1388, v1389);
}};
public static Object defined(final Object v1386, final Object v1387, final Object v1388, final Object v1389) throws Exception {
final Object f3758 = ShenLazyderef.LAMBDA.apply(v1386, v1388);
final Object f3759 = ShenLazyderef.LAMBDA.apply(v1387, v1388);
final Object f3760 = ShenLzyEqual.LAMBDA.apply(f3758, f3759, v1388, v1389);

    return f3760;

}
}
