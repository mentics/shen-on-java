package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInclude {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-include");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v443, final Object v444, final Object v445) throws Exception {
return defined(v443, v444, v445);
}};
public static Object defined(final Object v443, final Object v444, final Object v445) throws Exception {
final Object f446 = ShenIncinfs.LAMBDA.apply();














final Object f447 = UnifyBang.LAMBDA.apply(v443, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v444, v445);
final Object f448 = Do.LAMBDA.apply(f446, f447);

    return f448;

}
}
