package shen.gen;



import com.mentics.shen.*;

public class Macroexpand {

public static final Symbol SYMBOL = RuntimeContext.symbol("macroexpand");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v531) throws Exception {
return defined(v531);
}};
public static Object defined(final Object v531) throws Exception {

final Object f4294 = ShenCompose.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*macros*")), v531);

final Object y4293 = f4294;

final Object i4296;
if ((boolean)Lang.equals(v531, y4293)) {

i4296 = v531;
} else {
final Object f4295 = ShenWalk.LAMBDA.apply(RuntimeContext.symbol("macroexpand"), y4293);

i4296 = f4295;

}

    return i4296;

}
}
