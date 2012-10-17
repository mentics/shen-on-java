package shen.gen;



import com.mentics.shen.*;

public class ShenCaseForm {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-case-form");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v525, final Object v526) throws Exception {
return defined(v525, v526);
}};
public static Object defined(final Object v525, final Object v526) throws Exception {

final Object i2492;
if ((boolean)Lang.equals(Nil.NIL, v525)) {



i2492 = new Cons(v526, Nil.NIL);
} else {


final Object i2461;
if ((boolean)(v525 instanceof Cons)) {



final Object i2459;
if ((boolean)(((Cons)v525).head instanceof Cons)) {




final Object i2457;
if ((boolean)(((Cons)((Cons)v525).head).head instanceof Cons)) {




final Object i2455;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-tests"), ((Cons)((Cons)((Cons)v525).head).head).head)) {




final Object i2453;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v525).head).head).tail)) {




final Object i2451;
if ((boolean)(((Cons)((Cons)v525).head).tail instanceof Cons)) {





final Object i2449;
if ((boolean)(((Cons)((Cons)((Cons)v525).head).tail).head instanceof Cons)) {





final Object i2447;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-choicepoint!"), ((Cons)((Cons)((Cons)((Cons)v525).head).tail).head).head)) {






final Object i2445;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v525).head).tail).head).tail instanceof Cons)) {






final Object i2443;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v525).head).tail).head).tail).tail)) {




final Object i2442;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v525).head).tail).tail)) {

i2442 = true;
} else {

i2442 = false;

}
i2443 = i2442;
} else {

i2443 = false;

}
final Object i2444;
if ((boolean)i2443) {

i2444 = true;
} else {

i2444 = false;

}
i2445 = i2444;
} else {

i2445 = false;

}
final Object i2446;
if ((boolean)i2445) {

i2446 = true;
} else {

i2446 = false;

}
i2447 = i2446;
} else {

i2447 = false;

}
final Object i2448;
if ((boolean)i2447) {

i2448 = true;
} else {

i2448 = false;

}
i2449 = i2448;
} else {

i2449 = false;

}
final Object i2450;
if ((boolean)i2449) {

i2450 = true;
} else {

i2450 = false;

}
i2451 = i2450;
} else {

i2451 = false;

}
final Object i2452;
if ((boolean)i2451) {

i2452 = true;
} else {

i2452 = false;

}
i2453 = i2452;
} else {

i2453 = false;

}
final Object i2454;
if ((boolean)i2453) {

i2454 = true;
} else {

i2454 = false;

}
i2455 = i2454;
} else {

i2455 = false;

}
final Object i2456;
if ((boolean)i2455) {

i2456 = true;
} else {

i2456 = false;

}
i2457 = i2456;
} else {

i2457 = false;

}
final Object i2458;
if ((boolean)i2457) {

i2458 = true;
} else {

i2458 = false;

}
i2459 = i2458;
} else {

i2459 = false;

}
final Object i2460;
if ((boolean)i2459) {

i2460 = true;
} else {

i2460 = false;

}
i2461 = i2460;
} else {

i2461 = false;

}
final Object i2491;
if ((boolean)i2461) {






final Object f2462 = ShenCaseForm.LAMBDA.apply(((Cons)v525).tail, v526);


i2491 = new Cons(new Cons(true, ((Cons)((Cons)v525).head).tail), f2462);
} else {


final Object i2474;
if ((boolean)(v525 instanceof Cons)) {



final Object i2472;
if ((boolean)(((Cons)v525).head instanceof Cons)) {




final Object i2470;
if ((boolean)(((Cons)((Cons)v525).head).head instanceof Cons)) {




final Object i2468;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-tests"), ((Cons)((Cons)((Cons)v525).head).head).head)) {




final Object i2466;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v525).head).head).tail)) {




final Object i2464;
if ((boolean)(((Cons)((Cons)v525).head).tail instanceof Cons)) {




final Object i2463;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v525).head).tail).tail)) {

i2463 = true;
} else {

i2463 = false;

}
i2464 = i2463;
} else {

i2464 = false;

}
final Object i2465;
if ((boolean)i2464) {

i2465 = true;
} else {

i2465 = false;

}
i2466 = i2465;
} else {

i2466 = false;

}
final Object i2467;
if ((boolean)i2466) {

i2467 = true;
} else {

i2467 = false;

}
i2468 = i2467;
} else {

i2468 = false;

}
final Object i2469;
if ((boolean)i2468) {

i2469 = true;
} else {

i2469 = false;

}
i2470 = i2469;
} else {

i2470 = false;

}
final Object i2471;
if ((boolean)i2470) {

i2471 = true;
} else {

i2471 = false;

}
i2472 = i2471;
} else {

i2472 = false;

}
final Object i2473;
if ((boolean)i2472) {

i2473 = true;
} else {

i2473 = false;

}
i2474 = i2473;
} else {

i2474 = false;

}
final Object i2490;
if ((boolean)i2474) {







i2490 = new Cons(new Cons(true, ((Cons)((Cons)v525).head).tail), Nil.NIL);
} else {


final Object i2484;
if ((boolean)(v525 instanceof Cons)) {



final Object i2482;
if ((boolean)(((Cons)v525).head instanceof Cons)) {




final Object i2480;
if ((boolean)(((Cons)((Cons)v525).head).head instanceof Cons)) {




final Object i2478;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-tests"), ((Cons)((Cons)((Cons)v525).head).head).head)) {




final Object i2476;
if ((boolean)(((Cons)((Cons)v525).head).tail instanceof Cons)) {




final Object i2475;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v525).head).tail).tail)) {

i2475 = true;
} else {

i2475 = false;

}
i2476 = i2475;
} else {

i2476 = false;

}
final Object i2477;
if ((boolean)i2476) {

i2477 = true;
} else {

i2477 = false;

}
i2478 = i2477;
} else {

i2478 = false;

}
final Object i2479;
if ((boolean)i2478) {

i2479 = true;
} else {

i2479 = false;

}
i2480 = i2479;
} else {

i2480 = false;

}
final Object i2481;
if ((boolean)i2480) {

i2481 = true;
} else {

i2481 = false;

}
i2482 = i2481;
} else {

i2482 = false;

}
final Object i2483;
if ((boolean)i2482) {

i2483 = true;
} else {

i2483 = false;

}
i2484 = i2483;
} else {

i2484 = false;

}
final Object i2489;
if ((boolean)i2484) {



final Object f2485 = ShenEmbedAnd.LAMBDA.apply(((Cons)((Cons)((Cons)v525).head).head).tail);






final Object f2486 = ShenCaseForm.LAMBDA.apply(((Cons)v525).tail, v526);


i2489 = new Cons(new Cons(f2485, ((Cons)((Cons)v525).head).tail), f2486);
} else {

final Object i2488;
if ((boolean)true) {
final Object f2487 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-case-form"));

i2488 = f2487;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2489 = i2488;

}
i2490 = i2489;

}
i2491 = i2490;

}
i2492 = i2491;

}
    return i2492;

}
}
