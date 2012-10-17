package shen.gen;



import com.mentics.shen.*;

public class ShenMsH {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-ms-h");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1093, final Object v1094) throws Exception {
return defined(v1093, v1094);
}};
public static Object defined(final Object v1093, final Object v1094) throws Exception {

final Object i1178;
if ((boolean)Lang.equals(Nil.NIL, v1093)) {

i1178 = "";
} else {


final Object i1156;
if ((boolean)(v1093 instanceof Cons)) {


final Object i1154;
if ((boolean)Lang.equals("~", ((Cons)v1093).head)) {



final Object i1152;
if ((boolean)(((Cons)v1093).tail instanceof Cons)) {



final Object i1151;
if ((boolean)Lang.equals("%", ((Cons)((Cons)v1093).tail).head)) {

i1151 = true;
} else {

i1151 = false;

}
i1152 = i1151;
} else {

i1152 = false;

}
final Object i1153;
if ((boolean)i1152) {

i1153 = true;
} else {

i1153 = false;

}
i1154 = i1153;
} else {

i1154 = false;

}
final Object i1155;
if ((boolean)i1154) {

i1155 = true;
} else {

i1155 = false;

}
i1156 = i1155;
} else {

i1156 = false;

}
final Object i1177;
if ((boolean)i1156) {




final Object f1157 = ShenMsH.LAMBDA.apply(((Cons)((Cons)v1093).tail).tail, v1094);


i1177 = ((String)new String(Character.toChars(((Number) (10)).intValue())) + (String)f1157);
} else {


final Object i1167;
if ((boolean)(v1093 instanceof Cons)) {


final Object i1165;
if ((boolean)Lang.equals("~", ((Cons)v1093).head)) {



final Object i1163;
if ((boolean)(((Cons)v1093).tail instanceof Cons)) {
final Object f1158 = TupleQ.LAMBDA.apply(v1094);

final Object i1161;
if ((boolean)f1158) {








final Object f1159 = ElementQ.LAMBDA.apply(((Cons)((Cons)v1093).tail).head, new Cons("A", new Cons("S", new Cons("R", Nil.NIL))));

final Object i1160;
if ((boolean)f1159) {

i1160 = true;
} else {

i1160 = false;

}
i1161 = i1160;
} else {

i1161 = false;

}
final Object i1162;
if ((boolean)i1161) {

i1162 = true;
} else {

i1162 = false;

}
i1163 = i1162;
} else {

i1163 = false;

}
final Object i1164;
if ((boolean)i1163) {

i1164 = true;
} else {

i1164 = false;

}
i1165 = i1164;
} else {

i1165 = false;

}
final Object i1166;
if ((boolean)i1165) {

i1166 = true;
} else {

i1166 = false;

}
i1167 = i1166;
} else {

i1167 = false;

}
final Object i1176;
if ((boolean)i1167) {


final Object f1168 = Fst.LAMBDA.apply(v1094);
final Object f1169 = ShenObToStr.LAMBDA.apply(((Cons)((Cons)v1093).tail).head, f1168);



final Object f1170 = Snd.LAMBDA.apply(v1094);
final Object f1171 = ShenMsH.LAMBDA.apply(((Cons)((Cons)v1093).tail).tail, f1170);


i1176 = ((String)f1169 + (String)f1171);
} else {


final Object i1175;
if ((boolean)(v1093 instanceof Cons)) {



final Object f1172 = ShenMsH.LAMBDA.apply(((Cons)v1093).tail, v1094);


i1175 = ((String)((Cons)v1093).head + (String)f1172);
} else {

final Object i1174;
if ((boolean)true) {
final Object f1173 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-ms-h"));

i1174 = f1173;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1175 = i1174;

}
i1176 = i1175;

}
i1177 = i1176;

}
i1178 = i1177;

}
    return i1178;

}
}
