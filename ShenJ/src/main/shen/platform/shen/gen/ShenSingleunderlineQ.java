package shen.gen;



import com.mentics.shen.*;

public class ShenSingleunderlineQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-singleunderline?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1567) throws Exception {
return defined(v1567);
}};
public static Object defined(final Object v1567) throws Exception {
final Object f6184 = SymbolQ.LAMBDA.apply(v1567);

final Object i6187;
if ((boolean)f6184) {

final Object f6185 = ShenShQ.LAMBDA.apply(String.valueOf(v1567));

final Object i6186;
if ((boolean)f6185) {

i6186 = true;
} else {

i6186 = false;

}
i6187 = i6186;
} else {

i6187 = false;

}
    return i6187;

}
}
