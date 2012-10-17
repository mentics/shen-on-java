package shen.gen;



import com.mentics.shen.*;

public class ShenStartNewPrologProcess {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-start-new-prolog-process");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*process-counter*"), Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*process-counter*"))));
final Object incrementProcessCounter3917 = Primitives.plus.apply(1, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*process-counter*")));
final Object f3918 = ShenInitialiseProlog.LAMBDA.apply(incrementProcessCounter3917);


    return f3918;

}
}
