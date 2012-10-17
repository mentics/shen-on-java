package shen.gen;



import com.mentics.shen.*;

public class Format {

public static final Symbol SYMBOL = RuntimeContext.symbol("format");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1082, final Object v1083, final Object v1084) throws Exception {
return defined(v1082, v1083, v1084);
}};
public static Object defined(final Object v1082, final Object v1083, final Object v1084) throws Exception {

final Object i1143;
if ((boolean)Lang.equals(true, v1082)) {
final Object f1135 = Atp.LAMBDA.apply(v1084, Nil.NIL);
final Object f1136 = Intoutput.LAMBDA.apply(v1083, f1135);

i1143 = f1136;
} else {

final Object i1142;
if ((boolean)Lang.equals(false, v1082)) {
final Object f1137 = Atp.LAMBDA.apply(v1084, Nil.NIL);
final Object f1138 = IntmakeString.LAMBDA.apply(v1083, f1137);

i1142 = f1138;
} else {

final Object i1141;
if ((boolean)true) {
final Object f1139 = Explode.LAMBDA.apply(v1083);
final Object f1140 = ShenMsH.LAMBDA.apply(f1139, v1084);


((java.io.OutputStream)v1082).write(((String)f1140).getBytes());
i1141 = f1140;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1142 = i1141;

}
i1143 = i1142;

}
    return i1143;

}
}
