package shen.gen;



import com.mentics.shen.*;

public class StringJoin {

public static final Symbol SYMBOL = RuntimeContext.symbol("string-join");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6963, final Object v6964) throws Exception {
return defined(v6963, v6964);
}};
public static Object defined(final Object v6963, final Object v6964) throws Exception {
final Object f7220 = StringJoinIterator.LAMBDA.apply(v6963, v6964, "");

    return f7220;

}
}
