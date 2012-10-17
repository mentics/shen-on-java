package shen.gen;



import com.mentics.shen.*;

public class ShenAsymZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<sym>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1009) throws Exception {
return defined(v1009);
}};
public static Object defined(final Object v1009) throws Exception {
final Object f5186 = ShenAalphaZ.LAMBDA.apply(v1009);

final Object parse_AalphaZ5185 = f5186;


final Object i5194;
if ((boolean)!((boolean)Lang.equals(null, parse_AalphaZ5185))) {
final Object f5188 = ShenAsymcharsZ.LAMBDA.apply(parse_AalphaZ5185);

final Object parse_AsymcharsZ5187 = f5188;


final Object i5193;
if ((boolean)!((boolean)Lang.equals(null, parse_AsymcharsZ5187))) {
final Object f5189 = Fst.LAMBDA.apply(parse_AsymcharsZ5187);
final Object f5190 = Snd.LAMBDA.apply(parse_AalphaZ5185);

final Object f5191 = Snd.LAMBDA.apply(parse_AsymcharsZ5187);


final Object f5192 = ShenReassemble.LAMBDA.apply(f5189, RuntimeContext.symbol((String)((String)f5190 + (String)f5191)));

i5193 = f5192;
} else {

i5193 = null;

}

i5194 = i5193;
} else {

i5194 = null;

}

final Object result5184 = i5194;

final Object i5203;
if ((boolean)Lang.equals(result5184, null)) {
final Object f5197 = ShenAalphaZ.LAMBDA.apply(v1009);

final Object parse_AalphaZ5196 = f5197;


final Object i5201;
if ((boolean)!((boolean)Lang.equals(null, parse_AalphaZ5196))) {
final Object f5198 = Fst.LAMBDA.apply(parse_AalphaZ5196);
final Object f5199 = Snd.LAMBDA.apply(parse_AalphaZ5196);

final Object f5200 = ShenReassemble.LAMBDA.apply(f5198, RuntimeContext.symbol((String)f5199));

i5201 = f5200;
} else {

i5201 = null;

}

final Object result5195 = i5201;

final Object i5202;
if ((boolean)Lang.equals(result5195, null)) {

i5202 = null;
} else {

i5202 = result5195;

}

i5203 = i5202;
} else {

i5203 = result5184;

}

    return i5203;

}
}
