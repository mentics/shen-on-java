package shen.gen;



import com.mentics.shen.*;

public class StringEmptyQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("string-empty?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6944) throws Exception {
return defined(v6944);
}};
public static Object defined(final Object v6944) throws Exception {
final Object f7180 = StringLength.LAMBDA.apply(v6944);

    return Lang.equals(0, f7180);

}
}
