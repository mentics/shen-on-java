package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAppend {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-append");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v113, final Object v114, final Object v115) throws Exception {
return defined(v113, v114, v115);
}};
public static Object defined(final Object v113, final Object v114, final Object v115) throws Exception {
final Object f117 = ShenNewpv.LAMBDA.apply(v114);

final Object a116 = f117;
final Object f118 = ShenIncinfs.LAMBDA.apply();
























final Object f119 = UnifyBang.LAMBDA.apply(v113, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a116, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a116, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a116, Nil.NIL)), Nil.NIL))), Nil.NIL))), v114, v115);
final Object f120 = Do.LAMBDA.apply(f118, f119);


    return f120;

}
}
