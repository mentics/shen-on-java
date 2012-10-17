package shen.gen;



import com.mentics.shen.*;

public class ShenApredigitsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<predigits>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1031) throws Exception {
return defined(v1031);
}};
public static Object defined(final Object v1031) throws Exception {
final Object f5507 = ShenAdigitsZ.LAMBDA.apply(v1031);

final Object parse_AdigitsZ5506 = f5507;


final Object i5511;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5506))) {
final Object f5508 = Fst.LAMBDA.apply(parse_AdigitsZ5506);
final Object f5509 = Snd.LAMBDA.apply(parse_AdigitsZ5506);
final Object f5510 = ShenReassemble.LAMBDA.apply(f5508, f5509);

i5511 = f5510;
} else {

i5511 = null;

}

final Object result5505 = i5511;

final Object i5519;
if ((boolean)Lang.equals(result5505, null)) {
final Object f5514 = AeZ.LAMBDA.apply(v1031);

final Object parse_AeZ5513 = f5514;


final Object i5517;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ5513))) {
final Object f5515 = Fst.LAMBDA.apply(parse_AeZ5513);
final Object f5516 = ShenReassemble.LAMBDA.apply(f5515, Nil.NIL);

i5517 = f5516;
} else {

i5517 = null;

}

final Object result5512 = i5517;

final Object i5518;
if ((boolean)Lang.equals(result5512, null)) {

i5518 = null;
} else {

i5518 = result5512;

}

i5519 = i5518;
} else {

i5519 = result5505;

}

    return i5519;

}
}
