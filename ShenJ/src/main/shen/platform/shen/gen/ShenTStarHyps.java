package shen.gen;



import com.mentics.shen.*;

public class ShenTStarHyps {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-hyps");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v783, final Object v784, final Object v785, final Object v786) throws Exception {
return defined(v783, v784, v785, v786);
}};
public static Object defined(final Object v783, final Object v784, final Object v785, final Object v786) throws Exception {
final Object f1257 = ShenLazyderef.LAMBDA.apply(v783, v785);

final Object v5491256 = f1257;


final Object i1551;
if ((boolean)(v5491256 instanceof Cons)) {

final Object f1259 = ShenLazyderef.LAMBDA.apply(((Cons)v5491256).head, v785);

final Object v5501258 = f1259;


final Object i1550;
if ((boolean)(v5501258 instanceof Cons)) {

final Object f1261 = ShenLazyderef.LAMBDA.apply(((Cons)v5501258).head, v785);

final Object v5511260 = f1261;


final Object i1549;
if ((boolean)(v5511260 instanceof Cons)) {

final Object f1263 = ShenLazyderef.LAMBDA.apply(((Cons)v5511260).head, v785);

final Object v5521262 = f1263;

final Object i1548;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), v5521262)) {

final Object f1265 = ShenLazyderef.LAMBDA.apply(((Cons)v5511260).tail, v785);

final Object v5531264 = f1265;


final Object i1547;
if ((boolean)(v5531264 instanceof Cons)) {


final Object x1266 = ((Cons)v5531264).head;

final Object f1268 = ShenLazyderef.LAMBDA.apply(((Cons)v5531264).tail, v785);

final Object v5541267 = f1268;


final Object i1546;
if ((boolean)(v5541267 instanceof Cons)) {


final Object y1269 = ((Cons)v5541267).head;

final Object f1271 = ShenLazyderef.LAMBDA.apply(((Cons)v5541267).tail, v785);

final Object v5551270 = f1271;

final Object i1545;
if ((boolean)Lang.equals(Nil.NIL, v5551270)) {

final Object f1273 = ShenLazyderef.LAMBDA.apply(((Cons)v5501258).tail, v785);

final Object v5561272 = f1273;


final Object i1544;
if ((boolean)(v5561272 instanceof Cons)) {

final Object f1275 = ShenLazyderef.LAMBDA.apply(((Cons)v5561272).head, v785);

final Object v5571274 = f1275;

final Object i1543;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v5571274)) {

final Object f1277 = ShenLazyderef.LAMBDA.apply(((Cons)v5561272).tail, v785);

final Object v5581276 = f1277;


final Object i1542;
if ((boolean)(v5581276 instanceof Cons)) {

final Object f1279 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).head, v785);

final Object v5591278 = f1279;


final Object i1541;
if ((boolean)(v5591278 instanceof Cons)) {

final Object f1281 = ShenLazyderef.LAMBDA.apply(((Cons)v5591278).head, v785);

final Object v5601280 = f1281;

final Object i1503;
if ((boolean)Lang.equals(RuntimeContext.symbol("list"), v5601280)) {

final Object f1283 = ShenLazyderef.LAMBDA.apply(((Cons)v5591278).tail, v785);

final Object v5611282 = f1283;


final Object i1388;
if ((boolean)(v5611282 instanceof Cons)) {


final Object a1284 = ((Cons)v5611282).head;

final Object f1286 = ShenLazyderef.LAMBDA.apply(((Cons)v5611282).tail, v785);

final Object v5621285 = f1286;

final Object i1350;
if ((boolean)Lang.equals(Nil.NIL, v5621285)) {

final Object f1288 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5631287 = f1288;

final Object i1314;
if ((boolean)Lang.equals(Nil.NIL, v5631287)) {


final Object hyp1289 = ((Cons)v5491256).tail;
final Object f1290 = ShenIncinfs.LAMBDA.apply();
final Object f1291 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1292 = ShenLazyderef.LAMBDA.apply(a1284, v785);





final Object f1293 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1294 = ShenLazyderef.LAMBDA.apply(a1284, v785);








final Object f1295 = ShenLazyderef.LAMBDA.apply(hyp1289, v785);


final Object f1296 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1291, new Cons(RuntimeContext.symbol(":"), new Cons(f1292, Nil.NIL))), new Cons(new Cons(f1293, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1294, Nil.NIL)), Nil.NIL))), f1295)), v785, v786);
final Object f1297 = Do.LAMBDA.apply(f1290, f1296);


i1314 = f1297;
} else {
final Object f1298 = ShenPvarQ.LAMBDA.apply(v5631287);

final Object i1313;
if ((boolean)f1298) {
final Object f1299 = ShenBindv.LAMBDA.apply(v5631287, Nil.NIL, v785);


final Object hyp1301 = ((Cons)v5491256).tail;
final Object f1302 = ShenIncinfs.LAMBDA.apply();
final Object f1303 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1304 = ShenLazyderef.LAMBDA.apply(a1284, v785);





final Object f1305 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1306 = ShenLazyderef.LAMBDA.apply(a1284, v785);








final Object f1307 = ShenLazyderef.LAMBDA.apply(hyp1301, v785);


final Object f1308 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1303, new Cons(RuntimeContext.symbol(":"), new Cons(f1304, Nil.NIL))), new Cons(new Cons(f1305, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1306, Nil.NIL)), Nil.NIL))), f1307)), v785, v786);
final Object f1309 = Do.LAMBDA.apply(f1302, f1308);


final Object result1300 = f1309;
final Object f1310 = ShenUnbindv.LAMBDA.apply(v5631287, v785);
final Object f1311 = Do.LAMBDA.apply(f1310, result1300);

final Object f1312 = Do.LAMBDA.apply(f1299, f1311);

i1313 = f1312;
} else {

i1313 = false;

}
i1314 = i1313;

}

i1350 = i1314;
} else {
final Object f1315 = ShenPvarQ.LAMBDA.apply(v5621285);

final Object i1349;
if ((boolean)f1315) {
final Object f1316 = ShenBindv.LAMBDA.apply(v5621285, Nil.NIL, v785);

final Object f1319 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5641318 = f1319;

final Object i1345;
if ((boolean)Lang.equals(Nil.NIL, v5641318)) {


final Object hyp1320 = ((Cons)v5491256).tail;
final Object f1321 = ShenIncinfs.LAMBDA.apply();
final Object f1322 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1323 = ShenLazyderef.LAMBDA.apply(a1284, v785);





final Object f1324 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1325 = ShenLazyderef.LAMBDA.apply(a1284, v785);








final Object f1326 = ShenLazyderef.LAMBDA.apply(hyp1320, v785);


final Object f1327 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1322, new Cons(RuntimeContext.symbol(":"), new Cons(f1323, Nil.NIL))), new Cons(new Cons(f1324, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1325, Nil.NIL)), Nil.NIL))), f1326)), v785, v786);
final Object f1328 = Do.LAMBDA.apply(f1321, f1327);


i1345 = f1328;
} else {
final Object f1329 = ShenPvarQ.LAMBDA.apply(v5641318);

final Object i1344;
if ((boolean)f1329) {
final Object f1330 = ShenBindv.LAMBDA.apply(v5641318, Nil.NIL, v785);


final Object hyp1332 = ((Cons)v5491256).tail;
final Object f1333 = ShenIncinfs.LAMBDA.apply();
final Object f1334 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1335 = ShenLazyderef.LAMBDA.apply(a1284, v785);





final Object f1336 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1337 = ShenLazyderef.LAMBDA.apply(a1284, v785);








final Object f1338 = ShenLazyderef.LAMBDA.apply(hyp1332, v785);


final Object f1339 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1334, new Cons(RuntimeContext.symbol(":"), new Cons(f1335, Nil.NIL))), new Cons(new Cons(f1336, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1337, Nil.NIL)), Nil.NIL))), f1338)), v785, v786);
final Object f1340 = Do.LAMBDA.apply(f1333, f1339);


final Object result1331 = f1340;
final Object f1341 = ShenUnbindv.LAMBDA.apply(v5641318, v785);
final Object f1342 = Do.LAMBDA.apply(f1341, result1331);

final Object f1343 = Do.LAMBDA.apply(f1330, f1342);

i1344 = f1343;
} else {

i1344 = false;

}
i1345 = i1344;

}

final Object result1317 = i1345;
final Object f1346 = ShenUnbindv.LAMBDA.apply(v5621285, v785);
final Object f1347 = Do.LAMBDA.apply(f1346, result1317);

final Object f1348 = Do.LAMBDA.apply(f1316, f1347);

i1349 = f1348;
} else {

i1349 = false;

}
i1350 = i1349;

}


i1388 = i1350;
} else {
final Object f1351 = ShenPvarQ.LAMBDA.apply(v5611282);

final Object i1387;
if ((boolean)f1351) {
final Object f1353 = ShenNewpv.LAMBDA.apply(v785);

final Object a1352 = f1353;


final Object f1354 = ShenBindv.LAMBDA.apply(v5611282, new Cons(a1352, Nil.NIL), v785);

final Object f1357 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5651356 = f1357;

final Object i1383;
if ((boolean)Lang.equals(Nil.NIL, v5651356)) {


final Object hyp1358 = ((Cons)v5491256).tail;
final Object f1359 = ShenIncinfs.LAMBDA.apply();
final Object f1360 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1361 = ShenLazyderef.LAMBDA.apply(a1352, v785);





final Object f1362 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1363 = ShenLazyderef.LAMBDA.apply(a1352, v785);








final Object f1364 = ShenLazyderef.LAMBDA.apply(hyp1358, v785);


final Object f1365 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1360, new Cons(RuntimeContext.symbol(":"), new Cons(f1361, Nil.NIL))), new Cons(new Cons(f1362, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1363, Nil.NIL)), Nil.NIL))), f1364)), v785, v786);
final Object f1366 = Do.LAMBDA.apply(f1359, f1365);


i1383 = f1366;
} else {
final Object f1367 = ShenPvarQ.LAMBDA.apply(v5651356);

final Object i1382;
if ((boolean)f1367) {
final Object f1368 = ShenBindv.LAMBDA.apply(v5651356, Nil.NIL, v785);


final Object hyp1370 = ((Cons)v5491256).tail;
final Object f1371 = ShenIncinfs.LAMBDA.apply();
final Object f1372 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1373 = ShenLazyderef.LAMBDA.apply(a1352, v785);





final Object f1374 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1375 = ShenLazyderef.LAMBDA.apply(a1352, v785);








final Object f1376 = ShenLazyderef.LAMBDA.apply(hyp1370, v785);


final Object f1377 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1372, new Cons(RuntimeContext.symbol(":"), new Cons(f1373, Nil.NIL))), new Cons(new Cons(f1374, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1375, Nil.NIL)), Nil.NIL))), f1376)), v785, v786);
final Object f1378 = Do.LAMBDA.apply(f1371, f1377);


