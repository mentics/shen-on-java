package shen.gen;



import com.mentics.shen.*;

public class JavaClassFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("java-class-file");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1166, final Object v1167, final Object v1168) throws Exception {
return defined(v1166, v1167, v1168);
}};
public static Object defined(final Object v1166, final Object v1167, final Object v1168) throws Exception {

final Object i1171;
if ((boolean)Lang.equals(v1167, "")) {

i1171 = "";
} else {
final Object f1169 = Atp.LAMBDA.apply(v1167, Nil.NIL);
final Object f1170 = IntmakeString.LAMBDA.apply("package ~A;~%~%", f1169);

i1171 = f1170;

}final Object f1172 = Atp.LAMBDA.apply(v1168, Nil.NIL);
final Object f1173 = Atp.LAMBDA.apply(v1166, f1172);
final Object f1174 = Atp.LAMBDA.apply(i1171, f1173);
final Object f1175 = IntmakeString.LAMBDA.apply("~A~%~%import com.mentics.shen.*;~%~%public class ~A {~%~A~%}~%", f1174);

    return f1175;

}
}
