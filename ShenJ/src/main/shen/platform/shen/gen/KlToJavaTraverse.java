package shen.gen;



import com.mentics.shen.*;

public class KlToJavaTraverse {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-to-java-traverse");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1181, final Object v1182, final Object v1183) throws Exception {
return defined(v1181, v1182, v1183);
}};
public static Object defined(final Object v1181, final Object v1182, final Object v1183) throws Exception {


final Object i1193;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1191;
if ((boolean)Lang.equals(RuntimeContext.symbol("defun"), ((Cons)v1181).head)) {



final Object i1189;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1187;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {





final Object i1185;
if ((boolean)(((Cons)((Cons)((Cons)v1181).tail).tail).tail instanceof Cons)) {





final Object i1184;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).tail)) {

i1184 = true;
} else {

i1184 = false;

}
i1185 = i1184;
} else {

i1185 = false;

}
final Object i1186;
if ((boolean)i1185) {

i1186 = true;
} else {

i1186 = false;

}
i1187 = i1186;
} else {

i1187 = false;

}
final Object i1188;
if ((boolean)i1187) {

i1188 = true;
} else {

i1188 = false;

}
i1189 = i1188;
} else {

i1189 = false;

}
final Object i1190;
if ((boolean)i1189) {

i1190 = true;
} else {

i1190 = false;

}
i1191 = i1190;
} else {

i1191 = false;

}
final Object i1192;
if ((boolean)i1191) {

i1192 = true;
} else {

i1192 = false;

}
i1193 = i1192;
} else {

i1193 = false;

}
final Object i2279;
if ((boolean)i1193) {



final Object f1195 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head);

final Object arity1194 = f1195;
final Object f1197 = ToVar.LAMBDA.apply();



final Object f1198 = Map.LAMBDA.apply(f1197, ((Cons)((Cons)((Cons)v1181).tail).tail).head);
final Object f1199 = MethodSig.LAMBDA.apply(f1198);

final Object signature1196 = f1199;
final Object f1201 = ToVar.LAMBDA.apply();



final Object f1202 = Map.LAMBDA.apply(f1201, ((Cons)((Cons)((Cons)v1181).tail).tail).head);
final Object f1203 = MethodArgstring.LAMBDA.apply(f1202);

final Object argstring1200 = f1203;





final Object f1204 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head);

final Object f1205 = Put.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("arity"), f1204, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));




final Object f1207 = ToVarPair.LAMBDA.apply();



final Object f1208 = Map.LAMBDA.apply(f1207, ((Cons)((Cons)((Cons)v1181).tail).tail).head);
final Object f1209 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).head, RuntimeContext.symbol("object"), f1208);

final Object result1206 = f1209;





final Object f1210 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head);
final Object f1211 = Fst.LAMBDA.apply(result1206);
final Object f1212 = HandleUnreachableReturn.LAMBDA.apply(result1206);
final Object f1213 = Atp.LAMBDA.apply(f1212, Nil.NIL);
final Object f1214 = Atp.LAMBDA.apply(f1211, f1213);
final Object f1215 = Atp.LAMBDA.apply(signature1196, f1214);
final Object f1216 = Atp.LAMBDA.apply(argstring1200, f1215);
final Object f1217 = Atp.LAMBDA.apply(signature1196, f1216);
final Object f1218 = Atp.LAMBDA.apply(f1210, f1217);
final Object f1219 = Atp.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, f1218);
final Object f1220 = IntmakeString.LAMBDA.apply("\r\npublic static final Symbol SYMBOL = RuntimeContext.symbol(\"~A\");\r\npublic static final Lambda LAMBDA = new Lambda~A() {\r\npublic Object apply(~A) throws Exception {\r\nreturn defined(~A);\r\n}};\r\npublic static Object defined(~A) throws Exception {~%~A~%~A~%}", f1219);




final Object f1221 = Atp.LAMBDA.apply(String.valueOf(((Cons)((Cons)v1181).tail).head), RuntimeContext.symbol("func"));
final Object f1222 = Atp.LAMBDA.apply(f1220, f1221);
final Object f1223 = Do.LAMBDA.apply(f1205, f1222);




i2279 = f1223;
} else {


final Object i1233;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1231;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v1181).head)) {



final Object i1229;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1227;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {





final Object i1225;
if ((boolean)(((Cons)((Cons)((Cons)v1181).tail).tail).tail instanceof Cons)) {





final Object i1224;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).tail)) {

i1224 = true;
} else {

i1224 = false;

}
i1225 = i1224;
} else {

i1225 = false;

}
final Object i1226;
if ((boolean)i1225) {

i1226 = true;
} else {

i1226 = false;

}
i1227 = i1226;
} else {

i1227 = false;

}
final Object i1228;
if ((boolean)i1227) {

i1228 = true;
} else {

i1228 = false;

}
i1229 = i1228;
} else {

i1229 = false;

}
final Object i1230;
if ((boolean)i1229) {

i1230 = true;
} else {

i1230 = false;

}
i1231 = i1230;
} else {

i1231 = false;

}
final Object i1232;
if ((boolean)i1231) {

i1232 = true;
} else {

i1232 = false;

}
i1233 = i1232;
} else {

i1233 = false;

}
final Object i2278;
if ((boolean)i1233) {


final Object f1235 = Gensym.LAMBDA.apply(((Cons)((Cons)v1181).tail).head);
final Object f1236 = ToVar.LAMBDA.apply(f1235);

final Object varTOxDO1234 = f1236;



final Object f1238 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("object"), v1183);

final Object pValue1237 = f1238;






final Object f1240 = Atp.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, varTOxDO1234);


final Object f1241 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).head, v1182, new Cons(f1240, v1183));

final Object pBody1239 = f1241;
final Object f1242 = Fst.LAMBDA.apply(pValue1237);
final Object f1243 = Second.LAMBDA.apply(pValue1237);
final Object f1244 = Fst.LAMBDA.apply(pBody1239);
final Object f1245 = Atp.LAMBDA.apply(f1244, Nil.NIL);
final Object f1246 = Atp.LAMBDA.apply(f1243, f1245);
final Object f1247 = Atp.LAMBDA.apply(varTOxDO1234, f1246);
final Object f1248 = Atp.LAMBDA.apply(f1242, f1247);
final Object f1249 = IntmakeString.LAMBDA.apply("~A~%final Object ~A = ~A;~%~A~%", f1248);
final Object f1250 = Second.LAMBDA.apply(pBody1239);
final Object f1251 = Third.LAMBDA.apply(pBody1239);
final Object f1252 = Atp.LAMBDA.apply(f1250, f1251);
final Object f1253 = Atp.LAMBDA.apply(f1249, f1252);




i2278 = f1253;
} else {


final Object i1263;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1261;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)v1181).head)) {



final Object i1259;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1257;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {





final Object i1255;
if ((boolean)(((Cons)((Cons)((Cons)v1181).tail).tail).tail instanceof Cons)) {





final Object i1254;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).tail)) {

i1254 = true;
} else {

i1254 = false;

}
i1255 = i1254;
} else {

i1255 = false;

}
final Object i1256;
if ((boolean)i1255) {

i1256 = true;
} else {

i1256 = false;

}
i1257 = i1256;
} else {

i1257 = false;

}
final Object i1258;
if ((boolean)i1257) {

i1258 = true;
} else {

i1258 = false;

}
i1259 = i1258;
} else {

i1259 = false;

}
final Object i1260;
if ((boolean)i1259) {

i1260 = true;
} else {

i1260 = false;

}
i1261 = i1260;
} else {

i1261 = false;

}
final Object i1262;
if ((boolean)i1261) {

i1262 = true;
} else {

i1262 = false;

}
i1263 = i1262;
} else {

i1263 = false;

}
final Object i2277;
if ((boolean)i1263) {


final Object f1265 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("boolean"), v1183);

final Object pX01264 = f1265;



final Object f1267 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, v1182, v1183);

final Object pX11266 = f1267;




final Object f1269 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).head, v1182, v1183);

final Object pX21268 = f1269;
final Object f1271 = Gensym.LAMBDA.apply(RuntimeContext.symbol("i"));

final Object var1270 = f1271;
final Object f1273 = Third.LAMBDA.apply(pX01264);

final Object i1291;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f1273)) {
final Object f1274 = Fst.LAMBDA.apply(pX01264);
final Object f1275 = Atp.LAMBDA.apply(f1274, Nil.NIL);
final Object f1276 = IntmakeString.LAMBDA.apply("~A~%", f1275);

i1291 = f1276;
} else {
final Object f1277 = Fst.LAMBDA.apply(pX01264);
final Object f1278 = Second.LAMBDA.apply(pX01264);
final Object f1279 = Fst.LAMBDA.apply(pX11266);
final Object f1280 = HandleUnreachableAssignment.LAMBDA.apply(var1270, pX11266);
final Object f1281 = Fst.LAMBDA.apply(pX21268);
final Object f1282 = HandleUnreachableAssignment.LAMBDA.apply(var1270, pX21268);
final Object f1283 = Atp.LAMBDA.apply(f1282, Nil.NIL);
final Object f1284 = Atp.LAMBDA.apply(f1281, f1283);
final Object f1285 = Atp.LAMBDA.apply(f1280, f1284);
final Object f1286 = Atp.LAMBDA.apply(f1279, f1285);
final Object f1287 = Atp.LAMBDA.apply(f1278, f1286);
final Object f1288 = Atp.LAMBDA.apply(var1270, f1287);
final Object f1289 = Atp.LAMBDA.apply(f1277, f1288);
final Object f1290 = IntmakeString.LAMBDA.apply("~A~%final Object ~A;~%if ((boolean)~A) {~%~A~%~A} else {~%~A~%~A~%}", f1289);

i1291 = f1290;

}
final Object first1272 = i1291;

final Object f1292 = Third.LAMBDA.apply(pX01264);

final Object i1296;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f1292)) {

i1296 = RuntimeContext.symbol("unreachable");
} else {
final Object f1293 = Third.LAMBDA.apply(pX11266);
final Object f1294 = Third.LAMBDA.apply(pX21268);
final Object f1295 = CombineTypes.LAMBDA.apply(f1293, f1294);

i1296 = f1295;

}final Object f1297 = Atp.LAMBDA.apply(String.valueOf(var1270), i1296);
final Object f1298 = Atp.LAMBDA.apply(first1272, f1297);






i2277 = f1298;
} else {


final Object i1300;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1299;
if ((boolean)Lang.equals(RuntimeContext.symbol("cond"), ((Cons)v1181).head)) {

i1299 = true;
} else {

i1299 = false;

}
i1300 = i1299;
} else {

i1300 = false;

}
final Object i2276;
if ((boolean)i1300) {

final Object f1301 = HandleCases.LAMBDA.apply(((Cons)v1181).tail);
final Object f1302 = KlToJavaTraverse.LAMBDA.apply(f1301, v1182, v1183);

i2276 = f1302;
} else {


final Object i1310;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1308;
if ((boolean)Lang.equals(RuntimeContext.symbol("trap-error"), ((Cons)v1181).head)) {



final Object i1306;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1304;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1303;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1303 = true;
} else {

i1303 = false;

}
i1304 = i1303;
} else {

i1304 = false;

}
final Object i1305;
if ((boolean)i1304) {

i1305 = true;
} else {

i1305 = false;

}
i1306 = i1305;
} else {

i1306 = false;

}
final Object i1307;
if ((boolean)i1306) {

i1307 = true;
} else {

i1307 = false;

}
i1308 = i1307;
} else {

i1308 = false;

}
final Object i1309;
if ((boolean)i1308) {

i1309 = true;
} else {

i1309 = false;

}
i1310 = i1309;
} else {

i1310 = false;

}
final Object i2275;
if ((boolean)i1310) {


final Object f1312 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("object"), v1183);

final Object evaled1311 = f1312;



final Object f1314 = ToVarPair.LAMBDA.apply(RuntimeContext.symbol("t"));


final Object f1315 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("lambda"), new Cons(f1314, v1183));

final Object handlerTOxDO1313 = f1315;
final Object f1317 = Gensym.LAMBDA.apply(RuntimeContext.symbol("t"));

final Object temp1316 = f1317;
final Object f1319 = Gensym.LAMBDA.apply(RuntimeContext.symbol("t"));

