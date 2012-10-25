package shen.gen;



import com.mentics.shen.*;

public class SingleParam {

public static final Symbol SYMBOL = RuntimeContext.symbol("single-param");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v2673, final Object v2674, final Object v2675, final Object v2676, final Object v2677) throws Exception {
return defined(v2673, v2674, v2675, v2676, v2677);
}};
public static Object defined(final Object v2673, final Object v2674, final Object v2675, final Object v2676, final Object v2677) throws Exception {
final Object f2679 = KlToJavaTraverse.LAMBDA.apply(v2673, v2674, v2675);

final Object argTOxDO2678 = f2679;
final Object f2680 = Fst.LAMBDA.apply(argTOxDO2678);
final Object f2681 = Atp.LAMBDA.apply(f2680, Nil.NIL);
final Object f2682 = IntmakeString.LAMBDA.apply("~A~%", f2681);
final Object f2683 = Second.LAMBDA.apply(argTOxDO2678);
final Object f2684 = Atp.LAMBDA.apply(f2683, Nil.NIL);
final Object f2685 = IntmakeString.LAMBDA.apply(v2676, f2684);
final Object f2686 = Atp.LAMBDA.apply(f2685, v2677);
final Object f2687 = Atp.LAMBDA.apply(f2682, f2686);


    return f2687;

}
}
