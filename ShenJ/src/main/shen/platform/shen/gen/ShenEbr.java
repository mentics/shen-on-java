package shen.gen;



import com.mentics.shen.*;

public class ShenEbr {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-ebr");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v505, final Object v506, final Object v507) throws Exception {
return defined(v505, v506, v507);
}};
public static Object defined(final Object v505, final Object v506, final Object v507) throws Exception {

final Object i2357;
if ((boolean)Lang.equals(v507, v506)) {

i2357 = v505;
} else {


final Object i2337;
if ((boolean)(v507 instanceof Cons)) {


final Object i2335;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)v507).head)) {



final Object i2333;
if ((boolean)(((Cons)v507).tail instanceof Cons)) {




final Object i2331;
if ((boolean)(((Cons)((Cons)v507).tail).tail instanceof Cons)) {




final Object i2329;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v507).tail).tail).tail)) {


final Object f2327 = Occurrences.LAMBDA.apply(v506, ((Cons)((Cons)v507).tail).head);



final Object i2328;
if ((boolean)(((Number)(f2327)).doubleValue() > ((Number)(0)).doubleValue())) {

i2328 = true;
} else {

i2328 = false;

}
i2329 = i2328;
} else {

i2329 = false;

}
final Object i2330;
if ((boolean)i2329) {

i2330 = true;
} else {

i2330 = false;

}
i2331 = i2330;
} else {

i2331 = false;

}
final Object i2332;
if ((boolean)i2331) {

i2332 = true;
} else {

i2332 = false;

}
i2333 = i2332;
} else {

i2333 = false;

}
final Object i2334;
if ((boolean)i2333) {

i2334 = true;
} else {

i2334 = false;

}
i2335 = i2334;
} else {

i2335 = false;

}
final Object i2336;
if ((boolean)i2335) {

i2336 = true;
} else {

i2336 = false;

}
i2337 = i2336;
} else {

i2337 = false;

}
final Object i2356;
if ((boolean)i2337) {

i2356 = v507;
} else {


final Object i2349;
if ((boolean)(v507 instanceof Cons)) {


final Object i2347;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v507).head)) {



final Object i2345;
if ((boolean)(((Cons)v507).tail instanceof Cons)) {




final Object i2343;
if ((boolean)(((Cons)((Cons)v507).tail).tail instanceof Cons)) {





final Object i2341;
if ((boolean)(((Cons)((Cons)((Cons)v507).tail).tail).tail instanceof Cons)) {





final Object i2339;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v507).tail).tail).tail).tail)) {



final Object i2338;
if ((boolean)Lang.equals(((Cons)((Cons)v507).tail).head, v506)) {

i2338 = true;
} else {

i2338 = false;

}
i2339 = i2338;
} else {

i2339 = false;

}
final Object i2340;
if ((boolean)i2339) {

i2340 = true;
} else {

i2340 = false;

}
i2341 = i2340;
} else {

i2341 = false;

}
final Object i2342;
if ((boolean)i2341) {

i2342 = true;
} else {

i2342 = false;

}
i2343 = i2342;
} else {

i2343 = false;

}
final Object i2344;
if ((boolean)i2343) {

i2344 = true;
} else {

i2344 = false;

}
i2345 = i2344;
} else {

i2345 = false;

}
final Object i2346;
if ((boolean)i2345) {

i2346 = true;
} else {

i2346 = false;

}
i2347 = i2346;
} else {

i2347 = false;

}
final Object i2348;
if ((boolean)i2347) {

i2348 = true;
} else {

i2348 = false;

}
i2349 = i2348;
} else {

i2349 = false;

}
final Object i2355;
if ((boolean)i2349) {









final Object f2350 = ShenEbr.LAMBDA.apply(v505, ((Cons)((Cons)v507).tail).head, ((Cons)((Cons)((Cons)v507).tail).tail).head);








i2355 = new Cons(RuntimeContext.symbol("let"), new Cons(((Cons)((Cons)v507).tail).head, new Cons(f2350, ((Cons)((Cons)((Cons)v507).tail).tail).tail)));
} else {


final Object i2354;
if ((boolean)(v507 instanceof Cons)) {

final Object f2351 = ShenEbr.LAMBDA.apply(v505, v506, ((Cons)v507).head);


final Object f2352 = ShenEbr.LAMBDA.apply(v505, v506, ((Cons)v507).tail);


i2354 = new Cons(f2351, f2352);
} else {

final Object i2353;
if ((boolean)true) {

i2353 = v507;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2354 = i2353;

}
i2355 = i2354;

}
i2356 = i2355;

}
i2357 = i2356;

}
    return i2357;

}
}
