package shen.gen;



import com.mentics.shen.*;

public class ShenNext50 {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-next-50");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1175, final Object v1176) throws Exception {
return defined(v1175, v1176);
}};
public static Object defined(final Object v1175, final Object v1176) throws Exception {

final Object i2530;
if ((boolean)Lang.equals(Nil.NIL, v1176)) {

i2530 = "";
} else {

final Object i2529;
if ((boolean)Lang.equals(0, v1175)) {

i2529 = "";
} else {


final Object i2528;
if ((boolean)(v1176 instanceof Cons)) {

final Object f2524 = ShenDeconsString.LAMBDA.apply(((Cons)v1176).head);




final Object f2525 = ShenNext50.LAMBDA.apply(Primitives.minus.apply(v1175, 1), ((Cons)v1176).tail);


i2528 = ((String)f2524 + (String)f2525);
} else {

final Object i2527;
if ((boolean)true) {
final Object f2526 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-next-50"));

i2527 = f2526;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2528 = i2527;

}
i2529 = i2528;

}
i2530 = i2529;

}
    return i2530;

}
}
