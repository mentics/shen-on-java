package shen.gen;



import com.mentics.shen.*;

public class ShenAtypeZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<type>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1564) throws Exception {
return defined(v1564);
}};
public static Object defined(final Object v1564) throws Exception {
final Object f6151 = ShenAexprZ.LAMBDA.apply(v1564);

final Object parse_AexprZ6150 = f6151;


final Object i6156;
if ((boolean)!((boolean)Lang.equals(null, parse_AexprZ6150))) {
final Object f6152 = Fst.LAMBDA.apply(parse_AexprZ6150);
final Object f6153 = Snd.LAMBDA.apply(parse_AexprZ6150);
final Object f6154 = ShenCurryType.LAMBDA.apply(f6153);
final Object f6155 = ShenReassemble.LAMBDA.apply(f6152, f6154);

i6156 = f6155;
} else {

i6156 = null;

}

final Object result6149 = i6156;

final Object i6157;
if ((boolean)Lang.equals(result6149, null)) {

i6157 = null;
} else {

i6157 = result6149;

}

    return i6157;

}
}
