package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfSymbolQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-symbol?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v859, final Object v860, final Object v861) throws Exception {
return defined(v859, v860, v861);
}};
public static Object defined(final Object v859, final Object v860, final Object v861) throws Exception {
final Object f863 = ShenNewpv.LAMBDA.apply(v860);

final Object a862 = f863;
final Object f864 = ShenIncinfs.LAMBDA.apply();






final Object f865 = UnifyBang.LAMBDA.apply(v859, new Cons(a862, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v860, v861);
final Object f866 = Do.LAMBDA.apply(f864, f865);


    return f866;

}
}