final Object result1369 = f1378;
final Object f1379 = ShenUnbindv.LAMBDA.apply(v5651356, v785);
final Object f1380 = Do.LAMBDA.apply(f1379, result1369);

final Object f1381 = Do.LAMBDA.apply(f1368, f1380);

i1382 = f1381;
} else {

i1382 = false;

}
i1383 = i1382;

}

final Object result1355 = i1383;
final Object f1384 = ShenUnbindv.LAMBDA.apply(v5611282, v785);
final Object f1385 = Do.LAMBDA.apply(f1384, result1355);

final Object f1386 = Do.LAMBDA.apply(f1354, f1385);


i1387 = f1386;
} else {

i1387 = false;

}
i1388 = i1387;

}

i1503 = i1388;
} else {
final Object f1389 = ShenPvarQ.LAMBDA.apply(v5601280);

final Object i1502;
if ((boolean)f1389) {
final Object f1390 = ShenBindv.LAMBDA.apply(v5601280, RuntimeContext.symbol("list"), v785);

final Object f1393 = ShenLazyderef.LAMBDA.apply(((Cons)v5591278).tail, v785);

final Object v5661392 = f1393;


final Object i1498;
if ((boolean)(v5661392 instanceof Cons)) {


final Object a1394 = ((Cons)v5661392).head;

final Object f1396 = ShenLazyderef.LAMBDA.apply(((Cons)v5661392).tail, v785);

final Object v5671395 = f1396;

final Object i1460;
if ((boolean)Lang.equals(Nil.NIL, v5671395)) {

final Object f1398 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5681397 = f1398;

final Object i1424;
if ((boolean)Lang.equals(Nil.NIL, v5681397)) {


final Object hyp1399 = ((Cons)v5491256).tail;
final Object f1400 = ShenIncinfs.LAMBDA.apply();
final Object f1401 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1402 = ShenLazyderef.LAMBDA.apply(a1394, v785);





final Object f1403 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1404 = ShenLazyderef.LAMBDA.apply(a1394, v785);








final Object f1405 = ShenLazyderef.LAMBDA.apply(hyp1399, v785);


final Object f1406 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1401, new Cons(RuntimeContext.symbol(":"), new Cons(f1402, Nil.NIL))), new Cons(new Cons(f1403, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1404, Nil.NIL)), Nil.NIL))), f1405)), v785, v786);
final Object f1407 = Do.LAMBDA.apply(f1400, f1406);


i1424 = f1407;
} else {
final Object f1408 = ShenPvarQ.LAMBDA.apply(v5681397);

final Object i1423;
if ((boolean)f1408) {
final Object f1409 = ShenBindv.LAMBDA.apply(v5681397, Nil.NIL, v785);


final Object hyp1411 = ((Cons)v5491256).tail;
final Object f1412 = ShenIncinfs.LAMBDA.apply();
final Object f1413 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1414 = ShenLazyderef.LAMBDA.apply(a1394, v785);





final Object f1415 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1416 = ShenLazyderef.LAMBDA.apply(a1394, v785);








final Object f1417 = ShenLazyderef.LAMBDA.apply(hyp1411, v785);


final Object f1418 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1413, new Cons(RuntimeContext.symbol(":"), new Cons(f1414, Nil.NIL))), new Cons(new Cons(f1415, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1416, Nil.NIL)), Nil.NIL))), f1417)), v785, v786);
final Object f1419 = Do.LAMBDA.apply(f1412, f1418);


final Object result1410 = f1419;
final Object f1420 = ShenUnbindv.LAMBDA.apply(v5681397, v785);
final Object f1421 = Do.LAMBDA.apply(f1420, result1410);

final Object f1422 = Do.LAMBDA.apply(f1409, f1421);

i1423 = f1422;
} else {

i1423 = false;

}
i1424 = i1423;

}

i1460 = i1424;
} else {
final Object f1425 = ShenPvarQ.LAMBDA.apply(v5671395);

final Object i1459;
if ((boolean)f1425) {
final Object f1426 = ShenBindv.LAMBDA.apply(v5671395, Nil.NIL, v785);

final Object f1429 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5691428 = f1429;

final Object i1455;
if ((boolean)Lang.equals(Nil.NIL, v5691428)) {


final Object hyp1430 = ((Cons)v5491256).tail;
final Object f1431 = ShenIncinfs.LAMBDA.apply();
final Object f1432 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1433 = ShenLazyderef.LAMBDA.apply(a1394, v785);





final Object f1434 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1435 = ShenLazyderef.LAMBDA.apply(a1394, v785);








final Object f1436 = ShenLazyderef.LAMBDA.apply(hyp1430, v785);


final Object f1437 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1432, new Cons(RuntimeContext.symbol(":"), new Cons(f1433, Nil.NIL))), new Cons(new Cons(f1434, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1435, Nil.NIL)), Nil.NIL))), f1436)), v785, v786);
final Object f1438 = Do.LAMBDA.apply(f1431, f1437);


i1455 = f1438;
} else {
final Object f1439 = ShenPvarQ.LAMBDA.apply(v5691428);

final Object i1454;
if ((boolean)f1439) {
final Object f1440 = ShenBindv.LAMBDA.apply(v5691428, Nil.NIL, v785);


final Object hyp1442 = ((Cons)v5491256).tail;
final Object f1443 = ShenIncinfs.LAMBDA.apply();
final Object f1444 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1445 = ShenLazyderef.LAMBDA.apply(a1394, v785);





final Object f1446 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1447 = ShenLazyderef.LAMBDA.apply(a1394, v785);








final Object f1448 = ShenLazyderef.LAMBDA.apply(hyp1442, v785);


final Object f1449 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1444, new Cons(RuntimeContext.symbol(":"), new Cons(f1445, Nil.NIL))), new Cons(new Cons(f1446, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1447, Nil.NIL)), Nil.NIL))), f1448)), v785, v786);
final Object f1450 = Do.LAMBDA.apply(f1443, f1449);


final Object result1441 = f1450;
final Object f1451 = ShenUnbindv.LAMBDA.apply(v5691428, v785);
final Object f1452 = Do.LAMBDA.apply(f1451, result1441);

final Object f1453 = Do.LAMBDA.apply(f1440, f1452);

i1454 = f1453;
} else {

i1454 = false;

}
i1455 = i1454;

}

final Object result1427 = i1455;
final Object f1456 = ShenUnbindv.LAMBDA.apply(v5671395, v785);
final Object f1457 = Do.LAMBDA.apply(f1456, result1427);

final Object f1458 = Do.LAMBDA.apply(f1426, f1457);

i1459 = f1458;
} else {

i1459 = false;

}
i1460 = i1459;

}


i1498 = i1460;
} else {
final Object f1461 = ShenPvarQ.LAMBDA.apply(v5661392);

final Object i1497;
if ((boolean)f1461) {
final Object f1463 = ShenNewpv.LAMBDA.apply(v785);

final Object a1462 = f1463;


final Object f1464 = ShenBindv.LAMBDA.apply(v5661392, new Cons(a1462, Nil.NIL), v785);

final Object f1467 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5701466 = f1467;

final Object i1493;
if ((boolean)Lang.equals(Nil.NIL, v5701466)) {


final Object hyp1468 = ((Cons)v5491256).tail;
final Object f1469 = ShenIncinfs.LAMBDA.apply();
final Object f1470 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1471 = ShenLazyderef.LAMBDA.apply(a1462, v785);





final Object f1472 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1473 = ShenLazyderef.LAMBDA.apply(a1462, v785);








final Object f1474 = ShenLazyderef.LAMBDA.apply(hyp1468, v785);


final Object f1475 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1470, new Cons(RuntimeContext.symbol(":"), new Cons(f1471, Nil.NIL))), new Cons(new Cons(f1472, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1473, Nil.NIL)), Nil.NIL))), f1474)), v785, v786);
final Object f1476 = Do.LAMBDA.apply(f1469, f1475);


i1493 = f1476;
} else {
final Object f1477 = ShenPvarQ.LAMBDA.apply(v5701466);

final Object i1492;
if ((boolean)f1477) {
final Object f1478 = ShenBindv.LAMBDA.apply(v5701466, Nil.NIL, v785);


final Object hyp1480 = ((Cons)v5491256).tail;
final Object f1481 = ShenIncinfs.LAMBDA.apply();
final Object f1482 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1483 = ShenLazyderef.LAMBDA.apply(a1462, v785);





final Object f1484 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1485 = ShenLazyderef.LAMBDA.apply(a1462, v785);








final Object f1486 = ShenLazyderef.LAMBDA.apply(hyp1480, v785);


final Object f1487 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1482, new Cons(RuntimeContext.symbol(":"), new Cons(f1483, Nil.NIL))), new Cons(new Cons(f1484, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1485, Nil.NIL)), Nil.NIL))), f1486)), v785, v786);
final Object f1488 = Do.LAMBDA.apply(f1481, f1487);


final Object result1479 = f1488;
final Object f1489 = ShenUnbindv.LAMBDA.apply(v5701466, v785);
final Object f1490 = Do.LAMBDA.apply(f1489, result1479);

final Object f1491 = Do.LAMBDA.apply(f1478, f1490);

i1492 = f1491;
} else {

i1492 = false;

}
i1493 = i1492;

}

final Object result1465 = i1493;
final Object f1494 = ShenUnbindv.LAMBDA.apply(v5661392, v785);
final Object f1495 = Do.LAMBDA.apply(f1494, result1465);

final Object f1496 = Do.LAMBDA.apply(f1464, f1495);


i1497 = f1496;
} else {

i1497 = false;

}
i1498 = i1497;

}

final Object result1391 = i1498;
final Object f1499 = ShenUnbindv.LAMBDA.apply(v5601280, v785);
final Object f1500 = Do.LAMBDA.apply(f1499, result1391);

final Object f1501 = Do.LAMBDA.apply(f1390, f1500);

i1502 = f1501;
} else {

i1502 = false;

}
i1503 = i1502;

}

i1541 = i1503;
} else {
final Object f1504 = ShenPvarQ.LAMBDA.apply(v5591278);

final Object i1540;
if ((boolean)f1504) {
final Object f1506 = ShenNewpv.LAMBDA.apply(v785);

final Object a1505 = f1506;




final Object f1507 = ShenBindv.LAMBDA.apply(v5591278, new Cons(RuntimeContext.symbol("list"), new Cons(a1505, Nil.NIL)), v785);

final Object f1510 = ShenLazyderef.LAMBDA.apply(((Cons)v5581276).tail, v785);

final Object v5711509 = f1510;

final Object i1536;
if ((boolean)Lang.equals(Nil.NIL, v5711509)) {


final Object hyp1511 = ((Cons)v5491256).tail;
final Object f1512 = ShenIncinfs.LAMBDA.apply();
final Object f1513 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1514 = ShenLazyderef.LAMBDA.apply(a1505, v785);





final Object f1515 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1516 = ShenLazyderef.LAMBDA.apply(a1505, v785);








final Object f1517 = ShenLazyderef.LAMBDA.apply(hyp1511, v785);


final Object f1518 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1513, new Cons(RuntimeContext.symbol(":"), new Cons(f1514, Nil.NIL))), new Cons(new Cons(f1515, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1516, Nil.NIL)), Nil.NIL))), f1517)), v785, v786);
final Object f1519 = Do.LAMBDA.apply(f1512, f1518);


