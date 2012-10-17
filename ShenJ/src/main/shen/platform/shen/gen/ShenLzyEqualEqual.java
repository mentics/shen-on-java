package shen.gen;



import com.mentics.shen.*;

public class ShenLzyEqualEqual {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-lzy==");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1473, final Object v1474, final Object v1475, final Object v1476) throws Exception {
return defined(v1473, v1474, v1475, v1476);
}};
public static Object defined(final Object v1473, final Object v1474, final Object v1475, final Object v1476) throws Exception {

final Object i3846;
if ((boolean)Lang.equals(v1474, v1473)) {
final Object f3836 = Thaw.LAMBDA.apply(v1476);

i3846 = f3836;
} else {


final Object i3838;
if ((boolean)(v1473 instanceof Cons)) {


final Object i3837;
if ((boolean)(v1474 instanceof Cons)) {

i3837 = true;
} else {

i3837 = false;

}
i3838 = i3837;
} else {

i3838 = false;

}
final Object i3845;
if ((boolean)i3838) {

final Object f3839 = ShenLazyderef.LAMBDA.apply(((Cons)v1473).head, v1475);

final Object f3840 = ShenLazyderef.LAMBDA.apply(((Cons)v1474).head, v1475);
final Lambda l3842 = new Lambda0() {
  public Object apply() throws Exception {
    

final Object f3841 = ShenLzyEqualEqual.LAMBDA.apply(((Cons)v1473).tail, ((Cons)v1474).tail, v1475, v1476);

    return f3841;
  }
};final Object f3843 = ShenLzyEqualEqual.LAMBDA.apply(f3839, f3840, v1475, l3842);

i3845 = f3843;
} else {

final Object i3844;
if ((boolean)true) {

i3844 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3845 = i3844;

}
i3846 = i3845;

}
    return i3846;

}
}
