package shen.gen;



import com.mentics.shen.*;

public class ShenIntprologHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-intprolog-help");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1520, final Object v1521, final Object v1522) throws Exception {
return defined(v1520, v1521, v1522);
}};
public static Object defined(final Object v1520, final Object v1521, final Object v1522) throws Exception {


final Object i3885;
if ((boolean)(v1521 instanceof Cons)) {



final Object i3883;
if ((boolean)(((Cons)v1521).tail instanceof Cons)) {



final Object i3882;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1521).tail).tail)) {

i3882 = true;
} else {

i3882 = false;

}
i3883 = i3882;
} else {

i3883 = false;

}
final Object i3884;
if ((boolean)i3883) {

i3884 = true;
} else {

i3884 = false;

}
i3885 = i3884;
} else {

i3885 = false;

}
final Object i3889;
if ((boolean)i3885) {



final Object f3886 = ShenIntprologHelpHelp.LAMBDA.apply(v1520, ((Cons)v1521).head, ((Cons)((Cons)v1521).tail).head, v1522);

i3889 = f3886;
} else {

final Object i3888;
if ((boolean)true) {
final Object f3887 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-intprolog-help"));

i3888 = f3887;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3889 = i3888;

}
    return i3889;

}
}
