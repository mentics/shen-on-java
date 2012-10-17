package shen.gen;



import com.mentics.shen.*;

public class ShenAstrZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<str>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1020) throws Exception {
return defined(v1020);
}};
public static Object defined(final Object v1020) throws Exception {
final Object f5279 = ShenAdbqZ.LAMBDA.apply(v1020);

final Object parse_AdbqZ5278 = f5279;


final Object i5289;
if ((boolean)!((boolean)Lang.equals(null, parse_AdbqZ5278))) {
final Object f5281 = ShenAstrcontentsZ.LAMBDA.apply(parse_AdbqZ5278);

final Object parse_AstrcontentsZ5280 = f5281;


final Object i5288;
if ((boolean)!((boolean)Lang.equals(null, parse_AstrcontentsZ5280))) {
final Object f5283 = ShenAdbqZ.LAMBDA.apply(parse_AstrcontentsZ5280);

final Object parse_AdbqZ5282 = f5283;


final Object i5287;
if ((boolean)!((boolean)Lang.equals(null, parse_AdbqZ5282))) {
final Object f5284 = Fst.LAMBDA.apply(parse_AdbqZ5282);
final Object f5285 = Snd.LAMBDA.apply(parse_AstrcontentsZ5280);
final Object f5286 = ShenReassemble.LAMBDA.apply(f5284, f5285);

i5287 = f5286;
} else {

i5287 = null;

}

i5288 = i5287;
} else {

i5288 = null;

}

i5289 = i5288;
} else {

i5289 = null;

}

final Object result5277 = i5289;

final Object i5290;
if ((boolean)Lang.equals(result5277, null)) {

i5290 = null;
} else {

i5290 = result5277;

}

    return i5290;

}
}
