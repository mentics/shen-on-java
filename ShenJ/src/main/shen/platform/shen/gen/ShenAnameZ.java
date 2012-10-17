package shen.gen;



import com.mentics.shen.*;

public class ShenAnameZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<name>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v386) throws Exception {
return defined(v386);
}};
public static Object defined(final Object v386) throws Exception {
final Object f1294 = Fst.LAMBDA.apply(v386);


final Object i1311;
if ((boolean)(f1294 instanceof Cons)) {
final Object f1295 = Fst.LAMBDA.apply(v386);

final Object f1296 = Snd.LAMBDA.apply(v386);
final Object f1297 = ShenReassemble.LAMBDA.apply(((Cons)f1295).tail, f1296);
final Object f1298 = Fst.LAMBDA.apply(f1297);
final Object f1299 = Fst.LAMBDA.apply(v386);

final Object f1300 = SymbolQ.LAMBDA.apply(((Cons)f1299).head);

final Object i1304;
if ((boolean)f1300) {
final Object f1301 = Fst.LAMBDA.apply(v386);

final Object f1302 = ShenSysfuncQ.LAMBDA.apply(((Cons)f1301).head);


final Object i1303;
if ((boolean)!((boolean)f1302)) {

i1303 = true;
} else {

i1303 = false;

}
i1304 = i1303;
} else {

i1304 = false;

}
final Object i1309;
if ((boolean)i1304) {
final Object f1305 = Fst.LAMBDA.apply(v386);


i1309 = ((Cons)f1305).head;
} else {
final Object f1306 = Fst.LAMBDA.apply(v386);

final Object f1307 = Atp.LAMBDA.apply(((Cons)f1306).head, Nil.NIL);
final Object f1308 = Interror.LAMBDA.apply("~A is not a legitimate function name.~%", f1307);

i1309 = f1308;

}final Object f1310 = ShenReassemble.LAMBDA.apply(f1298, i1309);

i1311 = f1310;
} else {

i1311 = null;

}
final Object result1293 = i1311;

final Object i1312;
if ((boolean)Lang.equals(result1293, null)) {

i1312 = null;
} else {

i1312 = result1293;

}

    return i1312;

}
}
