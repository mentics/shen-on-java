package shen.gen;



import com.mentics.shen.*;

public class ShenAdd_test {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-add_test");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v510) throws Exception {
return defined(v510);
}};
public static Object defined(final Object v510) throws Exception {





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*teststack*"), new Cons(v510, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*teststack*"))));
    return new Cons(v510, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*teststack*")));

}
}
