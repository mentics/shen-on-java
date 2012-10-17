package shen.gen;



import com.mentics.shen.*;

public class ShenPrintPastInputs {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-print-past-inputs");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v630, final Object v631, final Object v632) throws Exception {
return defined(v630, v631, v632);
}};
public static Object defined(final Object v630, final Object v631, final Object v632) throws Exception {

final Object i6672;
if ((boolean)Lang.equals(Nil.NIL, v631)) {

i6672 = RuntimeContext.symbol("_");
} else {


final Object i6656;
if ((boolean)(v631 instanceof Cons)) {

final Object f6654 = RuntimeContext.dispatch(v630).apply(((Cons)v631).head);


final Object i6655;
if ((boolean)!((boolean)f6654)) {

i6655 = true;
} else {

i6655 = false;

}
i6656 = i6655;
} else {

i6656 = false;

}
final Object i6671;
if ((boolean)i6656) {



final Object f6657 = ShenPrintPastInputs.LAMBDA.apply(v630, ((Cons)v631).tail, Primitives.plus.apply(v632, 1));

i6671 = f6657;
} else {


final Object i6660;
if ((boolean)(v631 instanceof Cons)) {

final Object f6658 = TupleQ.LAMBDA.apply(((Cons)v631).head);

final Object i6659;
if ((boolean)f6658) {

i6659 = true;
} else {

i6659 = false;

}
i6660 = i6659;
} else {

i6660 = false;

}
final Object i6670;
if ((boolean)i6660) {
final Object f6661 = Atp.LAMBDA.apply(v632, Nil.NIL);
final Object f6662 = Intoutput.LAMBDA.apply("~A. ", f6661);

final Object f6663 = Snd.LAMBDA.apply(((Cons)v631).head);
final Object f6664 = ShenPrbytes.LAMBDA.apply(f6663);



final Object f6665 = ShenPrintPastInputs.LAMBDA.apply(v630, ((Cons)v631).tail, Primitives.plus.apply(v632, 1));
final Object f6666 = Do.LAMBDA.apply(f6664, f6665);
final Object f6667 = Do.LAMBDA.apply(f6662, f6666);

i6670 = f6667;
} else {

final Object i6669;
if ((boolean)true) {
final Object f6668 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-print-past-inputs"));

i6669 = f6668;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6670 = i6669;

}
i6671 = i6670;

}
i6672 = i6671;

}
    return i6672;

}
}
