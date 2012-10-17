package shen.gen;



import com.mentics.shen.*;

public class ShenApremiseZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<premise>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1559) throws Exception {
return defined(v1559);
}};
public static Object defined(final Object v1559) throws Exception {
final Object f5995 = Fst.LAMBDA.apply(v1559);


final Object i5998;
if ((boolean)(f5995 instanceof Cons)) {
final Object f5996 = Fst.LAMBDA.apply(v1559);


final Object i5997;
if ((boolean)Lang.equals(RuntimeContext.symbol("!"), ((Cons)f5996).head)) {

i5997 = true;
} else {

i5997 = false;

}
i5998 = i5997;
} else {

i5998 = false;

}
final Object i6004;
if ((boolean)i5998) {
final Object f5999 = Fst.LAMBDA.apply(v1559);

final Object f6000 = Snd.LAMBDA.apply(v1559);
final Object f6001 = ShenReassemble.LAMBDA.apply(((Cons)f5999).tail, f6000);
final Object f6002 = Fst.LAMBDA.apply(f6001);
final Object f6003 = ShenReassemble.LAMBDA.apply(f6002, RuntimeContext.symbol("!"));

i6004 = f6003;
} else {

i6004 = null;

}
final Object result5994 = i6004;

final Object i6035;
if ((boolean)Lang.equals(result5994, null)) {
final Object f6007 = ShenAformulaeZ.LAMBDA.apply(v1559);

final Object parse_AformulaeZ6006 = f6007;


final Object i6024;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaeZ6006))) {
final Object f6008 = Fst.LAMBDA.apply(parse_AformulaeZ6006);


final Object i6011;
if ((boolean)(f6008 instanceof Cons)) {
final Object f6009 = Fst.LAMBDA.apply(parse_AformulaeZ6006);


final Object i6010;
if ((boolean)Lang.equals(RuntimeContext.symbol(">>"), ((Cons)f6009).head)) {

i6010 = true;
} else {

i6010 = false;

}
i6011 = i6010;
} else {

i6011 = false;

}
final Object i6023;
if ((boolean)i6011) {
final Object f6013 = Fst.LAMBDA.apply(parse_AformulaeZ6006);

final Object f6014 = Snd.LAMBDA.apply(parse_AformulaeZ6006);
final Object f6015 = ShenReassemble.LAMBDA.apply(((Cons)f6013).tail, f6014);
final Object f6016 = ShenAformulaZ.LAMBDA.apply(f6015);

final Object parse_AformulaZ6012 = f6016;


final Object i6022;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaZ6012))) {
final Object f6017 = Fst.LAMBDA.apply(parse_AformulaZ6012);
final Object f6018 = Snd.LAMBDA.apply(parse_AformulaeZ6006);
final Object f6019 = Snd.LAMBDA.apply(parse_AformulaZ6012);
final Object f6020 = Atp.LAMBDA.apply(f6018, f6019);
final Object f6021 = ShenReassemble.LAMBDA.apply(f6017, f6020);

i6022 = f6021;
} else {

i6022 = null;

}

i6023 = i6022;
} else {

i6023 = null;

}
i6024 = i6023;
} else {

i6024 = null;

}

final Object result6005 = i6024;

final Object i6034;
if ((boolean)Lang.equals(result6005, null)) {
final Object f6027 = ShenAformulaZ.LAMBDA.apply(v1559);

final Object parse_AformulaZ6026 = f6027;


final Object i6032;
if ((boolean)!((boolean)Lang.equals(null, parse_AformulaZ6026))) {
final Object f6028 = Fst.LAMBDA.apply(parse_AformulaZ6026);
final Object f6029 = Snd.LAMBDA.apply(parse_AformulaZ6026);
final Object f6030 = Atp.LAMBDA.apply(Nil.NIL, f6029);
final Object f6031 = ShenReassemble.LAMBDA.apply(f6028, f6030);

i6032 = f6031;
} else {

i6032 = null;

}

final Object result6025 = i6032;

final Object i6033;
if ((boolean)Lang.equals(result6025, null)) {

i6033 = null;
} else {

i6033 = result6025;

}

i6034 = i6033;
} else {

i6034 = result6005;

}

i6035 = i6034;
} else {

i6035 = result5994;

}

    return i6035;

}
}
