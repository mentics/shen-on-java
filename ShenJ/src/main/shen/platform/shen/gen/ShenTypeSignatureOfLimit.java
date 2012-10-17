package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfLimit {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-limit");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4957, final Object v4958, final Object v4959) throws Exception {
return defined(v4957, v4958, v4959);
}};
public static Object defined(final Object v4957, final Object v4958, final Object v4959) throws Exception {
final Object f4961 = ShenNewpv.LAMBDA.apply(v4958);

final Object a4960 = f4961;
final Object f4962 = ShenIncinfs.LAMBDA.apply();










final Object f4963 = UnifyBang.LAMBDA.apply(v4957, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a4960, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v4958, v4959);
final Object f4964 = Do.LAMBDA.apply(f4962, f4963);


    return f4964;

}
}
