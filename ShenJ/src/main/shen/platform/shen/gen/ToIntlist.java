package shen.gen;



import com.mentics.shen.*;

public class ToIntlist {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-intlist");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6916) throws Exception {
return defined(v6916);
}};
public static Object defined(final Object v6916) throws Exception {
final Object f6998 = Explode.LAMBDA.apply(v6916);
final Object f6999 = Foldl.LAMBDA.apply(RuntimeContext.symbol("to-intlist-iterate"), Nil.NIL, f6998);
final Object f7000 = Reverse.LAMBDA.apply(f6999);

    return f7000;

}
}
