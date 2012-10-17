package shen.gen;



import com.mentics.shen.*;

public class ShenArulesZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<rules>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v394) throws Exception {
return defined(v394);
}};
public static Object defined(final Object v394) throws Exception {
final Object f1405 = ShenAruleZ.LAMBDA.apply(v394);

final Object parse_AruleZ1404 = f1405;


final Object i1413;
if ((boolean)!((boolean)Lang.equals(null, parse_AruleZ1404))) {
final Object f1407 = ShenArulesZ.LAMBDA.apply(parse_AruleZ1404);

final Object parse_ArulesZ1406 = f1407;


final Object i1412;
if ((boolean)!((boolean)Lang.equals(null, parse_ArulesZ1406))) {
final Object f1408 = Fst.LAMBDA.apply(parse_ArulesZ1406);
final Object f1409 = Snd.LAMBDA.apply(parse_AruleZ1404);

final Object f1410 = Snd.LAMBDA.apply(parse_ArulesZ1406);

final Object f1411 = ShenReassemble.LAMBDA.apply(f1408, new Cons(f1409, f1410));

i1412 = f1411;
} else {

i1412 = null;

}

i1413 = i1412;
} else {

i1413 = null;

}

final Object result1403 = i1413;

final Object i1422;
if ((boolean)Lang.equals(result1403, null)) {
final Object f1416 = ShenAruleZ.LAMBDA.apply(v394);

final Object parse_AruleZ1415 = f1416;


final Object i1420;
if ((boolean)!((boolean)Lang.equals(null, parse_AruleZ1415))) {
final Object f1417 = Fst.LAMBDA.apply(parse_AruleZ1415);
final Object f1418 = Snd.LAMBDA.apply(parse_AruleZ1415);


final Object f1419 = ShenReassemble.LAMBDA.apply(f1417, new Cons(f1418, Nil.NIL));

i1420 = f1419;
} else {

i1420 = null;

}

final Object result1414 = i1420;

final Object i1421;
if ((boolean)Lang.equals(result1414, null)) {

i1421 = null;
} else {

i1421 = result1414;

}

i1422 = i1421;
} else {

i1422 = result1403;

}

    return i1422;

}
}
