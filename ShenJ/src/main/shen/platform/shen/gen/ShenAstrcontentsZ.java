package shen.gen;



import com.mentics.shen.*;

public class ShenAstrcontentsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<strcontents>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1022) throws Exception {
return defined(v1022);
}};
public static Object defined(final Object v1022) throws Exception {
final Object f5304 = ShenAstrcZ.LAMBDA.apply(v1022);

final Object parse_AstrcZ5303 = f5304;


final Object i5312;
if ((boolean)!((boolean)Lang.equals(null, parse_AstrcZ5303))) {
final Object f5306 = ShenAstrcontentsZ.LAMBDA.apply(parse_AstrcZ5303);

final Object parse_AstrcontentsZ5305 = f5306;


final Object i5311;
if ((boolean)!((boolean)Lang.equals(null, parse_AstrcontentsZ5305))) {
final Object f5307 = Fst.LAMBDA.apply(parse_AstrcontentsZ5305);
final Object f5308 = Snd.LAMBDA.apply(parse_AstrcZ5303);

final Object f5309 = Snd.LAMBDA.apply(parse_AstrcontentsZ5305);

final Object f5310 = ShenReassemble.LAMBDA.apply(f5307, new Cons(f5308, f5309));

i5311 = f5310;
} else {

i5311 = null;

}

i5312 = i5311;
} else {

i5312 = null;

}

final Object result5302 = i5312;

final Object i5320;
if ((boolean)Lang.equals(result5302, null)) {
final Object f5315 = AeZ.LAMBDA.apply(v1022);

final Object parse_AeZ5314 = f5315;


final Object i5318;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ5314))) {
final Object f5316 = Fst.LAMBDA.apply(parse_AeZ5314);
final Object f5317 = ShenReassemble.LAMBDA.apply(f5316, Nil.NIL);

i5318 = f5317;
} else {

i5318 = null;

}

final Object result5313 = i5318;

final Object i5319;
if ((boolean)Lang.equals(result5313, null)) {

i5319 = null;
} else {

i5319 = result5313;

}

i5320 = i5319;
} else {

i5320 = result5302;

}

    return i5320;

}
}
