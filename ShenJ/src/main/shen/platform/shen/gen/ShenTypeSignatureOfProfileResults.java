package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfProfileResults {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-profile-results");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5145, final Object v5146, final Object v5147) throws Exception {
return defined(v5145, v5146, v5147);
}};
public static Object defined(final Object v5145, final Object v5146, final Object v5147) throws Exception {
final Object f5149 = ShenNewpv.LAMBDA.apply(v5146);

final Object a5148 = f5149;
final Object f5150 = ShenIncinfs.LAMBDA.apply();






final Object f5151 = UnifyBang.LAMBDA.apply(v5145, new Cons(a5148, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v5146, v5147);
final Object f5152 = Do.LAMBDA.apply(f5150, f5151);


    return f5152;

}
}
