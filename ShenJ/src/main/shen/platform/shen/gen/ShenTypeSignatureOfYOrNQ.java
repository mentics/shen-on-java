package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfYOrNQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-y-or-n?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1037, final Object v1038, final Object v1039) throws Exception {
return defined(v1037, v1038, v1039);
}};
public static Object defined(final Object v1037, final Object v1038, final Object v1039) throws Exception {
final Object f1040 = ShenIncinfs.LAMBDA.apply();






final Object f1041 = UnifyBang.LAMBDA.apply(v1037, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v1038, v1039);
final Object f1042 = Do.LAMBDA.apply(f1040, f1041);

    return f1042;

}
}
