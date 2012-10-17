package shen.gen;



import com.mentics.shen.*;

public class ShenJump_stream {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-jump_stream");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v370, final Object v371, final Object v372) throws Exception {
return defined(v370, v371, v372);
}};
public static Object defined(final Object v370, final Object v371, final Object v372) throws Exception {


final Object i4139;
if ((boolean)(v370 instanceof Cons)) {









final Object test4133 = new Cons(RuntimeContext.symbol("cons?"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v371, Nil.NIL)), Nil.NIL));



















final Object f4135 = ShenSyntax.LAMBDA.apply(((Cons)v370).tail, new Cons(RuntimeContext.symbol("shen-reassemble"), new Cons(new Cons(RuntimeContext.symbol("tl"), new Cons(new Cons(RuntimeContext.symbol("fst"), new Cons(v371, Nil.NIL)), Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("snd"), new Cons(v371, Nil.NIL)), Nil.NIL))), v372);

final Object action4134 = f4135;



final Object else4136 = new Cons(RuntimeContext.symbol("fail"), Nil.NIL);












i4139 = new Cons(RuntimeContext.symbol("if"), new Cons(test4133, new Cons(action4134, new Cons(else4136, Nil.NIL))));
} else {

final Object i4138;
if ((boolean)true) {
final Object f4137 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-jump_stream"));

i4138 = f4137;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4139 = i4138;

}
    return i4139;

}
}
