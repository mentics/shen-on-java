package shen.gen;



import com.mentics.shen.*;

public class ShenAdatatypeRulesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<datatype-rules>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1550) throws Exception {
return defined(v1550);
}};
public static Object defined(final Object v1550) throws Exception {
final Object f5801 = ShenAdatatypeRuleZ.LAMBDA.apply(v1550);

final Object parse_AdatatypeRuleZ5800 = f5801;


final Object i5809;
if ((boolean)!((boolean)Lang.equals(null, parse_AdatatypeRuleZ5800))) {
final Object f5803 = ShenAdatatypeRulesZ.LAMBDA.apply(parse_AdatatypeRuleZ5800);

final Object parse_AdatatypeRulesZ5802 = f5803;


final Object i5808;
if ((boolean)!((boolean)Lang.equals(null, parse_AdatatypeRulesZ5802))) {
final Object f5804 = Fst.LAMBDA.apply(parse_AdatatypeRulesZ5802);
final Object f5805 = Snd.LAMBDA.apply(parse_AdatatypeRuleZ5800);

final Object f5806 = Snd.LAMBDA.apply(parse_AdatatypeRulesZ5802);

final Object f5807 = ShenReassemble.LAMBDA.apply(f5804, new Cons(f5805, f5806));

i5808 = f5807;
} else {

i5808 = null;

}

i5809 = i5808;
} else {

i5809 = null;

}

final Object result5799 = i5809;

final Object i5817;
if ((boolean)Lang.equals(result5799, null)) {
final Object f5812 = AeZ.LAMBDA.apply(v1550);

final Object parse_AeZ5811 = f5812;


final Object i5815;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ5811))) {
final Object f5813 = Fst.LAMBDA.apply(parse_AeZ5811);
final Object f5814 = ShenReassemble.LAMBDA.apply(f5813, Nil.NIL);

i5815 = f5814;
} else {

i5815 = null;

}

final Object result5810 = i5815;

final Object i5816;
if ((boolean)Lang.equals(result5810, null)) {

i5816 = null;
} else {

i5816 = result5810;

}

i5817 = i5816;
} else {

i5817 = result5799;

}

    return i5817;

}
}