i1536 = f1519;
} else {
final Object f1520 = ShenPvarQ.LAMBDA.apply(v5711509);

final Object i1535;
if ((boolean)f1520) {
final Object f1521 = ShenBindv.LAMBDA.apply(v5711509, Nil.NIL, v785);


final Object hyp1523 = ((Cons)v5491256).tail;
final Object f1524 = ShenIncinfs.LAMBDA.apply();
final Object f1525 = ShenLazyderef.LAMBDA.apply(x1266, v785);


final Object f1526 = ShenLazyderef.LAMBDA.apply(a1505, v785);





final Object f1527 = ShenLazyderef.LAMBDA.apply(y1269, v785);



final Object f1528 = ShenLazyderef.LAMBDA.apply(a1505, v785);








final Object f1529 = ShenLazyderef.LAMBDA.apply(hyp1523, v785);


final Object f1530 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1525, new Cons(RuntimeContext.symbol(":"), new Cons(f1526, Nil.NIL))), new Cons(new Cons(f1527, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(f1528, Nil.NIL)), Nil.NIL))), f1529)), v785, v786);
final Object f1531 = Do.LAMBDA.apply(f1524, f1530);


final Object result1522 = f1531;
final Object f1532 = ShenUnbindv.LAMBDA.apply(v5711509, v785);
final Object f1533 = Do.LAMBDA.apply(f1532, result1522);

final Object f1534 = Do.LAMBDA.apply(f1521, f1533);

i1535 = f1534;
} else {

i1535 = false;

}
i1536 = i1535;

}

final Object result1508 = i1536;
final Object f1537 = ShenUnbindv.LAMBDA.apply(v5591278, v785);
final Object f1538 = Do.LAMBDA.apply(f1537, result1508);

final Object f1539 = Do.LAMBDA.apply(f1507, f1538);


i1540 = f1539;
} else {

i1540 = false;

}
i1541 = i1540;

}

i1542 = i1541;
} else {

i1542 = false;

}

i1543 = i1542;
} else {

i1543 = false;

}

i1544 = i1543;
} else {

i1544 = false;

}

i1545 = i1544;
} else {

i1545 = false;

}


i1546 = i1545;
} else {

i1546 = false;

}


i1547 = i1546;
} else {

i1547 = false;

}

i1548 = i1547;
} else {

i1548 = false;

}

i1549 = i1548;
} else {

i1549 = false;

}

i1550 = i1549;
} else {

i1550 = false;

}

i1551 = i1550;
} else {

i1551 = false;

}

final Object case1255 = i1551;

final Object i2297;
if ((boolean)Lang.equals(case1255, false)) {
final Object f1554 = ShenLazyderef.LAMBDA.apply(v783, v785);

final Object v5721553 = f1554;


final Object i1891;
if ((boolean)(v5721553 instanceof Cons)) {

final Object f1556 = ShenLazyderef.LAMBDA.apply(((Cons)v5721553).head, v785);

final Object v5731555 = f1556;


final Object i1890;
if ((boolean)(v5731555 instanceof Cons)) {

final Object f1558 = ShenLazyderef.LAMBDA.apply(((Cons)v5731555).head, v785);

final Object v5741557 = f1558;


final Object i1889;
if ((boolean)(v5741557 instanceof Cons)) {

final Object f1560 = ShenLazyderef.LAMBDA.apply(((Cons)v5741557).head, v785);

final Object v5751559 = f1560;

final Object i1888;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), v5751559)) {

final Object f1562 = ShenLazyderef.LAMBDA.apply(((Cons)v5741557).tail, v785);

final Object v5761561 = f1562;


final Object i1887;
if ((boolean)(v5761561 instanceof Cons)) {


final Object x1563 = ((Cons)v5761561).head;

final Object f1565 = ShenLazyderef.LAMBDA.apply(((Cons)v5761561).tail, v785);

final Object v5771564 = f1565;


final Object i1886;
if ((boolean)(v5771564 instanceof Cons)) {


final Object y1566 = ((Cons)v5771564).head;

final Object f1568 = ShenLazyderef.LAMBDA.apply(((Cons)v5771564).tail, v785);

final Object v5781567 = f1568;

final Object i1885;
if ((boolean)Lang.equals(Nil.NIL, v5781567)) {

final Object f1570 = ShenLazyderef.LAMBDA.apply(((Cons)v5731555).tail, v785);

final Object v5791569 = f1570;


final Object i1884;
if ((boolean)(v5791569 instanceof Cons)) {

final Object f1572 = ShenLazyderef.LAMBDA.apply(((Cons)v5791569).head, v785);

final Object v5801571 = f1572;

final Object i1883;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v5801571)) {

final Object f1574 = ShenLazyderef.LAMBDA.apply(((Cons)v5791569).tail, v785);

final Object v5811573 = f1574;


final Object i1882;
if ((boolean)(v5811573 instanceof Cons)) {

final Object f1576 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).head, v785);

final Object v5821575 = f1576;


final Object i1881;
if ((boolean)(v5821575 instanceof Cons)) {


final Object a1577 = ((Cons)v5821575).head;

final Object f1579 = ShenLazyderef.LAMBDA.apply(((Cons)v5821575).tail, v785);

final Object v5831578 = f1579;


final Object i1841;
if ((boolean)(v5831578 instanceof Cons)) {

final Object f1581 = ShenLazyderef.LAMBDA.apply(((Cons)v5831578).head, v785);

final Object v5841580 = f1581;

final Object i1803;
if ((boolean)Lang.equals(RuntimeContext.symbol("*"), v5841580)) {

final Object f1583 = ShenLazyderef.LAMBDA.apply(((Cons)v5831578).tail, v785);

final Object v5851582 = f1583;


final Object i1688;
if ((boolean)(v5851582 instanceof Cons)) {


final Object b1584 = ((Cons)v5851582).head;

final Object f1586 = ShenLazyderef.LAMBDA.apply(((Cons)v5851582).tail, v785);

final Object v5861585 = f1586;

final Object i1650;
if ((boolean)Lang.equals(Nil.NIL, v5861585)) {

final Object f1588 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5871587 = f1588;

final Object i1614;
if ((boolean)Lang.equals(Nil.NIL, v5871587)) {


final Object hyp1589 = ((Cons)v5721553).tail;
final Object f1590 = ShenIncinfs.LAMBDA.apply();
final Object f1591 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1592 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1593 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1594 = ShenLazyderef.LAMBDA.apply(b1584, v785);





final Object f1595 = ShenLazyderef.LAMBDA.apply(hyp1589, v785);


final Object f1596 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1591, new Cons(RuntimeContext.symbol(":"), new Cons(f1592, Nil.NIL))), new Cons(new Cons(f1593, new Cons(RuntimeContext.symbol(":"), new Cons(f1594, Nil.NIL))), f1595)), v785, v786);
final Object f1597 = Do.LAMBDA.apply(f1590, f1596);


i1614 = f1597;
} else {
final Object f1598 = ShenPvarQ.LAMBDA.apply(v5871587);

final Object i1613;
if ((boolean)f1598) {
final Object f1599 = ShenBindv.LAMBDA.apply(v5871587, Nil.NIL, v785);


final Object hyp1601 = ((Cons)v5721553).tail;
final Object f1602 = ShenIncinfs.LAMBDA.apply();
final Object f1603 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1604 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1605 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1606 = ShenLazyderef.LAMBDA.apply(b1584, v785);





final Object f1607 = ShenLazyderef.LAMBDA.apply(hyp1601, v785);


final Object f1608 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1603, new Cons(RuntimeContext.symbol(":"), new Cons(f1604, Nil.NIL))), new Cons(new Cons(f1605, new Cons(RuntimeContext.symbol(":"), new Cons(f1606, Nil.NIL))), f1607)), v785, v786);
final Object f1609 = Do.LAMBDA.apply(f1602, f1608);


final Object result1600 = f1609;
final Object f1610 = ShenUnbindv.LAMBDA.apply(v5871587, v785);
final Object f1611 = Do.LAMBDA.apply(f1610, result1600);

final Object f1612 = Do.LAMBDA.apply(f1599, f1611);

i1613 = f1612;
} else {

i1613 = false;

}
i1614 = i1613;

}

i1650 = i1614;
} else {
final Object f1615 = ShenPvarQ.LAMBDA.apply(v5861585);

final Object i1649;
if ((boolean)f1615) {
final Object f1616 = ShenBindv.LAMBDA.apply(v5861585, Nil.NIL, v785);

final Object f1619 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5881618 = f1619;

final Object i1645;
if ((boolean)Lang.equals(Nil.NIL, v5881618)) {


final Object hyp1620 = ((Cons)v5721553).tail;
final Object f1621 = ShenIncinfs.LAMBDA.apply();
final Object f1622 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1623 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1624 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1625 = ShenLazyderef.LAMBDA.apply(b1584, v785);





final Object f1626 = ShenLazyderef.LAMBDA.apply(hyp1620, v785);


final Object f1627 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1622, new Cons(RuntimeContext.symbol(":"), new Cons(f1623, Nil.NIL))), new Cons(new Cons(f1624, new Cons(RuntimeContext.symbol(":"), new Cons(f1625, Nil.NIL))), f1626)), v785, v786);
final Object f1628 = Do.LAMBDA.apply(f1621, f1627);


i1645 = f1628;
} else {
final Object f1629 = ShenPvarQ.LAMBDA.apply(v5881618);

final Object i1644;
if ((boolean)f1629) {
final Object f1630 = ShenBindv.LAMBDA.apply(v5881618, Nil.NIL, v785);


final Object hyp1632 = ((Cons)v5721553).tail;
final Object f1633 = ShenIncinfs.LAMBDA.apply();
final Object f1634 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1635 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1636 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1637 = ShenLazyderef.LAMBDA.apply(b1584, v785);





final Object f1638 = ShenLazyderef.LAMBDA.apply(hyp1632, v785);


final Object f1639 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1634, new Cons(RuntimeContext.symbol(":"), new Cons(f1635, Nil.NIL))), new Cons(new Cons(f1636, new Cons(RuntimeContext.symbol(":"), new Cons(f1637, Nil.NIL))), f1638)), v785, v786);
final Object f1640 = Do.LAMBDA.apply(f1633, f1639);


