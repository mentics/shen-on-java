package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfMap {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-map");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v527, final Object v528, final Object v529) throws Exception {
return defined(v527, v528, v529);
}};
public static Object defined(final Object v527, final Object v528, final Object v529) throws Exception {
final Object f531 = ShenNewpv.LAMBDA.apply(v528);

final Object a530 = f531;
final Object f533 = ShenNewpv.LAMBDA.apply(v528);

final Object b532 = f533;
final Object f534 = ShenIncinfs.LAMBDA.apply();


























final Object f535 = UnifyBang.LAMBDA.apply(v527, new Cons(new Cons(a530, new Cons(RuntimeContext.symbol("-->"), new Cons(b532, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a530, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b532, Nil.NIL)), Nil.NIL))), Nil.NIL))), v528, v529);
final Object f536 = Do.LAMBDA.apply(f534, f535);



    return f536;

}
}
