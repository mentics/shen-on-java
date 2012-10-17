package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfRemove {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-remove");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5195, final Object v5196, final Object v5197) throws Exception {
return defined(v5195, v5196, v5197);
}};
public static Object defined(final Object v5195, final Object v5196, final Object v5197) throws Exception {
final Object f5199 = ShenNewpv.LAMBDA.apply(v5196);

final Object a5198 = f5199;
final Object f5200 = ShenIncinfs.LAMBDA.apply();




















final Object f5201 = UnifyBang.LAMBDA.apply(v5195, new Cons(a5198, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5198, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5198, Nil.NIL)), Nil.NIL))), Nil.NIL))), v5196, v5197);
final Object f5202 = Do.LAMBDA.apply(f5200, f5201);


    return f5202;

}
}
