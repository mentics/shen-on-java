package shen.gen;



import com.mentics.shen.*;

public class ShenAliteralStarZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<literal*>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1192) throws Exception {
return defined(v1192);
}};
public static Object defined(final Object v1192) throws Exception {
final Object f2725 = Fst.LAMBDA.apply(v1192);


final Object i2728;
if ((boolean)(f2725 instanceof Cons)) {
final Object f2726 = Fst.LAMBDA.apply(v1192);


final Object i2727;
if ((boolean)Lang.equals(RuntimeContext.symbol("!"), ((Cons)f2726).head)) {

i2727 = true;
} else {

i2727 = false;

}
i2728 = i2727;
} else {

i2728 = false;

}
final Object i2734;
if ((boolean)i2728) {
final Object f2729 = Fst.LAMBDA.apply(v1192);

final Object f2730 = Snd.LAMBDA.apply(v1192);
final Object f2731 = ShenReassemble.LAMBDA.apply(((Cons)f2729).tail, f2730);
final Object f2732 = Fst.LAMBDA.apply(f2731);




final Object f2733 = ShenReassemble.LAMBDA.apply(f2732, new Cons(RuntimeContext.symbol("cut"), new Cons(RuntimeContext.symbol("Throwcontrol"), Nil.NIL)));

i2734 = f2733;
} else {

i2734 = null;

}
final Object result2724 = i2734;

final Object i2747;
if ((boolean)Lang.equals(result2724, null)) {
final Object f2736 = Fst.LAMBDA.apply(v1192);


final Object i2745;
if ((boolean)(f2736 instanceof Cons)) {
final Object f2737 = Fst.LAMBDA.apply(v1192);

final Object f2738 = Snd.LAMBDA.apply(v1192);
final Object f2739 = ShenReassemble.LAMBDA.apply(((Cons)f2737).tail, f2738);
final Object f2740 = Fst.LAMBDA.apply(f2739);
final Object f2741 = Fst.LAMBDA.apply(v1192);



final Object i2743;
if ((boolean)(((Cons)f2741).head instanceof Cons)) {
final Object f2742 = Fst.LAMBDA.apply(v1192);


i2743 = ((Cons)f2742).head;
} else {

i2743 = null;

}final Object f2744 = ShenReassemble.LAMBDA.apply(f2740, i2743);

i2745 = f2744;
} else {

i2745 = null;

}
final Object result2735 = i2745;

final Object i2746;
if ((boolean)Lang.equals(result2735, null)) {

i2746 = null;
} else {

i2746 = result2735;

}

i2747 = i2746;
} else {

i2747 = result2724;

}

    return i2747;

}
}
