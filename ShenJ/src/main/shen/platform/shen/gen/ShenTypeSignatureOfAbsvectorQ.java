package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfAbsvectorQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-absvector?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4543, final Object v4544, final Object v4545) throws Exception {
return defined(v4543, v4544, v4545);
}};
public static Object defined(final Object v4543, final Object v4544, final Object v4545) throws Exception {
final Object f4547 = ShenNewpv.LAMBDA.apply(v4544);

final Object a4546 = f4547;
final Object f4548 = ShenIncinfs.LAMBDA.apply();






final Object f4549 = UnifyBang.LAMBDA.apply(v4543, new Cons(a4546, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v4544, v4545);
final Object f4550 = Do.LAMBDA.apply(f4548, f4549);


    return f4550;

}
}
