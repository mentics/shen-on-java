package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfMaxinferences {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-maxinferences");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5009, final Object v5010, final Object v5011) throws Exception {
return defined(v5009, v5010, v5011);
}};
public static Object defined(final Object v5009, final Object v5010, final Object v5011) throws Exception {
final Object f5012 = ShenIncinfs.LAMBDA.apply();






final Object f5013 = UnifyBang.LAMBDA.apply(v5009, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v5010, v5011);
final Object f5014 = Do.LAMBDA.apply(f5012, f5013);

    return f5014;

}
}
