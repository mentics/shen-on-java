package shen.gen;



import com.mentics.shen.*;

public class ShenAconclusionZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<conclusion>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1560) throws Exception {
return defined(v1560);
}};
public static Object defined(final Object v1560) throws Exception {
final Object f6038 = ShenAformulaeZ.LAMBDA.apply(v1560);

final Object parse_AformulaeZ6037 = f6038;


final Object i6058;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaeZ6037))) {
final Object f6039 = Fst.LAMBDA.apply(parse_AformulaeZ6037);


final Object i6042;
if ((boolean)(f6039 instanceof Cons)) {
final Object f6040 = Fst.LAMBDA.apply(parse_AformulaeZ6037);


final Object i6041;
if ((boolean)Lang.equals(RuntimeContext.symbol(">>"), ((Cons)f6040).head)) {

i6041 = true;
} else {

i6041 = false;

}
i6042 = i6041;
} else {

i6042 = false;

}
final Object i6057;
if ((boolean)i6042) {
final Object f6044 = Fst.LAMBDA.apply(parse_AformulaeZ6037);

final Object f6045 = Snd.LAMBDA.apply(parse_AformulaeZ6037);
final Object f6046 = ShenReassemble.LAMBDA.apply(((Cons)f6044).tail, f6045);
final Object f6047 = ShenAformulaZ.LAMBDA.apply(f6046);

final Object parse_AformulaZ6043 = f6047;


final Object i6056;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaZ6043))) {
final Object f6049 = ShenAsemicolonSymbolZ.LAMBDA.apply(parse_AformulaZ6043);

final Object parse_AsemicolonSymbolZ6048 = f6049;


final Object i6055;
if ((boolean)!((boolean)Lang.equals(null, parse_AsemicolonSymbolZ6048))) {
final Object f6050 = Fst.LAMBDA.apply(parse_AsemicolonSymbolZ6048);
final Object f6051 = Snd.LAMBDA.apply(parse_AformulaeZ6037);
final Object f6052 = Snd.LAMBDA.apply(parse_AformulaZ6043);
final Object f6053 = Atp.LAMBDA.apply(f6051, f6052);
final Object f6054 = ShenReassemble.LAMBDA.apply(f6050, f6053);

i6055 = f6054;
} else {

i6055 = null;

}

i6056 = i6055;
} else {

i6056 = null;

}

i6057 = i6056;
} else {

i6057 = null;

}
i6058 = i6057;
} else {

i6058 = null;

}

final Object result6036 = i6058;

final Object i6071;
if ((boolean)Lang.equals(result6036, null)) {
final Object f6061 = ShenAformulaZ.LAMBDA.apply(v1560);

final Object parse_AformulaZ6060 = f6061;


final Object i6069;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaZ6060))) {
final Object f6063 = ShenAsemicolonSymbolZ.LAMBDA.apply(parse_AformulaZ6060);

final Object parse_AsemicolonSymbolZ6062 = f6063;


final Object i6068;
if ((boolean)!((boolean)Lang.equals(null, parse_AsemicolonSymbolZ6062))) {
final Object f6064 = Fst.LAMBDA.apply(parse_AsemicolonSymbolZ6062);
final Object f6065 = Snd.LAMBDA.apply(parse_AformulaZ6060);
final Object f6066 = Atp.LAMBDA.apply(Nil.NIL, f6065);
final Object f6067 = ShenReassemble.LAMBDA.apply(f6064, f6066);

i6068 = f6067;
} else {

i6068 = null;

}

i6069 = i6068;
} else {

i6069 = null;

}

final Object result6059 = i6069;

final Object i6070;
if ((boolean)Lang.equals(result6059, null)) {

i6070 = null;
} else {

i6070 = result6059;

}

i6071 = i6070;
} else {

i6071 = result6036;

}

    return i6071;

}
}
