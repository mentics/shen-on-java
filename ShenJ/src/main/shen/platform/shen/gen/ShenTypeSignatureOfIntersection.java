package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntersection {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-intersection");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v479, final Object v480, final Object v481) throws Exception {
return defined(v479, v480, v481);
}};
public static Object defined(final Object v479, final Object v480, final Object v481) throws Exception {
final Object f483 = ShenNewpv.LAMBDA.apply(v480);

final Object a482 = f483;
final Object f484 = ShenIncinfs.LAMBDA.apply();
























final Object f485 = UnifyBang.LAMBDA.apply(v479, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a482, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a482, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a482, Nil.NIL)), Nil.NIL))), Nil.NIL))), v480, v481);
final Object f486 = Do.LAMBDA.apply(f484, f485);


    return f486;

}
}
