package shen.gen;



import com.mentics.shen.*;

public class ShenEmbedAnd {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-embed-and");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v527) throws Exception {
return defined(v527);
}};
public static Object defined(final Object v527) throws Exception {


final Object i2494;
if ((boolean)(v527 instanceof Cons)) {


final Object i2493;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v527).tail)) {

i2493 = true;
} else {

i2493 = false;

}
i2494 = i2493;
} else {

i2494 = false;

}
final Object i2499;
if ((boolean)i2494) {


i2499 = ((Cons)v527).head;
} else {


final Object i2498;
if ((boolean)(v527 instanceof Cons)) {




final Object f2495 = ShenEmbedAnd.LAMBDA.apply(((Cons)v527).tail);





i2498 = new Cons(RuntimeContext.symbol("and"), new Cons(((Cons)v527).head, new Cons(f2495, Nil.NIL)));
} else {

final Object i2497;
if ((boolean)true) {
final Object f2496 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-embed-and"));

i2497 = f2496;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2498 = i2497;

}
i2499 = i2498;

}
    return i2499;

}
}
