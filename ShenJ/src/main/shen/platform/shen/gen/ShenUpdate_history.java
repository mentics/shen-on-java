package shen.gen;



import com.mentics.shen.*;

public class ShenUpdate_history {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-update_history");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v583, final Object v584) throws Exception {
return defined(v583, v584);
}};
public static Object defined(final Object v583, final Object v584) throws Exception {




RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*history*"), new Cons(v583, v584));
    return new Cons(v583, v584);

}
}
