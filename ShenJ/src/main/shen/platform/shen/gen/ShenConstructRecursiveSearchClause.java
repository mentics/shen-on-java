package shen.gen;



import com.mentics.shen.*;

public class ShenConstructRecursiveSearchClause {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-recursive-search-clause");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1623, final Object v1624, final Object v1625) throws Exception {
return defined(v1623, v1624, v1625);
}};
public static Object defined(final Object v1623, final Object v1624, final Object v1625) throws Exception {

























    return new Cons(new Cons(v1623, new Cons(new Cons(RuntimeContext.symbol("Assumption_1957"), RuntimeContext.symbol("Assumptions_1957")), new Cons(new Cons(RuntimeContext.symbol("Assumption_1957"), RuntimeContext.symbol("Out_1957")), v1625))), new Cons(RuntimeContext.symbol(":-"), new Cons(new Cons(new Cons(v1623, new Cons(RuntimeContext.symbol("Assumptions_1957"), new Cons(RuntimeContext.symbol("Out_1957"), v1625))), Nil.NIL), Nil.NIL)));

}
}
