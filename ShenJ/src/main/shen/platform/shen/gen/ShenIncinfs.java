package shen.gen;



import com.mentics.shen.*;

public class ShenIncinfs {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-incinfs");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*infs*"), Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*infs*"))));
    return Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*infs*")));

}
}
