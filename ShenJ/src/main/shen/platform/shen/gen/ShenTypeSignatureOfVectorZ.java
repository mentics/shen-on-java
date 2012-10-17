package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVectorZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-vector->");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4825, final Object v4826, final Object v4827) throws Exception {
return defined(v4825, v4826, v4827);
}};
public static Object defined(final Object v4825, final Object v4826, final Object v4827) throws Exception {
final Object f4829 = ShenNewpv.LAMBDA.apply(v4826);

final Object a4828 = f4829;
final Object f4830 = ShenIncinfs.LAMBDA.apply();


























final Object f4831 = UnifyBang.LAMBDA.apply(v4825, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a4828, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4828, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a4828, Nil.NIL)), Nil.NIL))), Nil.NIL))), Nil.NIL))), v4826, v4827);
final Object f4832 = Do.LAMBDA.apply(f4830, f4831);


    return f4832;

}
}
