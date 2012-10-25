package shen.gen;



import com.mentics.shen.*;

public class TwoParams {

public static final Symbol SYMBOL = RuntimeContext.symbol("two-params");
public static final Lambda LAMBDA = new Lambda6() {
public Object apply(final Object v2688, final Object v2689, final Object v2690, final Object v2691, final Object v2692, final Object v2693) throws Exception {
return defined(v2688, v2689, v2690, v2691, v2692, v2693);
}};
public static Object defined(final Object v2688, final Object v2689, final Object v2690, final Object v2691, final Object v2692, final Object v2693) throws Exception {
final Object f2695 = KlToJavaTraverse.LAMBDA.apply(v2688, RuntimeContext.symbol("object"), v2691);

final Object arg0TOxDO2694 = f2695;
final Object f2697 = KlToJavaTraverse.LAMBDA.apply(v2689, RuntimeContext.symbol("object"), v2691);

final Object arg1TOxDO2696 = f2697;
final Object f2698 = Fst.LAMBDA.apply(arg0TOxDO2694);
final Object f2699 = Fst.LAMBDA.apply(arg1TOxDO2696);
final Object f2700 = Atp.LAMBDA.apply(f2699, Nil.NIL);
final Object f2701 = Atp.LAMBDA.apply(f2698, f2700);
final Object f2702 = IntmakeString.LAMBDA.apply("~A~%~A~%", f2701);
final Object f2703 = Second.LAMBDA.apply(arg0TOxDO2694);
final Object f2704 = Second.LAMBDA.apply(arg1TOxDO2696);
final Object f2705 = Atp.LAMBDA.apply(f2704, Nil.NIL);
final Object f2706 = Atp.LAMBDA.apply(f2703, f2705);
final Object f2707 = IntmakeString.LAMBDA.apply(v2692, f2706);
final Object f2708 = Atp.LAMBDA.apply(f2707, v2693);
final Object f2709 = Atp.LAMBDA.apply(f2702, f2708);



    return f2709;

}
}
