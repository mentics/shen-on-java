package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAssoc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-assoc");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v133, final Object v134, final Object v135) throws Exception {
return defined(v133, v134, v135);
}};
public static Object defined(final Object v133, final Object v134, final Object v135) throws Exception {
final Object f137 = ShenNewpv.LAMBDA.apply(v134);

final Object a136 = f137;
final Object f138 = ShenIncinfs.LAMBDA.apply();
























final Object f139 = UnifyBang.LAMBDA.apply(v133, new Cons(a136, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a136, Nil.NIL)), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a136, Nil.NIL)), Nil.NIL))), Nil.NIL))), v134, v135);
final Object f140 = Do.LAMBDA.apply(f138, f139);


    return f140;

}
}
