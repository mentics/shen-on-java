package shen.gen;



import com.mentics.shen.*;

public class ShenAdefineZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<define>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v385) throws Exception {
return defined(v385);
}};
public static Object defined(final Object v385) throws Exception {
final Object f1266 = ShenAnameZ.LAMBDA.apply(v385);

final Object parse_AnameZ1265 = f1266;


final Object i1278;
if ((boolean)!((boolean)Lang.equals(null, parse_AnameZ1265))) {
final Object f1268 = ShenAsignatureZ.LAMBDA.apply(parse_AnameZ1265);

final Object parse_AsignatureZ1267 = f1268;


final Object i1277;
if ((boolean)!((boolean)Lang.equals(null, parse_AsignatureZ1267))) {
final Object f1270 = ShenArulesZ.LAMBDA.apply(parse_AsignatureZ1267);

final Object parse_ArulesZ1269 = f1270;


final Object i1276;
if ((boolean)!((boolean)Lang.equals(null, parse_ArulesZ1269))) {
final Object f1271 = Fst.LAMBDA.apply(parse_ArulesZ1269);
final Object f1272 = Snd.LAMBDA.apply(parse_AnameZ1265);
final Object f1273 = Snd.LAMBDA.apply(parse_ArulesZ1269);
final Object f1274 = ShenCompile_to_machine_code.LAMBDA.apply(f1272, f1273);
final Object f1275 = ShenReassemble.LAMBDA.apply(f1271, f1274);

i1276 = f1275;
} else {

i1276 = null;

}

i1277 = i1276;
} else {

i1277 = null;

}

i1278 = i1277;
} else {

i1278 = null;

}

final Object result1264 = i1278;

final Object i1292;
if ((boolean)Lang.equals(result1264, null)) {
final Object f1281 = ShenAnameZ.LAMBDA.apply(v385);

final Object parse_AnameZ1280 = f1281;


final Object i1290;
if ((boolean)!((boolean)Lang.equals(null, parse_AnameZ1280))) {
final Object f1283 = ShenArulesZ.LAMBDA.apply(parse_AnameZ1280);

final Object parse_ArulesZ1282 = f1283;


final Object i1289;
if ((boolean)!((boolean)Lang.equals(null, parse_ArulesZ1282))) {
final Object f1284 = Fst.LAMBDA.apply(parse_ArulesZ1282);
final Object f1285 = Snd.LAMBDA.apply(parse_AnameZ1280);
final Object f1286 = Snd.LAMBDA.apply(parse_ArulesZ1282);
final Object f1287 = ShenCompile_to_machine_code.LAMBDA.apply(f1285, f1286);
final Object f1288 = ShenReassemble.LAMBDA.apply(f1284, f1287);

i1289 = f1288;
} else {

i1289 = null;

}

i1290 = i1289;
} else {

i1290 = null;

}

final Object result1279 = i1290;

final Object i1291;
if ((boolean)Lang.equals(result1279, null)) {

i1291 = null;
} else {

i1291 = result1279;

}

i1292 = i1291;
} else {

i1292 = result1264;

}

    return i1292;

}
}
