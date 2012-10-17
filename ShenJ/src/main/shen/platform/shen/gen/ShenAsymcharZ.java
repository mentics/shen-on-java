package shen.gen;



import com.mentics.shen.*;

public class ShenAsymcharZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<symchar>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1011) throws Exception {
return defined(v1011);
}};
public static Object defined(final Object v1011) throws Exception {
final Object f5226 = ShenAalphaZ.LAMBDA.apply(v1011);

final Object parse_AalphaZ5225 = f5226;


final Object i5230;
if ((boolean)!((boolean)Lang.equals(null, parse_AalphaZ5225))) {
final Object f5227 = Fst.LAMBDA.apply(parse_AalphaZ5225);
final Object f5228 = Snd.LAMBDA.apply(parse_AalphaZ5225);
final Object f5229 = ShenReassemble.LAMBDA.apply(f5227, f5228);

i5230 = f5229;
} else {

i5230 = null;

}

final Object result5224 = i5230;

final Object i5239;
if ((boolean)Lang.equals(result5224, null)) {
final Object f5233 = ShenAdigitToStringZ.LAMBDA.apply(v1011);

final Object parse_AdigitToStringZ5232 = f5233;


final Object i5237;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitToStringZ5232))) {
final Object f5234 = Fst.LAMBDA.apply(parse_AdigitToStringZ5232);
final Object f5235 = Snd.LAMBDA.apply(parse_AdigitToStringZ5232);
final Object f5236 = ShenReassemble.LAMBDA.apply(f5234, f5235);

i5237 = f5236;
} else {

i5237 = null;

}

final Object result5231 = i5237;

final Object i5238;
if ((boolean)Lang.equals(result5231, null)) {

i5238 = null;
} else {

i5238 = result5231;

}

i5239 = i5238;
} else {

i5239 = result5224;

}

    return i5239;

}
}
