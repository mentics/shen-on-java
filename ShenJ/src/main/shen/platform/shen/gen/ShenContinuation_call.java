package shen.gen;



import com.mentics.shen.*;

public class ShenContinuation_call {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-continuation_call");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1296, final Object v1297) throws Exception {
return defined(v1296, v1297);
}};
public static Object defined(final Object v1296, final Object v1297) throws Exception {

final Object f3166 = ShenExtract_vars.LAMBDA.apply(v1296);


final Object vTerms3165 = new Cons(RuntimeContext.symbol("ProcessN"), f3166);
final Object f3168 = ShenExtract_vars.LAMBDA.apply(v1297);

final Object vBody3167 = f3168;
final Object f3170 = Difference.LAMBDA.apply(vBody3167, vTerms3165);
final Object f3171 = Remove.LAMBDA.apply(RuntimeContext.symbol("Throwcontrol"), f3170);

final Object free3169 = f3171;
final Object f3172 = ShenCc_help.LAMBDA.apply(free3169, v1297);




    return f3172;

}
}
