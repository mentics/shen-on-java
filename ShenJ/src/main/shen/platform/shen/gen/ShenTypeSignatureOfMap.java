package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfMap {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-map");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4985, final Object v4986, final Object v4987) throws Exception {
return defined(v4985, v4986, v4987);
}};
public static Object defined(final Object v4985, final Object v4986, final Object v4987) throws Exception {
final Object f4989 = ShenNewpv.LAMBDA.apply(v4986);

final Object a4988 = f4989;
final Object f4991 = ShenNewpv.LAMBDA.apply(v4986);

final Object b4990 = f4991;
final Object f4992 = ShenIncinfs.LAMBDA.apply();


























final Object f4993 = UnifyBang.LAMBDA.apply(v4985, new Cons(new Cons(a4988, new Cons(RuntimeContext.symbol("-->"), new Cons(b4990, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a4988, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b4990, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4986, v4987);
final Object f4994 = Do.LAMBDA.apply(f4992, f4993);



    return f4994;

}
}
