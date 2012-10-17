package shen.gen;



import com.mentics.shen.*;

public class ShenAmacroactionZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<macroaction>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v546) throws Exception {
return defined(v546);
}};
public static Object defined(final Object v546) throws Exception {
final Object f4506 = ShenAactionZ.LAMBDA.apply(v546);

final Object parse_AactionZ4505 = f4506;


final Object i4510;
if ((boolean)!((boolean)Lang.equals(null, parse_AactionZ4505))) {
final Object f4507 = Fst.LAMBDA.apply(parse_AactionZ4505);






final Object f4508 = Snd.LAMBDA.apply(parse_AactionZ4505);






final Object f4509 = ShenReassemble.LAMBDA.apply(f4507, new Cons(new Cons(RuntimeContext.symbol("shen-walk"), new Cons(new Cons(RuntimeContext.symbol("function"), new Cons(RuntimeContext.symbol("macroexpand"), Nil.NIL)), new Cons(f4508, Nil.NIL))), Nil.NIL));

i4510 = f4509;
} else {

i4510 = null;

}

final Object result4504 = i4510;

final Object i4511;
if ((boolean)Lang.equals(result4504, null)) {

i4511 = null;
} else {

i4511 = result4504;

}

    return i4511;

}
}
