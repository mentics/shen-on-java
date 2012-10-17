package shen.gen;



import com.mentics.shen.*;

public class Adjoin {

public static final Symbol SYMBOL = RuntimeContext.symbol("adjoin");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1544, final Object v1545) throws Exception {
return defined(v1544, v1545);
}};
public static Object defined(final Object v1544, final Object v1545) throws Exception {
final Object f4183 = ElementQ.LAMBDA.apply(v1544, v1545);

final Object i4184;
if ((boolean)f4183) {

i4184 = v1545;
} else {



i4184 = new Cons(v1544, v1545);

}
    return i4184;

}
}
