package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfVector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-vector");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4835, final Object v4836, final Object v4837) throws Exception {
return defined(v4835, v4836, v4837);
}};
public static Object defined(final Object v4835, final Object v4836, final Object v4837) throws Exception {
final Object f4839 = ShenNewpv.LAMBDA.apply(v4836);

final Object a4838 = f4839;
final Object f4840 = ShenIncinfs.LAMBDA.apply();










final Object f4841 = UnifyBang.LAMBDA.apply(v4835, new Cons(RuntimeContext.symbol("number"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a4838, Nil.NIL)), Nil.NIL))), v4836, v4837);
final Object f4842 = Do.LAMBDA.apply(f4840, f4841);


    return f4842;

}
}
