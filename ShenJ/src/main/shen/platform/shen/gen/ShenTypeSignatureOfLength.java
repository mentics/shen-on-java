package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfLength {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-length");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v489, final Object v490, final Object v491) throws Exception {
return defined(v489, v490, v491);
}};
public static Object defined(final Object v489, final Object v490, final Object v491) throws Exception {
final Object f493 = ShenNewpv.LAMBDA.apply(v490);

final Object a492 = f493;
final Object f494 = ShenIncinfs.LAMBDA.apply();










final Object f495 = UnifyBang.LAMBDA.apply(v489, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a492, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v490, v491);
final Object f496 = Do.LAMBDA.apply(f494, f495);


    return f496;

}
}
