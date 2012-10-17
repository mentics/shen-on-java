package shen.gen;



import com.mentics.shen.*;

public class ShenProcessDatatype {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-process-datatype");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1571, final Object v1572) throws Exception {
return defined(v1571, v1572);
}};
public static Object defined(final Object v1571, final Object v1572) throws Exception {
final Object f6202 = ShenRulesToHornClauses.LAMBDA.apply(v1571, v1572);
final Object f6203 = ShenSProlog.LAMBDA.apply(f6202);
final Object f6204 = ShenRememberDatatype.LAMBDA.apply(f6203);

    return f6204;

}
}
