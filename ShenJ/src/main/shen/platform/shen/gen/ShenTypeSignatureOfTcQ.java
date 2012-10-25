package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTcQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tc?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v913, final Object v914, final Object v915) throws Exception {
return defined(v913, v914, v915);
}};
public static Object defined(final Object v913, final Object v914, final Object v915) throws Exception {
final Object f917 = ShenNewpv.LAMBDA.apply(v914);

final Object a916 = f917;
final Object f918 = ShenIncinfs.LAMBDA.apply();






final Object f919 = UnifyBang.LAMBDA.apply(v913, new Cons(a916, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v914, v915);
final Object f920 = Do.LAMBDA.apply(f918, f919);


    return f920;

}
}
