package shen.gen;



import com.mentics.shen.*;

public class ShenLine {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-line");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f2319 = Inferences.LAMBDA.apply(RuntimeContext.symbol("_"));

final Object infs2318 = f2319;

final Object i2320;
if ((boolean)Lang.equals(1, infs2318)) {

i2320 = "";
} else {

i2320 = "s";

}final Object f2321 = Atp.LAMBDA.apply(i2320, Nil.NIL);
final Object f2322 = Atp.LAMBDA.apply(infs2318, f2321);
final Object f2323 = Intoutput.LAMBDA.apply("____________________________________________________________ ~A inference~A ~%?- ", f2322);


    return f2323;

}
}
