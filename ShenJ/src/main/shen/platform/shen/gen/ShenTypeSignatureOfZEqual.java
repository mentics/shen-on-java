package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfZEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of->=");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5519, final Object v5520, final Object v5521) throws Exception {
return defined(v5519, v5520, v5521);
}};
public static Object defined(final Object v5519, final Object v5520, final Object v5521) throws Exception {
final Object f5522 = ShenIncinfs.LAMBDA.apply();












final Object f5523 = UnifyBang.LAMBDA.apply(v5519, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5520, v5521);
final Object f5524 = Do.LAMBDA.apply(f5522, f5523);

    return f5524;

}
}
