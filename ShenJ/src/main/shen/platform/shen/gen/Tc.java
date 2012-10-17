package shen.gen;



import com.mentics.shen.*;

public class Tc {

public static final Symbol SYMBOL = RuntimeContext.symbol("tc");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v593) throws Exception {
return defined(v593);
}};
public static Object defined(final Object v593) throws Exception {

final Object i6583;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v593)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*tc*"), true);
i6583 = true;
} else {

final Object i6582;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v593)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*tc*"), false);
i6582 = false;
} else {

final Object i6581;
if ((boolean)true) {
final Object f6580 = Interror.LAMBDA.apply("tc expects a + or -", Nil.NIL);

i6581 = f6580;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6582 = i6581;

}
i6583 = i6582;

}
    return i6583;

}
}
