package shen.gen;



import com.mentics.shen.*;

public class ShenConstructBaseSearchClause {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-base-search-clause");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1620, final Object v1621, final Object v1622) throws Exception {
return defined(v1620, v1621, v1622);
}};
public static Object defined(final Object v1620, final Object v1621, final Object v1622) throws Exception {

final Object f6354 = ShenModeIfy.LAMBDA.apply(v1621);














    return new Cons(new Cons(v1620, new Cons(new Cons(f6354, RuntimeContext.symbol("In_1957")), new Cons(RuntimeContext.symbol("In_1957"), v1622))), new Cons(RuntimeContext.symbol(":-"), new Cons(Nil.NIL, Nil.NIL)));

}
}
