package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNl {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-nl");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5025, final Object v5026, final Object v5027) throws Exception {
return defined(v5025, v5026, v5027);
}};
public static Object defined(final Object v5025, final Object v5026, final Object v5027) throws Exception {
final Object f5028 = ShenIncinfs.LAMBDA.apply();






final Object f5029 = UnifyBang.LAMBDA.apply(v5025, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v5026, v5027);
final Object f5030 = Do.LAMBDA.apply(f5028, f5029);

    return f5030;

}
}
