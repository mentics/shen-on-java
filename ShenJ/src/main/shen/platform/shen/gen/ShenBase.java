package shen.gen;



import com.mentics.shen.*;

public class ShenBase {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-base");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v819, final Object v820, final Object v821, final Object v822) throws Exception {
return defined(v819, v820, v821, v822);
}};
public static Object defined(final Object v819, final Object v820, final Object v821, final Object v822) throws Exception {
final Object f2380 = ShenLazyderef.LAMBDA.apply(v820, v821);

final Object v5362379 = f2380;

final Object i2396;
if ((boolean)Lang.equals(RuntimeContext.symbol("number"), v5362379)) {
final Object f2381 = ShenIncinfs.LAMBDA.apply();
final Object f2382 = ShenLazyderef.LAMBDA.apply(v819, v821);

final Object f2383 = Fwhen.LAMBDA.apply((f2382 instanceof Number), v821, v822);
final Object f2384 = Do.LAMBDA.apply(f2381, f2383);

i2396 = f2384;
} else {
final Object f2385 = ShenPvarQ.LAMBDA.apply(v5362379);

final Object i2395;
if ((boolean)f2385) {
final Object f2386 = ShenBindv.LAMBDA.apply(v5362379, RuntimeContext.symbol("number"), v821);
final Object f2388 = ShenIncinfs.LAMBDA.apply();
final Object f2389 = ShenLazyderef.LAMBDA.apply(v819, v821);

final Object f2390 = Fwhen.LAMBDA.apply((f2389 instanceof Number), v821, v822);
final Object f2391 = Do.LAMBDA.apply(f2388, f2390);

final Object result2387 = f2391;
final Object f2392 = ShenUnbindv.LAMBDA.apply(v5362379, v821);
final Object f2393 = Do.LAMBDA.apply(f2392, result2387);

final Object f2394 = Do.LAMBDA.apply(f2386, f2393);

i2395 = f2394;
} else {

i2395 = false;

}
i2396 = i2395;

}

final Object case2378 = i2396;

final Object i2561;
if ((boolean)Lang.equals(case2378, false)) {
final Object f2399 = ShenLazyderef.LAMBDA.apply(v820, v821);

final Object v5372398 = f2399;

final Object i2417;
if ((boolean)Lang.equals(RuntimeContext.symbol("boolean"), v5372398)) {
final Object f2400 = ShenIncinfs.LAMBDA.apply();
final Object f2401 = ShenLazyderef.LAMBDA.apply(v819, v821);
final Object f2402 = BooleanQ.LAMBDA.apply(f2401);
final Object f2403 = Fwhen.LAMBDA.apply(f2402, v821, v822);
final Object f2404 = Do.LAMBDA.apply(f2400, f2403);

i2417 = f2404;
} else {
final Object f2405 = ShenPvarQ.LAMBDA.apply(v5372398);

final Object i2416;
if ((boolean)f2405) {
final Object f2406 = ShenBindv.LAMBDA.apply(v5372398, RuntimeContext.symbol("boolean"), v821);
final Object f2408 = ShenIncinfs.LAMBDA.apply();
final Object f2409 = ShenLazyderef.LAMBDA.apply(v819, v821);
final Object f2410 = BooleanQ.LAMBDA.apply(f2409);
final Object f2411 = Fwhen.LAMBDA.apply(f2410, v821, v822);
final Object f2412 = Do.LAMBDA.apply(f2408, f2411);

final Object result2407 = f2412;
final Object f2413 = ShenUnbindv.LAMBDA.apply(v5372398, v821);
final Object f2414 = Do.LAMBDA.apply(f2413, result2407);

final Object f2415 = Do.LAMBDA.apply(f2406, f2414);

i2416 = f2415;
} else {

i2416 = false;

}
i2417 = i2416;

}

final Object case2397 = i2417;

final Object i2560;
if ((boolean)Lang.equals(case2397, false)) {
final Object f2420 = ShenLazyderef.LAMBDA.apply(v820, v821);

final Object v5382419 = f2420;

final Object i2436;
if ((boolean)Lang.equals(RuntimeContext.symbol("string"), v5382419)) {
final Object f2421 = ShenIncinfs.LAMBDA.apply();
final Object f2422 = ShenLazyderef.LAMBDA.apply(v819, v821);

final Object f2423 = Fwhen.LAMBDA.apply((f2422 instanceof String), v821, v822);
final Object f2424 = Do.LAMBDA.apply(f2421, f2423);

i2436 = f2424;
} else {
final Object f2425 = ShenPvarQ.LAMBDA.apply(v5382419);

final Object i2435;
if ((boolean)f2425) {
final Object f2426 = ShenBindv.LAMBDA.apply(v5382419, RuntimeContext.symbol("string"), v821);
final Object f2428 = ShenIncinfs.LAMBDA.apply();
final Object f2429 = ShenLazyderef.LAMBDA.apply(v819, v821);

final Object f2430 = Fwhen.LAMBDA.apply((f2429 instanceof String), v821, v822);
final Object f2431 = Do.LAMBDA.apply(f2428, f2430);

final Object result2427 = f2431;
final Object f2432 = ShenUnbindv.LAMBDA.apply(v5382419, v821);
final Object f2433 = Do.LAMBDA.apply(f2432, result2427);

final Object f2434 = Do.LAMBDA.apply(f2426, f2433);

i2435 = f2434;
} else {

i2435 = false;

}
i2436 = i2435;

}

final Object case2418 = i2436;

final Object i2559;
if ((boolean)Lang.equals(case2418, false)) {
final Object f2439 = ShenLazyderef.LAMBDA.apply(v820, v821);

final Object v5392438 = f2439;

final Object i2465;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), v5392438)) {
final Object f2440 = ShenIncinfs.LAMBDA.apply();
final Object f2441 = ShenLazyderef.LAMBDA.apply(v819, v821);
final Object f2442 = SymbolQ.LAMBDA.apply(f2441);
final Lambda l2446 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2443 = ShenLazyderef.LAMBDA.apply(v819, v821);
final Object f2444 = ShenPlaceholderQ.LAMBDA.apply(f2443);

final Object f2445 = Fwhen.LAMBDA.apply(!((boolean)f2444), v821, v822);

    return f2445;
  }
};final Object f2447 = Fwhen.LAMBDA.apply(f2442, v821, l2446);
final Object f2448 = Do.LAMBDA.apply(f2440, f2447);

