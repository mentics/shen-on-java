package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntmakeString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-intmake-string");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4975, final Object v4976, final Object v4977) throws Exception {
return defined(v4975, v4976, v4977);
}};
public static Object defined(final Object v4975, final Object v4976, final Object v4977) throws Exception {
final Object f4979 = ShenNewpv.LAMBDA.apply(v4976);

final Object a4978 = f4979;
final Object f4980 = ShenIncinfs.LAMBDA.apply();












final Object f4981 = UnifyBang.LAMBDA.apply(v4975, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4978, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v4976, v4977);
final Object f4982 = Do.LAMBDA.apply(f4980, f4981);


    return f4982;

}
}
