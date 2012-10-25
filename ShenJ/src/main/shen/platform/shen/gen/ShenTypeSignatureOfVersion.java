package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVersion {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-version");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1019, final Object v1020, final Object v1021) throws Exception {
return defined(v1019, v1020, v1021);
}};
public static Object defined(final Object v1019, final Object v1020, final Object v1021) throws Exception {
final Object f1022 = ShenIncinfs.LAMBDA.apply();






final Object f1023 = UnifyBang.LAMBDA.apply(v1019, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v1020, v1021);
final Object f1024 = Do.LAMBDA.apply(f1022, f1023);

    return f1024;

}
}
