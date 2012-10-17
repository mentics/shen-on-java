package shen.gen;



import com.mentics.shen.*;

public class ShenLazyderef {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-lazyderef");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1413, final Object v1414) throws Exception {
return defined(v1413, v1414);
}};
public static Object defined(final Object v1413, final Object v1414) throws Exception {
final Object f3790 = ShenPvarQ.LAMBDA.apply(v1413);

final Object i3795;
if ((boolean)f3790) {
final Object f3792 = ShenValvector.LAMBDA.apply(v1413, v1414);

final Object value3791 = f3792;

final Object i3794;
if ((boolean)Lang.equals(value3791, RuntimeContext.symbol("shen--null-"))) {

i3794 = v1413;
} else {
final Object f3793 = ShenLazyderef.LAMBDA.apply(value3791, v1414);

i3794 = f3793;

}

i3795 = i3794;
} else {

i3795 = v1413;

}
    return i3795;

}
}
