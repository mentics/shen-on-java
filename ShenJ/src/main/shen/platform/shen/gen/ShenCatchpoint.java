package shen.gen;



import com.mentics.shen.*;

public class ShenCatchpoint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-catchpoint");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*catch*"), Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*catch*"))));
    return Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*catch*")));

}
}
