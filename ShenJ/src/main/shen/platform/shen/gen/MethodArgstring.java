package shen.gen;



import com.mentics.shen.*;

public class MethodArgstring {

public static final Symbol SYMBOL = RuntimeContext.symbol("method-argstring");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1164) throws Exception {
return defined(v1164);
}};
public static Object defined(final Object v1164) throws Exception {
final Object f1165 = StringJoin.LAMBDA.apply(", ", v1164);

    return f1165;

}
}
