package shen.gen;



import com.mentics.shen.*;

public class Fwhen {

public static final Symbol SYMBOL = RuntimeContext.symbol("fwhen");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1497, final Object v1498, final Object v1499) throws Exception {
return defined(v1497, v1498, v1499);
}};
public static Object defined(final Object v1497, final Object v1498, final Object v1499) throws Exception {

final Object i3860;
if ((boolean)Lang.equals(true, v1497)) {
final Object f3855 = Thaw.LAMBDA.apply(v1499);

i3860 = f3855;
} else {

final Object i3859;
if ((boolean)Lang.equals(false, v1497)) {

i3859 = false;
} else {

final Object i3858;
if ((boolean)true) {
final Object f3856 = Atp.LAMBDA.apply(v1497, Nil.NIL);
final Object f3857 = Interror.LAMBDA.apply("fwhen expects a boolean: not ~S%", f3856);

i3858 = f3857;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3859 = i3858;

}
i3860 = i3859;

}
    return i3860;

}
}
