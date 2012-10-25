package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVectorZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-vector->");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v367, final Object v368, final Object v369) throws Exception {
return defined(v367, v368, v369);
}};
public static Object defined(final Object v367, final Object v368, final Object v369) throws Exception {
final Object f371 = ShenNewpv.LAMBDA.apply(v368);

final Object a370 = f371;
final Object f372 = ShenIncinfs.LAMBDA.apply();


























final Object f373 = UnifyBang.LAMBDA.apply(v367, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a370, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a370, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a370, Nil.NIL)), Nil.NIL))), Nil.NIL))), Nil.NIL))), v368, v369);
final Object f374 = Do.LAMBDA.apply(f372, f373);


    return f374;

}
}
