package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfDifference {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-difference");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4677, final Object v4678, final Object v4679) throws Exception {
return defined(v4677, v4678, v4679);
}};
public static Object defined(final Object v4677, final Object v4678, final Object v4679) throws Exception {
final Object f4681 = ShenNewpv.LAMBDA.apply(v4678);

final Object a4680 = f4681;
final Object f4682 = ShenIncinfs.LAMBDA.apply();
























final Object f4683 = UnifyBang.LAMBDA.apply(v4677, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4680, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4680, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4680, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4678, v4679);
final Object f4684 = Do.LAMBDA.apply(f4682, f4683);


    return f4684;

}
}
