package shen.gen;



import com.mentics.shen.*;

public class ShenAdefmacroZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<defmacro>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v543) throws Exception {
return defined(v543);
}};
public static Object defined(final Object v543) throws Exception {
final Object f4362 = ShenAnameZ.LAMBDA.apply(v543);

final Object parse_AnameZ4361 = f4362;


final Object i4370;
if ((boolean)!((boolean)Lang.equals(null, parse_AnameZ4361))) {
final Object f4364 = ShenAmacrorulesZ.LAMBDA.apply(parse_AnameZ4361);

final Object parse_AmacrorulesZ4363 = f4364;


final Object i4369;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacrorulesZ4363))) {
final Object f4365 = Fst.LAMBDA.apply(parse_AmacrorulesZ4363);

final Object f4366 = Snd.LAMBDA.apply(parse_AnameZ4361);

final Object f4367 = Snd.LAMBDA.apply(parse_AmacrorulesZ4363);


final Object f4368 = ShenReassemble.LAMBDA.apply(f4365, new Cons(RuntimeContext.symbol("define"), new Cons(f4366, f4367)));

i4369 = f4368;
} else {

i4369 = null;

}

i4370 = i4369;
} else {

i4370 = null;

}

final Object result4360 = i4370;

final Object i4371;
if ((boolean)Lang.equals(result4360, null)) {

i4371 = null;
} else {

i4371 = result4360;

}

    return i4371;

}
}
