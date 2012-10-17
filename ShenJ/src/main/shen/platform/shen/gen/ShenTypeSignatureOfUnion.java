package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfUnion {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-union");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5419, final Object v5420, final Object v5421) throws Exception {
return defined(v5419, v5420, v5421);
}};
public static Object defined(final Object v5419, final Object v5420, final Object v5421) throws Exception {
final Object f5423 = ShenNewpv.LAMBDA.apply(v5420);

final Object a5422 = f5423;
final Object f5424 = ShenIncinfs.LAMBDA.apply();
























final Object f5425 = UnifyBang.LAMBDA.apply(v5419, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5422, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5422, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5422, Nil.NIL)), Nil.NIL))), Nil.NIL))), v5420, v5421);
final Object f5426 = Do.LAMBDA.apply(f5424, f5425);


    return f5426;

}
}
