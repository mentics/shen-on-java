package shen.gen;



import com.mentics.shen.*;

public class ShenSegdef {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-segdef");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v304) throws Exception {
return defined(v304);
}};
public static Object defined(final Object v304) throws Exception {































































































    return new Cons(RuntimeContext.symbol("define"), new Cons(v304, new Cons(new Cons(RuntimeContext.symbol("@p"), new Cons(RuntimeContext.symbol("In"), new Cons(RuntimeContext.symbol("Out"), Nil.NIL))), new Cons(RuntimeContext.symbol("Continuation"), new Cons(RuntimeContext.symbol("->"), new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Continue"), new Cons(new Cons(RuntimeContext.symbol("Continuation"), new Cons(new Cons(RuntimeContext.symbol("reverse"), new Cons(RuntimeContext.symbol("Out"), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("@p"), new Cons(RuntimeContext.symbol("In"), new Cons(Nil.NIL, Nil.NIL))), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(RuntimeContext.symbol("Continue"), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("cons?"), new Cons(RuntimeContext.symbol("In"), Nil.NIL)), Nil.NIL))), new Cons(new Cons(v304, new Cons(new Cons(RuntimeContext.symbol("@p"), new Cons(new Cons(RuntimeContext.symbol("tl"), new Cons(RuntimeContext.symbol("In"), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("cons"), new Cons(new Cons(RuntimeContext.symbol("hd"), new Cons(RuntimeContext.symbol("In"), Nil.NIL)), new Cons(RuntimeContext.symbol("Out"), Nil.NIL))), Nil.NIL))), new Cons(RuntimeContext.symbol("Continuation"), Nil.NIL))), new Cons(RuntimeContext.symbol("Continue"), Nil.NIL)))), Nil.NIL)))), Nil.NIL))))));

}
}
