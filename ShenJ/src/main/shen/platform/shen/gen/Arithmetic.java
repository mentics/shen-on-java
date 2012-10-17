package shen.gen;



import com.mentics.shen.*;

public class Arithmetic {

public static final Symbol SYMBOL = RuntimeContext.symbol("arithmetic");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v7271, final Object v7272, final Object v7273) throws Exception {
return defined(v7271, v7272, v7273);
}};
public static Object defined(final Object v7271, final Object v7272, final Object v7273) throws Exception {


final Object i8817;
if ((boolean)(v7272 instanceof Cons)) {


final Object i8816;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7272).tail)) {

i8816 = true;
} else {

i8816 = false;

}
i8817 = i8816;
} else {

i8817 = false;

}
final Object i8849;
if ((boolean)i8817) {
final Object f8819 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object var8818 = f8819;













final Object f8820 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(var8818, new Cons(new Cons(v7271, new Cons(((Cons)v7272).head, new Cons(var8818, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7273);


i8849 = f8820;
} else {


final Object i8824;
if ((boolean)(v7272 instanceof Cons)) {



final Object i8822;
if ((boolean)(((Cons)v7272).tail instanceof Cons)) {



final Object i8821;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7272).tail).tail)) {

i8821 = true;
} else {

i8821 = false;

}
i8822 = i8821;
} else {

i8822 = false;

}
final Object i8823;
if ((boolean)i8822) {

i8823 = true;
} else {

i8823 = false;

}
i8824 = i8823;
} else {

i8824 = false;

}
final Object i8848;
if ((boolean)i8824) {

final Object f8826 = KlToJavaTraverse.LAMBDA.apply(((Cons)v7272).head, RuntimeContext.symbol("number"), v7273);

final Object a0Eval8825 = f8826;


final Object f8828 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7272).tail).head, RuntimeContext.symbol("number"), v7273);

final Object a1Eval8827 = f8828;
final Object f8830 = Fst.LAMBDA.apply(a0Eval8825);

final Object a0Content8829 = f8830;
final Object f8832 = Second.LAMBDA.apply(a0Eval8825);

final Object a0Expression8831 = f8832;
final Object f8834 = Fst.LAMBDA.apply(a1Eval8827);

final Object a1Content8833 = f8834;
final Object f8836 = Second.LAMBDA.apply(a1Eval8827);

final Object a1Expression8835 = f8836;
final Object f8837 = Atp.LAMBDA.apply(a1Content8833, Nil.NIL);
final Object f8838 = Atp.LAMBDA.apply(a0Content8829, f8837);
final Object f8839 = IntmakeString.LAMBDA.apply("~A~%~A~%", f8838);
final Object f8840 = ArithmeticToName.LAMBDA.apply(v7271);
final Object f8841 = Atp.LAMBDA.apply(a1Expression8835, Nil.NIL);
final Object f8842 = Atp.LAMBDA.apply(a0Expression8831, f8841);
final Object f8843 = Atp.LAMBDA.apply(f8840, f8842);
final Object f8844 = IntmakeString.LAMBDA.apply("Primitives.~A.apply(~A, ~A)", f8843);
final Object f8845 = Atp.LAMBDA.apply(f8844, RuntimeContext.symbol("number"));
final Object f8846 = Atp.LAMBDA.apply(f8839, f8845);







i8848 = f8846;
} else {

final Object i8847;
if ((boolean)true) {

throw new SimpleError((String)"Bad args to arithmetic");

} else {

throw new SimpleError((String)"True condition not found.");


}

}
i8849 = i8848;

}
    return i8849;

}
}
