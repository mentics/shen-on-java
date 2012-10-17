package shen.gen;



import com.mentics.shen.*;

public class ShenTimerMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-timer-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v558) throws Exception {
return defined(v558);
}};
public static Object defined(final Object v558) throws Exception {


final Object i4647;
if ((boolean)(v558 instanceof Cons)) {


final Object i4645;
if ((boolean)Lang.equals(RuntimeContext.symbol("time"), ((Cons)v558).head)) {



final Object i4643;
if ((boolean)(((Cons)v558).tail instanceof Cons)) {



final Object i4642;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v558).tail).tail)) {

i4642 = true;
} else {

i4642 = false;

}
i4643 = i4642;
} else {

i4643 = false;

}
final Object i4644;
if ((boolean)i4643) {

i4644 = true;
} else {

i4644 = false;

}
i4645 = i4644;
} else {

i4645 = false;

}
final Object i4646;
if ((boolean)i4645) {

i4646 = true;
} else {

i4646 = false;

}
i4647 = i4646;
} else {

i4647 = false;

}
final Object i4651;
if ((boolean)i4647) {
































final Object f4648 = ShenISlashoMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("output"), new Cons("~%run time: ~A secs~%", new Cons(RuntimeContext.symbol("Time"), Nil.NIL))));














final Object f4649 = ShenLetMacro.LAMBDA.apply(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Start"), new Cons(new Cons(RuntimeContext.symbol("get-time"), new Cons(RuntimeContext.symbol("run"), Nil.NIL)), new Cons(RuntimeContext.symbol("Result"), new Cons(((Cons)((Cons)v558).tail).head, new Cons(RuntimeContext.symbol("Finish"), new Cons(new Cons(RuntimeContext.symbol("get-time"), new Cons(RuntimeContext.symbol("run"), Nil.NIL)), new Cons(RuntimeContext.symbol("Time"), new Cons(new Cons(RuntimeContext.symbol("-"), new Cons(RuntimeContext.symbol("Finish"), new Cons(RuntimeContext.symbol("Start"), Nil.NIL))), new Cons(RuntimeContext.symbol("Message"), new Cons(f4648, new Cons(RuntimeContext.symbol("Result"), Nil.NIL)))))))))))));

i4651 = f4649;
} else {

final Object i4650;
if ((boolean)true) {

i4650 = v558;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4651 = i4650;

}
    return i4651;

}
}
