package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfClose {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-close");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4627, final Object v4628, final Object v4629) throws Exception {
return defined(v4627, v4628, v4629);
}};
public static Object defined(final Object v4627, final Object v4628, final Object v4629) throws Exception {
final Object f4631 = ShenNewpv.LAMBDA.apply(v4628);

final Object a4630 = f4631;
final Object f4633 = ShenNewpv.LAMBDA.apply(v4628);

final Object b4632 = f4633;
final Object f4634 = ShenIncinfs.LAMBDA.apply();














final Object f4635 = UnifyBang.LAMBDA.apply(v4627, new Cons(new Cons(RuntimeContext.symbol("stream"), new Cons(a4630, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(b4632, Nil.NIL)), Nil.NIL))), v4628, v4629);
final Object f4636 = Do.LAMBDA.apply(f4634, f4635);



    return f4636;

}
}
