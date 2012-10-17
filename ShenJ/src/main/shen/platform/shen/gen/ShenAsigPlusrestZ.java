package shen.gen;



import com.mentics.shen.*;

public class ShenAsigPlusrestZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<sig+rest>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1678) throws Exception {
return defined(v1678);
}};
public static Object defined(final Object v1678) throws Exception {
final Object f4272 = ShenAsignatureZ.LAMBDA.apply(v1678);

final Object parse_AsignatureZ4271 = f4272;


final Object i4279;
if ((boolean)!((boolean)Lang.equals(null, parse_AsignatureZ4271))) {
final Object f4274 = ShenAanyZ.LAMBDA.apply(parse_AsignatureZ4271);

final Object parse_AanyZ4273 = f4274;


final Object i4278;
if ((boolean)!((boolean)Lang.equals(null, parse_AanyZ4273))) {
final Object f4275 = Fst.LAMBDA.apply(parse_AanyZ4273);
final Object f4276 = Snd.LAMBDA.apply(parse_AsignatureZ4271);
final Object f4277 = ShenReassemble.LAMBDA.apply(f4275, f4276);

i4278 = f4277;
} else {

i4278 = null;

}

i4279 = i4278;
} else {

i4279 = null;

}

final Object result4270 = i4279;

final Object i4280;
if ((boolean)Lang.equals(result4270, null)) {

i4280 = null;
} else {

i4280 = result4270;

}

    return i4280;

}
}
