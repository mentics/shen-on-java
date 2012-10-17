package shen.gen;



import com.mentics.shen.*;

public class JavaClassFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("java-class-file");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v7238, final Object v7239, final Object v7240) throws Exception {
return defined(v7238, v7239, v7240);
}};
public static Object defined(final Object v7238, final Object v7239, final Object v7240) throws Exception {

final Object i7329;
if ((boolean)Lang.equals(v7239, "")) {

i7329 = "";
} else {
final Object f7327 = Atp.LAMBDA.apply(v7239, Nil.NIL);
final Object f7328 = IntmakeString.LAMBDA.apply("package ~A;~%~%", f7327);

i7329 = f7328;

}final Object f7330 = Atp.LAMBDA.apply(v7240, Nil.NIL);
final Object f7331 = Atp.LAMBDA.apply(v7238, f7330);
final Object f7332 = Atp.LAMBDA.apply(i7329, f7331);
final Object f7333 = IntmakeString.LAMBDA.apply("~A~%~%import com.mentics.shen.*;~%~%public class ~A {~%~A~%}~%", f7332);

    return f7333;

}
}
