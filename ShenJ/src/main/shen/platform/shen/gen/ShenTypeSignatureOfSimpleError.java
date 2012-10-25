package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSimpleError {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-simple-error");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v757, final Object v758, final Object v759) throws Exception {
return defined(v757, v758, v759);
}};
public static Object defined(final Object v757, final Object v758, final Object v759) throws Exception {
final Object f761 = ShenNewpv.LAMBDA.apply(v758);

final Object a760 = f761;
final Object f762 = ShenIncinfs.LAMBDA.apply();






final Object f763 = UnifyBang.LAMBDA.apply(v757, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(a760, Nil.NIL))), v758, v759);
final Object f764 = Do.LAMBDA.apply(f762, f763);


    return f764;

}
}
