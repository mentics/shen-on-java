package shen.gen;



import com.mentics.shen.*;

public class ShenFixHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-fix-help");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v810, final Object v811, final Object v812) throws Exception {
return defined(v810, v811, v812);
}};
public static Object defined(final Object v810, final Object v811, final Object v812) throws Exception {

final Object i909;
if ((boolean)Lang.equals(v812, v811)) {

i909 = v812;
} else {

final Object i908;
if ((boolean)true) {
final Object f906 = RuntimeContext.dispatch(v810).apply(v812);
final Object f907 = ShenFixHelp.LAMBDA.apply(v810, v812, f906);

i908 = f907;
} else {

throw new SimpleError((String)"True condition not found.");


}
i909 = i908;

}
    return i909;

}
}
