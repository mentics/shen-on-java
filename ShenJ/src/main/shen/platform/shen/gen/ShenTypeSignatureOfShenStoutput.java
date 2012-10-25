package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfShenStoutput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-shen-stoutput");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v813, final Object v814, final Object v815) throws Exception {
return defined(v813, v814, v815);
}};
public static Object defined(final Object v813, final Object v814, final Object v815) throws Exception {
final Object f817 = ShenNewpv.LAMBDA.apply(v814);

final Object a816 = f817;
final Object f818 = ShenIncinfs.LAMBDA.apply();










final Object f819 = UnifyBang.LAMBDA.apply(v813, new Cons(a816, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("out"), Nil.NIL)), Nil.NIL))), v814, v815);
final Object f820 = Do.LAMBDA.apply(f818, f819);


    return f820;

}
}
