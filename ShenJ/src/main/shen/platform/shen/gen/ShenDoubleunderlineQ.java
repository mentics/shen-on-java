package shen.gen;



import com.mentics.shen.*;

public class ShenDoubleunderlineQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-doubleunderline?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1569) throws Exception {
return defined(v1569);
}};
public static Object defined(final Object v1569) throws Exception {
final Object f6193 = SymbolQ.LAMBDA.apply(v1569);

final Object i6196;
if ((boolean)f6193) {

final Object f6194 = ShenDhQ.LAMBDA.apply(String.valueOf(v1569));

final Object i6195;
if ((boolean)f6194) {

i6195 = true;
} else {

i6195 = false;

}
i6196 = i6195;
} else {

i6196 = false;

}
    return i6196;

}
}
