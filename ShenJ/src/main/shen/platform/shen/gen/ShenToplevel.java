package shen.gen;



import com.mentics.shen.*;

public class ShenToplevel {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-toplevel");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v594) throws Exception {
return defined(v594);
}};
public static Object defined(final Object v594) throws Exception {

final Object f6591 = ShenToplevel_evaluate.LAMBDA.apply(v594, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tc*")));

    return f6591;

}
}
