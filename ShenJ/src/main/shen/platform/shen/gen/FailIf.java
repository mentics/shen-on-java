package shen.gen;



import com.mentics.shen.*;

public class FailIf {

public static final Symbol SYMBOL = RuntimeContext.symbol("fail-if");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v694, final Object v695) throws Exception {
return defined(v694, v695);
}};
public static Object defined(final Object v694, final Object v695) throws Exception {
final Object f713 = RuntimeContext.dispatch(v694).apply(v695);

final Object i714;
if ((boolean)f713) {

i714 = null;
} else {

i714 = v695;

}
    return i714;

}
}
