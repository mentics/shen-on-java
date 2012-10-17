package shen.gen;



import com.mentics.shen.*;

public class Systemf {

public static final Symbol SYMBOL = RuntimeContext.symbol("systemf");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1543) throws Exception {
return defined(v1543);
}};
public static Object defined(final Object v1543) throws Exception {

final Object f4182 = Adjoin.LAMBDA.apply(v1543, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*system*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*system*"), f4182);
    return f4182;

}
}
