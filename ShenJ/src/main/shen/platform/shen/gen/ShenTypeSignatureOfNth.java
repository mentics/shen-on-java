package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNth {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-nth");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v583, final Object v584, final Object v585) throws Exception {
return defined(v583, v584, v585);
}};
public static Object defined(final Object v583, final Object v584, final Object v585) throws Exception {
final Object f587 = ShenNewpv.LAMBDA.apply(v584);

final Object a586 = f587;
final Object f588 = ShenIncinfs.LAMBDA.apply();
















final Object f589 = UnifyBang.LAMBDA.apply(v583, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a586, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a586, Nil.NIL))), Nil.NIL))), v584, v585);
final Object f590 = Do.LAMBDA.apply(f588, f589);


    return f590;

}
}
