package shen.gen;



import com.mentics.shen.*;

public class ShenAsignatureHelpZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<signature-help>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v393) throws Exception {
return defined(v393);
}};
public static Object defined(final Object v393) throws Exception {
final Object f1380 = Fst.LAMBDA.apply(v393);


final Object i1394;
if ((boolean)(f1380 instanceof Cons)) {
final Object f1382 = Fst.LAMBDA.apply(v393);

final Object f1383 = Snd.LAMBDA.apply(v393);
final Object f1384 = ShenReassemble.LAMBDA.apply(((Cons)f1382).tail, f1383);
final Object f1385 = ShenAsignatureHelpZ.LAMBDA.apply(f1384);

final Object parse_AsignatureHelpZ1381 = f1385;


final Object i1393;
if ((boolean)!((boolean)Lang.equals(null, parse_AsignatureHelpZ1381))) {
final Object f1386 = Fst.LAMBDA.apply(parse_AsignatureHelpZ1381);
final Object f1387 = Fst.LAMBDA.apply(v393);





final Object f1388 = ElementQ.LAMBDA.apply(((Cons)f1387).head, new Cons(RuntimeContext.symbol("{"), new Cons(RuntimeContext.symbol("}"), Nil.NIL)));

final Object i1391;
if ((boolean)f1388) {

i1391 = null;
} else {
final Object f1389 = Fst.LAMBDA.apply(v393);


final Object f1390 = Snd.LAMBDA.apply(parse_AsignatureHelpZ1381);


i1391 = new Cons(((Cons)f1389).head, f1390);

}final Object f1392 = ShenReassemble.LAMBDA.apply(f1386, i1391);

i1393 = f1392;
} else {

i1393 = null;

}

i1394 = i1393;
} else {

i1394 = null;

}
final Object result1379 = i1394;

final Object i1402;
if ((boolean)Lang.equals(result1379, null)) {
final Object f1397 = AeZ.LAMBDA.apply(v393);

final Object parse_AeZ1396 = f1397;


final Object i1400;
if ((boolean)!((boolean)Lang.equals(null, parse_AeZ1396))) {
final Object f1398 = Fst.LAMBDA.apply(parse_AeZ1396);
final Object f1399 = ShenReassemble.LAMBDA.apply(f1398, Nil.NIL);

i1400 = f1399;
} else {

i1400 = null;

}

final Object result1395 = i1400;

final Object i1401;
if ((boolean)Lang.equals(result1395, null)) {

i1401 = null;
} else {

i1401 = result1395;

}

i1402 = i1401;
} else {

i1402 = result1379;

}

    return i1402;

}
}
