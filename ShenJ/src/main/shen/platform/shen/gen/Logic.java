package shen.gen;



import com.mentics.shen.*;

public class Logic {

public static final Symbol SYMBOL = RuntimeContext.symbol("logic");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v7277, final Object v7278, final Object v7279) throws Exception {
return defined(v7277, v7278, v7279);
}};
public static Object defined(final Object v7277, final Object v7278, final Object v7279) throws Exception {


final Object i8884;
if ((boolean)(v7278 instanceof Cons)) {


final Object i8883;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7278).tail)) {

i8883 = true;
} else {

i8883 = false;

}
i8884 = i8883;
} else {

i8884 = false;

}
final Object i8916;
if ((boolean)i8884) {
final Object f8886 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object var8885 = f8886;













final Object f8887 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(var8885, new Cons(new Cons(v7277, new Cons(((Cons)v7278).head, new Cons(var8885, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7279);


i8916 = f8887;
} else {


final Object i8891;
if ((boolean)(v7278 instanceof Cons)) {



final Object i8889;
if ((boolean)(((Cons)v7278).tail instanceof Cons)) {



final Object i8888;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7278).tail).tail)) {

i8888 = true;
} else {

i8888 = false;

}
i8889 = i8888;
} else {

i8889 = false;

}
final Object i8890;
if ((boolean)i8889) {

i8890 = true;
} else {

i8890 = false;

}
i8891 = i8890;
} else {

i8891 = false;

}
final Object i8915;
if ((boolean)i8891) {

final Object f8893 = KlToJavaTraverse.LAMBDA.apply(((Cons)v7278).head, RuntimeContext.symbol("boolean"), v7279);

final Object a0Eval8892 = f8893;


final Object f8895 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7278).tail).head, RuntimeContext.symbol("boolean"), v7279);

final Object a1Eval8894 = f8895;
final Object f8897 = Fst.LAMBDA.apply(a0Eval8892);

final Object a0Content8896 = f8897;
final Object f8899 = Second.LAMBDA.apply(a0Eval8892);

final Object a0Expression8898 = f8899;
final Object f8901 = Fst.LAMBDA.apply(a1Eval8894);

final Object a1Content8900 = f8901;
final Object f8903 = Second.LAMBDA.apply(a1Eval8894);

final Object a1Expression8902 = f8903;
final Object f8904 = Atp.LAMBDA.apply(a1Content8900, Nil.NIL);
final Object f8905 = Atp.LAMBDA.apply(a0Content8896, f8904);
final Object f8906 = IntmakeString.LAMBDA.apply("~A~%~A~%", f8905);
final Object f8907 = LogicToJava.LAMBDA.apply(v7277);
final Object f8908 = Atp.LAMBDA.apply(a1Expression8902, Nil.NIL);
final Object f8909 = Atp.LAMBDA.apply(f8907, f8908);
final Object f8910 = Atp.LAMBDA.apply(a0Expression8898, f8909);
final Object f8911 = IntmakeString.LAMBDA.apply("((boolean)~A ~A (boolean)~A)", f8910);
final Object f8912 = Atp.LAMBDA.apply(f8911, RuntimeContext.symbol("boolean"));
final Object f8913 = Atp.LAMBDA.apply(f8906, f8912);







i8915 = f8913;
} else {

final Object i8914;
if ((boolean)true) {

throw new SimpleError((String)"Bad args to logic");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i8916 = i8915;

}
    return i8916;

}
}
