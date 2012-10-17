package shen.gen;



import com.mentics.shen.*;

public class Remove {

public static final Symbol SYMBOL = RuntimeContext.symbol("remove");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1298, final Object v1299) throws Exception {
return defined(v1298, v1299);
}};
public static Object defined(final Object v1298, final Object v1299) throws Exception {
final Object f3173 = ShenRemoveH.LAMBDA.apply(v1298, v1299, Nil.NIL);

    return f3173;

}
}
