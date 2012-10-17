package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of->");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5503, final Object v5504, final Object v5505) throws Exception {
return defined(v5503, v5504, v5505);
}};
public static Object defined(final Object v5503, final Object v5504, final Object v5505) throws Exception {
final Object f5506 = ShenIncinfs.LAMBDA.apply();












final Object f5507 = UnifyBang.LAMBDA.apply(v5503, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5504, v5505);
final Object f5508 = Do.LAMBDA.apply(f5506, f5507);

    return f5508;

}
}
