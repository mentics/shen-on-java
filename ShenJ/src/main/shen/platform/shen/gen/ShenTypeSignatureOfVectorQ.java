package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVectorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-vector?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1009, final Object v1010, final Object v1011) throws Exception {
return defined(v1009, v1010, v1011);
}};
public static Object defined(final Object v1009, final Object v1010, final Object v1011) throws Exception {
final Object f1013 = ShenNewpv.LAMBDA.apply(v1010);

final Object a1012 = f1013;
final Object f1014 = ShenIncinfs.LAMBDA.apply();






final Object f1015 = UnifyBang.LAMBDA.apply(v1009, new Cons(a1012, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v1010, v1011);
final Object f1016 = Do.LAMBDA.apply(f1014, f1015);


    return f1016;

}
}
