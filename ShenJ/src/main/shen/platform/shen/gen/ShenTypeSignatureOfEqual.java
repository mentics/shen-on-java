package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-=");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1077, final Object v1078, final Object v1079) throws Exception {
return defined(v1077, v1078, v1079);
}};
public static Object defined(final Object v1077, final Object v1078, final Object v1079) throws Exception {
final Object f1081 = ShenNewpv.LAMBDA.apply(v1078);

final Object a1080 = f1081;
final Object f1082 = ShenIncinfs.LAMBDA.apply();












final Object f1083 = UnifyBang.LAMBDA.apply(v1077, new Cons(a1080, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a1080, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v1078, v1079);
final Object f1084 = Do.LAMBDA.apply(f1082, f1083);


    return f1084;

}
}
