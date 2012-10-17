package shen.gen;



import com.mentics.shen.*;

public class ShenCallHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-call-help");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1515, final Object v1516, final Object v1517, final Object v1518) throws Exception {
return defined(v1515, v1516, v1517, v1518);
}};
public static Object defined(final Object v1515, final Object v1516, final Object v1517, final Object v1518) throws Exception {

final Object i3872;
if ((boolean)Lang.equals(Nil.NIL, v1516)) {
final Object f3866 = RuntimeContext.dispatch(v1515).apply(v1517, v1518);

i3872 = f3866;
} else {


final Object i3871;
if ((boolean)(v1516 instanceof Cons)) {

final Object f3867 = RuntimeContext.dispatch(v1515).apply(((Cons)v1516).head);

final Object f3868 = ShenCallHelp.LAMBDA.apply(f3867, ((Cons)v1516).tail, v1517, v1518);

i3871 = f3868;
} else {

final Object i3870;
if ((boolean)true) {
final Object f3869 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-call-help"));

i3870 = f3869;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3871 = i3870;

}
i3872 = i3871;

}
    return i3872;

}
}
