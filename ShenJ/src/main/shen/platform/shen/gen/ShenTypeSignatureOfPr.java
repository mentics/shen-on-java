package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfPr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-pr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5107, final Object v5108, final Object v5109) throws Exception {
return defined(v5107, v5108, v5109);
}};
public static Object defined(final Object v5107, final Object v5108, final Object v5109) throws Exception {
final Object f5110 = ShenIncinfs.LAMBDA.apply();
















final Object f5111 = UnifyBang.LAMBDA.apply(v5107, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("out"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v5108, v5109);
final Object f5112 = Do.LAMBDA.apply(f5110, f5111);

    return f5112;

}
}
