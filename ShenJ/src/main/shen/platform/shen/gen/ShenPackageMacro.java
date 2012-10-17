package shen.gen;



import com.mentics.shen.*;

public class ShenPackageMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-package-macro");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1066, final Object v1067) throws Exception {
return defined(v1066, v1067);
}};
public static Object defined(final Object v1066, final Object v1067) throws Exception {


final Object i5735;
if ((boolean)(v1066 instanceof Cons)) {


final Object i5733;
if ((boolean)Lang.equals(RuntimeContext.symbol("$"), ((Cons)v1066).head)) {



final Object i5731;
if ((boolean)(((Cons)v1066).tail instanceof Cons)) {



final Object i5730;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1066).tail).tail)) {

i5730 = true;
} else {

i5730 = false;

}
i5731 = i5730;
} else {

i5731 = false;

}
final Object i5732;
if ((boolean)i5731) {

i5732 = true;
} else {

i5732 = false;

}
i5733 = i5732;
} else {

i5733 = false;

}
final Object i5734;
if ((boolean)i5733) {

i5734 = true;
} else {

i5734 = false;

}
i5735 = i5734;
} else {

i5735 = false;

}
final Object i5762;
if ((boolean)i5735) {


final Object f5736 = Explode.LAMBDA.apply(((Cons)((Cons)v1066).tail).head);
final Object f5737 = Append.LAMBDA.apply(f5736, v1067);

i5762 = f5737;
} else {


final Object i5745;
if ((boolean)(v1066 instanceof Cons)) {


final Object i5743;
if ((boolean)Lang.equals(RuntimeContext.symbol("package"), ((Cons)v1066).head)) {



final Object i5741;
if ((boolean)(((Cons)v1066).tail instanceof Cons)) {



final Object i5739;
if ((boolean)Lang.equals(RuntimeContext.symbol("null"), ((Cons)((Cons)v1066).tail).head)) {




final Object i5738;
if ((boolean)(((Cons)((Cons)v1066).tail).tail instanceof Cons)) {

i5738 = true;
} else {

i5738 = false;

}
i5739 = i5738;
} else {

i5739 = false;

}
final Object i5740;
if ((boolean)i5739) {

i5740 = true;
} else {

i5740 = false;

}
i5741 = i5740;
} else {

i5741 = false;

}
final Object i5742;
if ((boolean)i5741) {

i5742 = true;
} else {

i5742 = false;

}
i5743 = i5742;
} else {

i5743 = false;

}
final Object i5744;
if ((boolean)i5743) {

i5744 = true;
} else {

i5744 = false;

}
i5745 = i5744;
} else {

i5745 = false;

}
final Object i5761;
if ((boolean)i5745) {



final Object f5746 = Append.LAMBDA.apply(((Cons)((Cons)((Cons)v1066).tail).tail).tail, v1067);

i5761 = f5746;
} else {


final Object i5752;
if ((boolean)(v1066 instanceof Cons)) {


final Object i5750;
if ((boolean)Lang.equals(RuntimeContext.symbol("package"), ((Cons)v1066).head)) {



final Object i5748;
if ((boolean)(((Cons)v1066).tail instanceof Cons)) {




final Object i5747;
if ((boolean)(((Cons)((Cons)v1066).tail).tail instanceof Cons)) {

i5747 = true;
} else {

i5747 = false;

}
i5748 = i5747;
} else {

i5748 = false;

}
final Object i5749;
if ((boolean)i5748) {

i5749 = true;
} else {

i5749 = false;

}
i5750 = i5749;
} else {

i5750 = false;

}
final Object i5751;
if ((boolean)i5750) {

i5751 = true;
} else {

i5751 = false;

}
i5752 = i5751;
} else {

i5752 = false;

}
final Object i5760;
if ((boolean)i5752) {



final Object f5754 = ShenEvalWithoutMacros.LAMBDA.apply(((Cons)((Cons)((Cons)v1066).tail).tail).head);

final Object listofExceptions5753 = f5754;


final Object f5756 = ShenRecordExceptions.LAMBDA.apply(listofExceptions5753, ((Cons)((Cons)v1066).tail).head);

final Object record5755 = f5756;





final Object f5757 = ShenPackageh.LAMBDA.apply(((Cons)((Cons)v1066).tail).head, listofExceptions5753, ((Cons)((Cons)((Cons)v1066).tail).tail).tail);
final Object f5758 = Append.LAMBDA.apply(f5757, v1067);



i5760 = f5758;
} else {

final Object i5759;
if ((boolean)true) {



i5759 = new Cons(v1066, v1067);
} else {

throw new SimpleError((String)"True condition not found.");


}
i5760 = i5759;

}
i5761 = i5760;

}
i5762 = i5761;

}
    return i5762;

}
}
