package shen.gen;



import com.mentics.shen.*;

public class YOrNQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("y-or-n?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v865) throws Exception {
return defined(v865);
}};
public static Object defined(final Object v865) throws Exception {
final Object f1015 = Intoutput.LAMBDA.apply(v865, Nil.NIL);

final Object message1014 = f1015;
final Object f1017 = Intoutput.LAMBDA.apply(" (y/n) ", Nil.NIL);

final Object yOrN1016 = f1017;
final Object f1019 = Input.LAMBDA.apply();
final Object f1020 = Atp.LAMBDA.apply(f1019, Nil.NIL);
final Object f1021 = IntmakeString.LAMBDA.apply("~S", f1020);

final Object input1018 = f1021;

final Object i1026;
if ((boolean)Lang.equals("y", input1018)) {

i1026 = true;
} else {

final Object i1025;
if ((boolean)Lang.equals("n", input1018)) {

i1025 = false;
} else {
final Object f1022 = Intoutput.LAMBDA.apply("please answer y or n~%", Nil.NIL);
final Object f1023 = YOrNQ.LAMBDA.apply(v865);
final Object f1024 = Do.LAMBDA.apply(f1022, f1023);

i1025 = f1024;

}
i1026 = i1025;

}



    return i1026;

}
}
