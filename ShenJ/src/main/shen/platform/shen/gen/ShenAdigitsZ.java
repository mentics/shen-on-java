package shen.gen;



import com.mentics.shen.*;

public class ShenAdigitsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<digits>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1033) throws Exception {
return defined(v1033);
}};
public static Object defined(final Object v1033) throws Exception {
final Object f5530 = ShenAdigitZ.LAMBDA.apply(v1033);

final Object parse_AdigitZ5529 = f5530;


final Object i5538;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitZ5529))) {
final Object f5532 = ShenAdigitsZ.LAMBDA.apply(parse_AdigitZ5529);

final Object parse_AdigitsZ5531 = f5532;


final Object i5537;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5531))) {
final Object f5533 = Fst.LAMBDA.apply(parse_AdigitsZ5531);
final Object f5534 = Snd.LAMBDA.apply(parse_AdigitZ5529);

final Object f5535 = Snd.LAMBDA.apply(parse_AdigitsZ5531);

final Object f5536 = ShenReassemble.LAMBDA.apply(f5533, new Cons(f5534, f5535));

i5537 = f5536;
} else {

i5537 = null;

}

i5538 = i5537;
} else {

i5538 = null;

}

final Object result5528 = i5538;

final Object i5547;
if ((boolean)Lang.equals(result5528, null)) {
final Object f5541 = ShenAdigitZ.LAMBDA.apply(v1033);

final Object parse_AdigitZ5540 = f5541;


final Object i5545;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitZ5540))) {
final Object f5542 = Fst.LAMBDA.apply(parse_AdigitZ5540);
final Object f5543 = Snd.LAMBDA.apply(parse_AdigitZ5540);


final Object f5544 = ShenReassemble.LAMBDA.apply(f5542, new Cons(f5543, Nil.NIL));

i5545 = f5544;
} else {

i5545 = null;

}

final Object result5539 = i5545;

final Object i5546;
if ((boolean)Lang.equals(result5539, null)) {

i5546 = null;
} else {

i5546 = result5539;

}

i5547 = i5546;
} else {

i5547 = result5528;

}

    return i5547;

}
}
