package shen.gen;



import com.mentics.shen.*;

public class ShenLispOr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-lisp-or");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1277, final Object v1278) throws Exception {
return defined(v1277, v1278);
}};
public static Object defined(final Object v1277, final Object v1278) throws Exception {























    return new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Case"), new Cons(v1277, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(RuntimeContext.symbol("Case"), new Cons(false, Nil.NIL))), new Cons(v1278, new Cons(RuntimeContext.symbol("Case"), Nil.NIL)))), Nil.NIL))));

}
}
