package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfInferences {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-inferences");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v459, final Object v460, final Object v461) throws Exception {
return defined(v459, v460, v461);
}};
public static Object defined(final Object v459, final Object v460, final Object v461) throws Exception {
final Object f463 = ShenNewpv.LAMBDA.apply(v460);

final Object a462 = f463;
final Object f464 = ShenIncinfs.LAMBDA.apply();






final Object f465 = UnifyBang.LAMBDA.apply(v459, new Cons(a462, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v460, v461);
final Object f466 = Do.LAMBDA.apply(f464, f465);


    return f466;

}
}
