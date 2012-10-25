package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfBooleanQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-boolean?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v143, final Object v144, final Object v145) throws Exception {
return defined(v143, v144, v145);
}};
public static Object defined(final Object v143, final Object v144, final Object v145) throws Exception {
final Object f147 = ShenNewpv.LAMBDA.apply(v144);

final Object a146 = f147;
final Object f148 = ShenIncinfs.LAMBDA.apply();






final Object f149 = UnifyBang.LAMBDA.apply(v143, new Cons(a146, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v144, v145);
final Object f150 = Do.LAMBDA.apply(f148, f149);


    return f150;

}
}
