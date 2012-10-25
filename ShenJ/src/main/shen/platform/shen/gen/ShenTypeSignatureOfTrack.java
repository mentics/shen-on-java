package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-track");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v933, final Object v934, final Object v935) throws Exception {
return defined(v933, v934, v935);
}};
public static Object defined(final Object v933, final Object v934, final Object v935) throws Exception {
final Object f936 = ShenIncinfs.LAMBDA.apply();






final Object f937 = UnifyBang.LAMBDA.apply(v933, new Cons(RuntimeContext.symbol("symbol"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v934, v935);
final Object f938 = Do.LAMBDA.apply(f936, f937);

    return f938;

}
}
