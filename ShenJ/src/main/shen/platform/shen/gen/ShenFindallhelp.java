package shen.gen;



import com.mentics.shen.*;

public class ShenFindallhelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-findallhelp");
public static final Lambda LAMBDA = new Lambda6() {
public Object apply(final Object v913, final Object v914, final Object v915, final Object v916, final Object v917, final Object v918) throws Exception {
return defined(v913, v914, v915, v916, v917, v918);
}};
public static Object defined(final Object v913, final Object v914, final Object v915, final Object v916, final Object v917, final Object v918) throws Exception {
final Object f3314 = ShenIncinfs.LAMBDA.apply();
final Lambda l3318 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3316 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3315 = Fwhen.LAMBDA.apply(false, v917, v918);

    return f3315;
  }
};final Object f3317 = ShenRemember.LAMBDA.apply(v916, v913, v917, l3316);

    return f3317;
  }
};final Object f3319 = Call.LAMBDA.apply(v914, v917, l3318);
final Object f3320 = Do.LAMBDA.apply(f3314, f3319);

final Object case3313 = f3320;

final Object i3325;
if ((boolean)Lang.equals(case3313, false)) {
final Object f3321 = ShenIncinfs.LAMBDA.apply();
final Object f3322 = ShenLazyderef.LAMBDA.apply(v916, v917);

final Object f3323 = Bind.LAMBDA.apply(v915, RuntimeContext.globalProperties.get(f3322), v917, v918);
final Object f3324 = Do.LAMBDA.apply(f3321, f3323);

i3325 = f3324;
} else {

i3325 = case3313;

}

    return i3325;

}
}
