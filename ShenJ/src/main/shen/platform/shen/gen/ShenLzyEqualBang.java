package shen.gen;



import com.mentics.shen.*;

public class ShenLzyEqualBang {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-lzy=!");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1437, final Object v1438, final Object v1439, final Object v1440) throws Exception {
return defined(v1437, v1438, v1439, v1440);
}};
public static Object defined(final Object v1437, final Object v1438, final Object v1439, final Object v1440) throws Exception {

final Object i3825;
if ((boolean)Lang.equals(v1438, v1437)) {
final Object f3799 = Thaw.LAMBDA.apply(v1440);

i3825 = f3799;
} else {
final Object f3800 = ShenPvarQ.LAMBDA.apply(v1437);

final Object i3804;
if ((boolean)f3800) {
final Object f3801 = ShenDeref.LAMBDA.apply(v1438, v1439);
final Object f3802 = ShenOccursQ.LAMBDA.apply(v1437, f3801);


final Object i3803;
if ((boolean)!((boolean)f3802)) {

i3803 = true;
} else {

i3803 = false;

}
i3804 = i3803;
} else {

i3804 = false;

}
final Object i3824;
if ((boolean)i3804) {
final Object f3805 = Bind.LAMBDA.apply(v1437, v1438, v1439, v1440);

i3824 = f3805;
} else {
final Object f3806 = ShenPvarQ.LAMBDA.apply(v1438);

final Object i3810;
if ((boolean)f3806) {
final Object f3807 = ShenDeref.LAMBDA.apply(v1437, v1439);
final Object f3808 = ShenOccursQ.LAMBDA.apply(v1438, f3807);


final Object i3809;
if ((boolean)!((boolean)f3808)) {

i3809 = true;
} else {

i3809 = false;

}
i3810 = i3809;
} else {

i3810 = false;

}
final Object i3823;
if ((boolean)i3810) {
final Object f3811 = Bind.LAMBDA.apply(v1438, v1437, v1439, v1440);

i3823 = f3811;
} else {


final Object i3813;
if ((boolean)(v1437 instanceof Cons)) {


final Object i3812;
if ((boolean)(v1438 instanceof Cons)) {

i3812 = true;
} else {

i3812 = false;

}
i3813 = i3812;
} else {

i3813 = false;

}
final Object i3822;
if ((boolean)i3813) {

final Object f3814 = ShenLazyderef.LAMBDA.apply(((Cons)v1437).head, v1439);

final Object f3815 = ShenLazyderef.LAMBDA.apply(((Cons)v1438).head, v1439);
final Lambda l3819 = new Lambda0() {
  public Object apply() throws Exception {
    
final Object f3816 = ShenLazyderef.LAMBDA.apply(((Cons)v1437).tail, v1439);

final Object f3817 = ShenLazyderef.LAMBDA.apply(((Cons)v1438).tail, v1439);
final Object f3818 = ShenLzyEqualBang.LAMBDA.apply(f3816, f3817, v1439, v1440);

    return f3818;
  }
};final Object f3820 = ShenLzyEqualBang.LAMBDA.apply(f3814, f3815, v1439, l3819);

i3822 = f3820;
} else {

final Object i3821;
if ((boolean)true) {

i3821 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3822 = i3821;

}
i3823 = i3822;

}
i3824 = i3823;

}
i3825 = i3824;

}
    return i3825;

}
}