i2465 = f2448;
} else {
final Object f2449 = ShenPvarQ.LAMBDA.apply(v5392438);

final Object i2464;
if ((boolean)f2449) {
final Object f2450 = ShenBindv.LAMBDA.apply(v5392438, RuntimeContext.symbol("symbol"), v821);
final Object f2452 = ShenIncinfs.LAMBDA.apply();
final Object f2453 = ShenLazyderef.LAMBDA.apply(v819, v821);
final Object f2454 = SymbolQ.LAMBDA.apply(f2453);
final Lambda l2458 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f2455 = ShenLazyderef.LAMBDA.apply(v819, v821);
final Object f2456 = ShenPlaceholderQ.LAMBDA.apply(f2455);

final Object f2457 = Fwhen.LAMBDA.apply(!((boolean)f2456), v821, v822);

    return f2457;
  }
};final Object f2459 = Fwhen.LAMBDA.apply(f2454, v821, l2458);
final Object f2460 = Do.LAMBDA.apply(f2452, f2459);

final Object result2451 = f2460;
final Object f2461 = ShenUnbindv.LAMBDA.apply(v5392438, v821);
final Object f2462 = Do.LAMBDA.apply(f2461, result2451);

final Object f2463 = Do.LAMBDA.apply(f2450, f2462);

i2464 = f2463;
} else {

i2464 = false;

}
i2465 = i2464;

}

final Object case2437 = i2465;

