package shen.gen;



import com.mentics.shen.*;

public class ShenMult_subst {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-mult_subst");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v647, final Object v648, final Object v649) throws Exception {
return defined(v647, v648, v649);
}};
public static Object defined(final Object v647, final Object v648, final Object v649) throws Exception {

final Object i6738;
if ((boolean)Lang.equals(Nil.NIL, v647)) {

i6738 = v649;
} else {

final Object i6737;
if ((boolean)Lang.equals(Nil.NIL, v648)) {

i6737 = v649;
} else {


final Object i6731;
if ((boolean)(v647 instanceof Cons)) {


final Object i6730;
if ((boolean)(v648 instanceof Cons)) {

i6730 = true;
} else {

i6730 = false;

}
i6731 = i6730;
} else {

i6731 = false;

}
final Object i6736;
if ((boolean)i6731) {




final Object f6732 = Subst.LAMBDA.apply(((Cons)v647).head, ((Cons)v648).head, v649);
final Object f6733 = ShenMult_subst.LAMBDA.apply(((Cons)v647).tail, ((Cons)v648).tail, f6732);

i6736 = f6733;
} else {

final Object i6735;
if ((boolean)true) {
final Object f6734 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-mult_subst"));

i6735 = f6734;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6736 = i6735;

}
i6737 = i6736;

}
i6738 = i6737;

}
    return i6738;

}
}
