package shen.gen;



import com.mentics.shen.*;

public class KlToJavaString {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-to-java-string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2875) throws Exception {
return defined(v2875);
}};
public static Object defined(final Object v2875) throws Exception {
final Object f2876 = ParseSingleKl.LAMBDA.apply(v2875);
final Object f2877 = ParsedKlToJava.LAMBDA.apply(f2876);

    return f2877;

}
}
