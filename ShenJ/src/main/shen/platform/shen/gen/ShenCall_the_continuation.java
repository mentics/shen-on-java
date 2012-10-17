package shen.gen;



import com.mentics.shen.*;

public class ShenCall_the_continuation {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-call_the_continuation");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1366, final Object v1367, final Object v1368) throws Exception {
return defined(v1366, v1367, v1368);
}};
public static Object defined(final Object v1366, final Object v1367, final Object v1368) throws Exception {


final Object i3734;
if ((boolean)(v1366 instanceof Cons)) {



final Object i3732;
if ((boolean)(((Cons)v1366).head instanceof Cons)) {


final Object i3731;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1366).tail)) {

i3731 = true;
} else {

i3731 = false;

}
i3732 = i3731;
} else {

i3732 = false;

}
final Object i3733;
if ((boolean)i3732) {

i3733 = true;
} else {

i3733 = false;

}
i3734 = i3733;
} else {

i3734 = false;

}
final Object i3744;
if ((boolean)i3734) {









final Object f3735 = Append.LAMBDA.apply(((Cons)((Cons)v1366).head).tail, new Cons(v1367, new Cons(v1368, Nil.NIL)));


i3744 = new Cons(((Cons)((Cons)v1366).head).head, f3735);
} else {


final Object i3737;
if ((boolean)(v1366 instanceof Cons)) {



final Object i3736;
if ((boolean)(((Cons)v1366).head instanceof Cons)) {

i3736 = true;
} else {

i3736 = false;

}
i3737 = i3736;
} else {

i3737 = false;

}
final Object i3743;
if ((boolean)i3737) {

final Object f3739 = ShenNewcontinuation.LAMBDA.apply(((Cons)v1366).tail, v1367, v1368);

final Object newContinuation3738 = f3739;









final Object f3740 = Append.LAMBDA.apply(((Cons)((Cons)v1366).head).tail, new Cons(v1367, new Cons(newContinuation3738, Nil.NIL)));



i3743 = new Cons(((Cons)((Cons)v1366).head).head, f3740);
} else {

final Object i3742;
if ((boolean)true) {
final Object f3741 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-call_the_continuation"));

i3742 = f3741;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3743 = i3742;

}
i3744 = i3743;

}
    return i3744;

}
}
