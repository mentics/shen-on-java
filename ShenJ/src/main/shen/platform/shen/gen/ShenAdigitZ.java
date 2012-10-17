package shen.gen;



import com.mentics.shen.*;

public class ShenAdigitZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<digit>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1034) throws Exception {
return defined(v1034);
}};
public static Object defined(final Object v1034) throws Exception {
final Object f5549 = Fst.LAMBDA.apply(v1034);


final Object i5560;
if ((boolean)(f5549 instanceof Cons)) {
final Object f5550 = Fst.LAMBDA.apply(v1034);

final Object f5551 = Snd.LAMBDA.apply(v1034);
final Object f5552 = ShenReassemble.LAMBDA.apply(((Cons)f5550).tail, f5551);
final Object f5553 = Fst.LAMBDA.apply(f5552);
final Object f5554 = Fst.LAMBDA.apply(v1034);

final Object f5555 = ShenDigitByteQ.LAMBDA.apply(((Cons)f5554).head);

final Object i5558;
if ((boolean)f5555) {
final Object f5556 = Fst.LAMBDA.apply(v1034);

final Object f5557 = ShenByteToDigit.LAMBDA.apply(((Cons)f5556).head);

i5558 = f5557;
} else {

i5558 = null;

}final Object f5559 = ShenReassemble.LAMBDA.apply(f5553, i5558);

i5560 = f5559;
} else {

i5560 = null;

}
final Object result5548 = i5560;

final Object i5561;
if ((boolean)Lang.equals(result5548, null)) {

i5561 = null;
} else {

i5561 = result5548;

}

    return i5561;

}
}
