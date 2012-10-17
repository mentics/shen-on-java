package shen.gen;



import com.mentics.shen.*;

public class ShenSigf {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-sigf");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v818) throws Exception {
return defined(v818);
}};
public static Object defined(final Object v818) throws Exception {
final Object f2376 = Concat.LAMBDA.apply(RuntimeContext.symbol("shen-type-signature-of-"), v818);

    return f2376;

}
}
