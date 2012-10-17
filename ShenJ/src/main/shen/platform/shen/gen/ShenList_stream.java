package shen.gen;



import com.mentics.shen.*;

public class ShenList_stream {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-list_stream");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v331, final Object v332, final Object v333, final Object v334) throws Exception {
return defined(v331, v332, v333, v334);
}};
public static Object defined(final Object v331, final Object v332, final Object v333, final Object v334) throws Exception {



























final Object test4082 = new Cons(RuntimeContext.symbol("and"), new Cons(new Cons(RuntimeContext.symbol("cons?"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v333, Nil.NIL)), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("cons?"), new Cons(new Cons(RuntimeContext.symbol("hd"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v333, Nil.NIL)), Nil.NIL)), Nil.NIL)), Nil.NIL)));






































final Object f4084 = ShenSyntax.LAMBDA.apply(v332, new Cons(RuntimeContext.symbol("shen-reassemble"), new Cons(new Cons(RuntimeContext.symbol("tl"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v333, Nil.NIL)), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("snd"), new Cons(v333, Nil.NIL)), Nil.NIL))), v334);



final Object f4085 = ShenSyntax.LAMBDA.apply(v331, new Cons(RuntimeContext.symbol("shen-reassemble"), new Cons(new Cons(RuntimeContext.symbol("hd"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v333, Nil.NIL)), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("snd"), new Cons(v333, Nil.NIL)), Nil.NIL))), new Cons(RuntimeContext.symbol("shen-leave!"), new Cons(f4084, Nil.NIL)));




final Object action4083 = new Cons(RuntimeContext.symbol("shen-snd-or-fail"), new Cons(f4085, Nil.NIL));



final Object else4086 = new Cons(RuntimeContext.symbol("fail"), Nil.NIL);












    return new Cons(RuntimeContext.symbol("if"), new Cons(test4082, new Cons(action4083, new Cons(else4086, Nil.NIL))));

}
}
