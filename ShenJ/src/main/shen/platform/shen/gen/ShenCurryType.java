package shen.gen;



import com.mentics.shen.*;

public class ShenCurryType {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-curry-type");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v391) throws Exception {
return defined(v391);
}};
public static Object defined(final Object v391) throws Exception {


final Object i1349;
if ((boolean)(v391 instanceof Cons)) {



final Object i1347;
if ((boolean)(((Cons)v391).tail instanceof Cons)) {



final Object i1345;
if ((boolean)Lang.equals(RuntimeContext.symbol("-->"), ((Cons)((Cons)v391).tail).head)) {




final Object i1343;
if ((boolean)(((Cons)((Cons)v391).tail).tail instanceof Cons)) {





final Object i1341;
if ((boolean)(((Cons)((Cons)((Cons)v391).tail).tail).tail instanceof Cons)) {





final Object i1340;
if ((boolean)Lang.equals(RuntimeContext.symbol("-->"), ((Cons)((Cons)((Cons)((Cons)v391).tail).tail).tail).head)) {

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
final Object i1346;
if ((boolean)i1345) {

i1346 = true;
} else {

i1346 = false;

}
i1347 = i1346;
} else {

i1347 = false;

}
final Object i1348;
if ((boolean)i1347) {

i1348 = true;
} else {

i1348 = false;

}
i1349 = i1348;
} else {

i1349 = false;

}
final Object i1378;
if ((boolean)i1349) {









final Object f1350 = ShenCurryType.LAMBDA.apply(new Cons(((Cons)v391).head, new Cons(RuntimeContext.symbol("-->"), new Cons(((Cons)((Cons)v391).tail).tail, Nil.NIL))));

i1378 = f1350;
} else {


final Object i1358;
if ((boolean)(v391 instanceof Cons)) {


final Object i1356;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v391).head)) {



final Object i1354;
if ((boolean)(((Cons)v391).tail instanceof Cons)) {




final Object i1352;
if ((boolean)(((Cons)((Cons)v391).tail).tail instanceof Cons)) {




final Object i1351;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v391).tail).tail).tail)) {

i1351 = true;
} else {

i1351 = false;

}
i1352 = i1351;
} else {

i1352 = false;

}
final Object i1353;
if ((boolean)i1352) {

i1353 = true;
} else {

i1353 = false;

}
i1354 = i1353;
} else {

i1354 = false;

}
final Object i1355;
if ((boolean)i1354) {

i1355 = true;
} else {

i1355 = false;

}
i1356 = i1355;
} else {

i1356 = false;

}
final Object i1357;
if ((boolean)i1356) {

i1357 = true;
} else {

i1357 = false;

}
i1358 = i1357;
} else {

i1358 = false;

}
final Object i1377;
if ((boolean)i1358) {



final Object f1359 = ShenCurryType.LAMBDA.apply(((Cons)((Cons)v391).tail).head);




i1377 = new Cons(RuntimeContext.symbol("list"), new Cons(f1359, Nil.NIL));
} else {


final Object i1369;
if ((boolean)(v391 instanceof Cons)) {



final Object i1367;
if ((boolean)(((Cons)v391).tail instanceof Cons)) {



final Object i1365;
if ((boolean)Lang.equals(RuntimeContext.symbol("*"), ((Cons)((Cons)v391).tail).head)) {




final Object i1363;
if ((boolean)(((Cons)((Cons)v391).tail).tail instanceof Cons)) {





final Object i1361;
if ((boolean)(((Cons)((Cons)((Cons)v391).tail).tail).tail instanceof Cons)) {





final Object i1360;
if ((boolean)Lang.equals(RuntimeContext.symbol("*"), ((Cons)((Cons)((Cons)((Cons)v391).tail).tail).tail).head)) {

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
final Object i1366;
if ((boolean)i1365) {

i1366 = true;
} else {

i1366 = false;

}
i1367 = i1366;
} else {

i1367 = false;

}
final Object i1368;
if ((boolean)i1367) {

i1368 = true;
} else {

i1368 = false;

}
i1369 = i1368;
} else {

i1369 = false;

}
final Object i1376;
if ((boolean)i1369) {









final Object f1370 = ShenCurryType.LAMBDA.apply(new Cons(((Cons)v391).head, new Cons(RuntimeContext.symbol("*"), new Cons(((Cons)((Cons)v391).tail).tail, Nil.NIL))));

i1376 = f1370;
} else {


final Object i1375;
if ((boolean)(v391 instanceof Cons)) {
final Lambda l1372 = new Lambda1() {
  public Object apply(final Object v392) throws Exception {
    final Object f1371 = ShenCurryType.LAMBDA.apply(v392);

    return f1371;
  }
};final Object f1373 = Map.LAMBDA.apply(l1372, v391);

i1375 = f1373;
} else {

final Object i1374;
if ((boolean)true) {

i1374 = v391;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1375 = i1374;

}
i1376 = i1375;

}
i1377 = i1376;

}
i1378 = i1377;

}
    return i1378;

}
}
