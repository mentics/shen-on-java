package shen.gen;



import com.mentics.shen.*;

public class ShenCheck_stream {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-check_stream");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v364, final Object v365, final Object v366) throws Exception {
return defined(v364, v365, v366);
}};
public static Object defined(final Object v364, final Object v365, final Object v366) throws Exception {


final Object i4129;
if ((boolean)(v364 instanceof Cons)) {






























final Object test4123 = new Cons(RuntimeContext.symbol("and"), new Cons(new Cons(RuntimeContext.symbol("cons?"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v365, Nil.NIL)), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(((Cons)v364).head, new Cons(new Cons(RuntimeContext.symbol("hd"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v365, Nil.NIL)), Nil.NIL)), Nil.NIL))), Nil.NIL)));



















final Object f4125 = ShenSyntax.LAMBDA.apply(((Cons)v364).tail, new Cons(RuntimeContext.symbol("shen-reassemble"), new Cons(new Cons(RuntimeContext.symbol("tl"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v365, Nil.NIL)), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("snd"), new Cons(v365, Nil.NIL)), Nil.NIL))), v366);

final Object action4124 = f4125;



final Object else4126 = new Cons(RuntimeContext.symbol("fail"), Nil.NIL);












i4129 = new Cons(RuntimeContext.symbol("if"), new Cons(test4123, new Cons(action4124, new Cons(else4126, Nil.NIL))));
} else {

final Object i4128;
if ((boolean)true) {
final Object f4127 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-check_stream"));

i4128 = f4127;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4129 = i4128;

}
    return i4129;

}
}
