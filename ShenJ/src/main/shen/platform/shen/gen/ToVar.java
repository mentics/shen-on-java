package shen.gen;



import com.mentics.shen.*;

public class ToVar {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-var");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1179) throws Exception {
return defined(v1179);
}};
public static Object defined(final Object v1179) throws Exception {

final Object f1180 = NameToMethodName.LAMBDA.apply(String.valueOf(v1179));

    return f1180;

}
}
