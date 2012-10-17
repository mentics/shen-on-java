package shen.gen;



import com.mentics.shen.*;

public class ShenApatternsZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<patterns>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v403) throws Exception {
return defined(v403);
}};
public static Object defined(final Object v403) throws Exception {
final Object f1533 = ShenApatternZ.LAMBDA.apply(v403);

final Object parse_ApatternZ1532 = f1533;


final Object i1541;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternZ1532))) {
final Object f1535 = ShenApatternsZ.LAMBDA.apply(parse_ApatternZ1532);

final Object parse_ApatternsZ1534 = f1535;


final Object i1540;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ1534))) {
final Object f1536 = Fst.LAMBDA.apply(parse_ApatternsZ1534);
final Object f1537 = Snd.LAMBDA.apply(parse_ApatternZ1532);

final Object f1538 = Snd.LAMBDA.apply(parse_ApatternsZ1534);

final Object f1539 = ShenReassemble.LAMBDA.apply(f1536, new Cons(f1537, f1538));

i1540 = f1539;
} else {

i1540 = null;

}

i1541 = i1540;
} else {

i1541 = null;

}

final Object result1531 = i1541;

final Object i1549;
if ((boolean)Lang.equals(result1531, null)) {
final Object f1544 = AeZ.LAMBDA.apply(v403);

final Object parse_AeZ1543 = f1544;


final Object i1547;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ1543))) {
final Object f1545 = Fst.LAMBDA.apply(parse_AeZ1543);
final Object f1546 = ShenReassemble.LAMBDA.apply(f1545, Nil.NIL);

i1547 = f1546;
} else {

i1547 = null;

}

final Object result1542 = i1547;

final Object i1548;
if ((boolean)Lang.equals(result1542, null)) {

i1548 = null;
} else {

i1548 = result1542;

}

i1549 = i1548;
} else {

i1549 = result1531;

}

    return i1549;

}
}
