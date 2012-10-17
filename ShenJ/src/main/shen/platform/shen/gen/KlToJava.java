package shen.gen;



import com.mentics.shen.*;

public class KlToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7291) throws Exception {
return defined(v7291);
}};
public static Object defined(final Object v7291) throws Exception {
final Object f8964 = ParseSingleKl.LAMBDA.apply(v7291);
final Object f8965 = JavaEval.LAMBDA.apply(f8964);

    return f8965;

}
}
