package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfArity {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-arity");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v4581, final Object v4582, final Object v4583) throws Exception {
return defined(v4581, v4582, v4583);
}};
public static Object defined(final Object v4581, final Object v4582, final Object v4583) throws Exception {
final Object f4585 = ShenNewpv.LAMBDA.apply(v4582);

final Object a4584 = f4585;
final Object f4586 = ShenIncinfs.LAMBDA.apply();






final Object f4587 = UnifyBang.LAMBDA.apply(v4581, new Cons(a4584, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("number"), Nil.NIL))), v4582, v4583);
final Object f4588 = Do.LAMBDA.apply(f4586, f4587);


    return f4588;

}
}
