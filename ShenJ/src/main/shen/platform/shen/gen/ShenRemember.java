package shen.gen;



import com.mentics.shen.*;

public class ShenRemember {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remember");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v919, final Object v920, final Object v921, final Object v922) throws Exception {
return defined(v919, v920, v921, v922);
}};
public static Object defined(final Object v919, final Object v920, final Object v921, final Object v922) throws Exception {
final Object f3327 = ShenNewpv.LAMBDA.apply(v921);

final Object b3326 = f3327;
final Object f3328 = ShenIncinfs.LAMBDA.apply();
final Object f3330 = ShenDeref.LAMBDA.apply(v920, v921);

final Object f3331 = ShenDeref.LAMBDA.apply(v919, v921);



final Object f3329 = ShenDeref.LAMBDA.apply(v919, v921);

RuntimeContext.globalProperties.put((Symbol)f3329, new Cons(f3330, RuntimeContext.globalProperties.get(f3331)));final Object f3332 = Bind.LAMBDA.apply(b3326, new Cons(f3330, RuntimeContext.globalProperties.get(f3331)), v921, v922);
final Object f3333 = Do.LAMBDA.apply(f3328, f3332);


    return f3333;

}
}
