package shen.gen;



import com.mentics.shen.*;

public class VectorZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("vector->");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v719, final Object v720, final Object v721) throws Exception {
return defined(v719, v720, v721);
}};
public static Object defined(final Object v719, final Object v720, final Object v721) throws Exception {

final Object i749;
if ((boolean)Lang.equals(v720, 0)) {
final Object f748 = Interror.LAMBDA.apply("cannot access 0th element of a vector~%", Nil.NIL);

i749 = f748;
} else {



((Object[])v719)[((Number)v720).intValue()] = v721;
i749 = v719;

}
    return i749;

}
}
