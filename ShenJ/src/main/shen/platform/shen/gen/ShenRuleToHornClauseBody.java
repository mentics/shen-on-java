package shen.gen;



import com.mentics.shen.*;

public class ShenRuleToHornClauseBody {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-rule->horn-clause-body");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1596, final Object v1597, final Object v1598) throws Exception {
return defined(v1596, v1597, v1598);
}};
public static Object defined(final Object v1596, final Object v1597, final Object v1598) throws Exception {
final Lambda l6302 = new Lambda1() {
  public Object apply(final Object v1599) throws Exception {
    final Object f6301 = ShenExtract_vars.LAMBDA.apply(v1599);

    return f6301;
  }
};final Object f6303 = Map.LAMBDA.apply(l6302, v1598);

final Object variables6300 = f6303;
final Lambda l6306 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f6305 = Gensym.LAMBDA.apply(RuntimeContext.symbol("shen-cl"));

    return f6305;
  }
};final Object f6307 = Map.LAMBDA.apply(l6306, v1598);

final Object predicates6304 = f6307;
final Object f6309 = ShenConstructSearchLiterals.LAMBDA.apply(predicates6304, variables6300, RuntimeContext.symbol("Context_1957"), RuntimeContext.symbol("Context1_1957"));

final Object searchLiterals6308 = f6309;
final Object f6311 = ShenConstructSearchClauses.LAMBDA.apply(predicates6304, v1598, variables6300);

final Object searchClauses6310 = f6311;
final Object f6313 = ShenConstructSideLiterals.LAMBDA.apply(v1596);

final Object sideLiterals6312 = f6313;
final Lambda l6317 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f6315 = EmptyQ.LAMBDA.apply(v1598);
final Object f6316 = ShenConstructPremissLiteral.LAMBDA.apply(x, f6315);

    return f6316;
  }
};final Object f6318 = Map.LAMBDA.apply(l6317, v1597);

final Object premissLiterals6314 = f6318;
final Object f6319 = Append.LAMBDA.apply(sideLiterals6312, premissLiterals6314);
final Object f6320 = Append.LAMBDA.apply(searchLiterals6308, f6319);







    return f6320;

}
}
