package shen.gen;



import com.mentics.shen.*;

public class ShenAdefprologZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<defprolog>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1168) throws Exception {
return defined(v1168);
}};
public static Object defined(final Object v1168) throws Exception {
final Object f2506 = ShenApredicateStarZ.LAMBDA.apply(v1168);

final Object parse_ApredicateStarZ2505 = f2506;


final Object i2518;
if ((boolean)!((boolean)Lang.equals(null, parse_ApredicateStarZ2505))) {
final Object f2508 = ShenAclausesStarZ.LAMBDA.apply(parse_ApredicateStarZ2505);

final Object parse_AclausesStarZ2507 = f2508;


final Object i2517;
if ((boolean)!((boolean)Lang.equals(null, parse_AclausesStarZ2507))) {
final Object f2509 = Fst.LAMBDA.apply(parse_AclausesStarZ2507);
final Lambda l2512 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f2510 = Snd.LAMBDA.apply(parse_ApredicateStarZ2505);
final Object f2511 = ShenInsertPredicate.LAMBDA.apply(f2510, x);

    return f2511;
  }
};final Object f2513 = Snd.LAMBDA.apply(parse_AclausesStarZ2507);
final Object f2514 = Map.LAMBDA.apply(l2512, f2513);
final Object f2515 = ShenPrologToShen.LAMBDA.apply(f2514);

final Object f2516 = ShenReassemble.LAMBDA.apply(f2509, ((Cons)f2515).head);

i2517 = f2516;
} else {

i2517 = null;

}

i2518 = i2517;
} else {

i2518 = null;

}

final Object result2504 = i2518;

final Object i2519;
if ((boolean)Lang.equals(result2504, null)) {

i2519 = null;
} else {

i2519 = result2504;

}

    return i2519;

}
}
