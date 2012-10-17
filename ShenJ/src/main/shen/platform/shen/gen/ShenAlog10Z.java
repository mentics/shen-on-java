package shen.gen;



import com.mentics.shen.*;

public class ShenAlog10Z {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<log10>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1028) throws Exception {
return defined(v1028);
}};
public static Object defined(final Object v1028) throws Exception {
final Object f5462 = ShenAminusZ.LAMBDA.apply(v1028);

final Object parse_AminusZ5461 = f5462;


final Object i5471;
if ((boolean)!((boolean)Lang.equals(null, parse_AminusZ5461))) {
final Object f5464 = ShenAdigitsZ.LAMBDA.apply(parse_AminusZ5461);

final Object parse_AdigitsZ5463 = f5464;


final Object i5470;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5463))) {
final Object f5465 = Fst.LAMBDA.apply(parse_AdigitsZ5463);

final Object f5466 = Snd.LAMBDA.apply(parse_AdigitsZ5463);
final Object f5467 = Reverse.LAMBDA.apply(f5466);
final Object f5468 = ShenPre.LAMBDA.apply(f5467, 0);

final Object f5469 = ShenReassemble.LAMBDA.apply(f5465, Primitives.minus.apply(0, f5468));

i5470 = f5469;
} else {

i5470 = null;

}

i5471 = i5470;
} else {

i5471 = null;

}

final Object result5460 = i5471;

final Object i5482;
if ((boolean)Lang.equals(result5460, null)) {
final Object f5474 = ShenAdigitsZ.LAMBDA.apply(v1028);

final Object parse_AdigitsZ5473 = f5474;


final Object i5480;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5473))) {
final Object f5475 = Fst.LAMBDA.apply(parse_AdigitsZ5473);
final Object f5476 = Snd.LAMBDA.apply(parse_AdigitsZ5473);
final Object f5477 = Reverse.LAMBDA.apply(f5476);
final Object f5478 = ShenPre.LAMBDA.apply(f5477, 0);
final Object f5479 = ShenReassemble.LAMBDA.apply(f5475, f5478);

i5480 = f5479;
} else {

i5480 = null;

}

final Object result5472 = i5480;

final Object i5481;
if ((boolean)Lang.equals(result5472, null)) {

i5481 = null;
} else {

i5481 = result5472;

}

i5482 = i5481;
} else {

i5482 = result5460;

}

    return i5482;

}
}
