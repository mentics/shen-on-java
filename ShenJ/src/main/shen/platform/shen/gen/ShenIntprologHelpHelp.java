package shen.gen;



import com.mentics.shen.*;

public class ShenIntprologHelpHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-intprolog-help-help");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1523, final Object v1524, final Object v1525, final Object v1526) throws Exception {
return defined(v1523, v1524, v1525, v1526);
}};
public static Object defined(final Object v1523, final Object v1524, final Object v1525, final Object v1526) throws Exception {

final Object i3898;
if ((boolean)Lang.equals(Nil.NIL, v1524)) {
final Lambda l3891 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3890 = ShenCallRest.LAMBDA.apply(v1525, v1526);

    return f3890;
  }
};final Object f3892 = RuntimeContext.dispatch(v1523).apply(v1526, l3891);

i3898 = f3892;
} else {


final Object i3897;
if ((boolean)(v1524 instanceof Cons)) {

final Object f3893 = RuntimeContext.dispatch(v1523).apply(((Cons)v1524).head);

final Object f3894 = ShenIntprologHelpHelp.LAMBDA.apply(f3893, ((Cons)v1524).tail, v1525, v1526);

i3897 = f3894;
} else {

final Object i3896;
if ((boolean)true) {
final Object f3895 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-intprolog-help-help"));

i3896 = f3895;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3897 = i3896;

}
i3898 = i3897;

}
    return i3898;

}
}
