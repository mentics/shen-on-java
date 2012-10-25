package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVariableQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-variable?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v999, final Object v1000, final Object v1001) throws Exception {
return defined(v999, v1000, v1001);
}};
public static Object defined(final Object v999, final Object v1000, final Object v1001) throws Exception {
final Object f1003 = ShenNewpv.LAMBDA.apply(v1000);

final Object a1002 = f1003;
final Object f1004 = ShenIncinfs.LAMBDA.apply();






final Object f1005 = UnifyBang.LAMBDA.apply(v999, new Cons(a1002, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v1000, v1001);
final Object f1006 = Do.LAMBDA.apply(f1004, f1005);


    return f1006;

}
}
