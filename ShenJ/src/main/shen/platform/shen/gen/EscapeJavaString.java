package shen.gen;



import com.mentics.shen.*;

public class EscapeJavaString {

public static final Symbol SYMBOL = RuntimeContext.symbol("escape-java-string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6923) throws Exception {
return defined(v6923);
}};
public static Object defined(final Object v6923) throws Exception {
final Object f7105 = EscapeJavaUstring.LAMBDA.apply();
final Object f7106 = Explode.LAMBDA.apply(v6923);
final Object f7107 = Map.LAMBDA.apply(f7105, f7106);
final Object f7108 = ListToString.LAMBDA.apply(f7107);

    return f7108;

}
}
