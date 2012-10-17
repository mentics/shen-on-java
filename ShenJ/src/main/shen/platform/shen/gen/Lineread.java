package shen.gen;



import com.mentics.shen.*;

public class Lineread {

public static final Symbol SYMBOL = RuntimeContext.symbol("lineread");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f4728 = Stinput.LAMBDA.apply(0);

final Object f4729 = ShenLinereadLoop.LAMBDA.apply(((java.io.InputStream)f4728).read(), Nil.NIL);

    return f4729;

}
}
