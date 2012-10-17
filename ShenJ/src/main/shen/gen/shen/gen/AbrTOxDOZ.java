package shen.gen;



import com.mentics.shen.*;

public class AbrTOxDOZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("<br$>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v974) throws Exception {
return defined(v974);
}};
public static Object defined(final Object v974) throws Exception {
final Object f977 = AbrZ.LAMBDA.apply(v974);

final Object parse_AbrZ976 = f977;


final Object i980;
if ((boolean)!((boolean)Lang.equals(null, parse_AbrZ976))) {
final Object f978 = Fst.LAMBDA.apply(parse_AbrZ976);
final Object f979 = ShenReassemble.LAMBDA.apply(f978, RuntimeContext.symbol("ok"));

i980 = f979;
} else {

i980 = null;

}

final Object result975 = i980;

final Object i981;
if ((boolean)Lang.equals(result975, null)) {

i981 = null;
} else {

i981 = result975;

}

    return i981;

}
}
