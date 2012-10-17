package shen.gen;



import com.mentics.shen.*;

public class WhitespaceQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("whitespace?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6870) throws Exception {
return defined(v6870);
}};
public static Object defined(final Object v6870) throws Exception {












final Object f6896 = ElementQ.LAMBDA.apply(v6870, new Cons("	", new Cons("\n", new Cons("", new Cons("", new Cons("\r", new Cons(" ", Nil.NIL)))))));

    return f6896;

}
}