final Object result1631 = f1640;
final Object f1641 = ShenUnbindv.LAMBDA.apply(v5881618, v785);
final Object f1642 = Do.LAMBDA.apply(f1641, result1631);

final Object f1643 = Do.LAMBDA.apply(f1630, f1642);

i1644 = f1643;
} else {

i1644 = false;

}
i1645 = i1644;

}

final Object result1617 = i1645;
final Object f1646 = ShenUnbindv.LAMBDA.apply(v5861585, v785);
final Object f1647 = Do.LAMBDA.apply(f1646, result1617);

final Object f1648 = Do.LAMBDA.apply(f1616, f1647);

i1649 = f1648;
} else {

i1649 = false;

}
i1650 = i1649;

}


i1688 = i1650;
} else {
final Object f1651 = ShenPvarQ.LAMBDA.apply(v5851582);

final Object i1687;
if ((boolean)f1651) {
final Object f1653 = ShenNewpv.LAMBDA.apply(v785);

final Object b1652 = f1653;


final Object f1654 = ShenBindv.LAMBDA.apply(v5851582, new Cons(b1652, Nil.NIL), v785);

final Object f1657 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5891656 = f1657;

final Object i1683;
if ((boolean)Lang.equals(Nil.NIL, v5891656)) {


final Object hyp1658 = ((Cons)v5721553).tail;
final Object f1659 = ShenIncinfs.LAMBDA.apply();
final Object f1660 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1661 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1662 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1663 = ShenLazyderef.LAMBDA.apply(b1652, v785);





final Object f1664 = ShenLazyderef.LAMBDA.apply(hyp1658, v785);


final Object f1665 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1660, new Cons(RuntimeContext.symbol(":"), new Cons(f1661, Nil.NIL))), new Cons(new Cons(f1662, new Cons(RuntimeContext.symbol(":"), new Cons(f1663, Nil.NIL))), f1664)), v785, v786);
final Object f1666 = Do.LAMBDA.apply(f1659, f1665);


i1683 = f1666;
} else {
final Object f1667 = ShenPvarQ.LAMBDA.apply(v5891656);

final Object i1682;
if ((boolean)f1667) {
final Object f1668 = ShenBindv.LAMBDA.apply(v5891656, Nil.NIL, v785);


final Object hyp1670 = ((Cons)v5721553).tail;
final Object f1671 = ShenIncinfs.LAMBDA.apply();
final Object f1672 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1673 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1674 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1675 = ShenLazyderef.LAMBDA.apply(b1652, v785);





final Object f1676 = ShenLazyderef.LAMBDA.apply(hyp1670, v785);


final Object f1677 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1672, new Cons(RuntimeContext.symbol(":"), new Cons(f1673, Nil.NIL))), new Cons(new Cons(f1674, new Cons(RuntimeContext.symbol(":"), new Cons(f1675, Nil.NIL))), f1676)), v785, v786);
final Object f1678 = Do.LAMBDA.apply(f1671, f1677);


final Object result1669 = f1678;
final Object f1679 = ShenUnbindv.LAMBDA.apply(v5891656, v785);
final Object f1680 = Do.LAMBDA.apply(f1679, result1669);

final Object f1681 = Do.LAMBDA.apply(f1668, f1680);

i1682 = f1681;
} else {

i1682 = false;

}
i1683 = i1682;

}

final Object result1655 = i1683;
final Object f1684 = ShenUnbindv.LAMBDA.apply(v5851582, v785);
final Object f1685 = Do.LAMBDA.apply(f1684, result1655);

final Object f1686 = Do.LAMBDA.apply(f1654, f1685);


i1687 = f1686;
} else {

i1687 = false;

}
i1688 = i1687;

}

i1803 = i1688;
} else {
final Object f1689 = ShenPvarQ.LAMBDA.apply(v5841580);

final Object i1802;
if ((boolean)f1689) {
final Object f1690 = ShenBindv.LAMBDA.apply(v5841580, RuntimeContext.symbol("*"), v785);

final Object f1693 = ShenLazyderef.LAMBDA.apply(((Cons)v5831578).tail, v785);

final Object v5901692 = f1693;


final Object i1798;
if ((boolean)(v5901692 instanceof Cons)) {


final Object b1694 = ((Cons)v5901692).head;

final Object f1696 = ShenLazyderef.LAMBDA.apply(((Cons)v5901692).tail, v785);

final Object v5911695 = f1696;

final Object i1760;
if ((boolean)Lang.equals(Nil.NIL, v5911695)) {

final Object f1698 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5921697 = f1698;

final Object i1724;
if ((boolean)Lang.equals(Nil.NIL, v5921697)) {


final Object hyp1699 = ((Cons)v5721553).tail;
final Object f1700 = ShenIncinfs.LAMBDA.apply();
final Object f1701 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1702 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1703 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1704 = ShenLazyderef.LAMBDA.apply(b1694, v785);





final Object f1705 = ShenLazyderef.LAMBDA.apply(hyp1699, v785);


final Object f1706 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1701, new Cons(RuntimeContext.symbol(":"), new Cons(f1702, Nil.NIL))), new Cons(new Cons(f1703, new Cons(RuntimeContext.symbol(":"), new Cons(f1704, Nil.NIL))), f1705)), v785, v786);
final Object f1707 = Do.LAMBDA.apply(f1700, f1706);


i1724 = f1707;
} else {
final Object f1708 = ShenPvarQ.LAMBDA.apply(v5921697);

final Object i1723;
if ((boolean)f1708) {
final Object f1709 = ShenBindv.LAMBDA.apply(v5921697, Nil.NIL, v785);


final Object hyp1711 = ((Cons)v5721553).tail;
final Object f1712 = ShenIncinfs.LAMBDA.apply();
final Object f1713 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1714 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1715 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1716 = ShenLazyderef.LAMBDA.apply(b1694, v785);





final Object f1717 = ShenLazyderef.LAMBDA.apply(hyp1711, v785);


final Object f1718 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1713, new Cons(RuntimeContext.symbol(":"), new Cons(f1714, Nil.NIL))), new Cons(new Cons(f1715, new Cons(RuntimeContext.symbol(":"), new Cons(f1716, Nil.NIL))), f1717)), v785, v786);
final Object f1719 = Do.LAMBDA.apply(f1712, f1718);


final Object result1710 = f1719;
final Object f1720 = ShenUnbindv.LAMBDA.apply(v5921697, v785);
final Object f1721 = Do.LAMBDA.apply(f1720, result1710);

final Object f1722 = Do.LAMBDA.apply(f1709, f1721);

i1723 = f1722;
} else {

i1723 = false;

}
i1724 = i1723;

}

i1760 = i1724;
} else {
final Object f1725 = ShenPvarQ.LAMBDA.apply(v5911695);

final Object i1759;
if ((boolean)f1725) {
final Object f1726 = ShenBindv.LAMBDA.apply(v5911695, Nil.NIL, v785);

final Object f1729 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5931728 = f1729;

final Object i1755;
if ((boolean)Lang.equals(Nil.NIL, v5931728)) {


final Object hyp1730 = ((Cons)v5721553).tail;
final Object f1731 = ShenIncinfs.LAMBDA.apply();
final Object f1732 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1733 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1734 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1735 = ShenLazyderef.LAMBDA.apply(b1694, v785);





final Object f1736 = ShenLazyderef.LAMBDA.apply(hyp1730, v785);


final Object f1737 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1732, new Cons(RuntimeContext.symbol(":"), new Cons(f1733, Nil.NIL))), new Cons(new Cons(f1734, new Cons(RuntimeContext.symbol(":"), new Cons(f1735, Nil.NIL))), f1736)), v785, v786);
final Object f1738 = Do.LAMBDA.apply(f1731, f1737);


i1755 = f1738;
} else {
final Object f1739 = ShenPvarQ.LAMBDA.apply(v5931728);

final Object i1754;
if ((boolean)f1739) {
final Object f1740 = ShenBindv.LAMBDA.apply(v5931728, Nil.NIL, v785);


final Object hyp1742 = ((Cons)v5721553).tail;
final Object f1743 = ShenIncinfs.LAMBDA.apply();
final Object f1744 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1745 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1746 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1747 = ShenLazyderef.LAMBDA.apply(b1694, v785);





final Object f1748 = ShenLazyderef.LAMBDA.apply(hyp1742, v785);


final Object f1749 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1744, new Cons(RuntimeContext.symbol(":"), new Cons(f1745, Nil.NIL))), new Cons(new Cons(f1746, new Cons(RuntimeContext.symbol(":"), new Cons(f1747, Nil.NIL))), f1748)), v785, v786);
final Object f1750 = Do.LAMBDA.apply(f1743, f1749);


final Object result1741 = f1750;
final Object f1751 = ShenUnbindv.LAMBDA.apply(v5931728, v785);
final Object f1752 = Do.LAMBDA.apply(f1751, result1741);

final Object f1753 = Do.LAMBDA.apply(f1740, f1752);

i1754 = f1753;
} else {

i1754 = false;

}
i1755 = i1754;

}

final Object result1727 = i1755;
final Object f1756 = ShenUnbindv.LAMBDA.apply(v5911695, v785);
final Object f1757 = Do.LAMBDA.apply(f1756, result1727);

final Object f1758 = Do.LAMBDA.apply(f1726, f1757);

i1759 = f1758;
} else {

i1759 = false;

}
i1760 = i1759;

}


i1798 = i1760;
} else {
final Object f1761 = ShenPvarQ.LAMBDA.apply(v5901692);

final Object i1797;
if ((boolean)f1761) {
final Object f1763 = ShenNewpv.LAMBDA.apply(v785);

final Object b1762 = f1763;


final Object f1764 = ShenBindv.LAMBDA.apply(v5901692, new Cons(b1762, Nil.NIL), v785);

final Object f1767 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5941766 = f1767;

final Object i1793;
if ((boolean)Lang.equals(Nil.NIL, v5941766)) {


final Object hyp1768 = ((Cons)v5721553).tail;
final Object f1769 = ShenIncinfs.LAMBDA.apply();
final Object f1770 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1771 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1772 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1773 = ShenLazyderef.LAMBDA.apply(b1762, v785);





final Object f1774 = ShenLazyderef.LAMBDA.apply(hyp1768, v785);


final Object f1775 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1770, new Cons(RuntimeContext.symbol(":"), new Cons(f1771, Nil.NIL))), new Cons(new Cons(f1772, new Cons(RuntimeContext.symbol(":"), new Cons(f1773, Nil.NIL))), f1774)), v785, v786);
final Object f1776 = Do.LAMBDA.apply(f1769, f1775);


