package shen.gen;



import com.mentics.shen.*;

public class ShenAsignatureZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<signature>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v388) throws Exception {
return defined(v388);
}};
public static Object defined(final Object v388) throws Exception {
final Object f1315 = Fst.LAMBDA.apply(v388);


final Object i1318;
if ((boolean)(f1315 instanceof Cons)) {
final Object f1316 = Fst.LAMBDA.apply(v388);


final Object i1317;
if ((boolean)Lang.equals(RuntimeContext.symbol("{"), ((Cons)f1316).head)) {

i1317 = true;
} else {

i1317 = false;

}
i1318 = i1317;
} else {

i1318 = false;

}
final Object i1338;
if ((boolean)i1318) {
final Object f1320 = Fst.LAMBDA.apply(v388);

final Object f1321 = Snd.LAMBDA.apply(v388);
final Object f1322 = ShenReassemble.LAMBDA.apply(((Cons)f1320).tail, f1321);
final Object f1323 = ShenAsignatureHelpZ.LAMBDA.apply(f1322);

final Object parse_AsignatureHelpZ1319 = f1323;


final Object i1337;
if ((boolean)!((boolean)Lang.equals(null, parse_AsignatureHelpZ1319))) {
final Object f1324 = Fst.LAMBDA.apply(parse_AsignatureHelpZ1319);


final Object i1327;
if ((boolean)(f1324 instanceof Cons)) {
final Object f1325 = Fst.LAMBDA.apply(parse_AsignatureHelpZ1319);


final Object i1326;
if ((boolean)Lang.equals(RuntimeContext.symbol("}"), ((Cons)f1325).head)) {

i1326 = true;
} else {

i1326 = false;

}
i1327 = i1326;
} else {

i1327 = false;

}
final Object i1336;
if ((boolean)i1327) {
final Object f1328 = Fst.LAMBDA.apply(parse_AsignatureHelpZ1319);

final Object f1329 = Snd.LAMBDA.apply(parse_AsignatureHelpZ1319);
final Object f1330 = ShenReassemble.LAMBDA.apply(((Cons)f1328).tail, f1329);
final Object f1331 = Fst.LAMBDA.apply(f1330);
final Object f1332 = Snd.LAMBDA.apply(parse_AsignatureHelpZ1319);
final Object f1333 = ShenCurryType.LAMBDA.apply(f1332);
final Object f1334 = ShenNormaliseType.LAMBDA.apply(f1333);
final Object f1335 = ShenReassemble.LAMBDA.apply(f1331, f1334);

i1336 = f1335;
} else {

i1336 = null;

}
i1337 = i1336;
} else {

i1337 = null;

}

i1338 = i1337;
} else {

i1338 = null;

}
final Object result1314 = i1338;

final Object i1339;
if ((boolean)Lang.equals(result1314, null)) {

i1339 = null;
} else {

i1339 = result1314;

}

    return i1339;

}
}
