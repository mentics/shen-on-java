package shen.gen;



import com.mentics.shen.*;

public class KlFileToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-file-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2881) throws Exception {
return defined(v2881);
}};
public static Object defined(final Object v2881) throws Exception {
final Lambda l2889 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l2886 = new Lambda1() {
  public Object apply(final Object parsed) throws Exception {
    final Object f2882 = JavaEval.LAMBDA.apply(parsed);
final Object f2883 = Atp.LAMBDA.apply(f2882, Nil.NIL);
final Object f2884 = IntmakeString.LAMBDA.apply("~A~%", f2883);
final Object f2885 = Intoutput.LAMBDA.apply(f2884, Nil.NIL);

    return f2885;
  }
};final Object f2887 = ReadFile.LAMBDA.apply(v2881);
final Object f2888 = Map.LAMBDA.apply(l2886, f2887);

    return f2888;
  }
};final Object f2890 = RunWithoutMacros.LAMBDA.apply(l2889);

    return f2890;

}
}
