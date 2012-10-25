package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfTlv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-tlv");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v895, final Object v896, final Object v897) throws Exception {
return defined(v895, v896, v897);
}};
public static Object defined(final Object v895, final Object v896, final Object v897) throws Exception {
final Object f899 = ShenNewpv.LAMBDA.apply(v896);

final Object a898 = f899;
final Object f900 = ShenIncinfs.LAMBDA.apply();














final Object f901 = UnifyBang.LAMBDA.apply(v895, new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a898, Nil.NIL)), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(a898, Nil.NIL)), Nil.NIL))), v896, v897);
final Object f902 = Do.LAMBDA.apply(f900, f901);


    return f902;

}
}
