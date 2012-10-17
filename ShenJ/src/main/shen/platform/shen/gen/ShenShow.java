package shen.gen;



import com.mentics.shen.*;

public class ShenShow {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-show");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v799, final Object v800, final Object v801, final Object v802) throws Exception {
return defined(v799, v800, v801, v802);
}};
public static Object defined(final Object v799, final Object v800, final Object v801, final Object v802) throws Exception {


final Object i2317;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*spy*"))) {
final Object f2298 = ShenLine.LAMBDA.apply();
final Object f2299 = ShenDeref.LAMBDA.apply(v799, v801);
final Object f2300 = ShenShowP.LAMBDA.apply(f2299);
final Object f2301 = Nl.LAMBDA.apply(1);
final Object f2302 = Nl.LAMBDA.apply(1);
final Object f2303 = ShenDeref.LAMBDA.apply(v800, v801);
final Object f2304 = ShenShowAssumptions.LAMBDA.apply(f2303, 1);
final Object f2305 = Intoutput.LAMBDA.apply("~%> ", Nil.NIL);

final Object f2306 = ShenPauseForUser.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*language*")));
final Object f2307 = Thaw.LAMBDA.apply(v802);
final Object f2308 = Do.LAMBDA.apply(f2306, f2307);
final Object f2309 = Do.LAMBDA.apply(f2305, f2308);
final Object f2310 = Do.LAMBDA.apply(f2304, f2309);
final Object f2311 = Do.LAMBDA.apply(f2302, f2310);
final Object f2312 = Do.LAMBDA.apply(f2301, f2311);
final Object f2313 = Do.LAMBDA.apply(f2300, f2312);
final Object f2314 = Do.LAMBDA.apply(f2298, f2313);

i2317 = f2314;
} else {

final Object i2316;
if ((boolean)true) {
final Object f2315 = Thaw.LAMBDA.apply(v802);

i2316 = f2315;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2317 = i2316;

}
    return i2317;

}
}
