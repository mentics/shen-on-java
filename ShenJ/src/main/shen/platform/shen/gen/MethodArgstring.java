package shen.gen;



import com.mentics.shen.*;

public class MethodArgstring {

public static final Symbol SYMBOL = RuntimeContext.symbol("method-argstring");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7237) throws Exception {
return defined(v7237);
}};
public static Object defined(final Object v7237) throws Exception {
final Object f7326 = StringJoin.LAMBDA.apply(", ", v7237);

    return f7326;

}
}
