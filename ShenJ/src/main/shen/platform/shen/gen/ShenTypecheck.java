package shen.gen;



import com.mentics.shen.*;

public class ShenTypecheck {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-typecheck");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v761, final Object v762) throws Exception {
return defined(v761, v762);
}};
public static Object defined(final Object v761, final Object v762) throws Exception {
final Object f7 = ShenCurry.LAMBDA.apply(v761);

final Object curry6 = f7;
final Object f9 = ShenStartNewPrologProcess.LAMBDA.apply();

final Object processN8 = f9;
final Object f11 = ShenCurryType.LAMBDA.apply(v762);
final Object f12 = ShenNormaliseType.LAMBDA.apply(f11);
final Object f13 = ShenInsertPrologVariables.LAMBDA.apply(f12, processN8);

final Object type10 = f13;
final Lambda l16 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f15 = Return.LAMBDA.apply(type10, processN8, RuntimeContext.symbol("shen-void"));

    return f15;
  }
};
final Object continuation14 = l16;
final Object f17 = ShenThStar.LAMBDA.apply(curry6, type10, Nil.NIL, processN8, continuation14);





    return f17;

}
}
