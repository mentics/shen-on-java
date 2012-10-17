package shen.gen;



import com.mentics.shen.*;

public class ShenApostdigitsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<postdigits>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1032) throws Exception {
return defined(v1032);
}};
public static Object defined(final Object v1032) throws Exception {
final Object f5522 = ShenAdigitsZ.LAMBDA.apply(v1032);

final Object parse_AdigitsZ5521 = f5522;


final Object i5526;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5521))) {
final Object f5523 = Fst.LAMBDA.apply(parse_AdigitsZ5521);
final Object f5524 = Snd.LAMBDA.apply(parse_AdigitsZ5521);
final Object f5525 = ShenReassemble.LAMBDA.apply(f5523, f5524);

i5526 = f5525;
} else {

i5526 = null;

}

final Object result5520 = i5526;

final Object i5527;
if ((boolean)Lang.equals(result5520, null)) {

i5527 = null;
} else {

i5527 = result5520;

}

    return i5527;

}
}
