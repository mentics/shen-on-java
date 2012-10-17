package shen.gen;



import com.mentics.shen.*;

public class ShenSProlog {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-s-prolog");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1198) throws Exception {
return defined(v1198);
}};
public static Object defined(final Object v1198) throws Exception {
final Lambda l2776 = new Lambda1() {
  public Object apply(final Object v1199) throws Exception {
    final Object f2775 = Eval.LAMBDA.apply(v1199);

    return f2775;
  }
};final Object f2777 = ShenPrologToShen.LAMBDA.apply(v1198);
final Object f2778 = Map.LAMBDA.apply(l2776, f2777);

    return f2778;

}
}
