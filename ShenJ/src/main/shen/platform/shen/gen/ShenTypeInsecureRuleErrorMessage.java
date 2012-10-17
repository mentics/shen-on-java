package shen.gen;



import com.mentics.shen.*;

public class ShenTypeInsecureRuleErrorMessage {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-insecure-rule-error-message");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v896, final Object v897) throws Exception {
return defined(v896, v897);
}};
public static Object defined(final Object v896, final Object v897) throws Exception {
final Object f2892 = Atp.LAMBDA.apply(v897, Nil.NIL);
final Object f2893 = Atp.LAMBDA.apply(v896, f2892);
final Object f2894 = Interror.LAMBDA.apply("type error in rule ~A of ~A~%", f2893);

    return f2894;

}
}
