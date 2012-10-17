package shen.gen;



import com.mentics.shen.*;

public class Eval {

public static final Symbol SYMBOL = RuntimeContext.symbol("eval");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v651) throws Exception {
return defined(v651);
}};
public static Object defined(final Object v651) throws Exception {
final Lambda l611 = new Lambda1() {
  public Object apply(final Object v652) throws Exception {
    final Object f610 = Macroexpand.LAMBDA.apply(v652);

    return f610;
  }
};final Object f612 = ShenWalk.LAMBDA.apply(l611, v651);

final Object macroexpand609 = f612;
final Object f613 = ShenPackagedQ.LAMBDA.apply(macroexpand609);

final Object i619;
if ((boolean)f613) {
final Lambda l615 = new Lambda1() {
  public Object apply(final Object v653) throws Exception {
    final Object f614 = ShenEvalWithoutMacros.LAMBDA.apply(v653);

    return f614;
  }
};final Object f616 = ShenPackageContents.LAMBDA.apply(macroexpand609);
final Object f617 = Map.LAMBDA.apply(l615, f616);

i619 = f617;
} else {
final Object f618 = ShenEvalWithoutMacros.LAMBDA.apply(macroexpand609);

i619 = f618;

}

    return i619;

}
}
