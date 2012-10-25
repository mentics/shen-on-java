package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReverse {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-reverse");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v747, final Object v748, final Object v749) throws Exception {
return defined(v747, v748, v749);
}};
public static Object defined(final Object v747, final Object v748, final Object v749) throws Exception {
final Object f751 = ShenNewpv.LAMBDA.apply(v748);

final Object a750 = f751;
final Object f752 = ShenIncinfs.LAMBDA.apply();














final Object f753 = UnifyBang.LAMBDA.apply(v747, new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a750, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a750, Nil.NIL)), Nil.NIL))), v748, v749);
final Object f754 = Do.LAMBDA.apply(f752, f753);


    return f754;

}
}