i1793 = f1776;
} else {
final Object f1777 = ShenPvarQ.LAMBDA.apply(v5941766);

final Object i1792;
if ((boolean)f1777) {
final Object f1778 = ShenBindv.LAMBDA.apply(v5941766, Nil.NIL, v785);


final Object hyp1780 = ((Cons)v5721553).tail;
final Object f1781 = ShenIncinfs.LAMBDA.apply();
final Object f1782 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1783 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1784 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1785 = ShenLazyderef.LAMBDA.apply(b1762, v785);





final Object f1786 = ShenLazyderef.LAMBDA.apply(hyp1780, v785);


final Object f1787 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1782, new Cons(RuntimeContext.symbol(":"), new Cons(f1783, Nil.NIL))), new Cons(new Cons(f1784, new Cons(RuntimeContext.symbol(":"), new Cons(f1785, Nil.NIL))), f1786)), v785, v786);
final Object f1788 = Do.LAMBDA.apply(f1781, f1787);


final Object result1779 = f1788;
final Object f1789 = ShenUnbindv.LAMBDA.apply(v5941766, v785);
final Object f1790 = Do.LAMBDA.apply(f1789, result1779);

final Object f1791 = Do.LAMBDA.apply(f1778, f1790);

i1792 = f1791;
} else {

i1792 = false;

}
i1793 = i1792;

}

final Object result1765 = i1793;
final Object f1794 = ShenUnbindv.LAMBDA.apply(v5901692, v785);
final Object f1795 = Do.LAMBDA.apply(f1794, result1765);

final Object f1796 = Do.LAMBDA.apply(f1764, f1795);


i1797 = f1796;
} else {

i1797 = false;

}
i1798 = i1797;

}

final Object result1691 = i1798;
final Object f1799 = ShenUnbindv.LAMBDA.apply(v5841580, v785);
final Object f1800 = Do.LAMBDA.apply(f1799, result1691);

final Object f1801 = Do.LAMBDA.apply(f1690, f1800);

i1802 = f1801;
} else {

i1802 = false;

}
i1803 = i1802;

}

i1841 = i1803;
} else {
final Object f1804 = ShenPvarQ.LAMBDA.apply(v5831578);

final Object i1840;
if ((boolean)f1804) {
final Object f1806 = ShenNewpv.LAMBDA.apply(v785);

final Object b1805 = f1806;




final Object f1807 = ShenBindv.LAMBDA.apply(v5831578, new Cons(RuntimeContext.symbol("*"), new Cons(b1805, Nil.NIL)), v785);

final Object f1810 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5951809 = f1810;

final Object i1836;
if ((boolean)Lang.equals(Nil.NIL, v5951809)) {


final Object hyp1811 = ((Cons)v5721553).tail;
final Object f1812 = ShenIncinfs.LAMBDA.apply();
final Object f1813 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1814 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1815 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1816 = ShenLazyderef.LAMBDA.apply(b1805, v785);





final Object f1817 = ShenLazyderef.LAMBDA.apply(hyp1811, v785);


final Object f1818 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1813, new Cons(RuntimeContext.symbol(":"), new Cons(f1814, Nil.NIL))), new Cons(new Cons(f1815, new Cons(RuntimeContext.symbol(":"), new Cons(f1816, Nil.NIL))), f1817)), v785, v786);
final Object f1819 = Do.LAMBDA.apply(f1812, f1818);


i1836 = f1819;
} else {
final Object f1820 = ShenPvarQ.LAMBDA.apply(v5951809);

final Object i1835;
if ((boolean)f1820) {
final Object f1821 = ShenBindv.LAMBDA.apply(v5951809, Nil.NIL, v785);


final Object hyp1823 = ((Cons)v5721553).tail;
final Object f1824 = ShenIncinfs.LAMBDA.apply();
final Object f1825 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1826 = ShenLazyderef.LAMBDA.apply(a1577, v785);





final Object f1827 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1828 = ShenLazyderef.LAMBDA.apply(b1805, v785);





final Object f1829 = ShenLazyderef.LAMBDA.apply(hyp1823, v785);


final Object f1830 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1825, new Cons(RuntimeContext.symbol(":"), new Cons(f1826, Nil.NIL))), new Cons(new Cons(f1827, new Cons(RuntimeContext.symbol(":"), new Cons(f1828, Nil.NIL))), f1829)), v785, v786);
final Object f1831 = Do.LAMBDA.apply(f1824, f1830);


final Object result1822 = f1831;
final Object f1832 = ShenUnbindv.LAMBDA.apply(v5951809, v785);
final Object f1833 = Do.LAMBDA.apply(f1832, result1822);

final Object f1834 = Do.LAMBDA.apply(f1821, f1833);

i1835 = f1834;
} else {

i1835 = false;

}
i1836 = i1835;

}

final Object result1808 = i1836;
final Object f1837 = ShenUnbindv.LAMBDA.apply(v5831578, v785);
final Object f1838 = Do.LAMBDA.apply(f1837, result1808);

final Object f1839 = Do.LAMBDA.apply(f1807, f1838);


i1840 = f1839;
} else {

i1840 = false;

}
i1841 = i1840;

}


i1881 = i1841;
} else {
final Object f1842 = ShenPvarQ.LAMBDA.apply(v5821575);

final Object i1880;
if ((boolean)f1842) {
final Object f1844 = ShenNewpv.LAMBDA.apply(v785);

final Object a1843 = f1844;
final Object f1846 = ShenNewpv.LAMBDA.apply(v785);

final Object b1845 = f1846;






final Object f1847 = ShenBindv.LAMBDA.apply(v5821575, new Cons(a1843, new Cons(RuntimeContext.symbol("*"), new Cons(b1845, Nil.NIL))), v785);

final Object f1850 = ShenLazyderef.LAMBDA.apply(((Cons)v5811573).tail, v785);

final Object v5961849 = f1850;

final Object i1876;
if ((boolean)Lang.equals(Nil.NIL, v5961849)) {


final Object hyp1851 = ((Cons)v5721553).tail;
final Object f1852 = ShenIncinfs.LAMBDA.apply();
final Object f1853 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1854 = ShenLazyderef.LAMBDA.apply(a1843, v785);





final Object f1855 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1856 = ShenLazyderef.LAMBDA.apply(b1845, v785);





final Object f1857 = ShenLazyderef.LAMBDA.apply(hyp1851, v785);


final Object f1858 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1853, new Cons(RuntimeContext.symbol(":"), new Cons(f1854, Nil.NIL))), new Cons(new Cons(f1855, new Cons(RuntimeContext.symbol(":"), new Cons(f1856, Nil.NIL))), f1857)), v785, v786);
final Object f1859 = Do.LAMBDA.apply(f1852, f1858);


i1876 = f1859;
} else {
final Object f1860 = ShenPvarQ.LAMBDA.apply(v5961849);

final Object i1875;
if ((boolean)f1860) {
final Object f1861 = ShenBindv.LAMBDA.apply(v5961849, Nil.NIL, v785);


final Object hyp1863 = ((Cons)v5721553).tail;
final Object f1864 = ShenIncinfs.LAMBDA.apply();
final Object f1865 = ShenLazyderef.LAMBDA.apply(x1563, v785);


final Object f1866 = ShenLazyderef.LAMBDA.apply(a1843, v785);





final Object f1867 = ShenLazyderef.LAMBDA.apply(y1566, v785);


final Object f1868 = ShenLazyderef.LAMBDA.apply(b1845, v785);





final Object f1869 = ShenLazyderef.LAMBDA.apply(hyp1863, v785);


final Object f1870 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1865, new Cons(RuntimeContext.symbol(":"), new Cons(f1866, Nil.NIL))), new Cons(new Cons(f1867, new Cons(RuntimeContext.symbol(":"), new Cons(f1868, Nil.NIL))), f1869)), v785, v786);
final Object f1871 = Do.LAMBDA.apply(f1864, f1870);


final Object result1862 = f1871;
final Object f1872 = ShenUnbindv.LAMBDA.apply(v5961849, v785);
final Object f1873 = Do.LAMBDA.apply(f1872, result1862);

final Object f1874 = Do.LAMBDA.apply(f1861, f1873);

i1875 = f1874;
} else {

i1875 = false;

}
i1876 = i1875;

}

final Object result1848 = i1876;
final Object f1877 = ShenUnbindv.LAMBDA.apply(v5821575, v785);
final Object f1878 = Do.LAMBDA.apply(f1877, result1848);

final Object f1879 = Do.LAMBDA.apply(f1847, f1878);



i1880 = f1879;
} else {

i1880 = false;

}
i1881 = i1880;

}

i1882 = i1881;
} else {

i1882 = false;

}

i1883 = i1882;
} else {

i1883 = false;

}

i1884 = i1883;
} else {

i1884 = false;

}

i1885 = i1884;
} else {

i1885 = false;

}


i1886 = i1885;
} else {

i1886 = false;

}


i1887 = i1886;
} else {

i1887 = false;

}

i1888 = i1887;
} else {

i1888 = false;

}

i1889 = i1888;
} else {

i1889 = false;

}

i1890 = i1889;
} else {

i1890 = false;

}

i1891 = i1890;
} else {

i1891 = false;

}

final Object case1552 = i1891;

