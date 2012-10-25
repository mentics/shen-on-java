package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTlstr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tlstr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v887, final Object v888, final Object v889) throws Exception {
return defined(v887, v888, v889);
}};
public static Object defined(final Object v887, final Object v888, final Object v889) throws Exception {
final Object f890 = ShenIncinfs.LAMBDA.apply();






final Object f891 = UnifyBang.LAMBDA.apply(v887, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), v888, v889);
final Object f892 = Do.LAMBDA.apply(f890, f891);

    return f892;

}
}
