package shen.gen;



import com.mentics.shen.*;

public class ShenReadChar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-read-char");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f2356 = Stinput.LAMBDA.apply(0);

final Object f2357 = ShenReadCharH.LAMBDA.apply(((java.io.InputStream)f2356).read(), 0);

    return f2357;

}
}
