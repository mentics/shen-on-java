package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfElementQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-element?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v241, final Object v242, final Object v243) throws Exception {
return defined(v241, v242, v243);
}};
public static Object defined(final Object v241, final Object v242, final Object v243) throws Exception {
final Object f245 = ShenNewpv.LAMBDA.apply(v242);

final Object a244 = f245;
final Object f246 = ShenIncinfs.LAMBDA.apply();
















final Object f247 = UnifyBang.LAMBDA.apply(v241, new Cons(a244, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a244, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v242, v243);
final Object f248 = Do.LAMBDA.apply(f246, f247);


    return f248;

}
}
