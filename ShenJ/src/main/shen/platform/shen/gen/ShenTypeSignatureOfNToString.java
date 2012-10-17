package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfNToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-n->string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5017, final Object v5018, final Object v5019) throws Exception {
return defined(v5017, v5018, v5019);
}};
public static Object defined(final Object v5017, final Object v5018, final Object v5019) throws Exception {
final Object f5020 = ShenIncinfs.LAMBDA.apply();






final Object f5021 = UnifyBang.LAMBDA.apply(v5017, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v5018, v5019);
final Object f5022 = Do.LAMBDA.apply(f5020, f5021);

    return f5022;

}
}
