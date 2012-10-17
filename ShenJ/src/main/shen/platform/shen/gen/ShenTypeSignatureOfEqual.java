package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-=");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5535, final Object v5536, final Object v5537) throws Exception {
return defined(v5535, v5536, v5537);
}};
public static Object defined(final Object v5535, final Object v5536, final Object v5537) throws Exception {
final Object f5539 = ShenNewpv.LAMBDA.apply(v5536);

final Object a5538 = f5539;
final Object f5540 = ShenIncinfs.LAMBDA.apply();












final Object f5541 = UnifyBang.LAMBDA.apply(v5535, new Cons(a5538, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a5538, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5536, v5537);
final Object f5542 = Do.LAMBDA.apply(f5540, f5541);


    return f5542;

}
}