final Object i2296;
if ((boolean)Lang.equals(case1552, false)) {
final Object f1894 = ShenLazyderef.LAMBDA.apply(v783, v785);

final Object v5971893 = f1894;


final Object i2188;
if ((boolean)(v5971893 instanceof Cons)) {

final Object f1896 = ShenLazyderef.LAMBDA.apply(((Cons)v5971893).head, v785);

final Object v5981895 = f1896;


final Object i2187;
if ((boolean)(v5981895 instanceof Cons)) {

final Object f1898 = ShenLazyderef.LAMBDA.apply(((Cons)v5981895).head, v785);

final Object v5991897 = f1898;


final Object i2186;
if ((boolean)(v5991897 instanceof Cons)) {

final Object f1900 = ShenLazyderef.LAMBDA.apply(((Cons)v5991897).head, v785);

final Object v6001899 = f1900;

final Object i2185;
if ((boolean)Lang.equals(RuntimeContext.symbol("@v"), v6001899)) {

final Object f1902 = ShenLazyderef.LAMBDA.apply(((Cons)v5991897).tail, v785);

final Object v6011901 = f1902;


final Object i2184;
if ((boolean)(v6011901 instanceof Cons)) {


final Object x1903 = ((Cons)v6011901).head;

final Object f1905 = ShenLazyderef.LAMBDA.apply(((Cons)v6011901).tail, v785);

final Object v6021904 = f1905;


final Object i2183;
if ((boolean)(v6021904 instanceof Cons)) {


final Object y1906 = ((Cons)v6021904).head;

final Object f1908 = ShenLazyderef.LAMBDA.apply(((Cons)v6021904).tail, v785);

final Object v6031907 = f1908;

final Object i2182;
if ((boolean)Lang.equals(Nil.NIL, v6031907)) {

final Object f1910 = ShenLazyderef.LAMBDA.apply(((Cons)v5981895).tail, v785);

final Object v6041909 = f1910;


final Object i2181;
if ((boolean)(v6041909 instanceof Cons)) {

final Object f1912 = ShenLazyderef.LAMBDA.apply(((Cons)v6041909).head, v785);

final Object v6051911 = f1912;

final Object i2180;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v6051911)) {

final Object f1914 = ShenLazyderef.LAMBDA.apply(((Cons)v6041909).tail, v785);

final Object v6061913 = f1914;


final Object i2179;
if ((boolean)(v6061913 instanceof Cons)) {

final Object f1916 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).head, v785);

final Object v6071915 = f1916;


final Object i2178;
if ((boolean)(v6071915 instanceof Cons)) {

final Object f1918 = ShenLazyderef.LAMBDA.apply(((Cons)v6071915).head, v785);

final Object v6081917 = f1918;

final Object i2140;
if ((boolean)Lang.equals(RuntimeContext.symbol("vector"), v6081917)) {

final Object f1920 = ShenLazyderef.LAMBDA.apply(((Cons)v6071915).tail, v785);

final Object v6091919 = f1920;


final Object i2025;
if ((boolean)(v6091919 instanceof Cons)) {


final Object a1921 = ((Cons)v6091919).head;

final Object f1923 = ShenLazyderef.LAMBDA.apply(((Cons)v6091919).tail, v785);

final Object v6101922 = f1923;

final Object i1987;
if ((boolean)Lang.equals(Nil.NIL, v6101922)) {

final Object f1925 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6111924 = f1925;

final Object i1951;
if ((boolean)Lang.equals(Nil.NIL, v6111924)) {


final Object hyp1926 = ((Cons)v5971893).tail;
final Object f1927 = ShenIncinfs.LAMBDA.apply();
final Object f1928 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f1929 = ShenLazyderef.LAMBDA.apply(a1921, v785);





final Object f1930 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f1931 = ShenLazyderef.LAMBDA.apply(a1921, v785);








final Object f1932 = ShenLazyderef.LAMBDA.apply(hyp1926, v785);


final Object f1933 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1928, new Cons(RuntimeContext.symbol(":"), new Cons(f1929, Nil.NIL))), new Cons(new Cons(f1930, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f1931, Nil.NIL)), Nil.NIL))), f1932)), v785, v786);
final Object f1934 = Do.LAMBDA.apply(f1927, f1933);


i1951 = f1934;
} else {
final Object f1935 = ShenPvarQ.LAMBDA.apply(v6111924);

final Object i1950;
if ((boolean)f1935) {
final Object f1936 = ShenBindv.LAMBDA.apply(v6111924, Nil.NIL, v785);


final Object hyp1938 = ((Cons)v5971893).tail;
final Object f1939 = ShenIncinfs.LAMBDA.apply();
final Object f1940 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f1941 = ShenLazyderef.LAMBDA.apply(a1921, v785);





final Object f1942 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f1943 = ShenLazyderef.LAMBDA.apply(a1921, v785);








final Object f1944 = ShenLazyderef.LAMBDA.apply(hyp1938, v785);


final Object f1945 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1940, new Cons(RuntimeContext.symbol(":"), new Cons(f1941, Nil.NIL))), new Cons(new Cons(f1942, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f1943, Nil.NIL)), Nil.NIL))), f1944)), v785, v786);
final Object f1946 = Do.LAMBDA.apply(f1939, f1945);


final Object result1937 = f1946;
final Object f1947 = ShenUnbindv.LAMBDA.apply(v6111924, v785);
final Object f1948 = Do.LAMBDA.apply(f1947, result1937);

final Object f1949 = Do.LAMBDA.apply(f1936, f1948);

i1950 = f1949;
} else {

i1950 = false;

}
i1951 = i1950;

}

i1987 = i1951;
} else {
final Object f1952 = ShenPvarQ.LAMBDA.apply(v6101922);

final Object i1986;
if ((boolean)f1952) {
final Object f1953 = ShenBindv.LAMBDA.apply(v6101922, Nil.NIL, v785);

final Object f1956 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6121955 = f1956;

final Object i1982;
if ((boolean)Lang.equals(Nil.NIL, v6121955)) {


final Object hyp1957 = ((Cons)v5971893).tail;
final Object f1958 = ShenIncinfs.LAMBDA.apply();
final Object f1959 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f1960 = ShenLazyderef.LAMBDA.apply(a1921, v785);





final Object f1961 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f1962 = ShenLazyderef.LAMBDA.apply(a1921, v785);








final Object f1963 = ShenLazyderef.LAMBDA.apply(hyp1957, v785);


final Object f1964 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1959, new Cons(RuntimeContext.symbol(":"), new Cons(f1960, Nil.NIL))), new Cons(new Cons(f1961, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f1962, Nil.NIL)), Nil.NIL))), f1963)), v785, v786);
final Object f1965 = Do.LAMBDA.apply(f1958, f1964);


i1982 = f1965;
} else {
final Object f1966 = ShenPvarQ.LAMBDA.apply(v6121955);

final Object i1981;
if ((boolean)f1966) {
final Object f1967 = ShenBindv.LAMBDA.apply(v6121955, Nil.NIL, v785);


final Object hyp1969 = ((Cons)v5971893).tail;
final Object f1970 = ShenIncinfs.LAMBDA.apply();
final Object f1971 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f1972 = ShenLazyderef.LAMBDA.apply(a1921, v785);





final Object f1973 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f1974 = ShenLazyderef.LAMBDA.apply(a1921, v785);








final Object f1975 = ShenLazyderef.LAMBDA.apply(hyp1969, v785);


final Object f1976 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1971, new Cons(RuntimeContext.symbol(":"), new Cons(f1972, Nil.NIL))), new Cons(new Cons(f1973, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f1974, Nil.NIL)), Nil.NIL))), f1975)), v785, v786);
final Object f1977 = Do.LAMBDA.apply(f1970, f1976);


final Object result1968 = f1977;
final Object f1978 = ShenUnbindv.LAMBDA.apply(v6121955, v785);
final Object f1979 = Do.LAMBDA.apply(f1978, result1968);

final Object f1980 = Do.LAMBDA.apply(f1967, f1979);

i1981 = f1980;
} else {

i1981 = false;

}
i1982 = i1981;

}

final Object result1954 = i1982;
final Object f1983 = ShenUnbindv.LAMBDA.apply(v6101922, v785);
final Object f1984 = Do.LAMBDA.apply(f1983, result1954);

final Object f1985 = Do.LAMBDA.apply(f1953, f1984);

i1986 = f1985;
} else {

i1986 = false;

}
i1987 = i1986;

}


i2025 = i1987;
} else {
final Object f1988 = ShenPvarQ.LAMBDA.apply(v6091919);

final Object i2024;
if ((boolean)f1988) {
final Object f1990 = ShenNewpv.LAMBDA.apply(v785);

final Object a1989 = f1990;


final Object f1991 = ShenBindv.LAMBDA.apply(v6091919, new Cons(a1989, Nil.NIL), v785);

final Object f1994 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6131993 = f1994;

final Object i2020;
if ((boolean)Lang.equals(Nil.NIL, v6131993)) {


final Object hyp1995 = ((Cons)v5971893).tail;
final Object f1996 = ShenIncinfs.LAMBDA.apply();
final Object f1997 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f1998 = ShenLazyderef.LAMBDA.apply(a1989, v785);





final Object f1999 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2000 = ShenLazyderef.LAMBDA.apply(a1989, v785);








final Object f2001 = ShenLazyderef.LAMBDA.apply(hyp1995, v785);


final Object f2002 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f1997, new Cons(RuntimeContext.symbol(":"), new Cons(f1998, Nil.NIL))), new Cons(new Cons(f1999, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2000, Nil.NIL)), Nil.NIL))), f2001)), v785, v786);
final Object f2003 = Do.LAMBDA.apply(f1996, f2002);


i2020 = f2003;
} else {
final Object f2004 = ShenPvarQ.LAMBDA.apply(v6131993);

final Object i2019;
if ((boolean)f2004) {
final Object f2005 = ShenBindv.LAMBDA.apply(v6131993, Nil.NIL, v785);


final Object hyp2007 = ((Cons)v5971893).tail;
final Object f2008 = ShenIncinfs.LAMBDA.apply();
final Object f2009 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2010 = ShenLazyderef.LAMBDA.apply(a1989, v785);





final Object f2011 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2012 = ShenLazyderef.LAMBDA.apply(a1989, v785);








final Object f2013 = ShenLazyderef.LAMBDA.apply(hyp2007, v785);


final Object f2014 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2009, new Cons(RuntimeContext.symbol(":"), new Cons(f2010, Nil.NIL))), new Cons(new Cons(f2011, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2012, Nil.NIL)), Nil.NIL))), f2013)), v785, v786);
final Object f2015 = Do.LAMBDA.apply(f2008, f2014);


final Object result2006 = f2015;
final Object f2016 = ShenUnbindv.LAMBDA.apply(v6131993, v785);
final Object f2017 = Do.LAMBDA.apply(f2016, result2006);

final Object f2018 = Do.LAMBDA.apply(f2005, f2017);

i2019 = f2018;
} else {

i2019 = false;

}
i2020 = i2019;

}

final Object result1992 = i2020;
final Object f2021 = ShenUnbindv.LAMBDA.apply(v6091919, v785);
final Object f2022 = Do.LAMBDA.apply(f2021, result1992);

final Object f2023 = Do.LAMBDA.apply(f1991, f2022);


i2024 = f2023;
} else {

i2024 = false;

}
i2025 = i2024;

}

i2140 = i2025;
} else {
final Object f2026 = ShenPvarQ.LAMBDA.apply(v6081917);

final Object i2139;
if ((boolean)f2026) {
final Object f2027 = ShenBindv.LAMBDA.apply(v6081917, RuntimeContext.symbol("vector"), v785);

final Object f2030 = ShenLazyderef.LAMBDA.apply(((Cons)v6071915).tail, v785);

final Object v6142029 = f2030;


final Object i2135;
if ((boolean)(v6142029 instanceof Cons)) {


final Object a2031 = ((Cons)v6142029).head;

final Object f2033 = ShenLazyderef.LAMBDA.apply(((Cons)v6142029).tail, v785);

final Object v6152032 = f2033;

final Object i2097;
if ((boolean)Lang.equals(Nil.NIL, v6152032)) {

final Object f2035 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6162034 = f2035;

final Object i2061;
if ((boolean)Lang.equals(Nil.NIL, v6162034)) {


final Object hyp2036 = ((Cons)v5971893).tail;
final Object f2037 = ShenIncinfs.LAMBDA.apply();
final Object f2038 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2039 = ShenLazyderef.LAMBDA.apply(a2031, v785);





final Object f2040 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2041 = ShenLazyderef.LAMBDA.apply(a2031, v785);








final Object f2042 = ShenLazyderef.LAMBDA.apply(hyp2036, v785);


final Object f2043 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2038, new Cons(RuntimeContext.symbol(":"), new Cons(f2039, Nil.NIL))), new Cons(new Cons(f2040, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2041, Nil.NIL)), Nil.NIL))), f2042)), v785, v786);
final Object f2044 = Do.LAMBDA.apply(f2037, f2043);


