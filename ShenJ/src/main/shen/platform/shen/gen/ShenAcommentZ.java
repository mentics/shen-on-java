package shen.gen;



import com.mentics.shen.*;

public class ShenAcommentZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<comment>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1050) throws Exception {
return defined(v1050);
}};
public static Object defined(final Object v1050) throws Exception {
final Object f5609 = ShenAbackslashZ.LAMBDA.apply(v1050);

final Object parse_AbackslashZ5608 = f5609;


final Object i5624;
if ((boolean)!((boolean)Lang.equals(null, parse_AbackslashZ5608))) {
final Object f5611 = ShenAtimesZ.LAMBDA.apply(parse_AbackslashZ5608);

final Object parse_AtimesZ5610 = f5611;


final Object i5623;
if ((boolean)!((boolean)Lang.equals(null, parse_AtimesZ5610))) {
final Object f5613 = ShenAanyZ.LAMBDA.apply(parse_AtimesZ5610);

final Object parse_AanyZ5612 = f5613;


final Object i5622;
if ((boolean)!((boolean)Lang.equals(null, parse_AanyZ5612))) {
final Object f5615 = ShenAtimesZ.LAMBDA.apply(parse_AanyZ5612);

final Object parse_AtimesZ5614 = f5615;


final Object i5621;
if ((boolean)!((boolean)Lang.equals(null, parse_AtimesZ5614))) {
final Object f5617 = ShenAbackslashZ.LAMBDA.apply(parse_AtimesZ5614);

final Object parse_AbackslashZ5616 = f5617;


final Object i5620;
if ((boolean)!((boolean)Lang.equals(null, parse_AbackslashZ5616))) {
final Object f5618 = Fst.LAMBDA.apply(parse_AbackslashZ5616);
final Object f5619 = ShenReassemble.LAMBDA.apply(f5618, RuntimeContext.symbol("shen-skip"));

i5620 = f5619;
} else {

i5620 = null;

}

i5621 = i5620;
} else {

i5621 = null;

}

i5622 = i5621;
} else {

i5622 = null;

}

i5623 = i5622;
} else {

i5623 = null;

}

i5624 = i5623;
} else {

i5624 = null;

}

final Object result5607 = i5624;

final Object i5625;
if ((boolean)Lang.equals(result5607, null)) {

i5625 = null;
} else {

i5625 = result5607;

}

    return i5625;

}
}