final Object result1318 = f1319;
final Object f1320 = Fst.LAMBDA.apply(evaled1311);
final Object f1321 = Second.LAMBDA.apply(evaled1311);
final Object f1322 = Fst.LAMBDA.apply(handlerTOxDO1313);
final Object f1323 = Second.LAMBDA.apply(handlerTOxDO1313);
final Object f1324 = Atp.LAMBDA.apply(temp1316, Nil.NIL);
final Object f1325 = Atp.LAMBDA.apply(result1318, f1324);
final Object f1326 = Atp.LAMBDA.apply(f1323, f1325);
final Object f1327 = Atp.LAMBDA.apply(temp1316, f1326);
final Object f1328 = Atp.LAMBDA.apply(f1322, f1327);
final Object f1329 = Atp.LAMBDA.apply(f1321, f1328);
final Object f1330 = Atp.LAMBDA.apply(temp1316, f1329);
final Object f1331 = Atp.LAMBDA.apply(f1320, f1330);
final Object f1332 = Atp.LAMBDA.apply(temp1316, f1331);
final Object f1333 = IntmakeString.LAMBDA.apply("Object ~A;~%try {~%~A~%~A = ~A;~%} catch (Throwable t) {~%~A~%~A = ~A.apply(t);~%}~%final Object ~A = ~A;~%", f1332);

final Object f1334 = Atp.LAMBDA.apply(String.valueOf(result1318), RuntimeContext.symbol("object"));
final Object f1335 = Atp.LAMBDA.apply(f1333, f1334);





i2275 = f1335;
} else {


final Object i1345;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1343;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), ((Cons)v1181).head)) {



final Object i1341;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1339;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).head)) {




final Object i1337;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1336;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1336 = true;
} else {

i1336 = false;

}
i1337 = i1336;
} else {

i1337 = false;

}
final Object i1338;
if ((boolean)i1337) {

i1338 = true;
} else {

i1338 = false;

}
i1339 = i1338;
} else {

i1339 = false;

}
final Object i1340;
if ((boolean)i1339) {

i1340 = true;
} else {

i1340 = false;

}
i1341 = i1340;
} else {

i1341 = false;

}
final Object i1342;
if ((boolean)i1341) {

i1342 = true;
} else {

i1342 = false;

}
i1343 = i1342;
} else {

i1343 = false;

}
final Object i1344;
if ((boolean)i1343) {

i1344 = true;
} else {

i1344 = false;

}
i1345 = i1344;
} else {

i1345 = false;

}
final Object i2274;
if ((boolean)i1345) {



final Object f1347 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("object"), v1183);

final Object bodyTOxDO1346 = f1347;
final Object f1349 = Gensym.LAMBDA.apply(RuntimeContext.symbol("l"));

final Object result1348 = f1349;
final Object f1350 = Fst.LAMBDA.apply(bodyTOxDO1346);
final Object f1351 = HandleUnreachableReturn.LAMBDA.apply(bodyTOxDO1346);
final Object f1352 = Atp.LAMBDA.apply(f1351, Nil.NIL);
final Object f1353 = Atp.LAMBDA.apply(f1350, f1352);
final Object f1354 = Atp.LAMBDA.apply(result1348, f1353);
final Object f1355 = IntmakeString.LAMBDA.apply("final Lambda ~A = new Lambda0() {~%  public Object apply() throws Exception {~%    ~A~%~A  }~%};", f1354);

final Object f1356 = Atp.LAMBDA.apply(String.valueOf(result1348), RuntimeContext.symbol("lambda"));
final Object f1357 = Atp.LAMBDA.apply(f1355, f1356);



i2274 = f1357;
} else {


final Object i1365;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1363;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), ((Cons)v1181).head)) {



final Object i1361;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1359;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1358;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1358 = true;
} else {

i1358 = false;

}
i1359 = i1358;
} else {

i1359 = false;

}
final Object i1360;
if ((boolean)i1359) {

i1360 = true;
} else {

i1360 = false;

}
i1361 = i1360;
} else {

i1361 = false;

}
final Object i1362;
if ((boolean)i1361) {

i1362 = true;
} else {

i1362 = false;

}
i1363 = i1362;
} else {

i1363 = false;

}
final Object i1364;
if ((boolean)i1363) {

i1364 = true;
} else {

i1364 = false;

}
i1365 = i1364;
} else {

i1365 = false;

}
final Object i2273;
if ((boolean)i1365) {


final Object f1367 = ToVar.LAMBDA.apply(((Cons)((Cons)v1181).tail).head);

final Object varTOxDO1366 = f1367;





final Object f1369 = ToVarPair.LAMBDA.apply(((Cons)((Cons)v1181).tail).head);


final Object f1370 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("object"), new Cons(f1369, v1183));

final Object bodyTOxDO1368 = f1370;
final Object f1372 = Gensym.LAMBDA.apply(RuntimeContext.symbol("l"));

final Object result1371 = f1372;
final Object f1373 = Fst.LAMBDA.apply(bodyTOxDO1368);
final Object f1374 = HandleUnreachableReturn.LAMBDA.apply(bodyTOxDO1368);
final Object f1375 = Atp.LAMBDA.apply(f1374, Nil.NIL);
final Object f1376 = Atp.LAMBDA.apply(f1373, f1375);
final Object f1377 = Atp.LAMBDA.apply(varTOxDO1366, f1376);
final Object f1378 = Atp.LAMBDA.apply(result1371, f1377);
final Object f1379 = IntmakeString.LAMBDA.apply("final Lambda ~A = new Lambda1() {~%  public Object apply(final Object ~A) throws Exception {~%    ~A~%~A  }~%};", f1378);

final Object f1380 = Atp.LAMBDA.apply(String.valueOf(result1371), RuntimeContext.symbol("lambda"));
final Object f1381 = Atp.LAMBDA.apply(f1379, f1380);




i2273 = f1381;
} else {


final Object i1387;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1385;
if ((boolean)Lang.equals(RuntimeContext.symbol("simple-error"), ((Cons)v1181).head)) {



final Object i1383;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1382;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1382 = true;
} else {

i1382 = false;

}
i1383 = i1382;
} else {

i1383 = false;

}
final Object i1384;
if ((boolean)i1383) {

i1384 = true;
} else {

i1384 = false;

}
i1385 = i1384;
} else {

i1385 = false;

}
final Object i1386;
if ((boolean)i1385) {

i1386 = true;
} else {

i1386 = false;

}
i1387 = i1386;
} else {

i1387 = false;

}
final Object i2272;
if ((boolean)i1387) {


final Object f1389 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("string"), v1183);

final Object messageTOxDO1388 = f1389;
final Object f1390 = Fst.LAMBDA.apply(messageTOxDO1388);
final Object f1391 = Second.LAMBDA.apply(messageTOxDO1388);
final Object f1392 = Atp.LAMBDA.apply(f1391, Nil.NIL);
final Object f1393 = Atp.LAMBDA.apply(f1390, f1392);
final Object f1394 = IntmakeString.LAMBDA.apply("~A~%throw new SimpleError((String)~A);~%", f1393);
final Object f1395 = Atp.LAMBDA.apply("", RuntimeContext.symbol("unreachable"));
final Object f1396 = Atp.LAMBDA.apply(f1394, f1395);


i2272 = f1396;
} else {


final Object i1402;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1400;
if ((boolean)Lang.equals(RuntimeContext.symbol("error-to-string"), ((Cons)v1181).head)) {



final Object i1398;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1397;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1397 = true;
} else {

i1397 = false;

}
i1398 = i1397;
} else {

i1398 = false;

}
final Object i1399;
if ((boolean)i1398) {

i1399 = true;
} else {

i1399 = false;

}
i1400 = i1399;
} else {

i1400 = false;

}
final Object i1401;
if ((boolean)i1400) {

i1401 = true;
} else {

i1401 = false;

}
i1402 = i1401;
} else {

i1402 = false;

}
final Object i2271;
if ((boolean)i1402) {


final Object f1404 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("exception"), v1183);

final Object exceptionTOxDO1403 = f1404;
final Object f1405 = Fst.LAMBDA.apply(exceptionTOxDO1403);
final Object f1406 = Atp.LAMBDA.apply(f1405, Nil.NIL);
final Object f1407 = IntmakeString.LAMBDA.apply("~A~%", f1406);
final Object f1408 = Second.LAMBDA.apply(exceptionTOxDO1403);
final Object f1409 = Atp.LAMBDA.apply(f1408, Nil.NIL);
final Object f1410 = IntmakeString.LAMBDA.apply("Lang.errorToString(~A)", f1409);
final Object f1411 = Atp.LAMBDA.apply(f1410, RuntimeContext.symbol("string"));
final Object f1412 = Atp.LAMBDA.apply(f1407, f1411);


i2271 = f1412;
} else {


final Object i1418;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1416;
if ((boolean)Lang.equals(RuntimeContext.symbol("str"), ((Cons)v1181).head)) {



final Object i1414;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1413;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1413 = true;
} else {

i1413 = false;

}
i1414 = i1413;
} else {

i1414 = false;

}
final Object i1415;
if ((boolean)i1414) {

i1415 = true;
} else {

i1415 = false;

}
i1416 = i1415;
} else {

i1416 = false;

}
final Object i1417;
if ((boolean)i1416) {

i1417 = true;
} else {

i1417 = false;

}
i1418 = i1417;
} else {

i1418 = false;

}
final Object i2270;
if ((boolean)i1418) {


final Object f1419 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "String.valueOf(~A)", RuntimeContext.symbol("string"));

i2270 = f1419;
} else {


final Object i1425;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1423;
if ((boolean)Lang.equals(RuntimeContext.symbol("intern"), ((Cons)v1181).head)) {



final Object i1421;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1420;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1420 = true;
} else {

i1420 = false;

}
i1421 = i1420;
} else {

i1421 = false;

}
final Object i1422;
if ((boolean)i1421) {

i1422 = true;
} else {

i1422 = false;

}
i1423 = i1422;
} else {

i1423 = false;

}
final Object i1424;
if ((boolean)i1423) {

i1424 = true;
} else {

i1424 = false;

}
i1425 = i1424;
} else {

i1425 = false;

}
final Object i2269;
if ((boolean)i1425) {


final Object f1426 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "RuntimeContext.symbol((String)~A)", RuntimeContext.symbol("symbol"));

i2269 = f1426;
} else {


final Object i1432;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1430;
if ((boolean)Lang.equals(RuntimeContext.symbol("absvector?"), ((Cons)v1181).head)) {



final Object i1428;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1427;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1427 = true;
} else {

i1427 = false;

}
i1428 = i1427;
} else {

i1428 = false;

}
final Object i1429;
if ((boolean)i1428) {

i1429 = true;
} else {

i1429 = false;

}
i1430 = i1429;
} else {

i1430 = false;

}
final Object i1431;
if ((boolean)i1430) {

i1431 = true;
} else {

i1431 = false;

}
i1432 = i1431;
} else {

i1432 = false;

}
final Object i2268;
if ((boolean)i1432) {


final Object f1433 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "(~A instanceof Object[])", RuntimeContext.symbol("boolean"));

i2268 = f1433;
} else {


final Object i1439;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1437;
if ((boolean)Lang.equals(RuntimeContext.symbol("get-time"), ((Cons)v1181).head)) {



final Object i1435;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1434;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1434 = true;
} else {

i1434 = false;

}
i1435 = i1434;
} else {

i1435 = false;

}
final Object i1436;
if ((boolean)i1435) {

i1436 = true;
} else {

i1436 = false;

}
i1437 = i1436;
} else {

i1437 = false;

}
final Object i1438;
if ((boolean)i1437) {

i1438 = true;
} else {

i1438 = false;

}
i1439 = i1438;
} else {

i1439 = false;

}
final Object i2267;
if ((boolean)i1439) {


final Object f1440 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "Lang.getTime(~A)", RuntimeContext.symbol("object"));

i2267 = f1440;
} else {


final Object i1450;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1448;
if ((boolean)Lang.equals(RuntimeContext.symbol("open"), ((Cons)v1181).head)) {



final Object i1446;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1444;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {





final Object i1442;
if ((boolean)(((Cons)((Cons)((Cons)v1181).tail).tail).tail instanceof Cons)) {





final Object i1441;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).tail)) {

i1441 = true;
} else {

i1441 = false;

}
i1442 = i1441;
} else {

i1442 = false;

}
final Object i1443;
if ((boolean)i1442) {

i1443 = true;
} else {

i1443 = false;

}
i1444 = i1443;
} else {

i1444 = false;

}
final Object i1445;
if ((boolean)i1444) {

i1445 = true;
} else {

i1445 = false;

}
i1446 = i1445;
} else {

i1446 = false;

}
final Object i1447;
if ((boolean)i1446) {

i1447 = true;
} else {

i1447 = false;

}
i1448 = i1447;
} else {

i1448 = false;

}
final Object i1449;
if ((boolean)i1448) {

i1449 = true;
} else {

i1449 = false;

}
i1450 = i1449;
} else {

i1450 = false;

}
final Object i2266;
if ((boolean)i1450) {


final Object f1452 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("symbol"), v1183);

