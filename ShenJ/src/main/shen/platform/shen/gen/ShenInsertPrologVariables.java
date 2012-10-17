package shen.gen;



import com.mentics.shen.*;

public class ShenInsertPrologVariables {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert-prolog-variables");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1531, final Object v1532) throws Exception {
return defined(v1531, v1532);
}};
public static Object defined(final Object v1531, final Object v1532) throws Exception {
final Object f3919 = ShenFlatten.LAMBDA.apply(v1531);
final Object f3920 = ShenInsertPrologVariablesHelp.LAMBDA.apply(v1531, f3919, v1532);

    return f3920;

}
}
