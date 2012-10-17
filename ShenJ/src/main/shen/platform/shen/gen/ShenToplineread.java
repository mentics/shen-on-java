package shen.gen;



import com.mentics.shen.*;

public class ShenToplineread {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-toplineread");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f6555 = Stinput.LAMBDA.apply(0);

final Object f6556 = ShenToplineread_loop.LAMBDA.apply(((java.io.InputStream)f6555).read(), Nil.NIL);

    return f6556;

}
}
