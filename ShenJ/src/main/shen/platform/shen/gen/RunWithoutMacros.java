package shen.gen;



import com.mentics.shen.*;

public class RunWithoutMacros {

public static final Symbol SYMBOL = RuntimeContext.symbol("run-without-macros");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7293) throws Exception {
return defined(v7293);
}};
public static Object defined(final Object v7293) throws Exception {



RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*save-macros*"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("*macros*")));

RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*macros*"), Nil.NIL);final Object f8976 = RuntimeContext.dispatch(v7293).apply();

final Object result8975 = f8976;



RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*macros*"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("*save-macros*")));final Object f8977 = Do.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*save-macros*")), result8975);

final Object f8978 = Do.LAMBDA.apply(Nil.NIL, f8977);
final Object f8979 = Do.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*macros*")), f8978);

    return f8979;

}
}
