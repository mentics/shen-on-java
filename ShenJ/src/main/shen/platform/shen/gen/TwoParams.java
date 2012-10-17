package shen.gen;



import com.mentics.shen.*;

public class TwoParams {

public static final Symbol SYMBOL = RuntimeContext.symbol("two-params");
public static final Lambda LAMBDA = new Lambda6() {
public Object apply(final Object v7265, final Object v7266, final Object v7267, final Object v7268, final Object v7269, final Object v7270) throws Exception {
return defined(v7265, v7266, v7267, v7268, v7269, v7270);
}};
public static Object defined(final Object v7265, final Object v7266, final Object v7267, final Object v7268, final Object v7269, final Object v7270) throws Exception {
final Object f8801 = KlToJavaTraverse.LAMBDA.apply(v7265, RuntimeContext.symbol("object"), v7268);

final Object arg0TOxDO8800 = f8801;
final Object f8803 = KlToJavaTraverse.LAMBDA.apply(v7266, RuntimeContext.symbol("object"), v7268);

final Object arg1TOxDO8802 = f8803;
final Object f8804 = Fst.LAMBDA.apply(arg0TOxDO8800);
final Object f8805 = Fst.LAMBDA.apply(arg1TOxDO8802);
final Object f8806 = Atp.LAMBDA.apply(f8805, Nil.NIL);
final Object f8807 = Atp.LAMBDA.apply(f8804, f8806);
final Object f8808 = IntmakeString.LAMBDA.apply("~A~%~A~%", f8807);
final Object f8809 = Second.LAMBDA.apply(arg0TOxDO8800);
final Object f8810 = Second.LAMBDA.apply(arg1TOxDO8802);
final Object f8811 = Atp.LAMBDA.apply(f8810, Nil.NIL);
final Object f8812 = Atp.LAMBDA.apply(f8809, f8811);
final Object f8813 = IntmakeString.LAMBDA.apply(v7269, f8812);
final Object f8814 = Atp.LAMBDA.apply(f8813, v7270);
final Object f8815 = Atp.LAMBDA.apply(f8808, f8814);



    return f8815;

}
}
