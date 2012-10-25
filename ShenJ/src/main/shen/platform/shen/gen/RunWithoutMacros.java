package shen.gen;



import com.mentics.shen.*;

public class RunWithoutMacros {

public static final Symbol SYMBOL = RuntimeContext.symbol("run-without-macros");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2891) throws Exception {
return defined(v2891);
}};
public static Object defined(final Object v2891) throws Exception {



RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*save-macros*"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("*macros*")));

RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*macros*"), Nil.NIL);final Object f2893 = RuntimeContext.dispatch(v2891).apply();

final Object result2892 = f2893;



RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("*macros*"), RuntimeContext.globalProperties.get(RuntimeContext.symbol("*save-macros*")));final Object f2894 = Do.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*save-macros*")), result2892);

final Object f2895 = Do.LAMBDA.apply(Nil.NIL, f2894);
final Object f2896 = Do.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*macros*")), f2895);

    return f2896;

}
}
