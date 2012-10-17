package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAppend {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-append");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4571, final Object v4572, final Object v4573) throws Exception {
return defined(v4571, v4572, v4573);
}};
public static Object defined(final Object v4571, final Object v4572, final Object v4573) throws Exception {
final Object f4575 = ShenNewpv.LAMBDA.apply(v4572);

final Object a4574 = f4575;
final Object f4576 = ShenIncinfs.LAMBDA.apply();
























final Object f4577 = UnifyBang.LAMBDA.apply(v4571, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4574, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4574, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4574, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4572, v4573);
final Object f4578 = Do.LAMBDA.apply(f4576, f4577);


    return f4578;

}
}
