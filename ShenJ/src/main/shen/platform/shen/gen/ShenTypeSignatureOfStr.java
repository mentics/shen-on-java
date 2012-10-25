package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-str");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v841, final Object v842, final Object v843) throws Exception {
return defined(v841, v842, v843);
}};
public static Object defined(final Object v841, final Object v842, final Object v843) throws Exception {
final Object f845 = ShenNewpv.LAMBDA.apply(v842);

final Object a844 = f845;
final Object f846 = ShenIncinfs.LAMBDA.apply();






final Object f847 = UnifyBang.LAMBDA.apply(v841, new Cons(a844, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v842, v843);
final Object f848 = Do.LAMBDA.apply(f846, f847);


    return f848;

}
}
