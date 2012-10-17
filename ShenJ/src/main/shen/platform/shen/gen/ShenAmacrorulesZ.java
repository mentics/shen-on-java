package shen.gen;



import com.mentics.shen.*;

public class ShenAmacrorulesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<macrorules>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v544) throws Exception {
return defined(v544);
}};
public static Object defined(final Object v544) throws Exception {
final Object f4374 = ShenAmacroruleZ.LAMBDA.apply(v544);

final Object parse_AmacroruleZ4373 = f4374;


final Object i4383;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacroruleZ4373))) {
final Object f4376 = ShenAmacrorulesZ.LAMBDA.apply(parse_AmacroruleZ4373);

final Object parse_AmacrorulesZ4375 = f4376;


final Object i4382;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacrorulesZ4375))) {
final Object f4377 = Fst.LAMBDA.apply(parse_AmacrorulesZ4375);
final Object f4378 = Snd.LAMBDA.apply(parse_AmacroruleZ4373);
final Object f4379 = Snd.LAMBDA.apply(parse_AmacrorulesZ4375);
final Object f4380 = Append.LAMBDA.apply(f4378, f4379);
final Object f4381 = ShenReassemble.LAMBDA.apply(f4377, f4380);

i4382 = f4381;
} else {

i4382 = null;

}

i4383 = i4382;
} else {

i4383 = null;

}

final Object result4372 = i4383;

final Object i4393;
if ((boolean)Lang.equals(result4372, null)) {
final Object f4386 = ShenAmacroruleZ.LAMBDA.apply(v544);

final Object parse_AmacroruleZ4385 = f4386;


final Object i4391;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacroruleZ4385))) {
final Object f4387 = Fst.LAMBDA.apply(parse_AmacroruleZ4385);
final Object f4388 = Snd.LAMBDA.apply(parse_AmacroruleZ4385);






final Object f4389 = Append.LAMBDA.apply(f4388, new Cons(RuntimeContext.symbol("X"), new Cons(RuntimeContext.symbol("->"), new Cons(RuntimeContext.symbol("X"), Nil.NIL))));
final Object f4390 = ShenReassemble.LAMBDA.apply(f4387, f4389);

i4391 = f4390;
} else {

i4391 = null;

}

final Object result4384 = i4391;

final Object i4392;
if ((boolean)Lang.equals(result4384, null)) {

i4392 = null;
} else {

i4392 = result4384;

}

i4393 = i4392;
} else {

i4393 = result4372;

}

    return i4393;

}
}
