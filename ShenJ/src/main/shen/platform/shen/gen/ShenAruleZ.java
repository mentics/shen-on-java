package shen.gen;



import com.mentics.shen.*;

public class ShenAruleZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<rule>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v395) throws Exception {
return defined(v395);
}};
public static Object defined(final Object v395) throws Exception {
final Object f1425 = ShenApatternsZ.LAMBDA.apply(v395);

final Object parse_ApatternsZ1424 = f1425;


final Object i1453;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ1424))) {
final Object f1426 = Fst.LAMBDA.apply(parse_ApatternsZ1424);


final Object i1429;
if ((boolean)(f1426 instanceof Cons)) {
final Object f1427 = Fst.LAMBDA.apply(parse_ApatternsZ1424);


final Object i1428;
if ((boolean)Lang.equals(RuntimeContext.symbol("->"), ((Cons)f1427).head)) {

i1428 = true;
} else {

i1428 = false;

}
i1429 = i1428;
} else {

i1429 = false;

}
final Object i1452;
if ((boolean)i1429) {
final Object f1431 = Fst.LAMBDA.apply(parse_ApatternsZ1424);

final Object f1432 = Snd.LAMBDA.apply(parse_ApatternsZ1424);
final Object f1433 = ShenReassemble.LAMBDA.apply(((Cons)f1431).tail, f1432);
final Object f1434 = ShenAactionZ.LAMBDA.apply(f1433);

final Object parse_AactionZ1430 = f1434;


final Object i1451;
if ((boolean)!((boolean)Lang.equals(null, parse_AactionZ1430))) {
final Object f1435 = Fst.LAMBDA.apply(parse_AactionZ1430);


final Object i1438;
if ((boolean)(f1435 instanceof Cons)) {
final Object f1436 = Fst.LAMBDA.apply(parse_AactionZ1430);


final Object i1437;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)f1436).head)) {

i1437 = true;
} else {

i1437 = false;

}
i1438 = i1437;
} else {

i1438 = false;

}
final Object i1450;
if ((boolean)i1438) {
final Object f1440 = Fst.LAMBDA.apply(parse_AactionZ1430);

final Object f1441 = Snd.LAMBDA.apply(parse_AactionZ1430);
final Object f1442 = ShenReassemble.LAMBDA.apply(((Cons)f1440).tail, f1441);
final Object f1443 = ShenAguardZ.LAMBDA.apply(f1442);

final Object parse_AguardZ1439 = f1443;


final Object i1449;
if ((boolean)!((boolean)Lang.equals(null, parse_AguardZ1439))) {
final Object f1444 = Fst.LAMBDA.apply(parse_AguardZ1439);
final Object f1445 = Snd.LAMBDA.apply(parse_ApatternsZ1424);


final Object f1446 = Snd.LAMBDA.apply(parse_AguardZ1439);

final Object f1447 = Snd.LAMBDA.apply(parse_AactionZ1430);







final Object f1448 = ShenReassemble.LAMBDA.apply(f1444, new Cons(f1445, new Cons(new Cons(RuntimeContext.symbol("where"), new Cons(f1446, new Cons(f1447, Nil.NIL))), Nil.NIL)));

i1449 = f1448;
} else {

i1449 = null;

}

i1450 = i1449;
} else {

i1450 = null;

}
i1451 = i1450;
} else {

i1451 = null;

}

i1452 = i1451;
} else {

i1452 = null;

}
i1453 = i1452;
} else {

i1453 = null;

}

final Object result1423 = i1453;

final Object i1526;
if ((boolean)Lang.equals(result1423, null)) {
final Object f1456 = ShenApatternsZ.LAMBDA.apply(v395);

final Object parse_ApatternsZ1455 = f1456;


final Object i1472;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ1455))) {
final Object f1457 = Fst.LAMBDA.apply(parse_ApatternsZ1455);


final Object i1460;
if ((boolean)(f1457 instanceof Cons)) {
final Object f1458 = Fst.LAMBDA.apply(parse_ApatternsZ1455);


final Object i1459;
if ((boolean)Lang.equals(RuntimeContext.symbol("->"), ((Cons)f1458).head)) {

i1459 = true;
} else {

i1459 = false;

}
i1460 = i1459;
} else {

i1460 = false;

}
final Object i1471;
if ((boolean)i1460) {
final Object f1462 = Fst.LAMBDA.apply(parse_ApatternsZ1455);

final Object f1463 = Snd.LAMBDA.apply(parse_ApatternsZ1455);
final Object f1464 = ShenReassemble.LAMBDA.apply(((Cons)f1462).tail, f1463);
final Object f1465 = ShenAactionZ.LAMBDA.apply(f1464);

final Object parse_AactionZ1461 = f1465;


final Object i1470;
if ((boolean)!((boolean)Lang.equals(null, parse_AactionZ1461))) {
final Object f1466 = Fst.LAMBDA.apply(parse_AactionZ1461);
final Object f1467 = Snd.LAMBDA.apply(parse_ApatternsZ1455);

final Object f1468 = Snd.LAMBDA.apply(parse_AactionZ1461);



final Object f1469 = ShenReassemble.LAMBDA.apply(f1466, new Cons(f1467, new Cons(f1468, Nil.NIL)));

i1470 = f1469;
} else {

i1470 = null;

}

i1471 = i1470;
} else {

i1471 = null;

}
i1472 = i1471;
} else {

i1472 = null;

}

final Object result1454 = i1472;

