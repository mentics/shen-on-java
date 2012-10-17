package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfIntoutput {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-intoutput");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v5089, final Object v5090, final Object v5091) throws Exception {
return defined(v5089, v5090, v5091);
}};
public static Object defined(final Object v5089, final Object v5090, final Object v5091) throws Exception {
final Object f5093 = ShenNewpv.LAMBDA.apply(v5090);

final Object a5092 = f5093;
final Object f5094 = ShenIncinfs.LAMBDA.apply();












final Object f5095 = UnifyBang.LAMBDA.apply(v5089, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(a5092, new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), Nil.NIL))), v5090, v5091);
final Object f5096 = Do.LAMBDA.apply(f5094, f5095);


    return f5096;

}
}
