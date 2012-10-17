package shen.gen;



import com.mentics.shen.*;

public class ShenToplevel_evaluate {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-toplevel_evaluate");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v633, final Object v634) throws Exception {
return defined(v633, v634);
}};
public static Object defined(final Object v633, final Object v634) throws Exception {


final Object i6682;
if ((boolean)(v633 instanceof Cons)) {



final Object i6680;
if ((boolean)(((Cons)v633).tail instanceof Cons)) {



final Object i6678;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), ((Cons)((Cons)v633).tail).head)) {




final Object i6676;
if ((boolean)(((Cons)((Cons)v633).tail).tail instanceof Cons)) {




final Object i6674;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v633).tail).tail).tail)) {

final Object i6673;
if ((boolean)Lang.equals(true, v634)) {

i6673 = true;
} else {

i6673 = false;

}
i6674 = i6673;
} else {

i6674 = false;

}
final Object i6675;
if ((boolean)i6674) {

i6675 = true;
} else {

i6675 = false;

}
i6676 = i6675;
} else {

i6676 = false;

}
final Object i6677;
if ((boolean)i6676) {

i6677 = true;
} else {

i6677 = false;

}
i6678 = i6677;
} else {

i6678 = false;

}
final Object i6679;
if ((boolean)i6678) {

i6679 = true;
} else {

i6679 = false;

}
i6680 = i6679;
} else {

i6680 = false;

}
final Object i6681;
if ((boolean)i6680) {

i6681 = true;
} else {

i6681 = false;

}
i6682 = i6681;
} else {

i6682 = false;

}
final Object i6709;
if ((boolean)i6682) {




final Object f6683 = ShenTypecheckAndEvaluate.LAMBDA.apply(((Cons)v633).head, ((Cons)((Cons)((Cons)v633).tail).tail).head);

i6709 = f6683;
} else {


final Object i6685;
if ((boolean)(v633 instanceof Cons)) {



final Object i6684;
if ((boolean)(((Cons)v633).tail instanceof Cons)) {

i6684 = true;
} else {

i6684 = false;

}
i6685 = i6684;
} else {

i6685 = false;

}
final Object i6708;
if ((boolean)i6685) {



final Object f6686 = ShenToplevel_evaluate.LAMBDA.apply(new Cons(((Cons)v633).head, Nil.NIL), v634);
final Object f6687 = Nl.LAMBDA.apply(1);

final Object f6688 = ShenToplevel_evaluate.LAMBDA.apply(((Cons)v633).tail, v634);
final Object f6689 = Do.LAMBDA.apply(f6687, f6688);
final Object f6690 = Do.LAMBDA.apply(f6686, f6689);

i6708 = f6690;
} else {


final Object i6694;
if ((boolean)(v633 instanceof Cons)) {


final Object i6692;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v633).tail)) {

final Object i6691;
if ((boolean)Lang.equals(true, v634)) {

i6691 = true;
} else {

i6691 = false;

}
i6692 = i6691;
} else {

i6692 = false;

}
final Object i6693;
if ((boolean)i6692) {

i6693 = true;
} else {

i6693 = false;

}
i6694 = i6693;
} else {

i6694 = false;

}
final Object i6707;
if ((boolean)i6694) {

final Object f6695 = Gensym.LAMBDA.apply(RuntimeContext.symbol("A"));
final Object f6696 = ShenTypecheckAndEvaluate.LAMBDA.apply(((Cons)v633).head, f6695);

i6707 = f6696;
} else {


final Object i6700;
if ((boolean)(v633 instanceof Cons)) {


final Object i6698;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v633).tail)) {

final Object i6697;
if ((boolean)Lang.equals(false, v634)) {

i6697 = true;
} else {

i6697 = false;

}
i6698 = i6697;
} else {

i6698 = false;

}
final Object i6699;
if ((boolean)i6698) {

i6699 = true;
} else {

i6699 = false;

}
i6700 = i6699;
} else {

i6700 = false;

}
final Object i6706;
if ((boolean)i6700) {

final Object f6702 = ShenEvalWithoutMacros.LAMBDA.apply(((Cons)v633).head);

final Object eval6701 = f6702;
final Object f6703 = Print.LAMBDA.apply(eval6701);


i6706 = f6703;
} else {

final Object i6705;
if ((boolean)true) {
final Object f6704 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-toplevel_evaluate"));

i6705 = f6704;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6706 = i6705;

}
i6707 = i6706;

}
i6708 = i6707;

}
i6709 = i6708;

}
    return i6709;

}
}
