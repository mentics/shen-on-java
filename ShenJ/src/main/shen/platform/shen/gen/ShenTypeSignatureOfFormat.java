package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFormat {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-format");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v317, final Object v318, final Object v319) throws Exception {
return defined(v317, v318, v319);
}};
public static Object defined(final Object v317, final Object v318, final Object v319) throws Exception {
final Object f321 = ShenNewpv.LAMBDA.apply(v318);

final Object a320 = f321;
final Object f322 = ShenIncinfs.LAMBDA.apply();






















final Object f323 = UnifyBang.LAMBDA.apply(v317, new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("out"), Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a320, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), Nil.NIL))), v318, v319);
final Object f324 = Do.LAMBDA.apply(f322, f323);


    return f324;

}
}
