package shen.gen;



import com.mentics.shen.*;

public class ShenF_error {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-f_error");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1123) throws Exception {
return defined(v1123);
}};
public static Object defined(final Object v1123) throws Exception {
final Object f6739 = Atp.LAMBDA.apply(v1123, Nil.NIL);
final Object f6740 = Intoutput.LAMBDA.apply("partial function ~A;~%", f6739);
final Object f6741 = ShenTrackedQ.LAMBDA.apply(v1123);


final Object i6746;
if ((boolean)!((boolean)f6741)) {
final Object f6742 = Atp.LAMBDA.apply(v1123, Nil.NIL);
final Object f6743 = IntmakeString.LAMBDA.apply("track ~A? ", f6742);
final Object f6744 = YOrNQ.LAMBDA.apply(f6743);

final Object i6745;
if ((boolean)f6744) {

i6745 = true;
} else {

i6745 = false;

}
i6746 = i6745;
} else {

i6746 = false;

}
final Object i6749;
if ((boolean)i6746) {
final Object f6747 = Ps.LAMBDA.apply(v1123);
final Object f6748 = ShenTrackFunction.LAMBDA.apply(f6747);

i6749 = f6748;
} else {

i6749 = RuntimeContext.symbol("shen-ok");

}
throw new SimpleError((String)"aborted");


}
}
