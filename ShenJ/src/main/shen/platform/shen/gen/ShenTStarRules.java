package shen.gen;



import com.mentics.shen.*;

public class ShenTStarRules {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-rules");
public static final Lambda LAMBDA = new Lambda7() {
public Object apply(final Object v877, final Object v878, final Object v879, final Object v880, final Object v881, final Object v882, final Object v883) throws Exception {
return defined(v877, v878, v879, v880, v881, v882, v883);
}};
public static Object defined(final Object v877, final Object v878, final Object v879, final Object v880, final Object v881, final Object v882, final Object v883) throws Exception {
final Object f2821 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol2820 = f2821;
final Object f2824 = ShenLazyderef.LAMBDA.apply(v877, v882);

final Object v5162823 = f2824;

final Object i2828;
if ((boolean)Lang.equals(Nil.NIL, v5162823)) {
final Object f2825 = ShenIncinfs.LAMBDA.apply();
final Object f2826 = Thaw.LAMBDA.apply(v883);
final Object f2827 = Do.LAMBDA.apply(f2825, f2826);

i2828 = f2827;
} else {

i2828 = false;

}

final Object case2822 = i2828;

final Object i2846;
if ((boolean)Lang.equals(case2822, false)) {
final Object f2830 = ShenLazyderef.LAMBDA.apply(v877, v882);

final Object v5172829 = f2830;


final Object i2845;
if ((boolean)(v5172829 instanceof Cons)) {


final Object rule2831 = ((Cons)v5172829).head;


final Object rules2832 = ((Cons)v5172829).tail;
final Object f2834 = ShenNewpv.LAMBDA.apply(v882);

final Object m2833 = f2834;
final Object f2835 = ShenIncinfs.LAMBDA.apply();
final Lambda l2842 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2840 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2836 = ShenLazyderef.LAMBDA.apply(v879, v882);


final Lambda l2838 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2837 = ShenTStarRules.LAMBDA.apply(rules2832, v878, m2833, v880, v881, v882, v883);

    return f2837;
  }
};final Object f2839 = Bind.LAMBDA.apply(m2833, Primitives.plus.apply(f2836, 1), v882, l2838);

    return f2839;
  }
};final Object f2841 = Cut.LAMBDA.apply(throwcontrol2820, v882, l2840);

    return f2841;
  }
};final Object f2843 = ShenTStarRule.LAMBDA.apply(rule2831, v878, v879, v880, v881, v882, l2842);
final Object f2844 = Do.LAMBDA.apply(f2835, f2843);




i2845 = f2844;
} else {

i2845 = false;

}

i2846 = i2845;
} else {

i2846 = case2822;

}
final Object f2847 = ShenCutpoint.LAMBDA.apply(throwcontrol2820, i2846);


    return f2847;

}
}
