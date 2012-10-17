package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfLength {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-length");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4947, final Object v4948, final Object v4949) throws Exception {
return defined(v4947, v4948, v4949);
}};
public static Object defined(final Object v4947, final Object v4948, final Object v4949) throws Exception {
final Object f4951 = ShenNewpv.LAMBDA.apply(v4948);

final Object a4950 = f4951;
final Object f4952 = ShenIncinfs.LAMBDA.apply();










final Object f4953 = UnifyBang.LAMBDA.apply(v4947, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4950, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v4948, v4949);
final Object f4954 = Do.LAMBDA.apply(f4952, f4953);


    return f4954;

}
}
