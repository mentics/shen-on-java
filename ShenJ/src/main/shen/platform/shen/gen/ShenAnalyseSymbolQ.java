package shen.gen;



import com.mentics.shen.*;

public class ShenAnalyseSymbolQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-analyse-symbol?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v727) throws Exception {
return defined(v727);
}};
public static Object defined(final Object v727) throws Exception {


final Object i777;
if ((boolean)(v727 instanceof Cons)) {

final Object f771 = ShenAlphaQ.LAMBDA.apply(((Cons)v727).head);

final Object i774;
if ((boolean)f771) {

final Object f772 = ShenAlphanumsQ.LAMBDA.apply(((Cons)v727).tail);

final Object i773;
if ((boolean)f772) {

i773 = true;
} else {

i773 = false;

}
i774 = i773;
} else {

i774 = false;

}
i777 = i774;
} else {

final Object i776;
if ((boolean)true) {
final Object f775 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-analyse-symbol?"));

i776 = f775;
} else {

throw new SimpleError((String)"True condition not found.");


}
i777 = i776;

}
    return i777;

}
}
