package shen.gen;



import com.mentics.shen.*;

public class GetSecond {

public static final Symbol SYMBOL = RuntimeContext.symbol("get-second");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7250, final Object v7251) throws Exception {
return defined(v7250, v7251);
}};
public static Object defined(final Object v7250, final Object v7251) throws Exception {

final Object i8450;
if ((boolean)Lang.equals(Nil.NIL, v7251)) {
final Object f8436 = Atp.LAMBDA.apply(v7250, Nil.NIL);
final Object f8437 = IntmakeString.LAMBDA.apply("Element not found in get-second for ~A", f8436);

throw new SimpleError((String)f8437);

} else {


final Object i8440;
if ((boolean)(v7251 instanceof Cons)) {

final Object f8438 = TupleQ.LAMBDA.apply(((Cons)v7251).head);

final Object i8439;
if ((boolean)f8438) {

i8439 = true;
} else {

i8439 = false;

}
i8440 = i8439;
} else {

i8440 = false;

}
final Object i8449;
if ((boolean)i8440) {

final Object f8441 = Fst.LAMBDA.apply(((Cons)v7251).head);

final Object i8444;
if ((boolean)Lang.equals(v7250, f8441)) {

final Object f8442 = Snd.LAMBDA.apply(((Cons)v7251).head);

i8444 = f8442;
} else {

final Object f8443 = GetSecond.LAMBDA.apply(v7250, ((Cons)v7251).tail);

i8444 = f8443;

}
i8449 = i8444;
} else {

final Object i8448;
if ((boolean)true) {
final Object f8445 = Atp.LAMBDA.apply(v7251, Nil.NIL);
final Object f8446 = Atp.LAMBDA.apply(v7250, f8445);
final Object f8447 = IntmakeString.LAMBDA.apply("get-second: X: ~A~%Y: ~A", f8446);

throw new SimpleError((String)f8447);

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i8450 = i8449;

}
    return i8450;

}
}
