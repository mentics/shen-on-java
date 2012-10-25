package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHead {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-head");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v405, final Object v406, final Object v407) throws Exception {
return defined(v405, v406, v407);
}};
public static Object defined(final Object v405, final Object v406, final Object v407) throws Exception {
final Object f409 = ShenNewpv.LAMBDA.apply(v406);

final Object a408 = f409;
final Object f410 = ShenIncinfs.LAMBDA.apply();










final Object f411 = UnifyBang.LAMBDA.apply(v405, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a408, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a408, Nil.NIL))), v406, v407);
final Object f412 = Do.LAMBDA.apply(f410, f411);


    return f412;

}
}