final Object streamTypeTOxDO1451 = f1452;



final Object f1454 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("string"), v1183);

final Object locationTOxDO1453 = f1454;




final Object f1456 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).head, RuntimeContext.symbol("symbol"), v1183);

final Object directionTOxDO1455 = f1456;
final Object f1458 = Gensym.LAMBDA.apply(RuntimeContext.symbol("o"));

final Object var1457 = f1458;
final Object f1459 = Fst.LAMBDA.apply(streamTypeTOxDO1451);
final Object f1460 = Fst.LAMBDA.apply(locationTOxDO1453);
final Object f1461 = Fst.LAMBDA.apply(directionTOxDO1455);
final Object f1462 = Second.LAMBDA.apply(streamTypeTOxDO1451);
final Object f1463 = Second.LAMBDA.apply(locationTOxDO1453);
final Object f1464 = Second.LAMBDA.apply(directionTOxDO1455);
final Object f1465 = Atp.LAMBDA.apply(f1464, Nil.NIL);
final Object f1466 = Atp.LAMBDA.apply(f1463, f1465);
final Object f1467 = Atp.LAMBDA.apply(f1462, f1466);
final Object f1468 = Atp.LAMBDA.apply(var1457, f1467);
final Object f1469 = Atp.LAMBDA.apply(f1461, f1468);
final Object f1470 = Atp.LAMBDA.apply(f1460, f1469);
final Object f1471 = Atp.LAMBDA.apply(f1459, f1470);
final Object f1472 = IntmakeString.LAMBDA.apply("~A~%~A~%~A~%final Object ~A = Lang.open(~A, ~A, ~A);", f1471);

final Object f1473 = Atp.LAMBDA.apply(String.valueOf(var1457), RuntimeContext.symbol("stream"));
final Object f1474 = Atp.LAMBDA.apply(f1472, f1473);





i2266 = f1474;
} else {


final Object i1480;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1478;
if ((boolean)Lang.equals(RuntimeContext.symbol("close"), ((Cons)v1181).head)) {



final Object i1476;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1475;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1475 = true;
} else {

i1475 = false;

}
i1476 = i1475;
} else {

i1476 = false;

}
final Object i1477;
if ((boolean)i1476) {

i1477 = true;
} else {

i1477 = false;

}
i1478 = i1477;
} else {

i1478 = false;

}
final Object i1479;
if ((boolean)i1478) {

i1479 = true;
} else {

i1479 = false;

}
i1480 = i1479;
} else {

i1480 = false;

}
final Object i2265;
if ((boolean)i1480) {


final Object f1482 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("stream"), v1183);

final Object streamTOxDO1481 = f1482;
final Object f1483 = Fst.LAMBDA.apply(streamTOxDO1481);
final Object f1484 = Second.LAMBDA.apply(streamTOxDO1481);
final Object f1485 = Atp.LAMBDA.apply(f1484, Nil.NIL);
final Object f1486 = Atp.LAMBDA.apply(f1483, f1485);
final Object f1487 = IntmakeString.LAMBDA.apply("~A~%((java.io.Closeable)~A).close();~%", f1486);
final Object f1488 = Atp.LAMBDA.apply("Nil.NIL", RuntimeContext.symbol("list"));
final Object f1489 = Atp.LAMBDA.apply(f1487, f1488);


i2265 = f1489;
} else {


final Object i1497;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1495;
if ((boolean)Lang.equals(RuntimeContext.symbol("pr"), ((Cons)v1181).head)) {



final Object i1493;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1491;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1490;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1490 = true;
} else {

i1490 = false;

}
i1491 = i1490;
} else {

i1491 = false;

}
final Object i1492;
if ((boolean)i1491) {

i1492 = true;
} else {

i1492 = false;

}
i1493 = i1492;
} else {

i1493 = false;

}
final Object i1494;
if ((boolean)i1493) {

i1494 = true;
} else {

i1494 = false;

}
i1495 = i1494;
} else {

i1495 = false;

}
final Object i1496;
if ((boolean)i1495) {

i1496 = true;
} else {

i1496 = false;

}
i1497 = i1496;
} else {

i1497 = false;

}
final Object i2264;
if ((boolean)i1497) {


final Object f1499 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("string"), v1183);

final Object stringTOxDO1498 = f1499;



final Object f1501 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("stream"), v1183);

final Object streamTOxDO1500 = f1501;
final Object f1502 = Fst.LAMBDA.apply(stringTOxDO1498);
final Object f1503 = Fst.LAMBDA.apply(streamTOxDO1500);
final Object f1504 = Second.LAMBDA.apply(streamTOxDO1500);
final Object f1505 = Second.LAMBDA.apply(stringTOxDO1498);
final Object f1506 = Atp.LAMBDA.apply(f1505, Nil.NIL);
final Object f1507 = Atp.LAMBDA.apply(f1504, f1506);
final Object f1508 = Atp.LAMBDA.apply(f1503, f1507);
final Object f1509 = Atp.LAMBDA.apply(f1502, f1508);
final Object f1510 = IntmakeString.LAMBDA.apply("~A~%~A~%((java.io.OutputStream)~A).write(((String)~A).getBytes());", f1509);
final Object f1511 = Second.LAMBDA.apply(stringTOxDO1498);
final Object f1512 = Atp.LAMBDA.apply(f1511, RuntimeContext.symbol("string"));
final Object f1513 = Atp.LAMBDA.apply(f1510, f1512);



i2264 = f1513;
} else {


final Object i1517;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1515;
if ((boolean)Lang.equals(RuntimeContext.symbol("read-byte"), ((Cons)v1181).head)) {


final Object i1514;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1514 = true;
} else {

i1514 = false;

}
i1515 = i1514;
} else {

i1515 = false;

}
final Object i1516;
if ((boolean)i1515) {

i1516 = true;
} else {

i1516 = false;

}
i1517 = i1516;
} else {

i1517 = false;

}
final Object i2263;
if ((boolean)i1517) {
final Object f1518 = SingleParam.LAMBDA.apply("", v1182, v1183, "System.in.read()", RuntimeContext.symbol("number"));

i2263 = f1518;
} else {


final Object i1524;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1522;
if ((boolean)Lang.equals(RuntimeContext.symbol("read-byte"), ((Cons)v1181).head)) {



final Object i1520;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1519;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1519 = true;
} else {

i1519 = false;

}
i1520 = i1519;
} else {

i1520 = false;

}
final Object i1521;
if ((boolean)i1520) {

i1521 = true;
} else {

i1521 = false;

}
i1522 = i1521;
} else {

i1522 = false;

}
final Object i1523;
if ((boolean)i1522) {

i1523 = true;
} else {

i1523 = false;

}
i1524 = i1523;
} else {

i1524 = false;

}
final Object i2262;
if ((boolean)i1524) {


final Object f1525 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "((java.io.InputStream)~A).read()", RuntimeContext.symbol("number"));

i2262 = f1525;
} else {


final Object i1529;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1527;
if ((boolean)Lang.equals(RuntimeContext.symbol("not"), ((Cons)v1181).head)) {


final Object i1526;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1526 = true;
} else {

i1526 = false;

}
i1527 = i1526;
} else {

i1527 = false;

}
final Object i1528;
if ((boolean)i1527) {

i1528 = true;
} else {

i1528 = false;

}
i1529 = i1528;
} else {

i1529 = false;

}
final Object i2261;
if ((boolean)i1529) {
final Object f1531 = Gensym.LAMBDA.apply(RuntimeContext.symbol("n"));

final Object expression1530 = f1531;










final Object f1532 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(expression1530, new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(expression1530, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2261 = f1532;
} else {


final Object i1538;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1536;
if ((boolean)Lang.equals(RuntimeContext.symbol("not"), ((Cons)v1181).head)) {



final Object i1534;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1533;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1533 = true;
} else {

i1533 = false;

}
i1534 = i1533;
} else {

i1534 = false;

}
final Object i1535;
if ((boolean)i1534) {

i1535 = true;
} else {

i1535 = false;

}
i1536 = i1535;
} else {

i1536 = false;

}
final Object i1537;
if ((boolean)i1536) {

i1537 = true;
} else {

i1537 = false;

}
i1538 = i1537;
} else {

i1538 = false;

}
final Object i2260;
if ((boolean)i1538) {

final Object i1540;
if ((boolean)Lang.equals(RuntimeContext.symbol("boolean"), v1182)) {

i1540 = true;
} else {

final Object i1539;
if ((boolean)Lang.equals(RuntimeContext.symbol("object"), v1182)) {

i1539 = true;
} else {

i1539 = false;

}
i1540 = i1539;

}

final Object f1542 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("boolean"), v1183);

final Object expressionTOxDO1541 = f1542;
final Object f1543 = Fst.LAMBDA.apply(expressionTOxDO1541);
final Object f1544 = Atp.LAMBDA.apply(f1543, Nil.NIL);
final Object f1545 = IntmakeString.LAMBDA.apply("~A~%", f1544);
final Object f1546 = Second.LAMBDA.apply(expressionTOxDO1541);
final Object f1547 = Atp.LAMBDA.apply(f1546, Nil.NIL);
final Object f1548 = IntmakeString.LAMBDA.apply("!((boolean)~A)", f1547);
final Object f1549 = Atp.LAMBDA.apply(f1548, RuntimeContext.symbol("boolean"));
final Object f1550 = Atp.LAMBDA.apply(f1545, f1549);

final Object f1551 = Assert.LAMBDA.apply(i1540, "Expected boolean or object for not operation.", f1550);

i2260 = f1551;
} else {


final Object i1555;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1553;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)v1181).head)) {


final Object i1552;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1552 = true;
} else {

i1552 = false;

}
i1553 = i1552;
} else {

i1553 = false;

}
final Object i1554;
if ((boolean)i1553) {

i1554 = true;
} else {

i1554 = false;

}
i1555 = i1554;
} else {

i1555 = false;

}
final Object i2259;
if ((boolean)i1555) {
final Object f1557 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg01556 = f1557;
final Object f1559 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg11558 = f1559;


















final Object f1560 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg01556, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg11558, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(arg01556, new Cons(arg11558, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);



i2259 = f1560;
} else {


final Object i1566;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1564;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)v1181).head)) {



final Object i1562;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1561;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1561 = true;
} else {

i1561 = false;

}
i1562 = i1561;
} else {

i1562 = false;

}
final Object i1563;
if ((boolean)i1562) {

i1563 = true;
} else {

i1563 = false;

}
i1564 = i1563;
} else {

i1564 = false;

}
final Object i1565;
if ((boolean)i1564) {

i1565 = true;
} else {

i1565 = false;

}
i1566 = i1565;
} else {

i1566 = false;

}
final Object i2258;
if ((boolean)i1566) {
final Object f1568 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg11567 = f1568;














final Object f1569 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg11567, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(arg11567, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2258 = f1569;
} else {


final Object i1577;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1575;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)v1181).head)) {



final Object i1573;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1571;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1570;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1570 = true;
} else {

i1570 = false;

}
i1571 = i1570;
} else {

i1571 = false;

}
final Object i1572;
if ((boolean)i1571) {

i1572 = true;
} else {

i1572 = false;

}
i1573 = i1572;
} else {

i1573 = false;

}
final Object i1574;
if ((boolean)i1573) {

i1574 = true;
} else {

i1574 = false;

}
i1575 = i1574;
} else {

i1575 = false;

}
final Object i1576;
if ((boolean)i1575) {

i1576 = true;
} else {

i1576 = false;

}
i1577 = i1576;
} else {

i1577 = false;

}
final Object i2257;
if ((boolean)i1577) {





















final Object f1578 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)((Cons)v1181).tail).tail).head, new Cons(true, new Cons(false, Nil.NIL)))), new Cons(false, Nil.NIL)))), RuntimeContext.symbol("boolean"), v1183);

