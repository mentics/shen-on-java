package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOccurrences {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-occurrences");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v603, final Object v604, final Object v605) throws Exception {
return defined(v603, v604, v605);
}};
public static Object defined(final Object v603, final Object v604, final Object v605) throws Exception {
final Object f607 = ShenNewpv.LAMBDA.apply(v604);

final Object a606 = f607;
final Object f609 = ShenNewpv.LAMBDA.apply(v604);

final Object b608 = f609;
final Object f610 = ShenIncinfs.LAMBDA.apply();












final Object f611 = UnifyBang.LAMBDA.apply(v603, new Cons(a606, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(b608, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v604, v605);
final Object f612 = Do.LAMBDA.apply(f610, f611);



    return f612;

}
}
