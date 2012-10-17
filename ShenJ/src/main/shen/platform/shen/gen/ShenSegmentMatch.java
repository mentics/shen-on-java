package shen.gen;



import com.mentics.shen.*;

public class ShenSegmentMatch {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-segment-match");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v347, final Object v348, final Object v349) throws Exception {
return defined(v347, v348, v349);
}};
public static Object defined(final Object v347, final Object v348, final Object v349) throws Exception {


final Object i4117;
if ((boolean)(v347 instanceof Cons)) {






final Object f4114 = ShenSyntax.LAMBDA.apply(((Cons)v347).tail, RuntimeContext.symbol("Restart"), v349);









final Object continuation4113 = new Cons(RuntimeContext.symbol("lambda"), new Cons(((Cons)v347).head, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(RuntimeContext.symbol("Restart"), new Cons(f4114, Nil.NIL))), Nil.NIL)));









i4117 = new Cons(((Cons)v347).head, new Cons(v348, new Cons(continuation4113, Nil.NIL)));
} else {

final Object i4116;
if ((boolean)true) {
final Object f4115 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-segment-match"));

i4116 = f4115;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4117 = i4116;

}
    return i4117;

}
}
