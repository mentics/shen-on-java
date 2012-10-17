package shen.gen;



import com.mentics.shen.*;

public class ShenAritycheckName {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-aritycheck-name");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v468, final Object v469, final Object v470) throws Exception {
return defined(v468, v469, v470);
}};
public static Object defined(final Object v468, final Object v469, final Object v470) throws Exception {

final Object i2071;
if ((boolean)Lang.equals(-1, v469)) {

i2071 = v470;
} else {

final Object i2070;
if ((boolean)Lang.equals(v470, v469)) {

i2070 = v470;
} else {

final Object i2069;
if ((boolean)true) {
final Object f2066 = Atp.LAMBDA.apply(v468, Nil.NIL);
final Object f2067 = Intoutput.LAMBDA.apply("~%warning: changing the arity of ~A can cause errors.~%", f2066);
final Object f2068 = Do.LAMBDA.apply(f2067, v470);

i2069 = f2068;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2070 = i2069;

}
i2071 = i2070;

}
    return i2071;

}
}
