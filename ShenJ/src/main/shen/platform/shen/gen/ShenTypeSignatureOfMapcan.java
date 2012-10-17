package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfMapcan {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-mapcan");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4997, final Object v4998, final Object v4999) throws Exception {
return defined(v4997, v4998, v4999);
}};
public static Object defined(final Object v4997, final Object v4998, final Object v4999) throws Exception {
final Object f5001 = ShenNewpv.LAMBDA.apply(v4998);

final Object a5000 = f5001;
final Object f5003 = ShenNewpv.LAMBDA.apply(v4998);

final Object b5002 = f5003;
final Object f5004 = ShenIncinfs.LAMBDA.apply();






























final Object f5005 = UnifyBang.LAMBDA.apply(v4997, new Cons(new Cons(a5000, new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b5002, Nil.NIL)), Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(a5000, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b5002, Nil.NIL)), Nil.NIL))), Nil.NIL))), v4998, v4999);
final Object f5006 = Do.LAMBDA.apply(f5004, f5005);



    return f5006;

}
}
