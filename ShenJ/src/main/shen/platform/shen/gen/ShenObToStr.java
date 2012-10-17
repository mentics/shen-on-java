package shen.gen;



import com.mentics.shen.*;

public class ShenObToStr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-ob->str");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1098, final Object v1099) throws Exception {
return defined(v1098, v1099);
}};
public static Object defined(final Object v1098, final Object v1099) throws Exception {

final Object i1226;
if ((boolean)Lang.equals(v1099, null)) {

i1226 = "...";
} else {

final Object i1225;
if ((boolean)Lang.equals(Nil.NIL, v1099)) {

final Object i1179;
if ((boolean)Lang.equals(v1098, "R")) {

i1179 = "()";
} else {

i1179 = "[]";

}
i1225 = i1179;
} else {
final Object f1180 = Vector.LAMBDA.apply(0);

final Object i1224;
if ((boolean)Lang.equals(v1099, f1180)) {

i1224 = "<>";
} else {


final Object i1223;
if ((boolean)(v1099 instanceof Cons)) {

final Object i1181;
if ((boolean)Lang.equals(v1098, "R")) {



i1181 = new Cons("(", Nil.NIL);
} else {



i1181 = new Cons("[", Nil.NIL);

}
final Object f1182 = ShenObToStr.LAMBDA.apply(v1098, ((Cons)v1099).head);



final Lambda l1184 = new Lambda1() {
  public Object apply(final Object z) throws Exception {
    
final Object f1183 = ShenObToStr.LAMBDA.apply(v1098, z);




    return new Cons(" ", new Cons(f1183, Nil.NIL));
  }
};
final Object f1185 = ShenXmapcan.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*maximum-print-sequence-size*")), l1184, ((Cons)v1099).tail);

final Object i1186;
if ((boolean)Lang.equals(v1098, "R")) {



i1186 = new Cons(")", Nil.NIL);
} else {



i1186 = new Cons("]", Nil.NIL);

}final Object f1187 = Append.LAMBDA.apply(f1185, i1186);
final Object f1188 = Append.LAMBDA.apply(new Cons(f1182, Nil.NIL), f1187);
final Object f1189 = Append.LAMBDA.apply(i1181, f1188);
final Object f1190 = ShenCnAll.LAMBDA.apply(f1189);

i1223 = f1190;
} else {
final Object f1191 = VectorQ.LAMBDA.apply(v1099);

final Object i1222;
if ((boolean)f1191) {
final Object f1193 = ShenVectorToList.LAMBDA.apply(v1099, 1);

final Object l1192 = f1193;



final Lambda l1197 = new Lambda1() {
  public Object apply(final Object z) throws Exception {
    
final Object f1195 = ShenBlankFail.LAMBDA.apply(z);
final Object f1196 = ShenObToStr.LAMBDA.apply(v1098, f1195);




    return new Cons(" ", new Cons(f1196, Nil.NIL));
  }
};final Object f1198 = ShenXmapcan.LAMBDA.apply(Primitives.minus.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*maximum-print-sequence-size*")), 1), l1197, l1192);
final Object f1199 = ShenCnAll.LAMBDA.apply(f1198);


final Object e1194 = ((String)f1199).substring(1);





final Object v1200 = ((String)"<" + (String)((String)e1194 + (String)">"));




i1222 = v1200;
} else {



final Object i1202;
if ((boolean)!((boolean)(v1099 instanceof String))) {


final Object i1201;
if ((boolean)(v1099 instanceof Object[])) {

i1201 = true;
} else {

i1201 = false;

}
i1202 = i1201;
} else {

i1202 = false;

}
final Object i1221;
if ((boolean)i1202) {
Object t1214;
try {


final Object f1203 = RuntimeContext.dispatch(((Object[])v1099)[((Number)0).intValue()]).apply(v1099);
final Object f1204 = ShenObToStr.LAMBDA.apply("A", f1203);

t1214 = f1204;
} catch (Throwable t) {
final Lambda l1213 = new Lambda1() {
  public Object apply(final Object ignore) throws Exception {
    final Object f1206 = ShenVectorToList.LAMBDA.apply(v1099, 0);

final Object l1205 = f1206;



final Lambda l1209 = new Lambda1() {
  public Object apply(final Object z) throws Exception {
    
final Object f1208 = ShenObToStr.LAMBDA.apply(v1098, z);




    return new Cons(" ", new Cons(f1208, Nil.NIL));
  }
};final Object f1210 = ShenXmapcan.LAMBDA.apply(Primitives.minus.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*maximum-print-sequence-size*")), 1), l1209, l1205);
final Object f1211 = ShenCnAll.LAMBDA.apply(f1210);


final Object e1207 = ((String)f1211).substring(1);





final Object v1212 = ((String)"<" + (String)((String)e1207 + (String)">"));




    return v1212;
  }
};
t1214 = l1213.apply(t);
}
final Object t1215 = t1214;

i1221 = t1215;
} else {

final Object i1220;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-vector-failure-object"), v1099)) {

i1220 = "...";
} else {

final Object i1219;
if ((boolean)true) {

final Object i1217;
if ((boolean)Lang.equals(v1098, "A")) {


final Object i1216;
if ((boolean)(v1099 instanceof String)) {

i1216 = true;
} else {

i1216 = false;

}
i1217 = i1216;
} else {

i1217 = false;

}
final Object i1218;
if ((boolean)i1217) {

i1218 = v1099;
} else {


i1218 = String.valueOf(v1099);

}
i1219 = i1218;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1220 = i1219;

}
i1221 = i1220;

}
i1222 = i1221;

}
i1223 = i1222;

}
i1224 = i1223;

}
i1225 = i1224;

}
i1226 = i1225;

}
    return i1226;

}
}
