package shen.gen;



import com.mentics.shen.*;

public class ShenDeconsString {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-decons-string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1177) throws Exception {
return defined(v1177);
}};
public static Object defined(final Object v1177) throws Exception {


final Object i2538;
if ((boolean)(v1177 instanceof Cons)) {


final Object i2536;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v1177).head)) {



final Object i2534;
if ((boolean)(((Cons)v1177).tail instanceof Cons)) {




final Object i2532;
if ((boolean)(((Cons)((Cons)v1177).tail).tail instanceof Cons)) {




final Object i2531;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1177).tail).tail).tail)) {

i2531 = true;
} else {

i2531 = false;

}
i2532 = i2531;
} else {

i2532 = false;

}
final Object i2533;
if ((boolean)i2532) {

i2533 = true;
} else {

i2533 = false;

}
i2534 = i2533;
} else {

i2534 = false;

}
final Object i2535;
if ((boolean)i2534) {

i2535 = true;
} else {

i2535 = false;

}
i2536 = i2535;
} else {

i2536 = false;

}
final Object i2537;
if ((boolean)i2536) {

i2537 = true;
} else {

i2537 = false;

}
i2538 = i2537;
} else {

i2538 = false;

}
final Object i2545;
if ((boolean)i2538) {
final Object f2539 = ShenEvalCons.LAMBDA.apply(v1177);
final Object f2540 = Atp.LAMBDA.apply(f2539, Nil.NIL);
final Object f2541 = IntmakeString.LAMBDA.apply("~S ", f2540);

i2545 = f2541;
} else {

final Object i2544;
if ((boolean)true) {
final Object f2542 = Atp.LAMBDA.apply(v1177, Nil.NIL);
final Object f2543 = IntmakeString.LAMBDA.apply("~R ", f2542);

i2544 = f2543;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2545 = i2544;

}
    return i2545;

}
}
