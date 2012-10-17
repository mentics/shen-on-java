package shen.gen;



import com.mentics.shen.*;

public class ShenInputTrack {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-input-track");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1145, final Object v1146, final Object v1147) throws Exception {
return defined(v1145, v1146, v1147);
}};
public static Object defined(final Object v1145, final Object v1146, final Object v1147) throws Exception {
final Object f6790 = ShenSpaces.LAMBDA.apply(v1145);
final Object f6791 = ShenSpaces.LAMBDA.apply(v1145);
final Object f6792 = Atp.LAMBDA.apply(v1147, Nil.NIL);
final Object f6793 = Atp.LAMBDA.apply(f6791, f6792);
final Object f6794 = Atp.LAMBDA.apply(v1146, f6793);
final Object f6795 = Atp.LAMBDA.apply(v1145, f6794);
final Object f6796 = Atp.LAMBDA.apply(f6790, f6795);
final Object f6797 = Intoutput.LAMBDA.apply("~%~A<~A> Inputs to ~A ~%~A", f6796);
final Object f6798 = ShenRecursivelyPrint.LAMBDA.apply(v1147);
final Object f6799 = Do.LAMBDA.apply(f6797, f6798);

    return f6799;

}
}
