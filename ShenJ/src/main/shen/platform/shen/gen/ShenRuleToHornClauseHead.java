package shen.gen;



import com.mentics.shen.*;

public class ShenRuleToHornClauseHead {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-rule->horn-clause-head");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1593, final Object v1594) throws Exception {
return defined(v1593, v1594);
}};
public static Object defined(final Object v1593, final Object v1594) throws Exception {

final Object f6289 = ShenModeIfy.LAMBDA.apply(v1594);






    return new Cons(v1593, new Cons(f6289, new Cons(RuntimeContext.symbol("Context_1957"), Nil.NIL)));

}
}
