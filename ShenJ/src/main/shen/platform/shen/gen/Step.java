package shen.gen;



import com.mentics.shen.*;

public class Step {

public static final Symbol SYMBOL = RuntimeContext.symbol("step");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1134) throws Exception {
return defined(v1134);
}};
public static Object defined(final Object v1134) throws Exception {

final Object i6778;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v1134)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*step*"), true);
i6778 = true;
} else {

final Object i6777;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v1134)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*step*"), false);
i6777 = false;
} else {

final Object i6776;
if ((boolean)true) {
final Object f6775 = Interror.LAMBDA.apply("step expects a + or a -.~%", Nil.NIL);

i6776 = f6775;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6777 = i6776;

}
i6778 = i6777;

}
    return i6778;

}
}
