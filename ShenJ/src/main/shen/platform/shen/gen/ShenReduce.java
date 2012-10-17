package shen.gen;



import com.mentics.shen.*;

public class ShenReduce {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-reduce");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v493) throws Exception {
return defined(v493);
}};
public static Object defined(final Object v493) throws Exception {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*teststack*"), Nil.NIL);final Object f2134 = ShenReduce_help.LAMBDA.apply(v493);

final Object result2133 = f2134;


final Object f2135 = Reverse.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*teststack*")));






final Object f2136 = Do.LAMBDA.apply(Nil.NIL, new Cons(new Cons(RuntimeContext.symbol("shen-tests"), f2135), new Cons(result2133, Nil.NIL)));

    return f2136;

}
}
