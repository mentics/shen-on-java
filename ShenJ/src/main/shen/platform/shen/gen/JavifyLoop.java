package shen.gen;



import com.mentics.shen.*;

public class JavifyLoop {

public static final Symbol SYMBOL = RuntimeContext.symbol("javify-loop");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6920) throws Exception {
return defined(v6920);
}};
public static Object defined(final Object v6920) throws Exception {

final Object i7081;
if ((boolean)Lang.equals(Nil.NIL, v6920)) {

i7081 = "";
} else {


final Object i7027;
if ((boolean)(v6920 instanceof Cons)) {


final Object i7026;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v6920).tail)) {

i7026 = true;
} else {

i7026 = false;

}
i7027 = i7026;
} else {

i7027 = false;

}
final Object i7080;
if ((boolean)i7027) {

final Object f7028 = EnsureValidChar.LAMBDA.apply(((Cons)v6920).head);

i7080 = f7028;
} else {


final Object i7039;
if ((boolean)(v6920 instanceof Cons)) {


final Object i7037;
if ((boolean)Lang.equals("-", ((Cons)v6920).head)) {



final Object i7035;
if ((boolean)(((Cons)v6920).tail instanceof Cons)) {



final Object i7033;
if ((boolean)Lang.equals(">", ((Cons)((Cons)v6920).tail).head)) {




final Object i7031;
if ((boolean)(((Cons)((Cons)v6920).tail).tail instanceof Cons)) {



final Object f7029 = LetterQ.LAMBDA.apply(((Cons)((Cons)((Cons)v6920).tail).tail).head);

final Object i7030;
if ((boolean)f7029) {

i7030 = true;
} else {

i7030 = false;

}
i7031 = i7030;
} else {

i7031 = false;

}
final Object i7032;
if ((boolean)i7031) {

i7032 = true;
} else {

i7032 = false;

}
i7033 = i7032;
} else {

i7033 = false;

}
final Object i7034;
if ((boolean)i7033) {

i7034 = true;
} else {

i7034 = false;

}
i7035 = i7034;
} else {

i7035 = false;

}
final Object i7036;
if ((boolean)i7035) {

i7036 = true;
} else {

i7036 = false;

}
i7037 = i7036;
} else {

i7037 = false;

}
final Object i7038;
if ((boolean)i7037) {

i7038 = true;
} else {

i7038 = false;

}
i7039 = i7038;
} else {

i7039 = false;

}
final Object i7079;
if ((boolean)i7039) {



final Object f7040 = UstringUpcase.LAMBDA.apply(((Cons)((Cons)((Cons)v6920).tail).tail).head);



final Object f7041 = JavifyLoop.LAMBDA.apply(((Cons)((Cons)((Cons)v6920).tail).tail).tail);
final Object f7042 = Ats.LAMBDA.apply(f7040, f7041);
final Object f7043 = Ats.LAMBDA.apply("o", f7042);
final Object f7044 = Ats.LAMBDA.apply("T", f7043);

i7079 = f7044;
} else {


final Object i7055;
if ((boolean)(v6920 instanceof Cons)) {


final Object i7053;
if ((boolean)Lang.equals("<", ((Cons)v6920).head)) {



final Object i7051;
if ((boolean)(((Cons)v6920).tail instanceof Cons)) {



final Object i7049;
if ((boolean)Lang.equals("-", ((Cons)((Cons)v6920).tail).head)) {




final Object i7047;
if ((boolean)(((Cons)((Cons)v6920).tail).tail instanceof Cons)) {



final Object f7045 = LetterQ.LAMBDA.apply(((Cons)((Cons)((Cons)v6920).tail).tail).head);

final Object i7046;
if ((boolean)f7045) {

i7046 = true;
} else {

i7046 = false;

}
i7047 = i7046;
} else {

i7047 = false;

}
final Object i7048;
if ((boolean)i7047) {

i7048 = true;
} else {

i7048 = false;

}
i7049 = i7048;
} else {

i7049 = false;

}
final Object i7050;
if ((boolean)i7049) {

i7050 = true;
} else {

i7050 = false;

}
i7051 = i7050;
} else {

i7051 = false;

}
final Object i7052;
if ((boolean)i7051) {

i7052 = true;
} else {

i7052 = false;

}
i7053 = i7052;
} else {

i7053 = false;

}
final Object i7054;
if ((boolean)i7053) {

i7054 = true;
} else {

i7054 = false;

}
i7055 = i7054;
} else {

i7055 = false;

}
final Object i7078;
if ((boolean)i7055) {



final Object f7056 = UstringUpcase.LAMBDA.apply(((Cons)((Cons)((Cons)v6920).tail).tail).head);



final Object f7057 = JavifyLoop.LAMBDA.apply(((Cons)((Cons)((Cons)v6920).tail).tail).tail);
final Object f7058 = Ats.LAMBDA.apply(f7056, f7057);
final Object f7059 = Ats.LAMBDA.apply("m", f7058);
final Object f7060 = Ats.LAMBDA.apply("o", f7059);
final Object f7061 = Ats.LAMBDA.apply("r", f7060);
final Object f7062 = Ats.LAMBDA.apply("F", f7061);

i7078 = f7062;
} else {


final Object i7066;
if ((boolean)(v6920 instanceof Cons)) {


final Object i7064;
if ((boolean)Lang.equals("-", ((Cons)v6920).head)) {



final Object i7063;
if ((boolean)(((Cons)v6920).tail instanceof Cons)) {

i7063 = true;
} else {

i7063 = false;

}
i7064 = i7063;
} else {

i7064 = false;

}
final Object i7065;
if ((boolean)i7064) {

i7065 = true;
} else {

i7065 = false;

}
i7066 = i7065;
} else {

i7066 = false;

}
final Object i7077;
if ((boolean)i7066) {


final Object f7068 = EnsureValidChar.LAMBDA.apply(((Cons)((Cons)v6920).tail).head);

final Object fixed7067 = f7068;
final Object f7069 = UstringUpcase.LAMBDA.apply(fixed7067);


final Object f7070 = JavifyLoop.LAMBDA.apply(((Cons)((Cons)v6920).tail).tail);
final Object f7071 = Ats.LAMBDA.apply(f7069, f7070);


i7077 = f7071;
} else {


final Object i7076;
if ((boolean)(v6920 instanceof Cons)) {

final Object f7072 = EnsureValidChar.LAMBDA.apply(((Cons)v6920).head);

final Object f7073 = JavifyLoop.LAMBDA.apply(((Cons)v6920).tail);
final Object f7074 = Ats.LAMBDA.apply(f7072, f7073);

i7076 = f7074;
} else {

final Object i7075;
if ((boolean)true) {

throw new SimpleError((String)"List expected. Call explode before calling javify-loop.");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i7077 = i7076;

}
i7078 = i7077;

}
i7079 = i7078;

}
i7080 = i7079;

}
i7081 = i7080;

}
    return i7081;

}
}
