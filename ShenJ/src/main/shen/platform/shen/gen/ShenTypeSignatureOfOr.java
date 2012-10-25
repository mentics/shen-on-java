package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-or");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v623, final Object v624, final Object v625) throws Exception {
return defined(v623, v624, v625);
}};
public static Object defined(final Object v623, final Object v624, final Object v625) throws Exception {
final Object f626 = ShenIncinfs.LAMBDA.apply();












final Object f627 = UnifyBang.LAMBDA.apply(v623, new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("boolean"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v624, v625);
final Object f628 = Do.LAMBDA.apply(f626, f627);

    return f628;

}
}
