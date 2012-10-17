package shen.gen;



import com.mentics.shen.*;

public class ShenProfileHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-profile-help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1159) throws Exception {
return defined(v1159);
}};
public static Object defined(final Object v1159) throws Exception {


final Object i6834;
if ((boolean)(v1159 instanceof Cons)) {


final Object i6832;
if ((boolean)Lang.equals(RuntimeContext.symbol("defun"), ((Cons)v1159).head)) {



final Object i6830;
if ((boolean)(((Cons)v1159).tail instanceof Cons)) {




final Object i6828;
if ((boolean)(((Cons)((Cons)v1159).tail).tail instanceof Cons)) {





final Object i6826;
if ((boolean)(((Cons)((Cons)((Cons)v1159).tail).tail).tail instanceof Cons)) {





final Object i6825;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1159).tail).tail).tail).tail)) {

i6825 = true;
} else {

i6825 = false;

}
i6826 = i6825;
} else {

i6826 = false;

}
final Object i6827;
if ((boolean)i6826) {

i6827 = true;
} else {

i6827 = false;

}
i6828 = i6827;
} else {

i6828 = false;

}
final Object i6829;
if ((boolean)i6828) {

i6829 = true;
} else {

i6829 = false;

}
i6830 = i6829;
} else {

i6830 = false;

}
final Object i6831;
if ((boolean)i6830) {

i6831 = true;
} else {

i6831 = false;

}
i6832 = i6831;
} else {

i6832 = false;

}
final Object i6833;
if ((boolean)i6832) {

i6833 = true;
} else {

i6833 = false;

}
i6834 = i6833;
} else {

i6834 = false;

}
final Object i6847;
if ((boolean)i6834) {
final Object f6836 = Gensym.LAMBDA.apply(RuntimeContext.symbol("shen-f"));

final Object g6835 = f6836;


















final Object f6838 = ShenProfileFunc.LAMBDA.apply(((Cons)((Cons)v1159).tail).head, ((Cons)((Cons)((Cons)v1159).tail).tail).head, new Cons(g6835, ((Cons)((Cons)((Cons)v1159).tail).tail).head));






final Object profile6837 = new Cons(RuntimeContext.symbol("defun"), new Cons(((Cons)((Cons)v1159).tail).head, new Cons(((Cons)((Cons)((Cons)v1159).tail).tail).head, new Cons(f6838, Nil.NIL))));












final Object f6840 = Subst.LAMBDA.apply(g6835, ((Cons)((Cons)v1159).tail).head, ((Cons)((Cons)((Cons)((Cons)v1159).tail).tail).tail).head);






final Object def6839 = new Cons(RuntimeContext.symbol("defun"), new Cons(g6835, new Cons(((Cons)((Cons)((Cons)v1159).tail).tail).head, new Cons(f6840, Nil.NIL))));
final Object f6842 = ShenEvalWithoutMacros.LAMBDA.apply(profile6837);

final Object compileProfile6841 = f6842;
final Object f6844 = ShenEvalWithoutMacros.LAMBDA.apply(def6839);

final Object compileG6843 = f6844;








i6847 = ((Cons)((Cons)v1159).tail).head;
} else {

final Object i6846;
if ((boolean)true) {
final Object f6845 = Interror.LAMBDA.apply("Cannot profile.~%", Nil.NIL);

i6846 = f6845;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6847 = i6846;

}
    return i6847;

}
}
