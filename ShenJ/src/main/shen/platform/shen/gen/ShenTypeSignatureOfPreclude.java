package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPreclude {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-preclude");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5137, final Object v5138, final Object v5139) throws Exception {
return defined(v5137, v5138, v5139);
}};
public static Object defined(final Object v5137, final Object v5138, final Object v5139) throws Exception {
final Object f5140 = ShenIncinfs.LAMBDA.apply();














final Object f5141 = UnifyBang.LAMBDA.apply(v5137, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v5138, v5139);
final Object f5142 = Do.LAMBDA.apply(f5140, f5141);

    return f5142;

}
}
