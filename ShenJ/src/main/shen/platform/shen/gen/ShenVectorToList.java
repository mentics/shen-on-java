package shen.gen;



import com.mentics.shen.*;

public class ShenVectorToList {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-vector->list");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1118, final Object v1119) throws Exception {
return defined(v1118, v1119);
}};
public static Object defined(final Object v1118, final Object v1119) throws Exception {
final Object f1247 = ShenVectorToListh.LAMBDA.apply(v1118, v1119, Nil.NIL);

    return f1247;

}
}
