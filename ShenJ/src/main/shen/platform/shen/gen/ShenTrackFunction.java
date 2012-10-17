package shen.gen;



import com.mentics.shen.*;

public class ShenTrackFunction {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-track-function");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1126) throws Exception {
return defined(v1126);
}};
public static Object defined(final Object v1126) throws Exception {


final Object i6765;
if ((boolean)(v1126 instanceof Cons)) {


final Object i6763;
if ((boolean)Lang.equals(RuntimeContext.symbol("defun"), ((Cons)v1126).head)) {



final Object i6761;
if ((boolean)(((Cons)v1126).tail instanceof Cons)) {




final Object i6759;
if ((boolean)(((Cons)((Cons)v1126).tail).tail instanceof Cons)) {





final Object i6757;
if ((boolean)(((Cons)((Cons)((Cons)v1126).tail).tail).tail instanceof Cons)) {





final Object i6756;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1126).tail).tail).tail).tail)) {

i6756 = true;
} else {

i6756 = false;

}
i6757 = i6756;
} else {

i6757 = false;

}
final Object i6758;
if ((boolean)i6757) {

i6758 = true;
} else {

i6758 = false;

}
i6759 = i6758;
} else {

i6759 = false;

}
final Object i6760;
if ((boolean)i6759) {

i6760 = true;
} else {

i6760 = false;

}
i6761 = i6760;
} else {

i6761 = false;

}
final Object i6762;
if ((boolean)i6761) {

i6762 = true;
} else {

i6762 = false;

}
i6763 = i6762;
} else {

i6763 = false;

}
final Object i6764;
if ((boolean)i6763) {

i6764 = true;
} else {

i6764 = false;

}
i6765 = i6764;
} else {

i6765 = false;

}
final Object i6773;
if ((boolean)i6765) {

















final Object f6767 = ShenInsertTrackingCode.LAMBDA.apply(((Cons)((Cons)v1126).tail).head, ((Cons)((Cons)((Cons)v1126).tail).tail).head, ((Cons)((Cons)((Cons)((Cons)v1126).tail).tail).tail).head);






final Object kL6766 = new Cons(RuntimeContext.symbol("defun"), new Cons(((Cons)((Cons)v1126).tail).head, new Cons(((Cons)((Cons)((Cons)v1126).tail).tail).head, new Cons(f6767, Nil.NIL))));
final Object f6769 = Eval.LAMBDA.apply(kL6766);

final Object ob6768 = f6769;





RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*tracking*"), new Cons(ob6768, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tracking*"))));
final Object tr6770 = new Cons(ob6768, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tracking*")));




i6773 = ob6768;
} else {

final Object i6772;
if ((boolean)true) {
final Object f6771 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-track-function"));

i6772 = f6771;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6773 = i6772;

}
    return i6773;

}
}
