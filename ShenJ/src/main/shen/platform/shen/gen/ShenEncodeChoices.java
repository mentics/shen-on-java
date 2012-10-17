package shen.gen;



import com.mentics.shen.*;

public class ShenEncodeChoices {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-encode-choices");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v519, final Object v520) throws Exception {
return defined(v519, v520);
}};
public static Object defined(final Object v519, final Object v520) throws Exception {

final Object i2441;
if ((boolean)Lang.equals(Nil.NIL, v519)) {

i2441 = Nil.NIL;
} else {


final Object i2392;
if ((boolean)(v519 instanceof Cons)) {



final Object i2390;
if ((boolean)(((Cons)v519).head instanceof Cons)) {



final Object i2388;
if ((boolean)Lang.equals(true, ((Cons)((Cons)v519).head).head)) {




final Object i2386;
if ((boolean)(((Cons)((Cons)v519).head).tail instanceof Cons)) {





final Object i2384;
if ((boolean)(((Cons)((Cons)((Cons)v519).head).tail).head instanceof Cons)) {





final Object i2382;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-choicepoint!"), ((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).head)) {






final Object i2380;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail instanceof Cons)) {






final Object i2378;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail).tail)) {




final Object i2376;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v519).head).tail).tail)) {


final Object i2375;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v519).tail)) {

i2375 = true;
} else {

i2375 = false;

}
i2376 = i2375;
} else {

i2376 = false;

}
final Object i2377;
if ((boolean)i2376) {

i2377 = true;
} else {

i2377 = false;

}
i2378 = i2377;
} else {

i2378 = false;

}
final Object i2379;
if ((boolean)i2378) {

i2379 = true;
} else {

i2379 = false;

}
i2380 = i2379;
} else {

i2380 = false;

}
final Object i2381;
if ((boolean)i2380) {

i2381 = true;
} else {

i2381 = false;

}
i2382 = i2381;
} else {

i2382 = false;

}
final Object i2383;
if ((boolean)i2382) {

i2383 = true;
} else {

i2383 = false;

}
i2384 = i2383;
} else {

i2384 = false;

}
final Object i2385;
if ((boolean)i2384) {

i2385 = true;
} else {

i2385 = false;

}
i2386 = i2385;
} else {

i2386 = false;

}
final Object i2387;
if ((boolean)i2386) {

i2387 = true;
} else {

i2387 = false;

}
i2388 = i2387;
} else {

i2388 = false;

}
final Object i2389;
if ((boolean)i2388) {

i2389 = true;
} else {

i2389 = false;

}
i2390 = i2389;
} else {

i2390 = false;

}
final Object i2391;
if ((boolean)i2390) {

i2391 = true;
} else {

i2391 = false;

}
i2392 = i2391;
} else {

i2392 = false;

}
final Object i2440;
if ((boolean)i2392) {





















final Object i2393;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*installing-kl*"))) {





i2393 = new Cons(RuntimeContext.symbol("shen-sys-error"), new Cons(v520, Nil.NIL));
} else {





i2393 = new Cons(RuntimeContext.symbol("shen-f_error"), new Cons(v520, Nil.NIL));

}
















