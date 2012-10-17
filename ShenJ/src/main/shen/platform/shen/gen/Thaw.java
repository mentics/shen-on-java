package shen.gen;



import com.mentics.shen.*;

public class Thaw {

public static final Symbol SYMBOL = RuntimeContext.symbol("thaw");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v650) throws Exception {
return defined(v650);
}};
public static Object defined(final Object v650) throws Exception {
final Object f608 = RuntimeContext.dispatch(v650).apply();

    return f608;

}
}
