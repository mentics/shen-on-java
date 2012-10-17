package shen.gen;



import com.mentics.shen.*;

public class JavaEval {

public static final Symbol SYMBOL = RuntimeContext.symbol("java-eval");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7257) throws Exception {
return defined(v7257);
}};
public static Object defined(final Object v7257) throws Exception {
final Object f8772 = ParsedKlToJava.LAMBDA.apply(v7257);

final Object result8771 = f8772;
final Object f8774 = Fst.LAMBDA.apply(result8771);
final Object f8775 = Second.LAMBDA.apply(result8771);
final Object f8776 = ToJavaUnit.LAMBDA.apply(f8774, f8775);

final Object unit8773 = f8776;
final Object f8778 = Fst.LAMBDA.apply(unit8773);

final Object className8777 = f8778;
final Object f8780 = Second.LAMBDA.apply(unit8773);

final Object classUnitContent8779 = f8780;
final Object f8782 = Ats.LAMBDA.apply(className8777, ".java");
final Object f8783 = WriteSource.LAMBDA.apply(f8782, classUnitContent8779);

final Object file8781 = f8783;
final Object f8784 = JavaCompileAndRun.LAMBDA.apply(className8777, file8781);






    return f8784;

}
}