i2440 = new Cons(new Cons(true, new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Result"), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(RuntimeContext.symbol("Result"), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL))), new Cons(i2393, new Cons(RuntimeContext.symbol("Result"), Nil.NIL)))), Nil.NIL)))), Nil.NIL)), Nil.NIL);
} else {


final Object i2409;
if ((boolean)(v519 instanceof Cons)) {



final Object i2407;
if ((boolean)(((Cons)v519).head instanceof Cons)) {



final Object i2405;
if ((boolean)Lang.equals(true, ((Cons)((Cons)v519).head).head)) {




final Object i2403;
if ((boolean)(((Cons)((Cons)v519).head).tail instanceof Cons)) {





final Object i2401;
if ((boolean)(((Cons)((Cons)((Cons)v519).head).tail).head instanceof Cons)) {





final Object i2399;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-choicepoint!"), ((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).head)) {






final Object i2397;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail instanceof Cons)) {






final Object i2395;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail).tail)) {




final Object i2394;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v519).head).tail).tail)) {

i2394 = true;
} else {

i2394 = false;

}
i2395 = i2394;
} else {

i2395 = false;

}
final Object i2396;
if ((boolean)i2395) {

i2396 = true;
} else {

i2396 = false;

}
i2397 = i2396;
} else {

i2397 = false;

}
final Object i2398;
if ((boolean)i2397) {

i2398 = true;
} else {

i2398 = false;

}
i2399 = i2398;
} else {

i2399 = false;

}
final Object i2400;
if ((boolean)i2399) {

i2400 = true;
} else {

i2400 = false;

}
i2401 = i2400;
} else {

i2401 = false;

}
final Object i2402;
if ((boolean)i2401) {

i2402 = true;
} else {

i2402 = false;

}
i2403 = i2402;
} else {

i2403 = false;

}
final Object i2404;
if ((boolean)i2403) {

i2404 = true;
} else {

i2404 = false;

}
i2405 = i2404;
} else {

i2405 = false;

}
final Object i2406;
if ((boolean)i2405) {

i2406 = true;
} else {

i2406 = false;

}
i2407 = i2406;
} else {

i2407 = false;

}
final Object i2408;
if ((boolean)i2407) {

i2408 = true;
} else {

i2408 = false;

}
i2409 = i2408;
} else {

i2409 = false;

}
final Object i2439;
if ((boolean)i2409) {




















final Object f2410 = ShenEncodeChoices.LAMBDA.apply(((Cons)v519).tail, v520);
final Object f2411 = ShenCondForm.LAMBDA.apply(f2410);

















i2439 = new Cons(new Cons(true, new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Result"), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(RuntimeContext.symbol("Result"), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL))), new Cons(f2411, new Cons(RuntimeContext.symbol("Result"), Nil.NIL)))), Nil.NIL)))), Nil.NIL)), Nil.NIL);
} else {


final Object i2425;
if ((boolean)(v519 instanceof Cons)) {



final Object i2423;
if ((boolean)(((Cons)v519).head instanceof Cons)) {




final Object i2421;
if ((boolean)(((Cons)((Cons)v519).head).tail instanceof Cons)) {





final Object i2419;
if ((boolean)(((Cons)((Cons)((Cons)v519).head).tail).head instanceof Cons)) {





final Object i2417;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-choicepoint!"), ((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).head)) {






final Object i2415;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail instanceof Cons)) {






final Object i2413;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail).tail)) {




final Object i2412;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v519).head).tail).tail)) {

i2412 = true;
} else {

i2412 = false;

}
i2413 = i2412;
} else {

i2413 = false;

}
final Object i2414;
if ((boolean)i2413) {

i2414 = true;
} else {

i2414 = false;

}
i2415 = i2414;
} else {

i2415 = false;

}
final Object i2416;
if ((boolean)i2415) {

i2416 = true;
} else {

i2416 = false;

}
i2417 = i2416;
} else {

i2417 = false;

}
final Object i2418;
if ((boolean)i2417) {

i2418 = true;
} else {

i2418 = false;

}
i2419 = i2418;
} else {

i2419 = false;

}
final Object i2420;
if ((boolean)i2419) {

i2420 = true;
} else {

i2420 = false;

}
i2421 = i2420;
} else {

i2421 = false;

}
final Object i2422;
if ((boolean)i2421) {

i2422 = true;
} else {

i2422 = false;

}
i2423 = i2422;
} else {

i2423 = false;

}
final Object i2424;
if ((boolean)i2423) {

i2424 = true;
} else {

i2424 = false;

}
i2425 = i2424;
} else {

i2425 = false;

}
final Object i2438;
if ((boolean)i2425) {





final Object f2426 = ShenEncodeChoices.LAMBDA.apply(((Cons)v519).tail, v520);
final Object f2427 = ShenCondForm.LAMBDA.apply(f2426);






























































i2438 = new Cons(new Cons(true, new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Freeze"), new Cons(new Cons(RuntimeContext.symbol("freeze"), new Cons(f2427, Nil.NIL)), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v519).head).head, new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Result"), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v519).head).tail).head).tail).head, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(RuntimeContext.symbol("Result"), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("thaw"), new Cons(RuntimeContext.symbol("Freeze"), Nil.NIL)), new Cons(RuntimeContext.symbol("Result"), Nil.NIL)))), Nil.NIL)))), new Cons(new Cons(RuntimeContext.symbol("thaw"), new Cons(RuntimeContext.symbol("Freeze"), Nil.NIL)), Nil.NIL)))), Nil.NIL)))), Nil.NIL)), Nil.NIL);
} else {


final Object i2433;
if ((boolean)(v519 instanceof Cons)) {



final Object i2431;
if ((boolean)(((Cons)v519).head instanceof Cons)) {




final Object i2429;
if ((boolean)(((Cons)((Cons)v519).head).tail instanceof Cons)) {




final Object i2428;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v519).head).tail).tail)) {

i2428 = true;
} else {

i2428 = false;

}
i2429 = i2428;
} else {

i2429 = false;

}
final Object i2430;
if ((boolean)i2429) {

i2430 = true;
} else {

i2430 = false;

}
i2431 = i2430;
} else {

i2431 = false;

}
final Object i2432;
if ((boolean)i2431) {

i2432 = true;
} else {

i2432 = false;

}
i2433 = i2432;
} else {

i2433 = false;

}
final Object i2437;
if ((boolean)i2433) {



final Object f2434 = ShenEncodeChoices.LAMBDA.apply(((Cons)v519).tail, v520);


i2437 = new Cons(((Cons)v519).head, f2434);
} else {

final Object i2436;
if ((boolean)true) {
final Object f2435 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-encode-choices"));

i2436 = f2435;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2437 = i2436;

}
i2438 = i2437;

}
i2439 = i2438;

}
i2440 = i2439;

}
i2441 = i2440;

}
    return i2441;

}
}