final Object i1525;
if ((boolean)Lang.equals(result1454, null)) {
final Object f1475 = ShenApatternsZ.LAMBDA.apply(v395);

final Object parse_ApatternsZ1474 = f1475;


final Object i1503;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ1474))) {
final Object f1476 = Fst.LAMBDA.apply(parse_ApatternsZ1474);


final Object i1479;
if ((boolean)(f1476 instanceof Cons)) {
final Object f1477 = Fst.LAMBDA.apply(parse_ApatternsZ1474);


final Object i1478;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-"), ((Cons)f1477).head)) {

i1478 = true;
} else {

i1478 = false;

}
i1479 = i1478;
} else {

i1479 = false;

}
final Object i1502;
if ((boolean)i1479) {
final Object f1481 = Fst.LAMBDA.apply(parse_ApatternsZ1474);

final Object f1482 = Snd.LAMBDA.apply(parse_ApatternsZ1474);
final Object f1483 = ShenReassemble.LAMBDA.apply(((Cons)f1481).tail, f1482);
final Object f1484 = ShenAactionZ.LAMBDA.apply(f1483);

final Object parse_AactionZ1480 = f1484;


final Object i1501;
if ((boolean)!((boolean)Lang.equals(null, parse_AactionZ1480))) {
final Object f1485 = Fst.LAMBDA.apply(parse_AactionZ1480);


final Object i1488;
if ((boolean)(f1485 instanceof Cons)) {
final Object f1486 = Fst.LAMBDA.apply(parse_AactionZ1480);


final Object i1487;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)f1486).head)) {

i1487 = true;
} else {

i1487 = false;

}
i1488 = i1487;
} else {

i1488 = false;

}
final Object i1500;
if ((boolean)i1488) {
final Object f1490 = Fst.LAMBDA.apply(parse_AactionZ1480);

final Object f1491 = Snd.LAMBDA.apply(parse_AactionZ1480);
final Object f1492 = ShenReassemble.LAMBDA.apply(((Cons)f1490).tail, f1491);
final Object f1493 = ShenAguardZ.LAMBDA.apply(f1492);

final Object parse_AguardZ1489 = f1493;


final Object i1499;
if ((boolean)!((boolean)Lang.equals(null, parse_AguardZ1489))) {
final Object f1494 = Fst.LAMBDA.apply(parse_AguardZ1489);
final Object f1495 = Snd.LAMBDA.apply(parse_ApatternsZ1474);


final Object f1496 = Snd.LAMBDA.apply(parse_AguardZ1489);


final Object f1497 = Snd.LAMBDA.apply(parse_AactionZ1480);










final Object f1498 = ShenReassemble.LAMBDA.apply(f1494, new Cons(f1495, new Cons(new Cons(RuntimeContext.symbol("where"), new Cons(f1496, new Cons(new Cons(RuntimeContext.symbol("shen-choicepoint!"), new Cons(f1497, Nil.NIL)), Nil.NIL))), Nil.NIL)));

i1499 = f1498;
} else {

i1499 = null;

}

i1500 = i1499;
} else {

i1500 = null;

}
i1501 = i1500;
} else {

i1501 = null;

}

i1502 = i1501;
} else {

i1502 = null;

}
i1503 = i1502;
} else {

i1503 = null;

}

final Object result1473 = i1503;

final Object i1524;
if ((boolean)Lang.equals(result1473, null)) {
final Object f1506 = ShenApatternsZ.LAMBDA.apply(v395);

final Object parse_ApatternsZ1505 = f1506;


final Object i1522;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ1505))) {
final Object f1507 = Fst.LAMBDA.apply(parse_ApatternsZ1505);


final Object i1510;
if ((boolean)(f1507 instanceof Cons)) {
final Object f1508 = Fst.LAMBDA.apply(parse_ApatternsZ1505);


final Object i1509;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-"), ((Cons)f1508).head)) {

i1509 = true;
} else {

i1509 = false;

}
i1510 = i1509;
} else {

i1510 = false;

}
final Object i1521;
if ((boolean)i1510) {
final Object f1512 = Fst.LAMBDA.apply(parse_ApatternsZ1505);

final Object f1513 = Snd.LAMBDA.apply(parse_ApatternsZ1505);
final Object f1514 = ShenReassemble.LAMBDA.apply(((Cons)f1512).tail, f1513);
final Object f1515 = ShenAactionZ.LAMBDA.apply(f1514);

final Object parse_AactionZ1511 = f1515;


final Object i1520;
if ((boolean)!((boolean)Lang.equals(null, parse_AactionZ1511))) {
final Object f1516 = Fst.LAMBDA.apply(parse_AactionZ1511);
final Object f1517 = Snd.LAMBDA.apply(parse_ApatternsZ1505);


final Object f1518 = Snd.LAMBDA.apply(parse_AactionZ1511);






final Object f1519 = ShenReassemble.LAMBDA.apply(f1516, new Cons(f1517, new Cons(new Cons(RuntimeContext.symbol("shen-choicepoint!"), new Cons(f1518, Nil.NIL)), Nil.NIL)));

i1520 = f1519;
} else {

i1520 = null;

}

i1521 = i1520;
} else {

i1521 = null;

}
i1522 = i1521;
} else {

i1522 = null;

}

final Object result1504 = i1522;

final Object i1523;
if ((boolean)Lang.equals(result1504, null)) {

i1523 = null;
} else {

i1523 = result1504;

}

i1524 = i1523;
} else {

i1524 = result1473;

}

i1525 = i1524;
} else {

i1525 = result1454;

}

i1526 = i1525;
} else {

i1526 = result1423;

}

    return i1526;

}
}