i2257 = f1578;
} else {


final Object i1582;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1580;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), ((Cons)v1181).head)) {


final Object i1579;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1579 = true;
} else {

i1579 = false;

}
i1580 = i1579;
} else {

i1580 = false;

}
final Object i1581;
if ((boolean)i1580) {

i1581 = true;
} else {

i1581 = false;

}
i1582 = i1581;
} else {

i1582 = false;

}
final Object i2256;
if ((boolean)i1582) {
final Object f1584 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg01583 = f1584;
final Object f1586 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg11585 = f1586;


















final Object f1587 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg01583, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg11585, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(arg01583, new Cons(arg11585, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);



i2256 = f1587;
} else {


final Object i1593;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1591;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), ((Cons)v1181).head)) {



final Object i1589;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1588;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1588 = true;
} else {

i1588 = false;

}
i1589 = i1588;
} else {

i1589 = false;

}
final Object i1590;
if ((boolean)i1589) {

i1590 = true;
} else {

i1590 = false;

}
i1591 = i1590;
} else {

i1591 = false;

}
final Object i1592;
if ((boolean)i1591) {

i1592 = true;
} else {

i1592 = false;

}
i1593 = i1592;
} else {

i1593 = false;

}
final Object i2255;
if ((boolean)i1593) {
final Object f1595 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg11594 = f1595;














final Object f1596 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg11594, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(arg11594, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2255 = f1596;
} else {


final Object i1604;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1602;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), ((Cons)v1181).head)) {



final Object i1600;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1598;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1597;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1597 = true;
} else {

i1597 = false;

}
i1598 = i1597;
} else {

i1598 = false;

}
final Object i1599;
if ((boolean)i1598) {

i1599 = true;
} else {

i1599 = false;

}
i1600 = i1599;
} else {

i1600 = false;

}
final Object i1601;
if ((boolean)i1600) {

i1601 = true;
} else {

i1601 = false;

}
i1602 = i1601;
} else {

i1602 = false;

}
final Object i1603;
if ((boolean)i1602) {

i1603 = true;
} else {

i1603 = false;

}
i1604 = i1603;
} else {

i1604 = false;

}
final Object i2254;
if ((boolean)i1604) {





















final Object f1605 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(true, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)((Cons)v1181).tail).tail).head, new Cons(true, new Cons(false, Nil.NIL)))), Nil.NIL)))), RuntimeContext.symbol("boolean"), v1183);

i2254 = f1605;
} else {


final Object i1609;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1607;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), ((Cons)v1181).head)) {


final Object i1606;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1606 = true;
} else {

i1606 = false;

}
i1607 = i1606;
} else {

i1607 = false;

}
final Object i1608;
if ((boolean)i1607) {

i1608 = true;
} else {

i1608 = false;

}
i1609 = i1608;
} else {

i1609 = false;

}
final Object i2253;
if ((boolean)i1609) {
final Object f1611 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object name1610 = f1611;
final Object f1613 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object value1612 = f1613;


















final Object f1614 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(name1610, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(value1612, new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(name1610, new Cons(value1612, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);



i2253 = f1614;
} else {


final Object i1620;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1618;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), ((Cons)v1181).head)) {



final Object i1616;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1615;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1615 = true;
} else {

i1615 = false;

}
i1616 = i1615;
} else {

i1616 = false;

}
final Object i1617;
if ((boolean)i1616) {

i1617 = true;
} else {

i1617 = false;

}
i1618 = i1617;
} else {

i1618 = false;

}
final Object i1619;
if ((boolean)i1618) {

i1619 = true;
} else {

i1619 = false;

}
i1620 = i1619;
} else {

i1620 = false;

}
final Object i2252;
if ((boolean)i1620) {
final Object f1622 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object value1621 = f1622;














final Object f1623 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(value1621, new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(value1621, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2252 = f1623;
} else {


final Object i1631;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1629;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), ((Cons)v1181).head)) {



final Object i1627;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1625;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1624;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1624 = true;
} else {

i1624 = false;

}
i1625 = i1624;
} else {

i1625 = false;

}
final Object i1626;
if ((boolean)i1625) {

i1626 = true;
} else {

i1626 = false;

}
i1627 = i1626;
} else {

i1627 = false;

}
final Object i1628;
if ((boolean)i1627) {

i1628 = true;
} else {

i1628 = false;

}
i1629 = i1628;
} else {

i1629 = false;

}
final Object i1630;
if ((boolean)i1629) {

i1630 = true;
} else {

i1630 = false;

}
i1631 = i1630;
} else {

i1631 = false;

}
final Object i2251;
if ((boolean)i1631) {


final Object f1633 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183);

final Object nameTOxDO1632 = f1633;



final Object f1635 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, v1182, v1183);

final Object valueTOxDO1634 = f1635;
final Object f1636 = Fst.LAMBDA.apply(valueTOxDO1634);
final Object f1637 = Fst.LAMBDA.apply(nameTOxDO1632);
final Object f1638 = Second.LAMBDA.apply(nameTOxDO1632);
final Object f1639 = Second.LAMBDA.apply(valueTOxDO1634);
final Object f1640 = Atp.LAMBDA.apply(f1639, Nil.NIL);
final Object f1641 = Atp.LAMBDA.apply(f1638, f1640);
final Object f1642 = Atp.LAMBDA.apply(f1637, f1641);
final Object f1643 = Atp.LAMBDA.apply(f1636, f1642);
final Object f1644 = IntmakeString.LAMBDA.apply("~A~%~A~%RuntimeContext.globalProperties.put((Symbol)~A, ~A);", f1643);
final Object f1645 = Second.LAMBDA.apply(valueTOxDO1634);
final Object f1646 = Third.LAMBDA.apply(valueTOxDO1634);
final Object f1647 = Atp.LAMBDA.apply(f1645, f1646);
final Object f1648 = Atp.LAMBDA.apply(f1644, f1647);



i2251 = f1648;
} else {


final Object i1652;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1650;
if ((boolean)Lang.equals(RuntimeContext.symbol("value"), ((Cons)v1181).head)) {


final Object i1649;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1649 = true;
} else {

i1649 = false;

}
i1650 = i1649;
} else {

i1650 = false;

}
final Object i1651;
if ((boolean)i1650) {

i1651 = true;
} else {

i1651 = false;

}
i1652 = i1651;
} else {

i1652 = false;

}
final Object i2250;
if ((boolean)i1652) {
final Object f1654 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object name1653 = f1654;










final Object f1655 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(name1653, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(name1653, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2250 = f1655;
} else {


final Object i1661;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1659;
if ((boolean)Lang.equals(RuntimeContext.symbol("value"), ((Cons)v1181).head)) {



final Object i1657;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1656;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1656 = true;
} else {

i1656 = false;

}
i1657 = i1656;
} else {

i1657 = false;

}
final Object i1658;
if ((boolean)i1657) {

i1658 = true;
} else {

i1658 = false;

}
i1659 = i1658;
} else {

i1659 = false;

}
final Object i1660;
if ((boolean)i1659) {

i1660 = true;
} else {

i1660 = false;

}
i1661 = i1660;
} else {

i1661 = false;

}
final Object i2249;
if ((boolean)i1661) {


final Object f1662 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "RuntimeContext.globalProperties.get(~A)", RuntimeContext.symbol("object"));

i2249 = f1662;
} else {


final Object i1666;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1664;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons?"), ((Cons)v1181).head)) {


final Object i1663;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1663 = true;
} else {

i1663 = false;

}
i1664 = i1663;
} else {

i1664 = false;

}
final Object i1665;
if ((boolean)i1664) {

i1665 = true;
} else {

i1665 = false;

}
i1666 = i1665;
} else {

i1666 = false;

}
final Object i2248;
if ((boolean)i1666) {
final Object f1668 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01667 = f1668;










final Object f1669 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01667, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(a01667, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2248 = f1669;
} else {


final Object i1675;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1673;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons?"), ((Cons)v1181).head)) {



final Object i1671;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1670;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1670 = true;
} else {

i1670 = false;

}
i1671 = i1670;
} else {

i1671 = false;

}
final Object i1672;
if ((boolean)i1671) {

i1672 = true;
} else {

i1672 = false;

}
i1673 = i1672;
} else {

i1673 = false;

}
final Object i1674;
if ((boolean)i1673) {

i1674 = true;
} else {

i1674 = false;

}
i1675 = i1674;
} else {

i1675 = false;

}
final Object i2247;
if ((boolean)i1675) {


final Object f1676 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "(~A instanceof Cons)", RuntimeContext.symbol("boolean"));

i2247 = f1676;
} else {


final Object i1680;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1678;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v1181).head)) {


final Object i1677;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1677 = true;
} else {

i1677 = false;

}
i1678 = i1677;
} else {

i1678 = false;

}
final Object i1679;
if ((boolean)i1678) {

i1679 = true;
} else {

i1679 = false;

}
i1680 = i1679;
} else {

i1680 = false;

}
final Object i2246;
if ((boolean)i1680) {
final Object f1682 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01681 = f1682;
final Object f1684 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a11683 = f1684;


















final Object f1685 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01681, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(a11683, new Cons(new Cons(RuntimeContext.symbol("cons"), new Cons(a01681, new Cons(a11683, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);



i2246 = f1685;
} else {


final Object i1691;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1689;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v1181).head)) {



final Object i1687;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1686;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1686 = true;
} else {

i1686 = false;

}
i1687 = i1686;
} else {

i1687 = false;

}
final Object i1688;
if ((boolean)i1687) {

i1688 = true;
} else {

i1688 = false;

}
i1689 = i1688;
} else {

i1689 = false;

}
final Object i1690;
if ((boolean)i1689) {

i1690 = true;
} else {

i1690 = false;

}
i1691 = i1690;
} else {

i1691 = false;

}
final Object i2245;
if ((boolean)i1691) {
final Object f1693 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a11692 = f1693;














final Object f1694 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a11692, new Cons(new Cons(RuntimeContext.symbol("cons"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(a11692, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2245 = f1694;
} else {


final Object i1702;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1700;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v1181).head)) {



final Object i1698;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1696;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1695;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1695 = true;
} else {

i1695 = false;

}
i1696 = i1695;
} else {

i1696 = false;

}
final Object i1697;
if ((boolean)i1696) {

i1697 = true;
} else {

i1697 = false;

}
i1698 = i1697;
} else {

i1698 = false;

}
final Object i1699;
if ((boolean)i1698) {

i1699 = true;
} else {

i1699 = false;

}
i1700 = i1699;
} else {

i1700 = false;

}
final Object i1701;
if ((boolean)i1700) {

i1701 = true;
} else {

i1701 = false;

}
i1702 = i1701;
} else {

i1702 = false;

}
final Object i2244;
if ((boolean)i1702) {





final Object f1703 = TwoParams.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, ((Cons)((Cons)((Cons)v1181).tail).tail).head, v1182, v1183, "new Cons(~A, ~A)", RuntimeContext.symbol("cons"));

