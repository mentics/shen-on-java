package shen.gen;



import com.mentics.shen.*;

public class Powerset {

public static final Symbol SYMBOL = RuntimeContext.symbol("powerset");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v780) throws Exception {
return defined(v780);
}};
public static Object defined(final Object v780) throws Exception {

final Object i788;
if ((boolean)Lang.equals(Nil.NIL, v780)) {



i788 = new Cons(Nil.NIL, Nil.NIL);
} else {


final Object i787;
if ((boolean)(v780 instanceof Cons)) {

final Object f782 = Powerset.LAMBDA.apply(((Cons)v780).tail);

final Object powerset781 = f782;

final Object f783 = ConsXToEachSet.LAMBDA.apply(((Cons)v780).head, powerset781);
final Object f784 = Append.LAMBDA.apply(f783, powerset781);


i787 = f784;
} else {

final Object i786;
if ((boolean)true) {
final Object f785 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("powerset"));

i786 = f785;
} else {

throw new SimpleError((String)"True condition not found.");


}
i787 = i786;

}
i788 = i787;

}
    return i788;

}
}
