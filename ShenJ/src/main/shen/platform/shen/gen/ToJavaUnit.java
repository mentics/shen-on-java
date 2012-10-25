package shen.gen;



import com.mentics.shen.*;

public class ToJavaUnit {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-java-unit");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v2341, final Object v2342) throws Exception {
return defined(v2341, v2342);
}};
public static Object defined(final Object v2341, final Object v2342) throws Exception {

final Object i2345;
if ((boolean)Lang.equals(v2342, "")) {

i2345 = "ToEval";
} else {
final Object f2344 = NameToClassName.LAMBDA.apply(v2342);

i2345 = f2344;

}
final Object className2343 = i2345;
final Object f2346 = JavaClassFile.LAMBDA.apply(className2343, "shen.gen", v2341);
final Object f2347 = Atp.LAMBDA.apply(className2343, f2346);


    return f2347;

}
}
