package shen.gen;



import com.mentics.shen.*;

public class ShenTStarRule {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-rule");
public static final Lambda LAMBDA = new Lambda7() {
public Object apply(final Object v884, final Object v885, final Object v886, final Object v887, final Object v888, final Object v889, final Object v890) throws Exception {
return defined(v884, v885, v886, v887, v888, v889, v890);
}};
public static Object defined(final Object v884, final Object v885, final Object v886, final Object v887, final Object v888, final Object v889, final Object v890) throws Exception {
final Object f2849 = ShenIncinfs.LAMBDA.apply();
final Object f2850 = ShenTStarRuleh.LAMBDA.apply(v884, v885, v888, v889, v890);
final Object f2851 = Do.LAMBDA.apply(f2849, f2850);

final Object case2848 = f2851;

final Object i2860;
if ((boolean)Lang.equals(case2848, false)) {
final Object f2853 = ShenNewpv.LAMBDA.apply(v889);

final Object error2852 = f2853;
final Object f2854 = ShenIncinfs.LAMBDA.apply();
final Object f2855 = ShenLazyderef.LAMBDA.apply(v886, v889);
final Object f2856 = ShenLazyderef.LAMBDA.apply(v887, v889);
final Object f2857 = ShenTypeInsecureRuleErrorMessage.LAMBDA.apply(f2855, f2856);
final Object f2858 = Bind.LAMBDA.apply(error2852, f2857, v889, v890);
final Object f2859 = Do.LAMBDA.apply(f2854, f2858);


i2860 = f2859;
} else {

i2860 = case2848;

}

    return i2860;

}
}
