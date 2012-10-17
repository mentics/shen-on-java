package shen.gen;



import com.mentics.shen.*;

public class Specialise {

public static final Symbol SYMBOL = RuntimeContext.symbol("specialise");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1547) throws Exception {
return defined(v1547);
}};
public static Object defined(final Object v1547) throws Exception {





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*special*"), new Cons(v1547, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*special*"))));final Object f4188 = Do.LAMBDA.apply(new Cons(v1547, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*special*"))), v1547);

    return f4188;

}
}
