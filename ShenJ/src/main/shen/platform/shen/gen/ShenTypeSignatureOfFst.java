package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFst {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-fst");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v337, final Object v338, final Object v339) throws Exception {
return defined(v337, v338, v339);
}};
public static Object defined(final Object v337, final Object v338, final Object v339) throws Exception {
final Object f341 = ShenNewpv.LAMBDA.apply(v338);

final Object b340 = f341;
final Object f343 = ShenNewpv.LAMBDA.apply(v338);

final Object a342 = f343;
final Object f344 = ShenIncinfs.LAMBDA.apply();












final Object f345 = UnifyBang.LAMBDA.apply(v337, new Cons(new Cons(a342, new Cons(RuntimeContext.symbol("*"), new Cons(b340, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(a342, Nil.NIL))), v338, v339);
final Object f346 = Do.LAMBDA.apply(f344, f345);



    return f346;

}
}
