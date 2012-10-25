package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTupleQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tuple?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v951, final Object v952, final Object v953) throws Exception {
return defined(v951, v952, v953);
}};
public static Object defined(final Object v951, final Object v952, final Object v953) throws Exception {
final Object f955 = ShenNewpv.LAMBDA.apply(v952);

final Object a954 = f955;
final Object f956 = ShenIncinfs.LAMBDA.apply();






final Object f957 = UnifyBang.LAMBDA.apply(v951, new Cons(a954, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), v952, v953);
final Object f958 = Do.LAMBDA.apply(f956, f957);


    return f958;

}
}
