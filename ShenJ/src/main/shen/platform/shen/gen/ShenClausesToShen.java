package shen.gen;



import com.mentics.shen.*;

public class ShenClausesToShen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-clauses-to-shen");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1263, final Object v1264) throws Exception {
return defined(v1263, v1264);
}};
public static Object defined(final Object v1263, final Object v1264) throws Exception {
final Lambda l3033 = new Lambda1() {
  public Object apply(final Object v1265) throws Exception {
    final Object f3032 = ShenLineariseClause.LAMBDA.apply(v1265);

    return f3032;
  }
};final Object f3034 = Map.LAMBDA.apply(l3033, v1264);

final Object linear3031 = f3034;
final Lambda l3037 = new Lambda1() {
  public Object apply(final Object v1266) throws Exception {
    final Object f3036 = Head.LAMBDA.apply(v1266);

    return f3036;
  }
};final Object f3038 = Map.LAMBDA.apply(l3037, v1264);
final Object f3039 = ShenPrologAritycheck.LAMBDA.apply(v1263, f3038);

final Object arity3035 = f3039;
final Object f3041 = ShenParameters.LAMBDA.apply(arity3035);

final Object parameters3040 = f3041;
final Lambda l3044 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f3043 = ShenAum.LAMBDA.apply(x, parameters3040);

    return f3043;
  }
};final Object f3045 = Map.LAMBDA.apply(l3044, linear3031);

final Object aUM_instructions3042 = f3045;
final Lambda l3048 = new Lambda1() {
  public Object apply(final Object v1267) throws Exception {
    final Object f3047 = ShenAum_to_shen.LAMBDA.apply(v1267);

    return f3047;
  }
};final Object f3049 = Map.LAMBDA.apply(l3048, aUM_instructions3042);
final Object f3050 = ShenNestDisjunct.LAMBDA.apply(f3049);
final Object f3051 = ShenCatchCut.LAMBDA.apply(f3050);

final Object code3046 = f3051;










final Object f3053 = Append.LAMBDA.apply(new Cons(RuntimeContext.symbol("ProcessN"), new Cons(RuntimeContext.symbol("Continuation"), Nil.NIL)), new Cons(RuntimeContext.symbol("->"), new Cons(code3046, Nil.NIL)));
final Object f3054 = Append.LAMBDA.apply(parameters3040, f3053);



final Object shenDef3052 = new Cons(RuntimeContext.symbol("define"), new Cons(v1263, f3054));







    return shenDef3052;

}
}
