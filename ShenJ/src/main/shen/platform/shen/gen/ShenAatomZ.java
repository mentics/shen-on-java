package shen.gen;



import com.mentics.shen.*;

public class ShenAatomZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<atom>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v993) throws Exception {
return defined(v993);
}};
public static Object defined(final Object v993) throws Exception {
final Object f5078 = ShenAstrZ.LAMBDA.apply(v993);

final Object parse_AstrZ5077 = f5078;


final Object i5083;
if ((boolean)!((boolean)Lang.equals(null, parse_AstrZ5077))) {
final Object f5079 = Fst.LAMBDA.apply(parse_AstrZ5077);
final Object f5080 = Snd.LAMBDA.apply(parse_AstrZ5077);
final Object f5081 = ShenControlChars.LAMBDA.apply(f5080);
final Object f5082 = ShenReassemble.LAMBDA.apply(f5079, f5081);

i5083 = f5082;
} else {

i5083 = null;

}

final Object result5076 = i5083;

final Object i5100;
if ((boolean)Lang.equals(result5076, null)) {
final Object f5086 = ShenAnumberZ.LAMBDA.apply(v993);

final Object parse_AnumberZ5085 = f5086;


final Object i5090;
if ((boolean)!((boolean)Lang.equals(null, parse_AnumberZ5085))) {
final Object f5087 = Fst.LAMBDA.apply(parse_AnumberZ5085);
final Object f5088 = Snd.LAMBDA.apply(parse_AnumberZ5085);
final Object f5089 = ShenReassemble.LAMBDA.apply(f5087, f5088);

i5090 = f5089;
} else {

i5090 = null;

}

final Object result5084 = i5090;

final Object i5099;
if ((boolean)Lang.equals(result5084, null)) {
final Object f5093 = ShenAsymZ.LAMBDA.apply(v993);

final Object parse_AsymZ5092 = f5093;


final Object i5097;
if ((boolean)!((boolean)Lang.equals(null, parse_AsymZ5092))) {
final Object f5094 = Fst.LAMBDA.apply(parse_AsymZ5092);
final Object f5095 = Snd.LAMBDA.apply(parse_AsymZ5092);
final Object f5096 = ShenReassemble.LAMBDA.apply(f5094, f5095);

i5097 = f5096;
} else {

i5097 = null;

}

final Object result5091 = i5097;

final Object i5098;
if ((boolean)Lang.equals(result5091, null)) {

i5098 = null;
} else {

i5098 = result5091;

}

i5099 = i5098;
} else {

i5099 = result5084;

}

i5100 = i5099;
} else {

i5100 = result5076;

}

    return i5100;

}
}