i2061 = f2044;
} else {
final Object f2045 = ShenPvarQ.LAMBDA.apply(v6162034);

final Object i2060;
if ((boolean)f2045) {
final Object f2046 = ShenBindv.LAMBDA.apply(v6162034, Nil.NIL, v785);


final Object hyp2048 = ((Cons)v5971893).tail;
final Object f2049 = ShenIncinfs.LAMBDA.apply();
final Object f2050 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2051 = ShenLazyderef.LAMBDA.apply(a2031, v785);





final Object f2052 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2053 = ShenLazyderef.LAMBDA.apply(a2031, v785);








final Object f2054 = ShenLazyderef.LAMBDA.apply(hyp2048, v785);


final Object f2055 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2050, new Cons(RuntimeContext.symbol(":"), new Cons(f2051, Nil.NIL))), new Cons(new Cons(f2052, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2053, Nil.NIL)), Nil.NIL))), f2054)), v785, v786);
final Object f2056 = Do.LAMBDA.apply(f2049, f2055);


final Object result2047 = f2056;
final Object f2057 = ShenUnbindv.LAMBDA.apply(v6162034, v785);
final Object f2058 = Do.LAMBDA.apply(f2057, result2047);

final Object f2059 = Do.LAMBDA.apply(f2046, f2058);

i2060 = f2059;
} else {

i2060 = false;

}
i2061 = i2060;

}

i2097 = i2061;
} else {
final Object f2062 = ShenPvarQ.LAMBDA.apply(v6152032);

final Object i2096;
if ((boolean)f2062) {
final Object f2063 = ShenBindv.LAMBDA.apply(v6152032, Nil.NIL, v785);

final Object f2066 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6172065 = f2066;

final Object i2092;
if ((boolean)Lang.equals(Nil.NIL, v6172065)) {


final Object hyp2067 = ((Cons)v5971893).tail;
final Object f2068 = ShenIncinfs.LAMBDA.apply();
final Object f2069 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2070 = ShenLazyderef.LAMBDA.apply(a2031, v785);





final Object f2071 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2072 = ShenLazyderef.LAMBDA.apply(a2031, v785);








final Object f2073 = ShenLazyderef.LAMBDA.apply(hyp2067, v785);


final Object f2074 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2069, new Cons(RuntimeContext.symbol(":"), new Cons(f2070, Nil.NIL))), new Cons(new Cons(f2071, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2072, Nil.NIL)), Nil.NIL))), f2073)), v785, v786);
final Object f2075 = Do.LAMBDA.apply(f2068, f2074);


i2092 = f2075;
} else {
final Object f2076 = ShenPvarQ.LAMBDA.apply(v6172065);

final Object i2091;
if ((boolean)f2076) {
final Object f2077 = ShenBindv.LAMBDA.apply(v6172065, Nil.NIL, v785);


final Object hyp2079 = ((Cons)v5971893).tail;
final Object f2080 = ShenIncinfs.LAMBDA.apply();
final Object f2081 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2082 = ShenLazyderef.LAMBDA.apply(a2031, v785);





final Object f2083 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2084 = ShenLazyderef.LAMBDA.apply(a2031, v785);








final Object f2085 = ShenLazyderef.LAMBDA.apply(hyp2079, v785);


final Object f2086 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2081, new Cons(RuntimeContext.symbol(":"), new Cons(f2082, Nil.NIL))), new Cons(new Cons(f2083, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2084, Nil.NIL)), Nil.NIL))), f2085)), v785, v786);
final Object f2087 = Do.LAMBDA.apply(f2080, f2086);


final Object result2078 = f2087;
final Object f2088 = ShenUnbindv.LAMBDA.apply(v6172065, v785);
final Object f2089 = Do.LAMBDA.apply(f2088, result2078);

final Object f2090 = Do.LAMBDA.apply(f2077, f2089);

i2091 = f2090;
} else {

i2091 = false;

}
i2092 = i2091;

}

final Object result2064 = i2092;
final Object f2093 = ShenUnbindv.LAMBDA.apply(v6152032, v785);
final Object f2094 = Do.LAMBDA.apply(f2093, result2064);

final Object f2095 = Do.LAMBDA.apply(f2063, f2094);

i2096 = f2095;
} else {

i2096 = false;

}
i2097 = i2096;

}


i2135 = i2097;
} else {
final Object f2098 = ShenPvarQ.LAMBDA.apply(v6142029);

final Object i2134;
if ((boolean)f2098) {
final Object f2100 = ShenNewpv.LAMBDA.apply(v785);

final Object a2099 = f2100;


final Object f2101 = ShenBindv.LAMBDA.apply(v6142029, new Cons(a2099, Nil.NIL), v785);

final Object f2104 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6182103 = f2104;

final Object i2130;
if ((boolean)Lang.equals(Nil.NIL, v6182103)) {


final Object hyp2105 = ((Cons)v5971893).tail;
final Object f2106 = ShenIncinfs.LAMBDA.apply();
final Object f2107 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2108 = ShenLazyderef.LAMBDA.apply(a2099, v785);





final Object f2109 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2110 = ShenLazyderef.LAMBDA.apply(a2099, v785);








final Object f2111 = ShenLazyderef.LAMBDA.apply(hyp2105, v785);


final Object f2112 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2107, new Cons(RuntimeContext.symbol(":"), new Cons(f2108, Nil.NIL))), new Cons(new Cons(f2109, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2110, Nil.NIL)), Nil.NIL))), f2111)), v785, v786);
final Object f2113 = Do.LAMBDA.apply(f2106, f2112);


i2130 = f2113;
} else {
final Object f2114 = ShenPvarQ.LAMBDA.apply(v6182103);

final Object i2129;
if ((boolean)f2114) {
final Object f2115 = ShenBindv.LAMBDA.apply(v6182103, Nil.NIL, v785);


final Object hyp2117 = ((Cons)v5971893).tail;
final Object f2118 = ShenIncinfs.LAMBDA.apply();
final Object f2119 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2120 = ShenLazyderef.LAMBDA.apply(a2099, v785);





final Object f2121 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2122 = ShenLazyderef.LAMBDA.apply(a2099, v785);








final Object f2123 = ShenLazyderef.LAMBDA.apply(hyp2117, v785);


final Object f2124 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2119, new Cons(RuntimeContext.symbol(":"), new Cons(f2120, Nil.NIL))), new Cons(new Cons(f2121, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2122, Nil.NIL)), Nil.NIL))), f2123)), v785, v786);
final Object f2125 = Do.LAMBDA.apply(f2118, f2124);


final Object result2116 = f2125;
final Object f2126 = ShenUnbindv.LAMBDA.apply(v6182103, v785);
final Object f2127 = Do.LAMBDA.apply(f2126, result2116);

final Object f2128 = Do.LAMBDA.apply(f2115, f2127);

i2129 = f2128;
} else {

i2129 = false;

}
i2130 = i2129;

}

final Object result2102 = i2130;
final Object f2131 = ShenUnbindv.LAMBDA.apply(v6142029, v785);
final Object f2132 = Do.LAMBDA.apply(f2131, result2102);

final Object f2133 = Do.LAMBDA.apply(f2101, f2132);


i2134 = f2133;
} else {

i2134 = false;

}
i2135 = i2134;

}

final Object result2028 = i2135;
final Object f2136 = ShenUnbindv.LAMBDA.apply(v6081917, v785);
final Object f2137 = Do.LAMBDA.apply(f2136, result2028);

final Object f2138 = Do.LAMBDA.apply(f2027, f2137);

i2139 = f2138;
} else {

i2139 = false;

}
i2140 = i2139;

}

i2178 = i2140;
} else {
final Object f2141 = ShenPvarQ.LAMBDA.apply(v6071915);

final Object i2177;
if ((boolean)f2141) {
final Object f2143 = ShenNewpv.LAMBDA.apply(v785);

final Object a2142 = f2143;




final Object f2144 = ShenBindv.LAMBDA.apply(v6071915, new Cons(RuntimeContext.symbol("vector"), new Cons(a2142, Nil.NIL)), v785);

final Object f2147 = ShenLazyderef.LAMBDA.apply(((Cons)v6061913).tail, v785);

final Object v6192146 = f2147;

final Object i2173;
if ((boolean)Lang.equals(Nil.NIL, v6192146)) {


final Object hyp2148 = ((Cons)v5971893).tail;
final Object f2149 = ShenIncinfs.LAMBDA.apply();
final Object f2150 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2151 = ShenLazyderef.LAMBDA.apply(a2142, v785);





final Object f2152 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2153 = ShenLazyderef.LAMBDA.apply(a2142, v785);








final Object f2154 = ShenLazyderef.LAMBDA.apply(hyp2148, v785);


final Object f2155 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2150, new Cons(RuntimeContext.symbol(":"), new Cons(f2151, Nil.NIL))), new Cons(new Cons(f2152, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2153, Nil.NIL)), Nil.NIL))), f2154)), v785, v786);
final Object f2156 = Do.LAMBDA.apply(f2149, f2155);


i2173 = f2156;
} else {
final Object f2157 = ShenPvarQ.LAMBDA.apply(v6192146);

final Object i2172;
if ((boolean)f2157) {
final Object f2158 = ShenBindv.LAMBDA.apply(v6192146, Nil.NIL, v785);


final Object hyp2160 = ((Cons)v5971893).tail;
final Object f2161 = ShenIncinfs.LAMBDA.apply();
final Object f2162 = ShenLazyderef.LAMBDA.apply(x1903, v785);


final Object f2163 = ShenLazyderef.LAMBDA.apply(a2142, v785);





final Object f2164 = ShenLazyderef.LAMBDA.apply(y1906, v785);



final Object f2165 = ShenLazyderef.LAMBDA.apply(a2142, v785);








final Object f2166 = ShenLazyderef.LAMBDA.apply(hyp2160, v785);


final Object f2167 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2162, new Cons(RuntimeContext.symbol(":"), new Cons(f2163, Nil.NIL))), new Cons(new Cons(f2164, new Cons(RuntimeContext.symbol(":"), new Cons(new Cons(RuntimeContext.symbol("vector"), new Cons(f2165, Nil.NIL)), Nil.NIL))), f2166)), v785, v786);
final Object f2168 = Do.LAMBDA.apply(f2161, f2167);


