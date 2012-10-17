package shen.gen;



import com.mentics.shen.*;

public class KlFileToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-file-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7292) throws Exception {
return defined(v7292);
}};
public static Object defined(final Object v7292) throws Exception {
final Lambda l8973 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l8970 = new Lambda1() {
  public Object apply(final Object parsed) throws Exception {
    final Object f8966 = JavaEval.LAMBDA.apply(parsed);
final Object f8967 = Atp.LAMBDA.apply(f8966, Nil.NIL);
final Object f8968 = IntmakeString.LAMBDA.apply("~A~%", f8967);
final Object f8969 = Intoutput.LAMBDA.apply(f8968, Nil.NIL);

    return f8969;
  }
};final Object f8971 = ReadFile.LAMBDA.apply(v7292);
final Object f8972 = Map.LAMBDA.apply(l8970, f8971);

    return f8972;
  }
};final Object f8974 = RunWithoutMacros.LAMBDA.apply(l8973);

    return f8974;

}
}
