package shen.gen;



import com.mentics.shen.*;

public class ToJavaUnit {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-java-unit");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7253, final Object v7254) throws Exception {
return defined(v7253, v7254);
}};
public static Object defined(final Object v7253, final Object v7254) throws Exception {

final Object i8479;
if ((boolean)Lang.equals(v7254, "")) {

i8479 = "ToEval";
} else {
final Object f8478 = NameToClassName.LAMBDA.apply(v7254);

i8479 = f8478;

}
final Object className8477 = i8479;
final Object f8480 = JavaClassFile.LAMBDA.apply(className8477, "shen.gen", v7253);
final Object f8481 = Atp.LAMBDA.apply(className8477, f8480);


    return f8481;

}
}
