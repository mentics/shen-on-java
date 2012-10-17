package shen.gen;



import com.mentics.shen.*;

public class ShenProfileFunc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-profile-func");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1161, final Object v1162, final Object v1163) throws Exception {
return defined(v1161, v1162, v1163);
}};
public static Object defined(final Object v1161, final Object v1162, final Object v1163) throws Exception {































































    return new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Start"), new Cons(new Cons(RuntimeContext.symbol("get-time"), new Cons(RuntimeContext.symbol("run"), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Result"), new Cons(v1163, new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Finish"), new Cons(new Cons(RuntimeContext.symbol("-"), new Cons(new Cons(RuntimeContext.symbol("get-time"), new Cons(RuntimeContext.symbol("run"), Nil.NIL)), new Cons(RuntimeContext.symbol("Start"), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Record"), new Cons(new Cons(RuntimeContext.symbol("shen-put-profile"), new Cons(v1161, new Cons(new Cons(RuntimeContext.symbol("+"), new Cons(new Cons(RuntimeContext.symbol("shen-get-profile"), new Cons(v1161, Nil.NIL)), new Cons(RuntimeContext.symbol("Finish"), Nil.NIL))), Nil.NIL))), new Cons(RuntimeContext.symbol("Result"), Nil.NIL)))), Nil.NIL)))), Nil.NIL)))), Nil.NIL))));

}
}
