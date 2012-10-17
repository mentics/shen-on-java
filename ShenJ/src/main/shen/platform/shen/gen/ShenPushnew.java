package shen.gen;



import com.mentics.shen.*;

public class ShenPushnew {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pushnew");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1649, final Object v1650) throws Exception {
return defined(v1649, v1650);
}};
public static Object defined(final Object v1649, final Object v1650) throws Exception {

final Object f6426 = ElementQ.LAMBDA.apply(v1649, RuntimeContext.globalProperties.get(v1650));

final Object i6427;
if ((boolean)f6426) {


i6427 = RuntimeContext.globalProperties.get(v1650);
} else {





RuntimeContext.globalProperties.put((Symbol)v1650, new Cons(v1649, RuntimeContext.globalProperties.get(v1650)));
i6427 = new Cons(v1649, RuntimeContext.globalProperties.get(v1650));

}
    return i6427;

}
}
