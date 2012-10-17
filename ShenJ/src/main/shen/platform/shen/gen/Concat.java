package shen.gen;



import com.mentics.shen.*;

public class Concat {

public static final Symbol SYMBOL = RuntimeContext.symbol("concat");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v736, final Object v737) throws Exception {
return defined(v736, v737);
}};
public static Object defined(final Object v736, final Object v737) throws Exception {






    return RuntimeContext.symbol((String)((String)String.valueOf(v736) + (String)String.valueOf(v737)));

}
}
