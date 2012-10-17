package shen.gen;



import com.mentics.shen.*;

public class Comparison {

public static final Symbol SYMBOL = RuntimeContext.symbol("comparison");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v7274, final Object v7275, final Object v7276) throws Exception {
return defined(v7274, v7275, v7276);
}};
public static Object defined(final Object v7274, final Object v7275, final Object v7276) throws Exception {


final Object i8851;
if ((boolean)(v7275 instanceof Cons)) {


final Object i8850;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7275).tail)) {

i8850 = true;
} else {

i8850 = false;

}
i8851 = i8850;
} else {

i8851 = false;

}
final Object i8882;
if ((boolean)i8851) {
final Object f8853 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object var8852 = f8853;













final Object f8854 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(var8852, new Cons(new Cons(v7274, new Cons(((Cons)v7275).head, new Cons(var8852, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7276);


i8882 = f8854;
} else {


final Object i8858;
if ((boolean)(v7275 instanceof Cons)) {



final Object i8856;
if ((boolean)(((Cons)v7275).tail instanceof Cons)) {



final Object i8855;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7275).tail).tail)) {

i8855 = true;
} else {

i8855 = false;

}
i8856 = i8855;
} else {

i8856 = false;

}
final Object i8857;
if ((boolean)i8856) {

i8857 = true;
} else {

i8857 = false;

}
i8858 = i8857;
} else {

i8858 = false;

}
final Object i8881;
if ((boolean)i8858) {

final Object f8860 = KlToJavaTraverse.LAMBDA.apply(((Cons)v7275).head, RuntimeContext.symbol("number"), v7276);

final Object a0Eval8859 = f8860;


final Object f8862 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7275).tail).head, RuntimeContext.symbol("number"), v7276);

final Object a1Eval8861 = f8862;
final Object f8864 = Fst.LAMBDA.apply(a0Eval8859);

final Object a0Content8863 = f8864;
final Object f8866 = Second.LAMBDA.apply(a0Eval8859);

final Object a0Expression8865 = f8866;
final Object f8868 = Fst.LAMBDA.apply(a1Eval8861);

final Object a1Content8867 = f8868;
final Object f8870 = Second.LAMBDA.apply(a1Eval8861);

final Object a1Expression8869 = f8870;
final Object f8871 = Atp.LAMBDA.apply(a1Content8867, Nil.NIL);
final Object f8872 = Atp.LAMBDA.apply(a0Content8863, f8871);
final Object f8873 = IntmakeString.LAMBDA.apply("~A~%~A~%", f8872);

final Object f8874 = Atp.LAMBDA.apply(a1Expression8869, Nil.NIL);
final Object f8875 = Atp.LAMBDA.apply(String.valueOf(v7274), f8874);
final Object f8876 = Atp.LAMBDA.apply(a0Expression8865, f8875);
final Object f8877 = IntmakeString.LAMBDA.apply("(((Number)(~A)).doubleValue() ~A ((Number)(~A)).doubleValue())", f8876);
final Object f8878 = Atp.LAMBDA.apply(f8877, RuntimeContext.symbol("boolean"));
final Object f8879 = Atp.LAMBDA.apply(f8873, f8878);







i8881 = f8879;
} else {

final Object i8880;
if ((boolean)true) {

throw new SimpleError((String)"Bad args to comparison");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i8882 = i8881;

}
    return i8882;

}
}
