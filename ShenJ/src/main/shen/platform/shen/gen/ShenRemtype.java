package shen.gen;



import com.mentics.shen.*;

public class ShenRemtype {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remtype");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1677) throws Exception {
return defined(v1677);
}};
public static Object defined(final Object v1677) throws Exception {

final Object f4268 = Remove.LAMBDA.apply(v1677, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*signedfuncs*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*signedfuncs*"), f4268);final Object f4269 = Do.LAMBDA.apply(f4268, v1677);

    return f4269;

}
}
