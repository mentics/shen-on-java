package shen.gen;



import com.mentics.shen.*;

public class Gensym {

public static final Symbol SYMBOL = RuntimeContext.symbol("gensym");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v735) throws Exception {
return defined(v735);
}};
public static Object defined(final Object v735) throws Exception {





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*gensym*"), Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*gensym*"))));final Object f813 = Concat.LAMBDA.apply(v735, Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*gensym*"))));

    return f813;

}
}
