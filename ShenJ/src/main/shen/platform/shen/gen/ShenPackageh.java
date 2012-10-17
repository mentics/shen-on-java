package shen.gen;



import com.mentics.shen.*;

public class ShenPackageh {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-packageh");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1078, final Object v1079, final Object v1080) throws Exception {
return defined(v1078, v1079, v1080);
}};
public static Object defined(final Object v1078, final Object v1079, final Object v1080) throws Exception {


final Object i5795;
if ((boolean)(v1080 instanceof Cons)) {

final Object f5771 = ShenPackageh.LAMBDA.apply(v1078, v1079, ((Cons)v1080).head);


final Object f5772 = ShenPackageh.LAMBDA.apply(v1078, v1079, ((Cons)v1080).tail);


i5795 = new Cons(f5771, f5772);
} else {
final Object f5773 = ShenSysfuncQ.LAMBDA.apply(v1080);

final Object i5785;
if ((boolean)f5773) {

i5785 = true;
} else {
final Object f5774 = VariableQ.LAMBDA.apply(v1080);

final Object i5783;
if ((boolean)f5774) {

i5783 = true;
} else {
final Object f5775 = ElementQ.LAMBDA.apply(v1080, v1079);

final Object i5781;
if ((boolean)f5775) {

i5781 = true;
} else {
final Object f5776 = ShenDoubleunderlineQ.LAMBDA.apply(v1080);

final Object i5779;
if ((boolean)f5776) {

i5779 = true;
} else {
final Object f5777 = ShenSingleunderlineQ.LAMBDA.apply(v1080);

final Object i5778;
if ((boolean)f5777) {

i5778 = true;
} else {

i5778 = false;

}
i5779 = i5778;

}
final Object i5780;
if ((boolean)i5779) {

i5780 = true;
} else {

i5780 = false;

}
i5781 = i5780;

}
final Object i5782;
if ((boolean)i5781) {

i5782 = true;
} else {

i5782 = false;

}
i5783 = i5782;

}
final Object i5784;
if ((boolean)i5783) {

i5784 = true;
} else {

i5784 = false;

}
i5785 = i5784;

}
final Object i5794;
if ((boolean)i5785) {

i5794 = v1080;
} else {
final Object f5786 = SymbolQ.LAMBDA.apply(v1080);

final Object i5790;
if ((boolean)f5786) {










final Object f5787 = Explode.LAMBDA.apply(v1080);
final Object f5788 = ShenPrefixQ.LAMBDA.apply(new Cons("s", new Cons("h", new Cons("e", new Cons("n", new Cons("-", Nil.NIL))))), f5787);


final Object i5789;
if ((boolean)!((boolean)f5788)) {

i5789 = true;
} else {

i5789 = false;

}
i5790 = i5789;
} else {

i5790 = false;

}
final Object i5793;
if ((boolean)i5790) {
final Object f5791 = Concat.LAMBDA.apply(v1078, v1080);

i5793 = f5791;
} else {

final Object i5792;
if ((boolean)true) {

i5792 = v1080;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5793 = i5792;

}
i5794 = i5793;

}
i5795 = i5794;

}
    return i5795;

}
}
