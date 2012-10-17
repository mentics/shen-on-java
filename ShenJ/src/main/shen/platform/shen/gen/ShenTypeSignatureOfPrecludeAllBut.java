package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPrecludeAllBut {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-preclude-all-but");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5163, final Object v5164, final Object v5165) throws Exception {
return defined(v5163, v5164, v5165);
}};
public static Object defined(final Object v5163, final Object v5164, final Object v5165) throws Exception {
final Object f5166 = ShenIncinfs.LAMBDA.apply();














final Object f5167 = UnifyBang.LAMBDA.apply(v5163, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL)), Nil.NIL))), v5164, v5165);
final Object f5168 = Do.LAMBDA.apply(f5166, f5167);

    return f5168;

}
}
