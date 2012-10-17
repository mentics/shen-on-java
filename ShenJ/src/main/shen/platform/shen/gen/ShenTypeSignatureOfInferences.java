package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInferences {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-inferences");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4917, final Object v4918, final Object v4919) throws Exception {
return defined(v4917, v4918, v4919);
}};
public static Object defined(final Object v4917, final Object v4918, final Object v4919) throws Exception {
final Object f4921 = ShenNewpv.LAMBDA.apply(v4918);

final Object a4920 = f4921;
final Object f4922 = ShenIncinfs.LAMBDA.apply();






final Object f4923 = UnifyBang.LAMBDA.apply(v4917, new Cons(a4920, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v4918, v4919);
final Object f4924 = Do.LAMBDA.apply(f4922, f4923);


    return f4924;

}
}
