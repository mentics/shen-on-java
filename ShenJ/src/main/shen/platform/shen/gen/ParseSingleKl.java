package shen.gen;



import com.mentics.shen.*;

public class ParseSingleKl {

public static final Symbol SYMBOL = RuntimeContext.symbol("parse-single-kl");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7235) throws Exception {
return defined(v7235);
}};
public static Object defined(final Object v7235) throws Exception {
final Object f7321 = ParseKl.LAMBDA.apply(v7235);


    return ((Cons)f7321).head;

}
}
