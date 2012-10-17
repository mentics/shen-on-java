package shen.gen;



import com.mentics.shen.*;

public class ShenInsertTrackingCode {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert-tracking-code");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1127, final Object v1128, final Object v1129) throws Exception {
return defined(v1127, v1128, v1129);
}};
public static Object defined(final Object v1127, final Object v1128, final Object v1129) throws Exception {


























final Object f6774 = ShenCons_form.LAMBDA.apply(v1128);















































































    return new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(RuntimeContext.symbol("shen-*call*"), new Cons(new Cons(RuntimeContext.symbol("+"), new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("shen-*call*"), Nil.NIL)), new Cons(1, Nil.NIL))), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-input-track"), new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("shen-*call*"), Nil.NIL)), new Cons(v1127, new Cons(f6774, Nil.NIL)))), new Cons(new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-terpri-or-read-char"), Nil.NIL), new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Result"), new Cons(v1129, new Cons(new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-output-track"), new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("shen-*call*"), Nil.NIL)), new Cons(v1127, new Cons(RuntimeContext.symbol("Result"), Nil.NIL)))), new Cons(new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(RuntimeContext.symbol("shen-*call*"), new Cons(new Cons(RuntimeContext.symbol("-"), new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(RuntimeContext.symbol("shen-*call*"), Nil.NIL)), new Cons(1, Nil.NIL))), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-terpri-or-read-char"), Nil.NIL), new Cons(RuntimeContext.symbol("Result"), Nil.NIL))), Nil.NIL))), Nil.NIL))), Nil.NIL)))), Nil.NIL))), Nil.NIL))), Nil.NIL)));

}
}
