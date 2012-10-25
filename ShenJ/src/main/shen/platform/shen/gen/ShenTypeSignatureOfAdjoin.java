package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAdjoin {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-adjoin");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v95, final Object v96, final Object v97) throws Exception {
return defined(v95, v96, v97);
}};
public static Object defined(final Object v95, final Object v96, final Object v97) throws Exception {
final Object f99 = ShenNewpv.LAMBDA.apply(v96);

final Object a98 = f99;
final Object f100 = ShenIncinfs.LAMBDA.apply();




















final Object f101 = UnifyBang.LAMBDA.apply(v95, new Cons(a98, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a98, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a98, Nil.NIL)), Nil.NIL))), Nil.NIL))), v96, v97);
final Object f102 = Do.LAMBDA.apply(f100, f101);


    return f102;

}
}
