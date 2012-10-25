package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfEqualEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-==");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1119, final Object v1120, final Object v1121) throws Exception {
return defined(v1119, v1120, v1121);
}};
public static Object defined(final Object v1119, final Object v1120, final Object v1121) throws Exception {
final Object f1123 = ShenNewpv.LAMBDA.apply(v1120);

final Object a1122 = f1123;
final Object f1125 = ShenNewpv.LAMBDA.apply(v1120);

final Object b1124 = f1125;
final Object f1126 = ShenIncinfs.LAMBDA.apply();












final Object f1127 = UnifyBang.LAMBDA.apply(v1119, new Cons(a1122, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(b1124, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1120, v1121);
final Object f1128 = Do.LAMBDA.apply(f1126, f1127);



    return f1128;

}
}
