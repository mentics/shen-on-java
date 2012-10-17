package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfFix {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-fix");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4765, final Object v4766, final Object v4767) throws Exception {
return defined(v4765, v4766, v4767);
}};
public static Object defined(final Object v4765, final Object v4766, final Object v4767) throws Exception {
final Object f4769 = ShenNewpv.LAMBDA.apply(v4766);

final Object a4768 = f4769;
final Object f4770 = ShenIncinfs.LAMBDA.apply();


















final Object f4771 = UnifyBang.LAMBDA.apply(v4765, new Cons(new Cons(a4768, new Cons(RuntimeContext.symbol("-->"), new Cons(a4768, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4768, new Cons(RuntimeContext.symbol("-->"), new Cons(a4768, Nil.NIL))), Nil.NIL))), v4766, v4767);
final Object f4772 = Do.LAMBDA.apply(f4770, f4771);


    return f4772;

}
}
