package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-pr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v649, final Object v650, final Object v651) throws Exception {
return defined(v649, v650, v651);
}};
public static Object defined(final Object v649, final Object v650, final Object v651) throws Exception {
final Object f652 = ShenIncinfs.LAMBDA.apply();
















final Object f653 = UnifyBang.LAMBDA.apply(v649, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("out"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v650, v651);
final Object f654 = Do.LAMBDA.apply(f652, f653);

    return f654;

}
}
