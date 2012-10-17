package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfOccurrences {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-occurrences");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5061, final Object v5062, final Object v5063) throws Exception {
return defined(v5061, v5062, v5063);
}};
public static Object defined(final Object v5061, final Object v5062, final Object v5063) throws Exception {
final Object f5065 = ShenNewpv.LAMBDA.apply(v5062);

final Object a5064 = f5065;
final Object f5067 = ShenNewpv.LAMBDA.apply(v5062);

final Object b5066 = f5067;
final Object f5068 = ShenIncinfs.LAMBDA.apply();












final Object f5069 = UnifyBang.LAMBDA.apply(v5061, new Cons(a5064, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(b5066, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), Nil.NIL))), v5062, v5063);
final Object f5070 = Do.LAMBDA.apply(f5068, f5069);



    return f5070;

}
}
