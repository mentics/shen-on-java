package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfHdv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-hdv");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4873, final Object v4874, final Object v4875) throws Exception {
return defined(v4873, v4874, v4875);
}};
public static Object defined(final Object v4873, final Object v4874, final Object v4875) throws Exception {
final Object f4877 = ShenNewpv.LAMBDA.apply(v4874);

final Object a4876 = f4877;
final Object f4878 = ShenIncinfs.LAMBDA.apply();










final Object f4879 = UnifyBang.LAMBDA.apply(v4873, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a4876, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(a4876, Nil.NIL))), v4874, v4875);
final Object f4880 = Do.LAMBDA.apply(f4878, f4879);


    return f4880;

}
}
