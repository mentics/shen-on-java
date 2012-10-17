package shen.gen;



import com.mentics.shen.*;

public class KlToJavaString {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-to-java-string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7290) throws Exception {
return defined(v7290);
}};
public static Object defined(final Object v7290) throws Exception {
final Object f8962 = ParseSingleKl.LAMBDA.apply(v7290);
final Object f8963 = ParsedKlToJava.LAMBDA.apply(f8962);

    return f8963;

}
}
