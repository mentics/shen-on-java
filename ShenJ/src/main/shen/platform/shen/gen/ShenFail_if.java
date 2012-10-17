package shen.gen;



import com.mentics.shen.*;

public class ShenFail_if {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-fail_if");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v396, final Object v397) throws Exception {
return defined(v396, v397);
}};
public static Object defined(final Object v396, final Object v397) throws Exception {
final Object f1527 = RuntimeContext.dispatch(v396).apply(v397);

final Object i1528;
if ((boolean)f1527) {

i1528 = null;
} else {

i1528 = v397;

}
    return i1528;

}
}
