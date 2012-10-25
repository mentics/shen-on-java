package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfMapcan {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-mapcan");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v539, final Object v540, final Object v541) throws Exception {
return defined(v539, v540, v541);
}};
public static Object defined(final Object v539, final Object v540, final Object v541) throws Exception {
final Object f543 = ShenNewpv.LAMBDA.apply(v540);

final Object a542 = f543;
final Object f545 = ShenNewpv.LAMBDA.apply(v540);

final Object b544 = f545;
final Object f546 = ShenIncinfs.LAMBDA.apply();






























final Object f547 = UnifyBang.LAMBDA.apply(v539, new Cons(new Cons(a542, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b544, Nil.NIL)), Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a542, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b544, Nil.NIL)), Nil.NIL))), Nil.NIL))), v540, v541);
final Object f548 = Do.LAMBDA.apply(f546, f547);



    return f548;

}
}
