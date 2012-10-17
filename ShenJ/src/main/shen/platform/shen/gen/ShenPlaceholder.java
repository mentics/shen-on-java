package shen.gen;



import com.mentics.shen.*;

public class ShenPlaceholder {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-placeholder");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f2377 = Gensym.LAMBDA.apply(RuntimeContext.symbol("&&"));

    return f2377;

}
}
