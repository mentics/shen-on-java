package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfLimit {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-limit");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v499, final Object v500, final Object v501) throws Exception {
return defined(v499, v500, v501);
}};
public static Object defined(final Object v499, final Object v500, final Object v501) throws Exception {
final Object f503 = ShenNewpv.LAMBDA.apply(v500);

final Object a502 = f503;
final Object f504 = ShenIncinfs.LAMBDA.apply();










final Object f505 = UnifyBang.LAMBDA.apply(v499, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a502, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v500, v501);
final Object f506 = Do.LAMBDA.apply(f504, f505);


    return f506;

}
}
