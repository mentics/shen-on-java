package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSum {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-sum");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5291, final Object v5292, final Object v5293) throws Exception {
return defined(v5291, v5292, v5293);
}};
public static Object defined(final Object v5291, final Object v5292, final Object v5293) throws Exception {
final Object f5294 = ShenIncinfs.LAMBDA.apply();










final Object f5295 = UnifyBang.LAMBDA.apply(v5291, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v5292, v5293);
final Object f5296 = Do.LAMBDA.apply(f5294, f5295);

    return f5296;

}
}
