package shen.gen;



import com.mentics.shen.*;

public class WriteSource {

public static final Symbol SYMBOL = RuntimeContext.symbol("write-source");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1132, final Object v1133) throws Exception {
return defined(v1132, v1133);
}};
public static Object defined(final Object v1132, final Object v1133) throws Exception {
final Object f1135 = Ats.LAMBDA.apply("/", v1132);
final Object f1136 = Ats.LAMBDA.apply("n", f1135);
final Object f1137 = Ats.LAMBDA.apply("e", f1136);
final Object f1138 = Ats.LAMBDA.apply("g", f1137);
final Object f1139 = Ats.LAMBDA.apply("/", f1138);
final Object f1140 = Ats.LAMBDA.apply("n", f1139);
final Object f1141 = Ats.LAMBDA.apply("e", f1140);
final Object f1142 = Ats.LAMBDA.apply("h", f1141);
final Object f1143 = Ats.LAMBDA.apply("s", f1142);
final Object f1144 = Ats.LAMBDA.apply("/", f1143);
final Object f1145 = Ats.LAMBDA.apply("n", f1144);
final Object f1146 = Ats.LAMBDA.apply("e", f1145);
final Object f1147 = Ats.LAMBDA.apply("g", f1146);

final Object file1134 = f1147;
final Object f1148 = WriteStringToFile.LAMBDA.apply(file1134, v1133);
final Object f1149 = Do.LAMBDA.apply(f1148, file1134);


    return f1149;

}
}