i2244 = f1703;
} else {


final Object i1707;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1705;
if ((boolean)Lang.equals(RuntimeContext.symbol("hd"), ((Cons)v1181).head)) {


final Object i1704;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1704 = true;
} else {

i1704 = false;

}
i1705 = i1704;
} else {

i1705 = false;

}
final Object i1706;
if ((boolean)i1705) {

i1706 = true;
} else {

i1706 = false;

}
i1707 = i1706;
} else {

i1707 = false;

}
final Object i2243;
if ((boolean)i1707) {
final Object f1709 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01708 = f1709;










final Object f1710 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01708, new Cons(new Cons(RuntimeContext.symbol("hd"), new Cons(a01708, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2243 = f1710;
} else {


final Object i1716;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1714;
if ((boolean)Lang.equals(RuntimeContext.symbol("hd"), ((Cons)v1181).head)) {



final Object i1712;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1711;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1711 = true;
} else {

i1711 = false;

}
i1712 = i1711;
} else {

i1712 = false;

}
final Object i1713;
if ((boolean)i1712) {

i1713 = true;
} else {

i1713 = false;

}
i1714 = i1713;
} else {

i1714 = false;

}
final Object i1715;
if ((boolean)i1714) {

i1715 = true;
} else {

i1715 = false;

}
i1716 = i1715;
} else {

i1716 = false;

}
final Object i2242;
if ((boolean)i1716) {


final Object f1717 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "((Cons)~A).head", RuntimeContext.symbol("object"));

i2242 = f1717;
} else {


final Object i1721;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1719;
if ((boolean)Lang.equals(RuntimeContext.symbol("tl"), ((Cons)v1181).head)) {


final Object i1718;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1718 = true;
} else {

i1718 = false;

}
i1719 = i1718;
} else {

i1719 = false;

}
final Object i1720;
if ((boolean)i1719) {

i1720 = true;
} else {

i1720 = false;

}
i1721 = i1720;
} else {

i1721 = false;

}
final Object i2241;
if ((boolean)i1721) {
final Object f1723 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01722 = f1723;










final Object f1724 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01722, new Cons(new Cons(RuntimeContext.symbol("tl"), new Cons(a01722, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2241 = f1724;
} else {


final Object i1730;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1728;
if ((boolean)Lang.equals(RuntimeContext.symbol("tl"), ((Cons)v1181).head)) {



final Object i1726;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1725;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1725 = true;
} else {

i1725 = false;

}
i1726 = i1725;
} else {

i1726 = false;

}
final Object i1727;
if ((boolean)i1726) {

i1727 = true;
} else {

i1727 = false;

}
i1728 = i1727;
} else {

i1728 = false;

}
final Object i1729;
if ((boolean)i1728) {

i1729 = true;
} else {

i1729 = false;

}
i1730 = i1729;
} else {

i1730 = false;

}
final Object i2240;
if ((boolean)i1730) {


final Object f1731 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "((Cons)~A).tail", RuntimeContext.symbol("object"));

i2240 = f1731;
} else {


final Object i1735;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1733;
if ((boolean)Lang.equals(RuntimeContext.symbol("freeze"), ((Cons)v1181).head)) {


final Object i1732;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1732 = true;
} else {

i1732 = false;

}
i1733 = i1732;
} else {

i1733 = false;

}
final Object i1734;
if ((boolean)i1733) {

i1734 = true;
} else {

i1734 = false;

}
i1735 = i1734;
} else {

i1735 = false;

}
final Object i2239;
if ((boolean)i1735) {
final Object f1737 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object expression1736 = f1737;










final Object f1738 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(expression1736, new Cons(new Cons(RuntimeContext.symbol("freeze"), new Cons(expression1736, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2239 = f1738;
} else {


final Object i1744;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1742;
if ((boolean)Lang.equals(RuntimeContext.symbol("freeze"), ((Cons)v1181).head)) {



final Object i1740;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1739;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1739 = true;
} else {

i1739 = false;

}
i1740 = i1739;
} else {

i1740 = false;

}
final Object i1741;
if ((boolean)i1740) {

i1741 = true;
} else {

i1741 = false;

}
i1742 = i1741;
} else {

i1742 = false;

}
final Object i1743;
if ((boolean)i1742) {

i1743 = true;
} else {

i1743 = false;

}
i1744 = i1743;
} else {

i1744 = false;

}
final Object i2238;
if ((boolean)i1744) {





final Object f1745 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(Nil.NIL, ((Cons)v1181).tail)), RuntimeContext.symbol("lambda"), v1183);

i2238 = f1745;
} else {


final Object i1749;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1747;
if ((boolean)Lang.equals(RuntimeContext.symbol("eval-kl"), ((Cons)v1181).head)) {


final Object i1746;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1746 = true;
} else {

i1746 = false;

}
i1747 = i1746;
} else {

i1747 = false;

}
final Object i1748;
if ((boolean)i1747) {

i1748 = true;
} else {

i1748 = false;

}
i1749 = i1748;
} else {

i1749 = false;

}
final Object i2237;
if ((boolean)i1749) {
final Object f1751 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object expression1750 = f1751;










final Object f1752 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(expression1750, new Cons(new Cons(RuntimeContext.symbol("eval-kl"), new Cons(expression1750, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2237 = f1752;
} else {


final Object i1758;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1756;
if ((boolean)Lang.equals(RuntimeContext.symbol("eval-kl"), ((Cons)v1181).head)) {



final Object i1754;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1753;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1753 = true;
} else {

i1753 = false;

}
i1754 = i1753;
} else {

i1754 = false;

}
final Object i1755;
if ((boolean)i1754) {

i1755 = true;
} else {

i1755 = false;

}
i1756 = i1755;
} else {

i1756 = false;

}
final Object i1757;
if ((boolean)i1756) {

i1757 = true;
} else {

i1757 = false;

}
i1758 = i1757;
} else {

i1758 = false;

}
final Object i2236;
if ((boolean)i1758) {


final Object f1759 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "RuntimeContext.evalKl(~A)", RuntimeContext.symbol("object"));

i2236 = f1759;
} else {


final Object i1763;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1761;
if ((boolean)Lang.equals(RuntimeContext.symbol("number?"), ((Cons)v1181).head)) {


final Object i1760;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1760 = true;
} else {

i1760 = false;

}
i1761 = i1760;
} else {

i1761 = false;

}
final Object i1762;
if ((boolean)i1761) {

i1762 = true;
} else {

i1762 = false;

}
i1763 = i1762;
} else {

i1763 = false;

}
final Object i2235;
if ((boolean)i1763) {
final Object f1765 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01764 = f1765;










final Object f1766 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01764, new Cons(new Cons(RuntimeContext.symbol("number?"), new Cons(a01764, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2235 = f1766;
} else {


final Object i1772;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1770;
if ((boolean)Lang.equals(RuntimeContext.symbol("number?"), ((Cons)v1181).head)) {



final Object i1768;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1767;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1767 = true;
} else {

i1767 = false;

}
i1768 = i1767;
} else {

i1768 = false;

}
final Object i1769;
if ((boolean)i1768) {

i1769 = true;
} else {

i1769 = false;

}
i1770 = i1769;
} else {

i1770 = false;

}
final Object i1771;
if ((boolean)i1770) {

i1771 = true;
} else {

i1771 = false;

}
i1772 = i1771;
} else {

i1772 = false;

}
final Object i2234;
if ((boolean)i1772) {


final Object f1774 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("object"), v1183);

final Object a0TOxDO1773 = f1774;
final Object f1775 = Fst.LAMBDA.apply(a0TOxDO1773);
final Object f1776 = Atp.LAMBDA.apply(f1775, Nil.NIL);
final Object f1777 = IntmakeString.LAMBDA.apply("~A~%", f1776);
final Object f1778 = Third.LAMBDA.apply(a0TOxDO1773);

final Object i1781;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), f1778)) {


final Object f1779 = FindFirstQ.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1183);


final Object i1780;
if ((boolean)!((boolean)f1779)) {

i1780 = true;
} else {

i1780 = false;

}
i1781 = i1780;
} else {

i1781 = false;

}
final Object i1791;
if ((boolean)i1781) {

i1791 = "false";
} else {
final Object f1782 = Third.LAMBDA.apply(a0TOxDO1773);

final Object i1790;
if ((boolean)Lang.equals(RuntimeContext.symbol("string"), f1782)) {

i1790 = "false";
} else {
final Object f1783 = Third.LAMBDA.apply(a0TOxDO1773);
final Object f1784 = NumericTypeQ.LAMBDA.apply(f1783);

final Object i1789;
if ((boolean)f1784) {

i1789 = "true";
} else {

final Object i1788;
if ((boolean)true) {
final Object f1785 = Second.LAMBDA.apply(a0TOxDO1773);
final Object f1786 = Atp.LAMBDA.apply(f1785, Nil.NIL);
final Object f1787 = IntmakeString.LAMBDA.apply("(~A instanceof Number)", f1786);

i1788 = f1787;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1789 = i1788;

}
i1790 = i1789;

}
i1791 = i1790;

}final Object f1792 = Atp.LAMBDA.apply(i1791, RuntimeContext.symbol("boolean"));
final Object f1793 = Atp.LAMBDA.apply(f1777, f1792);


i2234 = f1793;
} else {


final Object i1796;
if ((boolean)(v1181 instanceof Cons)) {









final Object f1794 = ElementQ.LAMBDA.apply(((Cons)v1181).head, new Cons(RuntimeContext.symbol("+"), new Cons(RuntimeContext.symbol("-"), new Cons(RuntimeContext.symbol("*"), new Cons(RuntimeContext.symbol("/"), Nil.NIL)))));

final Object i1795;
if ((boolean)f1794) {

i1795 = true;
} else {

i1795 = false;

}
i1796 = i1795;
} else {

i1796 = false;

}
final Object i2233;
if ((boolean)i1796) {


final Object f1797 = Arithmetic.LAMBDA.apply(((Cons)v1181).head, ((Cons)v1181).tail, v1183);

i2233 = f1797;
} else {


final Object i1800;
if ((boolean)(v1181 instanceof Cons)) {









final Object f1798 = ElementQ.LAMBDA.apply(((Cons)v1181).head, new Cons(RuntimeContext.symbol("<"), new Cons(RuntimeContext.symbol(">"), new Cons(RuntimeContext.symbol("<="), new Cons(RuntimeContext.symbol(">="), Nil.NIL)))));

final Object i1799;
if ((boolean)f1798) {

i1799 = true;
} else {

i1799 = false;

}
i1800 = i1799;
} else {

i1800 = false;

}
final Object i2232;
if ((boolean)i1800) {


final Object f1801 = Comparison.LAMBDA.apply(((Cons)v1181).head, ((Cons)v1181).tail, v1183);

i2232 = f1801;
} else {


final Object i1805;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1803;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v1181).head)) {


final Object i1802;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1802 = true;
} else {

i1802 = false;

}
i1803 = i1802;
} else {

i1803 = false;

}
final Object i1804;
if ((boolean)i1803) {

i1804 = true;
} else {

i1804 = false;

}
i1805 = i1804;
} else {

i1805 = false;

}
final Object i2231;
if ((boolean)i1805) {
final Object f1807 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01806 = f1807;
final Object f1809 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a11808 = f1809;


















final Object f1810 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01806, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(a11808, new Cons(new Cons(RuntimeContext.symbol("="), new Cons(a01806, new Cons(a11808, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);



i2231 = f1810;
} else {


final Object i1816;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1814;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v1181).head)) {



final Object i1812;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1811;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1811 = true;
} else {

i1811 = false;

}
i1812 = i1811;
} else {

i1812 = false;

}
final Object i1813;
if ((boolean)i1812) {

i1813 = true;
} else {

i1813 = false;

}
i1814 = i1813;
} else {

i1814 = false;

}
final Object i1815;
if ((boolean)i1814) {

i1815 = true;
} else {

i1815 = false;

}
i1816 = i1815;
} else {

i1816 = false;

}
final Object i2230;
if ((boolean)i1816) {
final Object f1818 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a11817 = f1818;














final Object f1819 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a11817, new Cons(new Cons(RuntimeContext.symbol("="), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(a11817, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2230 = f1819;
} else {


final Object i1827;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1825;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v1181).head)) {



final Object i1823;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1821;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1820;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1820 = true;
} else {

i1820 = false;

}
i1821 = i1820;
} else {

i1821 = false;

}
final Object i1822;
if ((boolean)i1821) {

i1822 = true;
} else {

i1822 = false;

}
i1823 = i1822;
} else {

i1823 = false;

}
final Object i1824;
if ((boolean)i1823) {

i1824 = true;
} else {

i1824 = false;

}
i1825 = i1824;
} else {

i1825 = false;

}
final Object i1826;
if ((boolean)i1825) {

i1826 = true;
} else {

i1826 = false;

}
i1827 = i1826;
} else {

i1827 = false;

}
final Object i2229;
if ((boolean)i1827) {

final Object i1829;
if ((boolean)Lang.equals(v1182, RuntimeContext.symbol("boolean"))) {

i1829 = true;
} else {

final Object i1828;
if ((boolean)Lang.equals(v1182, RuntimeContext.symbol("object"))) {

i1828 = true;
} else {

i1828 = false;

}
i1829 = i1828;

}
final Object i1854;
if ((boolean)i1829) {


final Object f1831 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("object"), v1183);

final Object pX01830 = f1831;



final Object f1833 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("object"), v1183);

final Object pX11832 = f1833;
final Object f1834 = Fst.LAMBDA.apply(pX01830);
final Object f1835 = Fst.LAMBDA.apply(pX11832);
final Object f1836 = Ats.LAMBDA.apply(f1834, f1835);
final Object f1837 = Third.LAMBDA.apply(pX01830);
final Object f1838 = PrimitiveTypeQ.LAMBDA.apply(f1837);

