package shen.gen;



import com.mentics.shen.*;

public class AssertTest {

public static final Symbol SYMBOL = RuntimeContext.symbol("assert-test");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6936, final Object v6937, final Object v6938) throws Exception {
return defined(v6936, v6937, v6938);
}};
public static Object defined(final Object v6936, final Object v6937, final Object v6938) throws Exception {
final Object f7171 = RuntimeContext.dispatch(v6937).apply(v6936);

final Object i7172;
if ((boolean)f7171) {

i7172 = v6936;
} else {

throw new SimpleError((String)v6938);


}
    return i7172;

}
}
