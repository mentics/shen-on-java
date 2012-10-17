package shen.gen;



import com.mentics.shen.*;

public class Identical {

public static final Symbol SYMBOL = RuntimeContext.symbol("identical");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1453, final Object v1454, final Object v1455, final Object v1456) throws Exception {
return defined(v1453, v1454, v1455, v1456);
}};
public static Object defined(final Object v1453, final Object v1454, final Object v1455, final Object v1456) throws Exception {
final Object f3833 = ShenLazyderef.LAMBDA.apply(v1453, v1455);
final Object f3834 = ShenLazyderef.LAMBDA.apply(v1454, v1455);
final Object f3835 = ShenLzyEqualEqual.LAMBDA.apply(f3833, f3834, v1455, v1456);

    return f3835;

}
}