final Object i1849;
if ((boolean)f1838) {
final Object f1839 = Second.LAMBDA.apply(pX01830);
final Object f1840 = Second.LAMBDA.apply(pX11832);
final Object f1841 = Atp.LAMBDA.apply(f1840, Nil.NIL);
final Object f1842 = Atp.LAMBDA.apply(f1839, f1841);
final Object f1843 = IntmakeString.LAMBDA.apply("Lang.equals(~A, ~A)", f1842);

i1849 = f1843;
} else {
final Object f1844 = Second.LAMBDA.apply(pX01830);
final Object f1845 = Second.LAMBDA.apply(pX11832);
final Object f1846 = Atp.LAMBDA.apply(f1845, Nil.NIL);
final Object f1847 = Atp.LAMBDA.apply(f1844, f1846);
final Object f1848 = IntmakeString.LAMBDA.apply("Lang.equals(~A, ~A)", f1847);

i1849 = f1848;

}final Object f1850 = Atp.LAMBDA.apply(i1849, RuntimeContext.symbol("boolean"));
final Object f1851 = Atp.LAMBDA.apply(f1836, f1850);



i1854 = f1851;
} else {
final Object f1852 = Atp.LAMBDA.apply(v1182, Nil.NIL);
final Object f1853 = IntmakeString.LAMBDA.apply("Expected boolean type assertion for = operator, but was ~A", f1852);

throw new SimpleError((String)f1853);


}
i2229 = i1854;
} else {


final Object i1858;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1856;
if ((boolean)Lang.equals(RuntimeContext.symbol("string?"), ((Cons)v1181).head)) {


final Object i1855;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1855 = true;
} else {

i1855 = false;

}
i1856 = i1855;
} else {

i1856 = false;

}
final Object i1857;
if ((boolean)i1856) {

i1857 = true;
} else {

i1857 = false;

}
i1858 = i1857;
} else {

i1858 = false;

}
final Object i2228;
if ((boolean)i1858) {
final Object f1860 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a01859 = f1860;










final Object f1861 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a01859, new Cons(new Cons(RuntimeContext.symbol("string?"), new Cons(a01859, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2228 = f1861;
} else {


final Object i1867;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1865;
if ((boolean)Lang.equals(RuntimeContext.symbol("string?"), ((Cons)v1181).head)) {



final Object i1863;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1862;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1862 = true;
} else {

i1862 = false;

}
i1863 = i1862;
} else {

i1863 = false;

}
final Object i1864;
if ((boolean)i1863) {

i1864 = true;
} else {

i1864 = false;

}
i1865 = i1864;
} else {

i1865 = false;

}
final Object i1866;
if ((boolean)i1865) {

i1866 = true;
} else {

i1866 = false;

}
i1867 = i1866;
} else {

i1867 = false;

}
final Object i2227;
if ((boolean)i1867) {


final Object f1869 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("string"), v1183);

final Object a0TOxDO1868 = f1869;
final Object f1870 = Fst.LAMBDA.apply(a0TOxDO1868);
final Object f1871 = Atp.LAMBDA.apply(f1870, Nil.NIL);
final Object f1872 = IntmakeString.LAMBDA.apply("~A~%", f1871);
final Object f1873 = Second.LAMBDA.apply(a0TOxDO1868);
final Object f1874 = Atp.LAMBDA.apply(f1873, Nil.NIL);
final Object f1875 = IntmakeString.LAMBDA.apply("(~A instanceof String)", f1874);
final Object f1876 = Atp.LAMBDA.apply(f1875, RuntimeContext.symbol("boolean"));
final Object f1877 = Atp.LAMBDA.apply(f1872, f1876);


i2227 = f1877;
} else {


final Object i1881;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1879;
if ((boolean)Lang.equals(RuntimeContext.symbol("tlstr"), ((Cons)v1181).head)) {


final Object i1878;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1878 = true;
} else {

i1878 = false;

}
i1879 = i1878;
} else {

i1879 = false;

}
final Object i1880;
if ((boolean)i1879) {

i1880 = true;
} else {

i1880 = false;

}
i1881 = i1880;
} else {

i1881 = false;

}
final Object i2226;
if ((boolean)i1881) {
final Object f1883 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string1882 = f1883;




final Object f1884 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("tlstr"), new Cons(string1882, Nil.NIL)), RuntimeContext.symbol("string"), v1183);


i2226 = f1884;
} else {


final Object i1890;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1888;
if ((boolean)Lang.equals(RuntimeContext.symbol("tlstr"), ((Cons)v1181).head)) {



final Object i1886;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1885;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1885 = true;
} else {

i1885 = false;

}
i1886 = i1885;
} else {

i1886 = false;

}
final Object i1887;
if ((boolean)i1886) {

i1887 = true;
} else {

i1887 = false;

}
i1888 = i1887;
} else {

i1888 = false;

}
final Object i1889;
if ((boolean)i1888) {

i1889 = true;
} else {

i1889 = false;

}
i1890 = i1889;
} else {

i1890 = false;

}
final Object i2225;
if ((boolean)i1890) {


final Object f1892 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("string"), v1183);

final Object stringTOxDO1891 = f1892;
final Object f1893 = Fst.LAMBDA.apply(stringTOxDO1891);
final Object f1894 = Atp.LAMBDA.apply(f1893, Nil.NIL);
final Object f1895 = IntmakeString.LAMBDA.apply("~A~%", f1894);
final Object f1896 = Second.LAMBDA.apply(stringTOxDO1891);
final Object f1897 = Atp.LAMBDA.apply(f1896, Nil.NIL);
final Object f1898 = IntmakeString.LAMBDA.apply("((String)~A).substring(1)", f1897);
final Object f1899 = Atp.LAMBDA.apply(f1898, RuntimeContext.symbol("string"));
final Object f1900 = Atp.LAMBDA.apply(f1895, f1899);


i2225 = f1900;
} else {


final Object i1904;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1902;
if ((boolean)Lang.equals(RuntimeContext.symbol("pos"), ((Cons)v1181).head)) {


final Object i1901;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1901 = true;
} else {

i1901 = false;

}
i1902 = i1901;
} else {

i1902 = false;

}
final Object i1903;
if ((boolean)i1902) {

i1903 = true;
} else {

i1903 = false;

}
i1904 = i1903;
} else {

i1904 = false;

}
final Object i2224;
if ((boolean)i1904) {
final Object f1906 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string1905 = f1906;
final Object f1908 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object position1907 = f1908;






final Object f1909 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("pos"), new Cons(string1905, new Cons(position1907, Nil.NIL))), RuntimeContext.symbol("boolean"), v1183);



i2224 = f1909;
} else {


final Object i1915;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1913;
if ((boolean)Lang.equals(RuntimeContext.symbol("pos"), ((Cons)v1181).head)) {



final Object i1911;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1910;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1910 = true;
} else {

i1910 = false;

}
i1911 = i1910;
} else {

i1911 = false;

}
final Object i1912;
if ((boolean)i1911) {

i1912 = true;
} else {

i1912 = false;

}
i1913 = i1912;
} else {

i1913 = false;

}
final Object i1914;
if ((boolean)i1913) {

i1914 = true;
} else {

i1914 = false;

}
i1915 = i1914;
} else {

i1915 = false;

}
final Object i2223;
if ((boolean)i1915) {
final Object f1917 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object position1916 = f1917;








final Object f1918 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("pos"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(position1916, Nil.NIL))), RuntimeContext.symbol("boolean"), v1183);


i2223 = f1918;
} else {


final Object i1926;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1924;
if ((boolean)Lang.equals(RuntimeContext.symbol("pos"), ((Cons)v1181).head)) {



final Object i1922;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1920;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1919;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1919 = true;
} else {

i1919 = false;

}
i1920 = i1919;
} else {

i1920 = false;

}
final Object i1921;
if ((boolean)i1920) {

i1921 = true;
} else {

i1921 = false;

}
i1922 = i1921;
} else {

i1922 = false;

}
final Object i1923;
if ((boolean)i1922) {

i1923 = true;
} else {

i1923 = false;

}
i1924 = i1923;
} else {

i1924 = false;

}
final Object i1925;
if ((boolean)i1924) {

i1925 = true;
} else {

i1925 = false;

}
i1926 = i1925;
} else {

i1926 = false;

}
final Object i2222;
if ((boolean)i1926) {


final Object f1928 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("string"), v1183);

final Object stringTOxDO1927 = f1928;



final Object f1930 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("number"), v1183);

final Object positionTOxDO1929 = f1930;
final Object f1931 = Fst.LAMBDA.apply(stringTOxDO1927);
final Object f1932 = Fst.LAMBDA.apply(positionTOxDO1929);
final Object f1933 = Atp.LAMBDA.apply(f1932, Nil.NIL);
final Object f1934 = Atp.LAMBDA.apply(f1931, f1933);
final Object f1935 = IntmakeString.LAMBDA.apply("~A~%~A~%", f1934);
final Object f1936 = Second.LAMBDA.apply(stringTOxDO1927);
final Object f1937 = Second.LAMBDA.apply(positionTOxDO1929);
final Object f1938 = Second.LAMBDA.apply(positionTOxDO1929);
final Object f1939 = Atp.LAMBDA.apply(f1938, Nil.NIL);
final Object f1940 = Atp.LAMBDA.apply(f1937, f1939);
final Object f1941 = Atp.LAMBDA.apply(f1936, f1940);
final Object f1942 = IntmakeString.LAMBDA.apply("((String)~A).substring(((Number)~A).intValue(), ((Number)~A).intValue()+1)", f1941);
final Object f1943 = Atp.LAMBDA.apply(f1942, RuntimeContext.symbol("string"));
final Object f1944 = Atp.LAMBDA.apply(f1935, f1943);



