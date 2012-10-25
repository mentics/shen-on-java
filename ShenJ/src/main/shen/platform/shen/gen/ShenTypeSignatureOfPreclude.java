package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPreclude {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-preclude");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v679, final Object v680, final Object v681) throws Exception {
return defined(v679, v680, v681);
}};
public static Object defined(final Object v679, final Object v680, final Object v681) throws Exception {
final Object f682 = ShenIncinfs.LAMBDA.apply();














final Object f683 = UnifyBang.LAMBDA.apply(v679, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v680, v681);
final Object f684 = Do.LAMBDA.apply(f682, f683);

    return f684;

}
}
