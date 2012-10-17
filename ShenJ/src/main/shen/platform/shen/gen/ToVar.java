package shen.gen;



import com.mentics.shen.*;

public class ToVar {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-var");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7242) throws Exception {
return defined(v7242);
}};
public static Object defined(final Object v7242) throws Exception {

final Object f7336 = NameToMethodName.LAMBDA.apply(String.valueOf(v7242));

    return f7336;

}
}
