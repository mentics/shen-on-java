package shen.gen;



import com.mentics.shen.*;

public class ShenAsymcharsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<symchars>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1010) throws Exception {
return defined(v1010);
}};
public static Object defined(final Object v1010) throws Exception {
final Object f5206 = ShenAsymcharZ.LAMBDA.apply(v1010);

final Object parse_AsymcharZ5205 = f5206;


final Object i5214;
if ((boolean)!((boolean)Lang.equals(null, parse_AsymcharZ5205))) {
final Object f5208 = ShenAsymcharsZ.LAMBDA.apply(parse_AsymcharZ5205);

final Object parse_AsymcharsZ5207 = f5208;


final Object i5213;
if ((boolean)!((boolean)Lang.equals(null, parse_AsymcharsZ5207))) {
final Object f5209 = Fst.LAMBDA.apply(parse_AsymcharsZ5207);
final Object f5210 = Snd.LAMBDA.apply(parse_AsymcharZ5205);

final Object f5211 = Snd.LAMBDA.apply(parse_AsymcharsZ5207);

final Object f5212 = ShenReassemble.LAMBDA.apply(f5209, ((String)f5210 + (String)f5211));

i5213 = f5212;
} else {

i5213 = null;

}

i5214 = i5213;
} else {

i5214 = null;

}

final Object result5204 = i5214;

final Object i5223;
if ((boolean)Lang.equals(result5204, null)) {
final Object f5217 = ShenAsymcharZ.LAMBDA.apply(v1010);

final Object parse_AsymcharZ5216 = f5217;


final Object i5221;
if ((boolean)!((boolean)Lang.equals(null, parse_AsymcharZ5216))) {
final Object f5218 = Fst.LAMBDA.apply(parse_AsymcharZ5216);
final Object f5219 = Snd.LAMBDA.apply(parse_AsymcharZ5216);
final Object f5220 = ShenReassemble.LAMBDA.apply(f5218, f5219);

i5221 = f5220;
} else {

i5221 = null;

}

final Object result5215 = i5221;

final Object i5222;
if ((boolean)Lang.equals(result5215, null)) {

i5222 = null;
} else {

i5222 = result5215;

}

i5223 = i5222;
} else {

i5223 = result5204;

}

    return i5223;

}
}
