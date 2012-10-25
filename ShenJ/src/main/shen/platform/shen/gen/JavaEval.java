package shen.gen;



import com.mentics.shen.*;

public class JavaEval {

public static final Symbol SYMBOL = RuntimeContext.symbol("java-eval");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2651) throws Exception {
return defined(v2651);
}};
public static Object defined(final Object v2651) throws Exception {
final Object f2653 = ParsedKlToJava.LAMBDA.apply(v2651);

final Object result2652 = f2653;
final Object f2655 = Fst.LAMBDA.apply(result2652);
final Object f2656 = Second.LAMBDA.apply(result2652);
final Object f2657 = ToJavaUnit.LAMBDA.apply(f2655, f2656);

final Object unit2654 = f2657;
final Object f2659 = Fst.LAMBDA.apply(unit2654);

final Object className2658 = f2659;
final Object f2661 = Second.LAMBDA.apply(unit2654);

final Object classUnitContent2660 = f2661;
final Object f2663 = Ats.LAMBDA.apply(className2658, ".java");
final Object f2664 = WriteSource.LAMBDA.apply(f2663, classUnitContent2660);

final Object file2662 = f2664;
final Object f2665 = JavaCompileAndRun.LAMBDA.apply(className2658, file2662);






    return f2665;

}
}
