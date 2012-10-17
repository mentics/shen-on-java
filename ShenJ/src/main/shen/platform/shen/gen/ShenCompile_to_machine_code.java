package shen.gen;



import com.mentics.shen.*;

public class ShenCompile_to_machine_code {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compile_to_machine_code");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v410, final Object v411) throws Exception {
return defined(v410, v411);
}};
public static Object defined(final Object v410, final Object v411) throws Exception {
final Object f1876 = ShenCompile_to_lambdaPlus.LAMBDA.apply(v410, v411);

final Object lambdaPlus1875 = f1876;
final Object f1878 = ShenCompile_to_kl.LAMBDA.apply(v410, lambdaPlus1875);

final Object kL1877 = f1878;
final Object f1880 = ShenRecordSource.LAMBDA.apply(v410, kL1877);

final Object record1879 = f1880;




    return kL1877;

}
}
