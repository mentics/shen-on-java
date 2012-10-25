package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfCd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-cd");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v161, final Object v162, final Object v163) throws Exception {
return defined(v161, v162, v163);
}};
public static Object defined(final Object v161, final Object v162, final Object v163) throws Exception {
final Object f164 = ShenIncinfs.LAMBDA.apply();






final Object f165 = UnifyBang.LAMBDA.apply(v161, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v162, v163);
final Object f166 = Do.LAMBDA.apply(f164, f165);

    return f166;

}
}
