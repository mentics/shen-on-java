package shen.gen;



import com.mentics.shen.*;

public class ShenAanyZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<any>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1052) throws Exception {
return defined(v1052);
}};
public static Object defined(final Object v1052) throws Exception {
final Object f5639 = ShenAcommentZ.LAMBDA.apply(v1052);

final Object parse_AcommentZ5638 = f5639;


final Object i5645;
if ((boolean)!((boolean)Lang.equals(null, parse_AcommentZ5638))) {
final Object f5641 = ShenAanyZ.LAMBDA.apply(parse_AcommentZ5638);

final Object parse_AanyZ5640 = f5641;


final Object i5644;
if ((boolean)!((boolean)Lang.equals(null, parse_AanyZ5640))) {
final Object f5642 = Fst.LAMBDA.apply(parse_AanyZ5640);
final Object f5643 = ShenReassemble.LAMBDA.apply(f5642, RuntimeContext.symbol("shen-skip"));

i5644 = f5643;
} else {

i5644 = null;

}

i5645 = i5644;
} else {

i5645 = null;

}

final Object result5637 = i5645;

final Object i5663;
if ((boolean)Lang.equals(result5637, null)) {
final Object f5648 = ShenAblahZ.LAMBDA.apply(v1052);

final Object parse_AblahZ5647 = f5648;


final Object i5654;
if ((boolean)!((boolean)Lang.equals(null, parse_AblahZ5647))) {
final Object f5650 = ShenAanyZ.LAMBDA.apply(parse_AblahZ5647);

final Object parse_AanyZ5649 = f5650;


final Object i5653;
if ((boolean)!((boolean)Lang.equals(null, parse_AanyZ5649))) {
final Object f5651 = Fst.LAMBDA.apply(parse_AanyZ5649);
final Object f5652 = ShenReassemble.LAMBDA.apply(f5651, RuntimeContext.symbol("shen-skip"));

i5653 = f5652;
} else {

i5653 = null;

}

i5654 = i5653;
} else {

i5654 = null;

}

final Object result5646 = i5654;

final Object i5662;
if ((boolean)Lang.equals(result5646, null)) {
final Object f5657 = AeZ.LAMBDA.apply(v1052);

final Object parse_AeZ5656 = f5657;


final Object i5660;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ5656))) {
final Object f5658 = Fst.LAMBDA.apply(parse_AeZ5656);
final Object f5659 = ShenReassemble.LAMBDA.apply(f5658, RuntimeContext.symbol("shen-skip"));

i5660 = f5659;
} else {

i5660 = null;

}

final Object result5655 = i5660;

final Object i5661;
if ((boolean)Lang.equals(result5655, null)) {

i5661 = null;
} else {

i5661 = result5655;

}

i5662 = i5661;
} else {

i5662 = result5646;

}

i5663 = i5662;
} else {

i5663 = result5637;

}

    return i5663;

}
}
