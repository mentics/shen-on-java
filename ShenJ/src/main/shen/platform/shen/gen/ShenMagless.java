package shen.gen;



import com.mentics.shen.*;

public class ShenMagless {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-magless");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v911, final Object v912) throws Exception {
return defined(v911, v912);
}};
public static Object defined(final Object v911, final Object v912) throws Exception {



final Object nx21067 = Primitives.multiply.apply(v912, 2);



final Object i1069;
if ((boolean)(((Number)(nx21067)).doubleValue() > ((Number)(v911)).doubleValue())) {

i1069 = v912;
} else {
final Object f1068 = ShenMagless.LAMBDA.apply(v911, nx21067);

i1069 = f1068;

}

    return i1069;

}
}
