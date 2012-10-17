package shen.gen;



import com.mentics.shen.*;

public class ShenAformulaZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<formula>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1562) throws Exception {
return defined(v1562);
}};
public static Object defined(final Object v1562) throws Exception {
final Object f6109 = ShenAexprZ.LAMBDA.apply(v1562);

final Object parse_AexprZ6108 = f6109;


final Object i6127;
if ((boolean)!((boolean)Lang.equals(null, parse_AexprZ6108))) {
final Object f6110 = Fst.LAMBDA.apply(parse_AexprZ6108);


final Object i6113;
if ((boolean)(f6110 instanceof Cons)) {
final Object f6111 = Fst.LAMBDA.apply(parse_AexprZ6108);


final Object i6112;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), ((Cons)f6111).head)) {

i6112 = true;
} else {

i6112 = false;

}
i6113 = i6112;
} else {

i6113 = false;

}
final Object i6126;
if ((boolean)i6113) {
final Object f6115 = Fst.LAMBDA.apply(parse_AexprZ6108);

final Object f6116 = Snd.LAMBDA.apply(parse_AexprZ6108);
final Object f6117 = ShenReassemble.LAMBDA.apply(((Cons)f6115).tail, f6116);
final Object f6118 = ShenAtypeZ.LAMBDA.apply(f6117);

final Object parse_AtypeZ6114 = f6118;


final Object i6125;
if ((boolean)!((boolean)Lang.equals(null, parse_AtypeZ6114))) {
final Object f6119 = Fst.LAMBDA.apply(parse_AtypeZ6114);
final Object f6120 = Snd.LAMBDA.apply(parse_AexprZ6108);
final Object f6121 = ShenCurry.LAMBDA.apply(f6120);


final Object f6122 = Snd.LAMBDA.apply(parse_AtypeZ6114);
final Object f6123 = ShenNormaliseType.LAMBDA.apply(f6122);




final Object f6124 = ShenReassemble.LAMBDA.apply(f6119, new Cons(f6121, new Cons(RuntimeContext.symbol(":"), new Cons(f6123, Nil.NIL))));

i6125 = f6124;
} else {

i6125 = null;

}

i6126 = i6125;
} else {

i6126 = null;

}
i6127 = i6126;
} else {

i6127 = null;

}

final Object result6107 = i6127;

final Object i6136;
if ((boolean)Lang.equals(result6107, null)) {
final Object f6130 = ShenAexprZ.LAMBDA.apply(v1562);

final Object parse_AexprZ6129 = f6130;


final Object i6134;
if ((boolean)!((boolean)Lang.equals(null, parse_AexprZ6129))) {
final Object f6131 = Fst.LAMBDA.apply(parse_AexprZ6129);
final Object f6132 = Snd.LAMBDA.apply(parse_AexprZ6129);
final Object f6133 = ShenReassemble.LAMBDA.apply(f6131, f6132);

i6134 = f6133;
} else {

i6134 = null;

}

final Object result6128 = i6134;

final Object i6135;
if ((boolean)Lang.equals(result6128, null)) {

i6135 = null;
} else {

i6135 = result6128;

}

i6136 = i6135;
} else {

i6136 = result6107;

}

    return i6136;

}
}
