package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfEqualEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-==");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5577, final Object v5578, final Object v5579) throws Exception {
return defined(v5577, v5578, v5579);
}};
public static Object defined(final Object v5577, final Object v5578, final Object v5579) throws Exception {
final Object f5581 = ShenNewpv.LAMBDA.apply(v5578);

final Object a5580 = f5581;
final Object f5583 = ShenNewpv.LAMBDA.apply(v5578);

final Object b5582 = f5583;
final Object f5584 = ShenIncinfs.LAMBDA.apply();












final Object f5585 = UnifyBang.LAMBDA.apply(v5577, new Cons(a5580, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(b5582, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("boolean"), Nil.NIL))), Nil.NIL))), v5578, v5579);
final Object f5586 = Do.LAMBDA.apply(f5584, f5585);



    return f5586;

}
}
