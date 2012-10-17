package shen.gen;



import com.mentics.shen.*;

public class ShenShen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-shen");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f6428 = ShenCredits.LAMBDA.apply();
final Object f6429 = ShenLoop.LAMBDA.apply();
final Object f6430 = Do.LAMBDA.apply(f6428, f6429);

    return f6430;

}
}
