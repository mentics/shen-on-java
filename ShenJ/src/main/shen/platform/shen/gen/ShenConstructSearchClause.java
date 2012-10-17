package shen.gen;



import com.mentics.shen.*;

public class ShenConstructSearchClause {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-search-clause");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1617, final Object v1618, final Object v1619) throws Exception {
return defined(v1617, v1618, v1619);
}};
public static Object defined(final Object v1617, final Object v1618, final Object v1619) throws Exception {
final Object f6351 = ShenConstructBaseSearchClause.LAMBDA.apply(v1617, v1618, v1619);

final Object f6352 = ShenConstructRecursiveSearchClause.LAMBDA.apply(v1617, v1618, v1619);



final Object f6353 = ShenSProlog.LAMBDA.apply(new Cons(f6351, new Cons(f6352, Nil.NIL)));

    return f6353;

}
}