i2222 = f1944;
} else {


final Object i1948;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1946;
if ((boolean)Lang.equals(RuntimeContext.symbol("cn"), ((Cons)v1181).head)) {


final Object i1945;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1945 = true;
} else {

i1945 = false;

}
i1946 = i1945;
} else {

i1946 = false;

}
final Object i1947;
if ((boolean)i1946) {

i1947 = true;
} else {

i1947 = false;

}
i1948 = i1947;
} else {

i1948 = false;

}
final Object i2221;
if ((boolean)i1948) {
final Object f1950 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string01949 = f1950;
final Object f1952 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string11951 = f1952;


















final Object f1953 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(string01949, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(string11951, new Cons(new Cons(RuntimeContext.symbol("cn"), new Cons(string01949, new Cons(string11951, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);



i2221 = f1953;
} else {


final Object i1959;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1957;
if ((boolean)Lang.equals(RuntimeContext.symbol("cn"), ((Cons)v1181).head)) {



final Object i1955;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1954;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1954 = true;
} else {

i1954 = false;

}
i1955 = i1954;
} else {

i1955 = false;

}
final Object i1956;
if ((boolean)i1955) {

i1956 = true;
} else {

i1956 = false;

}
i1957 = i1956;
} else {

i1957 = false;

}
final Object i1958;
if ((boolean)i1957) {

i1958 = true;
} else {

i1958 = false;

}
i1959 = i1958;
} else {

i1959 = false;

}
final Object i2220;
if ((boolean)i1959) {
final Object f1961 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string11960 = f1961;














final Object f1962 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(string11960, new Cons(new Cons(RuntimeContext.symbol("cn"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(string11960, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2220 = f1962;
} else {


final Object i1970;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1968;
if ((boolean)Lang.equals(RuntimeContext.symbol("cn"), ((Cons)v1181).head)) {



final Object i1966;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i1964;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i1963;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i1963 = true;
} else {

i1963 = false;

}
i1964 = i1963;
} else {

i1964 = false;

}
final Object i1965;
if ((boolean)i1964) {

i1965 = true;
} else {

i1965 = false;

}
i1966 = i1965;
} else {

i1966 = false;

}
final Object i1967;
if ((boolean)i1966) {

i1967 = true;
} else {

i1967 = false;

}
i1968 = i1967;
} else {

i1968 = false;

}
final Object i1969;
if ((boolean)i1968) {

i1969 = true;
} else {

i1969 = false;

}
i1970 = i1969;
} else {

i1970 = false;

}
final Object i2219;
if ((boolean)i1970) {





final Object f1971 = TwoParams.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, ((Cons)((Cons)((Cons)v1181).tail).tail).head, v1182, v1183, "((String)~A + (String)~A)", RuntimeContext.symbol("string"));

i2219 = f1971;
} else {


final Object i1975;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1973;
if ((boolean)Lang.equals(RuntimeContext.symbol("n->string"), ((Cons)v1181).head)) {


final Object i1972;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1972 = true;
} else {

i1972 = false;

}
i1973 = i1972;
} else {

i1973 = false;

}
final Object i1974;
if ((boolean)i1973) {

i1974 = true;
} else {

i1974 = false;

}
i1975 = i1974;
} else {

i1975 = false;

}
final Object i2218;
if ((boolean)i1975) {
final Object f1977 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object number1976 = f1977;










final Object f1978 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(number1976, new Cons(new Cons(RuntimeContext.symbol("n->string"), new Cons(number1976, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2218 = f1978;
} else {


final Object i1984;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1982;
if ((boolean)Lang.equals(RuntimeContext.symbol("n->string"), ((Cons)v1181).head)) {



final Object i1980;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i1979;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i1979 = true;
} else {

i1979 = false;

}
i1980 = i1979;
} else {

i1980 = false;

}
final Object i1981;
if ((boolean)i1980) {

i1981 = true;
} else {

i1981 = false;

}
i1982 = i1981;
} else {

i1982 = false;

}
final Object i1983;
if ((boolean)i1982) {

i1983 = true;
} else {

i1983 = false;

}
i1984 = i1983;
} else {

i1984 = false;

}
final Object i2217;
if ((boolean)i1984) {


final Object f1986 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("number"), v1183);

final Object numberTOxDO1985 = f1986;
final Object f1988 = Third.LAMBDA.apply(numberTOxDO1985);

final Object i1989;
if ((boolean)Lang.equals(RuntimeContext.symbol("number"), f1988)) {

i1989 = "new String(Character.toChars(((Number) (~A)).intValue()))";
} else {

i1989 = "new String(Character.toChars(((Number) (~A)).intValue()))";

}
final Object template1987 = i1989;
final Object f1990 = Fst.LAMBDA.apply(numberTOxDO1985);
final Object f1991 = Atp.LAMBDA.apply(f1990, Nil.NIL);
final Object f1992 = IntmakeString.LAMBDA.apply("~A~%", f1991);
final Object f1993 = Second.LAMBDA.apply(numberTOxDO1985);
final Object f1994 = Atp.LAMBDA.apply(f1993, Nil.NIL);
final Object f1995 = IntmakeString.LAMBDA.apply(template1987, f1994);
final Object f1996 = Atp.LAMBDA.apply(f1995, RuntimeContext.symbol("string"));
final Object f1997 = Atp.LAMBDA.apply(f1992, f1996);



i2217 = f1997;
} else {


final Object i2001;
if ((boolean)(v1181 instanceof Cons)) {


final Object i1999;
if ((boolean)Lang.equals(RuntimeContext.symbol("string->n"), ((Cons)v1181).head)) {


final Object i1998;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i1998 = true;
} else {

i1998 = false;

}
i1999 = i1998;
} else {

i1999 = false;

}
final Object i2000;
if ((boolean)i1999) {

i2000 = true;
} else {

i2000 = false;

}
i2001 = i2000;
} else {

i2001 = false;

}
final Object i2216;
if ((boolean)i2001) {
final Object f2003 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string2002 = f2003;










final Object f2004 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(string2002, new Cons(new Cons(RuntimeContext.symbol("string->n"), new Cons(string2002, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2216 = f2004;
} else {


final Object i2010;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2008;
if ((boolean)Lang.equals(RuntimeContext.symbol("string->n"), ((Cons)v1181).head)) {



final Object i2006;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i2005;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i2005 = true;
} else {

i2005 = false;

}
i2006 = i2005;
} else {

i2006 = false;

}
final Object i2007;
if ((boolean)i2006) {

i2007 = true;
} else {

i2007 = false;

}
i2008 = i2007;
} else {

i2008 = false;

}
final Object i2009;
if ((boolean)i2008) {

i2009 = true;
} else {

i2009 = false;

}
i2010 = i2009;
} else {

i2010 = false;

}
final Object i2215;
if ((boolean)i2010) {


final Object f2011 = SingleParam.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, v1182, v1183, "Integer.valueOf(((String) ~A).charAt(0))", RuntimeContext.symbol("number"));

i2215 = f2011;
} else {


final Object i2015;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2013;
if ((boolean)Lang.equals(RuntimeContext.symbol("absvector"), ((Cons)v1181).head)) {


final Object i2012;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i2012 = true;
} else {

i2012 = false;

}
i2013 = i2012;
} else {

i2013 = false;

}
final Object i2014;
if ((boolean)i2013) {

i2014 = true;
} else {

i2014 = false;

}
i2015 = i2014;
} else {

i2015 = false;

}
final Object i2214;
if ((boolean)i2015) {
final Object f2017 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object arg2016 = f2017;










final Object f2018 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg2016, new Cons(new Cons(RuntimeContext.symbol("absvector"), new Cons(arg2016, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v1183);


i2214 = f2018;
} else {


final Object i2024;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2022;
if ((boolean)Lang.equals(RuntimeContext.symbol("absvector"), ((Cons)v1181).head)) {



final Object i2020;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i2019;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i2019 = true;
} else {

i2019 = false;

}
i2020 = i2019;
} else {

i2020 = false;

}
final Object i2021;
if ((boolean)i2020) {

i2021 = true;
} else {

i2021 = false;

}
i2022 = i2021;
} else {

i2022 = false;

}
final Object i2023;
if ((boolean)i2022) {

i2023 = true;
} else {

i2023 = false;

}
i2024 = i2023;
} else {

i2024 = false;

}
final Object i2213;
if ((boolean)i2024) {


final Object f2026 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("integer"), v1183);

final Object sizeTOxDO2025 = f2026;
final Object f2028 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object result2027 = f2028;
final Object f2029 = Fst.LAMBDA.apply(sizeTOxDO2025);
final Object f2030 = Second.LAMBDA.apply(sizeTOxDO2025);
final Object f2031 = Atp.LAMBDA.apply(f2030, Nil.NIL);
final Object f2032 = Atp.LAMBDA.apply(result2027, f2031);
final Object f2033 = Atp.LAMBDA.apply(f2029, f2032);
final Object f2034 = IntmakeString.LAMBDA.apply("~A~%final Object[] ~A = new Object[((Number)~A).intValue()];~%", f2033);

final Object f2035 = Atp.LAMBDA.apply(String.valueOf(result2027), RuntimeContext.symbol("vector"));
final Object f2036 = Atp.LAMBDA.apply(f2034, f2035);



i2213 = f2036;
} else {


final Object i2046;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2044;
if ((boolean)Lang.equals(RuntimeContext.symbol("address->"), ((Cons)v1181).head)) {



final Object i2042;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i2040;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {





final Object i2038;
if ((boolean)(((Cons)((Cons)((Cons)v1181).tail).tail).tail instanceof Cons)) {





final Object i2037;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).tail)) {

i2037 = true;
} else {

i2037 = false;

}
i2038 = i2037;
} else {

i2038 = false;

}
final Object i2039;
if ((boolean)i2038) {

i2039 = true;
} else {

i2039 = false;

}
i2040 = i2039;
} else {

i2040 = false;

}
final Object i2041;
if ((boolean)i2040) {

i2041 = true;
} else {

i2041 = false;

}
i2042 = i2041;
} else {

i2042 = false;

}
final Object i2043;
if ((boolean)i2042) {

i2043 = true;
} else {

i2043 = false;

}
i2044 = i2043;
} else {

i2044 = false;

}
final Object i2045;
if ((boolean)i2044) {

i2045 = true;
} else {

i2045 = false;

}
i2046 = i2045;
} else {

i2046 = false;

}
final Object i2212;
if ((boolean)i2046) {


final Object f2048 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, RuntimeContext.symbol("vector"), v1183);

final Object vectorTOxDO2047 = f2048;



final Object f2050 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v1181).tail).tail).head, RuntimeContext.symbol("number"), v1183);

final Object indexTOxDO2049 = f2050;




final Object f2052 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1181).tail).tail).tail).head, RuntimeContext.symbol("object"), v1183);

final Object valueTOxDO2051 = f2052;
final Object f2053 = Fst.LAMBDA.apply(vectorTOxDO2047);
final Object f2054 = Fst.LAMBDA.apply(indexTOxDO2049);
final Object f2055 = Fst.LAMBDA.apply(valueTOxDO2051);
final Object f2056 = Second.LAMBDA.apply(vectorTOxDO2047);
final Object f2057 = Second.LAMBDA.apply(indexTOxDO2049);
final Object f2058 = Second.LAMBDA.apply(valueTOxDO2051);
final Object f2059 = Atp.LAMBDA.apply(f2058, Nil.NIL);
final Object f2060 = Atp.LAMBDA.apply(f2057, f2059);
final Object f2061 = Atp.LAMBDA.apply(f2056, f2060);
final Object f2062 = Atp.LAMBDA.apply(f2055, f2061);
final Object f2063 = Atp.LAMBDA.apply(f2054, f2062);
final Object f2064 = Atp.LAMBDA.apply(f2053, f2063);
final Object f2065 = IntmakeString.LAMBDA.apply("~A~%~A~%~A~%((Object[])~A)[((Number)~A).intValue()] = ~A;", f2064);
final Object f2066 = Second.LAMBDA.apply(vectorTOxDO2047);
final Object f2067 = Atp.LAMBDA.apply(f2066, RuntimeContext.symbol("vector"));
final Object f2068 = Atp.LAMBDA.apply(f2065, f2067);




i2212 = f2068;
} else {


final Object i2072;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2070;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-address"), ((Cons)v1181).head)) {


final Object i2069;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i2069 = true;
} else {

i2069 = false;

}
i2070 = i2069;
} else {

i2070 = false;

}
final Object i2071;
if ((boolean)i2070) {

i2071 = true;
} else {

i2071 = false;

}
i2072 = i2071;
} else {

i2072 = false;

}
final Object i2211;
if ((boolean)i2072) {
final Object f2074 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object vector2073 = f2074;
final Object f2076 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object index2075 = f2076;










final Object f2077 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(new Cons(RuntimeContext.symbol("<-address"), new Cons(vector2073, new Cons(index2075, Nil.NIL))), Nil.NIL)), RuntimeContext.symbol("lambda"), v1183);



i2211 = f2077;
} else {


final Object i2083;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2081;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-address"), ((Cons)v1181).head)) {



final Object i2079;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {



final Object i2078;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1181).tail).tail)) {

i2078 = true;
} else {

i2078 = false;

}
i2079 = i2078;
} else {

i2079 = false;

}
final Object i2080;
if ((boolean)i2079) {

i2080 = true;
} else {

i2080 = false;

}
i2081 = i2080;
} else {

i2081 = false;

}
final Object i2082;
if ((boolean)i2081) {

i2082 = true;
} else {

i2082 = false;

}
i2083 = i2082;
} else {

i2083 = false;

}
final Object i2210;
if ((boolean)i2083) {
final Object f2085 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object index2084 = f2085;












final Object f2086 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(new Cons(RuntimeContext.symbol("<-address"), new Cons(((Cons)((Cons)v1181).tail).head, new Cons(index2084, Nil.NIL))), Nil.NIL)), RuntimeContext.symbol("lambda"), v1183);


