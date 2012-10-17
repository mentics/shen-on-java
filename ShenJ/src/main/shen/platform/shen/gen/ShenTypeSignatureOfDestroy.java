package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfDestroy {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-destroy");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4665, final Object v4666, final Object v4667) throws Exception {
return defined(v4665, v4666, v4667);
}};
public static Object defined(final Object v4665, final Object v4666, final Object v4667) throws Exception {
final Object f4669 = ShenNewpv.LAMBDA.apply(v4666);

final Object a4668 = f4669;
final Object f4671 = ShenNewpv.LAMBDA.apply(v4666);

final Object b4670 = f4671;
final Object f4672 = ShenIncinfs.LAMBDA.apply();


















final Object f4673 = UnifyBang.LAMBDA.apply(v4665, new Cons(new Cons(a4668, new Cons(RuntimeContext.symbol("-->"), new Cons(b4670, Nil.NIL))), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a4668, new Cons(RuntimeContext.symbol("-->"), new Cons(b4670, Nil.NIL))), Nil.NIL))), v4666, v4667);
final Object f4674 = Do.LAMBDA.apply(f4672, f4673);



    return f4674;

}
}
