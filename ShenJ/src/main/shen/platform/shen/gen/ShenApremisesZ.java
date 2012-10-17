package shen.gen;



import com.mentics.shen.*;

public class ShenApremisesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<premises>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1557) throws Exception {
return defined(v1557);
}};
public static Object defined(final Object v1557) throws Exception {
final Object f5963 = ShenApremiseZ.LAMBDA.apply(v1557);

final Object parse_ApremiseZ5962 = f5963;


final Object i5974;
if ((boolean)!((boolean)Lang.equals(null, parse_ApremiseZ5962))) {
final Object f5965 = ShenAsemicolonSymbolZ.LAMBDA.apply(parse_ApremiseZ5962);

final Object parse_AsemicolonSymbolZ5964 = f5965;


final Object i5973;
if ((boolean)!((boolean)Lang.equals(null, parse_AsemicolonSymbolZ5964))) {
final Object f5967 = ShenApremisesZ.LAMBDA.apply(parse_AsemicolonSymbolZ5964);

final Object parse_ApremisesZ5966 = f5967;


final Object i5972;
if ((boolean)!((boolean)Lang.equals(null, parse_ApremisesZ5966))) {
final Object f5968 = Fst.LAMBDA.apply(parse_ApremisesZ5966);
final Object f5969 = Snd.LAMBDA.apply(parse_ApremiseZ5962);

final Object f5970 = Snd.LAMBDA.apply(parse_ApremisesZ5966);

final Object f5971 = ShenReassemble.LAMBDA.apply(f5968, new Cons(f5969, f5970));

i5972 = f5971;
} else {

i5972 = null;

}

i5973 = i5972;
} else {

i5973 = null;

}

i5974 = i5973;
} else {

i5974 = null;

}

final Object result5961 = i5974;

final Object i5982;
if ((boolean)Lang.equals(result5961, null)) {
final Object f5977 = AeZ.LAMBDA.apply(v1557);

final Object parse_AeZ5976 = f5977;


final Object i5980;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ5976))) {
final Object f5978 = Fst.LAMBDA.apply(parse_AeZ5976);
final Object f5979 = ShenReassemble.LAMBDA.apply(f5978, Nil.NIL);

i5980 = f5979;
} else {

i5980 = null;

}

final Object result5975 = i5980;

final Object i5981;
if ((boolean)Lang.equals(result5975, null)) {

i5981 = null;
} else {

i5981 = result5975;

}

i5982 = i5981;
} else {

i5982 = result5961;

}

    return i5982;

}
}
