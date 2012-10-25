package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfClose {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-close");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v169, final Object v170, final Object v171) throws Exception {
return defined(v169, v170, v171);
}};
public static Object defined(final Object v169, final Object v170, final Object v171) throws Exception {
final Object f173 = ShenNewpv.LAMBDA.apply(v170);

final Object a172 = f173;
final Object f175 = ShenNewpv.LAMBDA.apply(v170);

final Object b174 = f175;
final Object f176 = ShenIncinfs.LAMBDA.apply();














final Object f177 = UnifyBang.LAMBDA.apply(v169, new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(a172, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b174, Nil.NIL)), Nil.NIL))), v170, v171);
final Object f178 = Do.LAMBDA.apply(f176, f177);



    return f178;

}
}
