package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfStinput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-stinput");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v803, final Object v804, final Object v805) throws Exception {
return defined(v803, v804, v805);
}};
public static Object defined(final Object v803, final Object v804, final Object v805) throws Exception {
final Object f807 = ShenNewpv.LAMBDA.apply(v804);

final Object a806 = f807;
final Object f808 = ShenIncinfs.LAMBDA.apply();










final Object f809 = UnifyBang.LAMBDA.apply(v803, new Cons(a806, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(RuntimeContext.symbol("in"), Nil.NIL)), Nil.NIL))), v804, v805);
final Object f810 = Do.LAMBDA.apply(f808, f809);


    return f810;

}
}
