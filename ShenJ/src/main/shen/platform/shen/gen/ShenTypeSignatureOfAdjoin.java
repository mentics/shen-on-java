package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAdjoin {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-adjoin");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4553, final Object v4554, final Object v4555) throws Exception {
return defined(v4553, v4554, v4555);
}};
public static Object defined(final Object v4553, final Object v4554, final Object v4555) throws Exception {
final Object f4557 = ShenNewpv.LAMBDA.apply(v4554);

final Object a4556 = f4557;
final Object f4558 = ShenIncinfs.LAMBDA.apply();




















final Object f4559 = UnifyBang.LAMBDA.apply(v4553, new Cons(a4556, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4556, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4556, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4554, v4555);
final Object f4560 = Do.LAMBDA.apply(f4558, f4559);


    return f4560;

}
}