final Object i2558;
if ((boolean)Lang.equals(case2437, false)) {
final Object f2467 = ShenLazyderef.LAMBDA.apply(v819, v821);

final Object v5402466 = f2467;

final Object i2557;
if ((boolean)Lang.equals(Nil.NIL, v5402466)) {
final Object f2469 = ShenLazyderef.LAMBDA.apply(v820, v821);

final Object v5412468 = f2469;


final Object i2556;
if ((boolean)(v5412468 instanceof Cons)) {

final Object f2471 = ShenLazyderef.LAMBDA.apply(((Cons)v5412468).head, v821);

final Object v5422470 = f2471;

final Object i2543;
if ((boolean)Lang.equals(RuntimeContext.symbol("list"), v5422470)) {

final Object f2473 = ShenLazyderef.LAMBDA.apply(((Cons)v5412468).tail, v821);

final Object v5432472 = f2473;


final Object i2503;
if ((boolean)(v5432472 instanceof Cons)) {


final Object a2474 = ((Cons)v5432472).head;

final Object f2476 = ShenLazyderef.LAMBDA.apply(((Cons)v5432472).tail, v821);

final Object v5442475 = f2476;

final Object i2490;
if ((boolean)Lang.equals(Nil.NIL, v5442475)) {
final Object f2477 = ShenIncinfs.LAMBDA.apply();
final Object f2478 = Thaw.LAMBDA.apply(v822);
final Object f2479 = Do.LAMBDA.apply(f2477, f2478);

i2490 = f2479;
} else {
final Object f2480 = ShenPvarQ.LAMBDA.apply(v5442475);

final Object i2489;
if ((boolean)f2480) {
final Object f2481 = ShenBindv.LAMBDA.apply(v5442475, Nil.NIL, v821);
final Object f2483 = ShenIncinfs.LAMBDA.apply();
final Object f2484 = Thaw.LAMBDA.apply(v822);
final Object f2485 = Do.LAMBDA.apply(f2483, f2484);

final Object result2482 = f2485;
final Object f2486 = ShenUnbindv.LAMBDA.apply(v5442475, v821);
final Object f2487 = Do.LAMBDA.apply(f2486, result2482);

final Object f2488 = Do.LAMBDA.apply(f2481, f2487);

i2489 = f2488;
} else {

i2489 = false;

}
i2490 = i2489;

}


i2503 = i2490;
} else {
final Object f2491 = ShenPvarQ.LAMBDA.apply(v5432472);

final Object i2502;
if ((boolean)f2491) {
final Object f2493 = ShenNewpv.LAMBDA.apply(v821);

final Object a2492 = f2493;


final Object f2494 = ShenBindv.LAMBDA.apply(v5432472, new Cons(a2492, Nil.NIL), v821);
final Object f2496 = ShenIncinfs.LAMBDA.apply();
final Object f2497 = Thaw.LAMBDA.apply(v822);
final Object f2498 = Do.LAMBDA.apply(f2496, f2497);

final Object result2495 = f2498;
final Object f2499 = ShenUnbindv.LAMBDA.apply(v5432472, v821);
final Object f2500 = Do.LAMBDA.apply(f2499, result2495);

final Object f2501 = Do.LAMBDA.apply(f2494, f2500);


i2502 = f2501;
} else {

i2502 = false;

}
i2503 = i2502;

}

i2543 = i2503;
} else {
final Object f2504 = ShenPvarQ.LAMBDA.apply(v5422470);

final Object i2542;
if ((boolean)f2504) {
final Object f2505 = ShenBindv.LAMBDA.apply(v5422470, RuntimeContext.symbol("list"), v821);

final Object f2508 = ShenLazyderef.LAMBDA.apply(((Cons)v5412468).tail, v821);

final Object v5452507 = f2508;


final Object i2538;
if ((boolean)(v5452507 instanceof Cons)) {


final Object a2509 = ((Cons)v5452507).head;

final Object f2511 = ShenLazyderef.LAMBDA.apply(((Cons)v5452507).tail, v821);

final Object v5462510 = f2511;

final Object i2525;
if ((boolean)Lang.equals(Nil.NIL, v5462510)) {
final Object f2512 = ShenIncinfs.LAMBDA.apply();
final Object f2513 = Thaw.LAMBDA.apply(v822);
final Object f2514 = Do.LAMBDA.apply(f2512, f2513);

i2525 = f2514;
} else {
final Object f2515 = ShenPvarQ.LAMBDA.apply(v5462510);

final Object i2524;
if ((boolean)f2515) {
final Object f2516 = ShenBindv.LAMBDA.apply(v5462510, Nil.NIL, v821);
final Object f2518 = ShenIncinfs.LAMBDA.apply();
final Object f2519 = Thaw.LAMBDA.apply(v822);
final Object f2520 = Do.LAMBDA.apply(f2518, f2519);

final Object result2517 = f2520;
final Object f2521 = ShenUnbindv.LAMBDA.apply(v5462510, v821);
final Object f2522 = Do.LAMBDA.apply(f2521, result2517);

final Object f2523 = Do.LAMBDA.apply(f2516, f2522);

i2524 = f2523;
} else {

i2524 = false;

}
i2525 = i2524;

}


i2538 = i2525;
} else {
final Object f2526 = ShenPvarQ.LAMBDA.apply(v5452507);

final Object i2537;
if ((boolean)f2526) {
final Object f2528 = ShenNewpv.LAMBDA.apply(v821);

final Object a2527 = f2528;


final Object f2529 = ShenBindv.LAMBDA.apply(v5452507, new Cons(a2527, Nil.NIL), v821);
final Object f2531 = ShenIncinfs.LAMBDA.apply();
final Object f2532 = Thaw.LAMBDA.apply(v822);
final Object f2533 = Do.LAMBDA.apply(f2531, f2532);

final Object result2530 = f2533;
final Object f2534 = ShenUnbindv.LAMBDA.apply(v5452507, v821);
final Object f2535 = Do.LAMBDA.apply(f2534, result2530);

final Object f2536 = Do.LAMBDA.apply(f2529, f2535);


i2537 = f2536;
} else {

i2537 = false;

}
i2538 = i2537;

}

final Object result2506 = i2538;
final Object f2539 = ShenUnbindv.LAMBDA.apply(v5422470, v821);
final Object f2540 = Do.LAMBDA.apply(f2539, result2506);

final Object f2541 = Do.LAMBDA.apply(f2505, f2540);

i2542 = f2541;
} else {

i2542 = false;

}
i2543 = i2542;

}

i2556 = i2543;
} else {
final Object f2544 = ShenPvarQ.LAMBDA.apply(v5412468);

final Object i2555;
if ((boolean)f2544) {
final Object f2546 = ShenNewpv.LAMBDA.apply(v821);

final Object a2545 = f2546;




final Object f2547 = ShenBindv.LAMBDA.apply(v5412468, new Cons(RuntimeContext.symbol("list"), new Cons(a2545, Nil.NIL)), v821);
final Object f2549 = ShenIncinfs.LAMBDA.apply();
final Object f2550 = Thaw.LAMBDA.apply(v822);
final Object f2551 = Do.LAMBDA.apply(f2549, f2550);

final Object result2548 = f2551;
final Object f2552 = ShenUnbindv.LAMBDA.apply(v5412468, v821);
final Object f2553 = Do.LAMBDA.apply(f2552, result2548);

final Object f2554 = Do.LAMBDA.apply(f2547, f2553);


i2555 = f2554;
} else {

i2555 = false;

}
i2556 = i2555;

}

i2557 = i2556;
} else {

i2557 = false;

}

i2558 = i2557;
} else {

i2558 = case2437;

}

i2559 = i2558;
} else {

i2559 = case2418;

}

i2560 = i2559;
} else {

i2560 = case2397;

}

i2561 = i2560;
} else {

i2561 = case2378;

}

    return i2561;

}
}
