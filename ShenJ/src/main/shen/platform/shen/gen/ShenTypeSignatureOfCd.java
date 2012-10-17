package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfCd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-cd");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4619, final Object v4620, final Object v4621) throws Exception {
return defined(v4619, v4620, v4621);
}};
public static Object defined(final Object v4619, final Object v4620, final Object v4621) throws Exception {
final Object f4622 = ShenIncinfs.LAMBDA.apply();






final Object f4623 = UnifyBang.LAMBDA.apply(v4619, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v4620, v4621);
final Object f4624 = Do.LAMBDA.apply(f4622, f4623);

    return f4624;

}
}