final Object result2159 = f2168;
final Object f2169 = ShenUnbindv.LAMBDA.apply(v6192146, v785);
final Object f2170 = Do.LAMBDA.apply(f2169, result2159);

final Object f2171 = Do.LAMBDA.apply(f2158, f2170);

i2172 = f2171;
} else {

i2172 = false;

}
i2173 = i2172;

}

final Object result2145 = i2173;
final Object f2174 = ShenUnbindv.LAMBDA.apply(v6071915, v785);
final Object f2175 = Do.LAMBDA.apply(f2174, result2145);

final Object f2176 = Do.LAMBDA.apply(f2144, f2175);


i2177 = f2176;
} else {

i2177 = false;

}
i2178 = i2177;

}

i2179 = i2178;
} else {

i2179 = false;

}

i2180 = i2179;
} else {

i2180 = false;

}

i2181 = i2180;
} else {

i2181 = false;

}

i2182 = i2181;
} else {

i2182 = false;

}


i2183 = i2182;
} else {

i2183 = false;

}


i2184 = i2183;
} else {

i2184 = false;

}

i2185 = i2184;
} else {

i2185 = false;

}

i2186 = i2185;
} else {

i2186 = false;

}

i2187 = i2186;
} else {

i2187 = false;

}

i2188 = i2187;
} else {

i2188 = false;

}

final Object case1892 = i2188;

final Object i2295;
if ((boolean)Lang.equals(case1892, false)) {
final Object f2191 = ShenLazyderef.LAMBDA.apply(v783, v785);

final Object v6202190 = f2191;


final Object i2279;
if ((boolean)(v6202190 instanceof Cons)) {

final Object f2193 = ShenLazyderef.LAMBDA.apply(((Cons)v6202190).head, v785);

final Object v6212192 = f2193;


final Object i2278;
if ((boolean)(v6212192 instanceof Cons)) {

final Object f2195 = ShenLazyderef.LAMBDA.apply(((Cons)v6212192).head, v785);

final Object v6222194 = f2195;


final Object i2277;
if ((boolean)(v6222194 instanceof Cons)) {

final Object f2197 = ShenLazyderef.LAMBDA.apply(((Cons)v6222194).head, v785);

final Object v6232196 = f2197;

final Object i2276;
if ((boolean)Lang.equals(RuntimeContext.symbol("@s"), v6232196)) {

final Object f2199 = ShenLazyderef.LAMBDA.apply(((Cons)v6222194).tail, v785);

final Object v6242198 = f2199;


final Object i2275;
if ((boolean)(v6242198 instanceof Cons)) {


final Object x2200 = ((Cons)v6242198).head;

final Object f2202 = ShenLazyderef.LAMBDA.apply(((Cons)v6242198).tail, v785);

final Object v6252201 = f2202;


final Object i2274;
if ((boolean)(v6252201 instanceof Cons)) {


final Object y2203 = ((Cons)v6252201).head;

final Object f2205 = ShenLazyderef.LAMBDA.apply(((Cons)v6252201).tail, v785);

final Object v6262204 = f2205;

final Object i2273;
if ((boolean)Lang.equals(Nil.NIL, v6262204)) {

final Object f2207 = ShenLazyderef.LAMBDA.apply(((Cons)v6212192).tail, v785);

final Object v6272206 = f2207;


final Object i2272;
if ((boolean)(v6272206 instanceof Cons)) {

final Object f2209 = ShenLazyderef.LAMBDA.apply(((Cons)v6272206).head, v785);

final Object v6282208 = f2209;

final Object i2271;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v6282208)) {

final Object f2211 = ShenLazyderef.LAMBDA.apply(((Cons)v6272206).tail, v785);

final Object v6292210 = f2211;


final Object i2270;
if ((boolean)(v6292210 instanceof Cons)) {

final Object f2213 = ShenLazyderef.LAMBDA.apply(((Cons)v6292210).head, v785);

final Object v6302212 = f2213;

final Object i2269;
if ((boolean)Lang.equals(RuntimeContext.symbol("string"), v6302212)) {

final Object f2215 = ShenLazyderef.LAMBDA.apply(((Cons)v6292210).tail, v785);

final Object v6312214 = f2215;

final Object i2237;
if ((boolean)Lang.equals(Nil.NIL, v6312214)) {


final Object hyp2216 = ((Cons)v6202190).tail;
final Object f2217 = ShenIncinfs.LAMBDA.apply();
final Object f2218 = ShenLazyderef.LAMBDA.apply(x2200, v785);







final Object f2219 = ShenLazyderef.LAMBDA.apply(y2203, v785);







final Object f2220 = ShenLazyderef.LAMBDA.apply(hyp2216, v785);


final Object f2221 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2218, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), new Cons(new Cons(f2219, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), f2220)), v785, v786);
final Object f2222 = Do.LAMBDA.apply(f2217, f2221);


i2237 = f2222;
} else {
final Object f2223 = ShenPvarQ.LAMBDA.apply(v6312214);

final Object i2236;
if ((boolean)f2223) {
final Object f2224 = ShenBindv.LAMBDA.apply(v6312214, Nil.NIL, v785);


final Object hyp2226 = ((Cons)v6202190).tail;
final Object f2227 = ShenIncinfs.LAMBDA.apply();
final Object f2228 = ShenLazyderef.LAMBDA.apply(x2200, v785);







final Object f2229 = ShenLazyderef.LAMBDA.apply(y2203, v785);







final Object f2230 = ShenLazyderef.LAMBDA.apply(hyp2226, v785);


final Object f2231 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2228, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), new Cons(new Cons(f2229, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), f2230)), v785, v786);
final Object f2232 = Do.LAMBDA.apply(f2227, f2231);


final Object result2225 = f2232;
final Object f2233 = ShenUnbindv.LAMBDA.apply(v6312214, v785);
final Object f2234 = Do.LAMBDA.apply(f2233, result2225);

final Object f2235 = Do.LAMBDA.apply(f2224, f2234);

i2236 = f2235;
} else {

i2236 = false;

}
i2237 = i2236;

}

i2269 = i2237;
} else {
final Object f2238 = ShenPvarQ.LAMBDA.apply(v6302212);

final Object i2268;
if ((boolean)f2238) {
final Object f2239 = ShenBindv.LAMBDA.apply(v6302212, RuntimeContext.symbol("string"), v785);

final Object f2242 = ShenLazyderef.LAMBDA.apply(((Cons)v6292210).tail, v785);

final Object v6322241 = f2242;

final Object i2264;
if ((boolean)Lang.equals(Nil.NIL, v6322241)) {


final Object hyp2243 = ((Cons)v6202190).tail;
final Object f2244 = ShenIncinfs.LAMBDA.apply();
final Object f2245 = ShenLazyderef.LAMBDA.apply(x2200, v785);







final Object f2246 = ShenLazyderef.LAMBDA.apply(y2203, v785);







final Object f2247 = ShenLazyderef.LAMBDA.apply(hyp2243, v785);


final Object f2248 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2245, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), new Cons(new Cons(f2246, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), f2247)), v785, v786);
final Object f2249 = Do.LAMBDA.apply(f2244, f2248);


i2264 = f2249;
} else {
final Object f2250 = ShenPvarQ.LAMBDA.apply(v6322241);

final Object i2263;
if ((boolean)f2250) {
final Object f2251 = ShenBindv.LAMBDA.apply(v6322241, Nil.NIL, v785);


final Object hyp2253 = ((Cons)v6202190).tail;
final Object f2254 = ShenIncinfs.LAMBDA.apply();
final Object f2255 = ShenLazyderef.LAMBDA.apply(x2200, v785);







final Object f2256 = ShenLazyderef.LAMBDA.apply(y2203, v785);







final Object f2257 = ShenLazyderef.LAMBDA.apply(hyp2253, v785);


final Object f2258 = Bind.LAMBDA.apply(v784, new Cons(new Cons(f2255, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), new Cons(new Cons(f2256, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("string"), Nil.NIL))), f2257)), v785, v786);
final Object f2259 = Do.LAMBDA.apply(f2254, f2258);


final Object result2252 = f2259;
final Object f2260 = ShenUnbindv.LAMBDA.apply(v6322241, v785);
final Object f2261 = Do.LAMBDA.apply(f2260, result2252);

final Object f2262 = Do.LAMBDA.apply(f2251, f2261);

i2263 = f2262;
} else {

i2263 = false;

}
i2264 = i2263;

}

final Object result2240 = i2264;
final Object f2265 = ShenUnbindv.LAMBDA.apply(v6302212, v785);
final Object f2266 = Do.LAMBDA.apply(f2265, result2240);

final Object f2267 = Do.LAMBDA.apply(f2239, f2266);

i2268 = f2267;
} else {

i2268 = false;

}
i2269 = i2268;

}

i2270 = i2269;
} else {

i2270 = false;

}

i2271 = i2270;
} else {

i2271 = false;

}

i2272 = i2271;
} else {

i2272 = false;

}

i2273 = i2272;
} else {

i2273 = false;

}


i2274 = i2273;
} else {

i2274 = false;

}


i2275 = i2274;
} else {

i2275 = false;

}

i2276 = i2275;
} else {

i2276 = false;

}

i2277 = i2276;
} else {

i2277 = false;

}

i2278 = i2277;
} else {

i2278 = false;

}

i2279 = i2278;
} else {

i2279 = false;

}

final Object case2189 = i2279;

final Object i2294;
if ((boolean)Lang.equals(case2189, false)) {
final Object f2281 = ShenLazyderef.LAMBDA.apply(v783, v785);

final Object v6332280 = f2281;


final Object i2293;
if ((boolean)(v6332280 instanceof Cons)) {


final Object x2282 = ((Cons)v6332280).head;


final Object hyp2283 = ((Cons)v6332280).tail;
final Object f2285 = ShenNewpv.LAMBDA.apply(v785);

final Object newHyps2284 = f2285;
final Object f2286 = ShenIncinfs.LAMBDA.apply();
final Object f2287 = ShenLazyderef.LAMBDA.apply(x2282, v785);

final Object f2288 = ShenLazyderef.LAMBDA.apply(newHyps2284, v785);

final Lambda l2290 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2289 = ShenTStarHyps.LAMBDA.apply(hyp2283, newHyps2284, v785, v786);

    return f2289;
  }
};final Object f2291 = Bind.LAMBDA.apply(v784, new Cons(f2287, f2288), v785, l2290);
final Object f2292 = Do.LAMBDA.apply(f2286, f2291);




i2293 = f2292;
} else {

i2293 = false;

}

i2294 = i2293;
} else {

i2294 = case2189;

}

i2295 = i2294;
} else {

i2295 = case1892;

}

i2296 = i2295;
} else {

i2296 = case1552;

}

i2297 = i2296;
} else {

i2297 = case1255;

}

    return i2297;

}
}
