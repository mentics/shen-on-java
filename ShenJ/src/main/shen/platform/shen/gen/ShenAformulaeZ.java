package shen.gen;



import com.mentics.shen.*;

public class ShenAformulaeZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<formulae>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1561) throws Exception {
return defined(v1561);
}};
public static Object defined(final Object v1561) throws Exception {
final Object f6074 = ShenAformulaZ.LAMBDA.apply(v1561);

final Object parse_AformulaZ6073 = f6074;


final Object i6090;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaZ6073))) {
final Object f6075 = Fst.LAMBDA.apply(parse_AformulaZ6073);


final Object i6078;
if ((boolean)(f6075 instanceof Cons)) {
final Object f6076 = Fst.LAMBDA.apply(parse_AformulaZ6073);


final Object i6077;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-"), ((Cons)f6076).head)) {

i6077 = true;
} else {

i6077 = false;

}
i6078 = i6077;
} else {

i6078 = false;

}
final Object i6089;
if ((boolean)i6078) {
final Object f6080 = Fst.LAMBDA.apply(parse_AformulaZ6073);

final Object f6081 = Snd.LAMBDA.apply(parse_AformulaZ6073);
final Object f6082 = ShenReassemble.LAMBDA.apply(((Cons)f6080).tail, f6081);
final Object f6083 = ShenAformulaeZ.LAMBDA.apply(f6082);

final Object parse_AformulaeZ6079 = f6083;


final Object i6088;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaeZ6079))) {
final Object f6084 = Fst.LAMBDA.apply(parse_AformulaeZ6079);
final Object f6085 = Snd.LAMBDA.apply(parse_AformulaZ6073);

final Object f6086 = Snd.LAMBDA.apply(parse_AformulaeZ6079);

final Object f6087 = ShenReassemble.LAMBDA.apply(f6084, new Cons(f6085, f6086));

i6088 = f6087;
} else {

i6088 = null;

}

i6089 = i6088;
} else {

i6089 = null;

}
i6090 = i6089;
} else {

i6090 = null;

}

final Object result6072 = i6090;

final Object i6106;
if ((boolean)Lang.equals(result6072, null)) {
final Object f6093 = ShenAformulaZ.LAMBDA.apply(v1561);

final Object parse_AformulaZ6092 = f6093;


final Object i6097;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaZ6092))) {
final Object f6094 = Fst.LAMBDA.apply(parse_AformulaZ6092);
final Object f6095 = Snd.LAMBDA.apply(parse_AformulaZ6092);


final Object f6096 = ShenReassemble.LAMBDA.apply(f6094, new Cons(f6095, Nil.NIL));

i6097 = f6096;
} else {

i6097 = null;

}

final Object result6091 = i6097;

final Object i6105;
if ((boolean)Lang.equals(result6091, null)) {
final Object f6100 = AeZ.LAMBDA.apply(v1561);

final Object parse_AeZ6099 = f6100;


final Object i6103;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ6099))) {
final Object f6101 = Fst.LAMBDA.apply(parse_AeZ6099);
final Object f6102 = ShenReassemble.LAMBDA.apply(f6101, Nil.NIL);

i6103 = f6102;
} else {

i6103 = null;

}

final Object result6098 = i6103;

final Object i6104;
if ((boolean)Lang.equals(result6098, null)) {

i6104 = null;
} else {

i6104 = result6098;

}

i6105 = i6104;
} else {

i6105 = result6091;

}

i6106 = i6105;
} else {

i6106 = result6072;

}

    return i6106;

}
}