i2210 = f2086;
} else {


final Object i2094;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2092;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-address"), ((Cons)v1181).head)) {



final Object i2090;
if ((boolean)(((Cons)v1181).tail instanceof Cons)) {




final Object i2088;
if ((boolean)(((Cons)((Cons)v1181).tail).tail instanceof Cons)) {




final Object i2087;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1181).tail).tail).tail)) {

i2087 = true;
} else {

i2087 = false;

}
i2088 = i2087;
} else {

i2088 = false;

}
final Object i2089;
if ((boolean)i2088) {

i2089 = true;
} else {

i2089 = false;

}
i2090 = i2089;
} else {

i2090 = false;

}
final Object i2091;
if ((boolean)i2090) {

i2091 = true;
} else {

i2091 = false;

}
i2092 = i2091;
} else {

i2092 = false;

}
final Object i2093;
if ((boolean)i2092) {

i2093 = true;
} else {

i2093 = false;

}
i2094 = i2093;
} else {

i2094 = false;

}
final Object i2209;
if ((boolean)i2094) {





final Object f2095 = TwoParams.LAMBDA.apply(((Cons)((Cons)v1181).tail).head, ((Cons)((Cons)((Cons)v1181).tail).tail).head, v1182, v1183, "((Object[])~A)[((Number)~A).intValue()]", RuntimeContext.symbol("object"));

i2209 = f2095;
} else {


final Object i2099;
if ((boolean)(v1181 instanceof Cons)) {


final Object i2097;
if ((boolean)Lang.equals(RuntimeContext.symbol("fail"), ((Cons)v1181).head)) {


final Object i2096;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v1181).tail)) {

i2096 = true;
} else {

i2096 = false;

}
i2097 = i2096;
} else {

i2097 = false;

}
final Object i2098;
if ((boolean)i2097) {

i2098 = true;
} else {

i2098 = false;

}
i2099 = i2098;
} else {

i2099 = false;

}
final Object i2208;
if ((boolean)i2099) {
final Object f2100 = Atp.LAMBDA.apply("null", RuntimeContext.symbol("object"));
final Object f2101 = Atp.LAMBDA.apply("", f2100);

i2208 = f2101;
} else {


final Object i2207;
if ((boolean)(v1181 instanceof Cons)) {




final Object directQ2102 = !((boolean)(((Cons)v1181).head instanceof Cons));



final Object i2108;
if ((boolean)(((Cons)v1181).head instanceof Cons)) {

final Object f2104 = KlToJavaTraverse.LAMBDA.apply(((Cons)v1181).head, RuntimeContext.symbol("lambda"), v1183);

i2108 = f2104;
} else {

final Object f2105 = ToVar.LAMBDA.apply(((Cons)v1181).head);
final Object f2106 = Atp.LAMBDA.apply(f2105, RuntimeContext.symbol("symbol"));
final Object f2107 = Atp.LAMBDA.apply("", f2106);

i2108 = f2107;

}
final Object funcTOxDO2103 = i2108;
final Object f2110 = Flip3.LAMBDA.apply(RuntimeContext.symbol("kl-to-java-traverse"));
final Object f2111 = ((Lambda)f2110).apply(v1183, RuntimeContext.symbol("object"));

final Object f2112 = Map.LAMBDA.apply(f2111, ((Cons)v1181).tail);

final Object evaledArgs2109 = f2112;
final Object f2114 = Fst.LAMBDA.apply();
final Object f2115 = Map.LAMBDA.apply(f2114, evaledArgs2109);
final Object f2116 = StringJoin.LAMBDA.apply("", f2115);

final Object argsPrepString2113 = f2116;
final Object f2118 = Second.LAMBDA.apply();
final Object f2119 = Map.LAMBDA.apply(f2118, evaledArgs2109);
final Object f2120 = StringJoin.LAMBDA.apply(", ", f2119);

final Object argsString2117 = f2120;
final Object f2122 = Fst.LAMBDA.apply(funcTOxDO2103);

final Object funcPrepString2121 = f2122;
final Object f2124 = Second.LAMBDA.apply(funcTOxDO2103);

final Object funcString2123 = f2124;
final Lambda l2127 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f2126 = Third.LAMBDA.apply(x);

    return Lang.equals(RuntimeContext.symbol("unreachable"), f2126);
  }
};final Object f2128 = ListMatches.LAMBDA.apply(l2127, evaledArgs2109);

final Object unreachableQ2125 = f2128;
final Object f2130 = Gensym.LAMBDA.apply(RuntimeContext.symbol("f"));

final Object result2129 = f2130;

final Object i2170;
if ((boolean)unreachableQ2125) {

i2170 = "";
} else {

final Object f2132 = SymbolQ.LAMBDA.apply(((Cons)v1181).head);

final Object i2135;
if ((boolean)f2132) {


final Object f2133 = IsJavaCall.LAMBDA.apply(String.valueOf(((Cons)v1181).head));

final Object i2134;
if ((boolean)f2133) {

i2134 = true;
} else {

i2134 = false;

}
i2135 = i2134;
} else {

i2135 = false;

}
final Object i2169;
if ((boolean)i2135) {


final Object f2136 = Atp.LAMBDA.apply(argsString2117, Nil.NIL);
final Object f2137 = Atp.LAMBDA.apply(String.valueOf(((Cons)v1181).head), f2136);
final Object f2138 = Atp.LAMBDA.apply(result2129, f2137);
final Object f2139 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.javaDispatch(\"~A\").apply(~A);~%", f2138);

i2169 = f2139;
} else {

final Object f2140 = FindFirstQ.LAMBDA.apply(((Cons)v1181).head, v1183);

final Object i2168;
if ((boolean)f2140) {
final Object f2141 = Atp.LAMBDA.apply(argsString2117, Nil.NIL);
final Object f2142 = Atp.LAMBDA.apply(funcString2123, f2141);
final Object f2143 = Atp.LAMBDA.apply(result2129, f2142);
final Object f2144 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.dispatch(~A).apply(~A);~%", f2143);

i2168 = f2144;
} else {

final Object i2167;
if ((boolean)directQ2102) {


final Object f2145 = NameToClassName.LAMBDA.apply(String.valueOf(((Cons)v1181).head));
final Object f2146 = Atp.LAMBDA.apply(argsString2117, Nil.NIL);
final Object f2147 = Atp.LAMBDA.apply(f2145, f2146);
final Object f2148 = Atp.LAMBDA.apply(result2129, f2147);
final Object f2149 = IntmakeString.LAMBDA.apply("final Object ~A = ~A.LAMBDA.apply(~A);~%", f2148);

i2167 = f2149;
} else {
final Object f2150 = Third.LAMBDA.apply(funcTOxDO2103);

final Object i2166;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), f2150)) {
final Object f2151 = Atp.LAMBDA.apply(argsString2117, Nil.NIL);
final Object f2152 = Atp.LAMBDA.apply(funcString2123, f2151);
final Object f2153 = Atp.LAMBDA.apply(result2129, f2152);
final Object f2154 = IntmakeString.LAMBDA.apply("final Object ~A = ((Lambda)~A).apply(~A);~%", f2153);

i2166 = f2154;
} else {
final Object f2155 = Third.LAMBDA.apply(funcTOxDO2103);

final Object i2165;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), f2155)) {
final Object f2156 = Atp.LAMBDA.apply(argsString2117, Nil.NIL);
final Object f2157 = Atp.LAMBDA.apply(funcString2123, f2156);
final Object f2158 = Atp.LAMBDA.apply(result2129, f2157);
final Object f2159 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.symbolDispatch((Symbol)~A).apply(~A);~%", f2158);

i2165 = f2159;
} else {

final Object i2164;
if ((boolean)true) {
final Object f2160 = Atp.LAMBDA.apply(argsString2117, Nil.NIL);
final Object f2161 = Atp.LAMBDA.apply(funcString2123, f2160);
final Object f2162 = Atp.LAMBDA.apply(result2129, f2161);
final Object f2163 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.dispatch(~A).apply(~A);~%", f2162);

i2164 = f2163;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2165 = i2164;

}
i2166 = i2165;

}
i2167 = i2166;

}
i2168 = i2167;

}
i2169 = i2168;

}
i2170 = i2169;

}
final Object eval2131 = i2170;
final Object f2171 = Atp.LAMBDA.apply(eval2131, Nil.NIL);
final Object f2172 = Atp.LAMBDA.apply(argsPrepString2113, f2171);
final Object f2173 = Atp.LAMBDA.apply(funcPrepString2121, f2172);
final Object f2174 = IntmakeString.LAMBDA.apply("~A~A~A", f2173);


final Object i2175;
if ((boolean)unreachableQ2125) {

i2175 = RuntimeContext.symbol("unreachable");
} else {

i2175 = v1182;

}final Object f2176 = Atp.LAMBDA.apply(String.valueOf(result2129), i2175);
final Object f2177 = Atp.LAMBDA.apply(f2174, f2176);











i2207 = f2177;
} else {

final Object i2206;
if ((boolean)Lang.equals(Nil.NIL, v1181)) {
final Object f2178 = Atp.LAMBDA.apply("Nil.NIL", RuntimeContext.symbol("nil"));
final Object f2179 = Atp.LAMBDA.apply("", f2178);

i2206 = f2179;
} else {

final Object i2205;
if ((boolean)true) {




final Object str2180 = String.valueOf(v1181);
final Object f2181 = FindFirstQ.LAMBDA.apply(v1181, v1183);

final Object i2200;
if ((boolean)f2181) {
final Object f2182 = GetSecond.LAMBDA.apply(v1181, v1183);

i2200 = f2182;
} else {
final Object f2183 = SymbolQ.LAMBDA.apply(v1181);

final Object i2199;
if ((boolean)f2183) {
final Object f2184 = Atp.LAMBDA.apply(str2180, Nil.NIL);
final Object f2185 = IntmakeString.LAMBDA.apply("RuntimeContext.symbol(\"~A\")", f2184);

i2199 = f2185;
} else {


final Object i2198;
if ((boolean)(v1181 instanceof String)) {
final Object f2186 = EscapeJavaString.LAMBDA.apply(v1181);
final Object f2187 = Ats.LAMBDA.apply(f2186, "\"");
final Object f2188 = Ats.LAMBDA.apply("\"", f2187);

i2198 = f2188;
} else {
final Object f2189 = IntegerQ.LAMBDA.apply(v1181);

final Object i2197;
if ((boolean)f2189) {
final Object f2190 = Atp.LAMBDA.apply(v1181, Nil.NIL);
final Object f2191 = IntmakeString.LAMBDA.apply("~A", f2190);

i2197 = f2191;
} else {
final Object f2192 = FloatQ.LAMBDA.apply(v1181);

final Object i2196;
if ((boolean)f2192) {
final Object f2193 = Atp.LAMBDA.apply(v1181, Nil.NIL);
final Object f2194 = IntmakeString.LAMBDA.apply("~Ad", f2193);

i2196 = f2194;
} else {

final Object i2195;
if ((boolean)true) {

i2195 = str2180;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2196 = i2195;

}
i2197 = i2196;

}
i2198 = i2197;

}
i2199 = i2198;

}
i2200 = i2199;

}
final Object f2201 = TypeOf.LAMBDA.apply(v1181);
final Object f2202 = Atp.LAMBDA.apply(i2200, f2201);
final Object f2203 = Atp.LAMBDA.apply("", f2202);
final Object f2204 = Assert.LAMBDA.apply(!((boolean)(v1181 instanceof Cons)), "Invalid input to kl-to-java-traverse. List found where atom expected.", f2203);

i2205 = f2204;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2206 = i2205;

}
i2207 = i2206;

}
i2208 = i2207;

}
i2209 = i2208;

}
i2210 = i2209;

}
i2211 = i2210;

}
i2212 = i2211;

}
i2213 = i2212;

}
i2214 = i2213;

}
i2215 = i2214;

}
i2216 = i2215;

}
i2217 = i2216;

}
i2218 = i2217;

}
i2219 = i2218;

}
i2220 = i2219;

}
i2221 = i2220;

}
i2222 = i2221;

}
i2223 = i2222;

}
i2224 = i2223;

}
i2225 = i2224;

}
i2226 = i2225;

}
i2227 = i2226;

}
i2228 = i2227;

}
i2229 = i2228;

}
i2230 = i2229;

}
i2231 = i2230;

}
i2232 = i2231;

}
i2233 = i2232;

}
i2234 = i2233;

}
i2235 = i2234;

}
i2236 = i2235;

}
i2237 = i2236;

}
i2238 = i2237;

}
i2239 = i2238;

}
i2240 = i2239;

}
i2241 = i2240;

}
i2242 = i2241;

}
i2243 = i2242;

}
i2244 = i2243;

}
i2245 = i2244;

}
i2246 = i2245;

}
i2247 = i2246;

}
i2248 = i2247;

}
i2249 = i2248;

}
i2250 = i2249;

}
i2251 = i2250;

}
i2252 = i2251;

}
i2253 = i2252;

}
i2254 = i2253;

}
i2255 = i2254;

}
i2256 = i2255;

}
i2257 = i2256;

}
i2258 = i2257;

}
i2259 = i2258;

}
i2260 = i2259;

}
i2261 = i2260;

}
i2262 = i2261;

}
i2263 = i2262;

}
i2264 = i2263;

}
i2265 = i2264;

}
i2266 = i2265;

}
i2267 = i2266;

}
i2268 = i2267;

}
i2269 = i2268;

}
i2270 = i2269;

}
i2271 = i2270;

}
i2272 = i2271;

}
i2273 = i2272;

}
i2274 = i2273;

}
i2275 = i2274;

}
i2276 = i2275;

}
i2277 = i2276;

}
i2278 = i2277;

}
i2279 = i2278;

}
    return i2279;

}
}
