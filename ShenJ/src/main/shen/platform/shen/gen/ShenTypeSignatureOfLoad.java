package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfLoad {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-load");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v509, final Object v510, final Object v511) throws Exception {
return defined(v509, v510, v511);
}};
public static Object defined(final Object v509, final Object v510, final Object v511) throws Exception {
final Object f512 = ShenIncinfs.LAMBDA.apply();






final Object f513 = UnifyBang.LAMBDA.apply(v509, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(RuntimeContext.symbol("symbol"), Nil.NIL))), v510, v511);
final Object f514 = Do.LAMBDA.apply(f512, f513);

    return f514;

}
}
