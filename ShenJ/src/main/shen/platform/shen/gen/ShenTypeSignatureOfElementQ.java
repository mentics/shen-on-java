package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfElementQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-element?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4699, final Object v4700, final Object v4701) throws Exception {
return defined(v4699, v4700, v4701);
}};
public static Object defined(final Object v4699, final Object v4700, final Object v4701) throws Exception {
final Object f4703 = ShenNewpv.LAMBDA.apply(v4700);

final Object a4702 = f4703;
final Object f4704 = ShenIncinfs.LAMBDA.apply();
















final Object f4705 = UnifyBang.LAMBDA.apply(v4699, new Cons(a4702, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4702, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v4700, v4701);
final Object f4706 = Do.LAMBDA.apply(f4704, f4705);


    return f4706;

}
}
