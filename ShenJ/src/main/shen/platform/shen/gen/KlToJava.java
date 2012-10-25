package shen.gen;



import com.mentics.shen.*;

public class KlToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2878) throws Exception {
return defined(v2878);
}};
public static Object defined(final Object v2878) throws Exception {
final Object f2879 = ParseSingleKl.LAMBDA.apply(v2878);
final Object f2880 = JavaEval.LAMBDA.apply(f2879);

    return f2880;

}
}
