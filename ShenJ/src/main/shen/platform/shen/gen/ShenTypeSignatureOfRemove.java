package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfRemove {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-remove");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v737, final Object v738, final Object v739) throws Exception {
return defined(v737, v738, v739);
}};
public static Object defined(final Object v737, final Object v738, final Object v739) throws Exception {
final Object f741 = ShenNewpv.LAMBDA.apply(v738);

final Object a740 = f741;
final Object f742 = ShenIncinfs.LAMBDA.apply();




















final Object f743 = UnifyBang.LAMBDA.apply(v737, new Cons(a740, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a740, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a740, Nil.NIL)), Nil.NIL))), Nil.NIL))), v738, v739);
final Object f744 = Do.LAMBDA.apply(f742, f743);


    return f744;

}
}
