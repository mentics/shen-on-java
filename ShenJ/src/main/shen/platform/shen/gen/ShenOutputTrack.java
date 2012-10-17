package shen.gen;



import com.mentics.shen.*;

public class ShenOutputTrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-output-track");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1150, final Object v1151, final Object v1152) throws Exception {
return defined(v1150, v1151, v1152);
}};
public static Object defined(final Object v1150, final Object v1151, final Object v1152) throws Exception {
final Object f6813 = ShenSpaces.LAMBDA.apply(v1150);
final Object f6814 = ShenSpaces.LAMBDA.apply(v1150);
final Object f6815 = Atp.LAMBDA.apply(v1152, Nil.NIL);
final Object f6816 = Atp.LAMBDA.apply(f6814, f6815);
final Object f6817 = Atp.LAMBDA.apply(v1151, f6816);
final Object f6818 = Atp.LAMBDA.apply(v1150, f6817);
final Object f6819 = Atp.LAMBDA.apply(f6813, f6818);
final Object f6820 = Intoutput.LAMBDA.apply("~%~A<~A> Output from ~A ~%~A==> ~S", f6819);

    return f6820;

}
}
