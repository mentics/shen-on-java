package shen.gen;



import com.mentics.shen.*;

public class Reverse {

public static final Symbol SYMBOL = RuntimeContext.symbol("reverse");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v860) throws Exception {
return defined(v860);
}};
public static Object defined(final Object v860) throws Exception {
final Object f1000 = ShenReverse_help.LAMBDA.apply(v860, Nil.NIL);

    return f1000;

}
}
