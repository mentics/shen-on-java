package shen.gen;



import com.mentics.shen.*;

public class ParseSingleKl {

public static final Symbol SYMBOL = RuntimeContext.symbol("parse-single-kl");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1157) throws Exception {
return defined(v1157);
}};
public static Object defined(final Object v1157) throws Exception {
final Object f1158 = ParseKl.LAMBDA.apply(v1157);


    return ((Cons)f1158).head;

}
}
