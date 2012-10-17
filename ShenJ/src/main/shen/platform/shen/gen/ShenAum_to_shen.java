package shen.gen;



import com.mentics.shen.*;

public class ShenAum_to_shen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-aum_to_shen");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1331) throws Exception {
return defined(v1331);
}};
public static Object defined(final Object v1331) throws Exception {


final Object i3453;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3451;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v1331).head)) {



final Object i3449;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {




final Object i3447;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3445;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-be"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3443;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {






final Object i3441;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3439;
if ((boolean)Lang.equals(RuntimeContext.symbol("in"), ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head)) {







final Object i3437;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail instanceof Cons)) {







final Object i3436;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail)) {

i3436 = true;
} else {

i3436 = false;

}
i3437 = i3436;
} else {

i3437 = false;

}
final Object i3438;
if ((boolean)i3437) {

i3438 = true;
} else {

i3438 = false;

}
i3439 = i3438;
} else {

i3439 = false;

}
final Object i3440;
if ((boolean)i3439) {

i3440 = true;
} else {

i3440 = false;

}
i3441 = i3440;
} else {

i3441 = false;

}
final Object i3442;
if ((boolean)i3441) {

i3442 = true;
} else {

i3442 = false;

}
i3443 = i3442;
} else {

i3443 = false;

}
final Object i3444;
if ((boolean)i3443) {

i3444 = true;
} else {

i3444 = false;

}
i3445 = i3444;
} else {

i3445 = false;

}
final Object i3446;
if ((boolean)i3445) {

i3446 = true;
} else {

i3446 = false;

}
i3447 = i3446;
} else {

i3447 = false;

}
final Object i3448;
if ((boolean)i3447) {

i3448 = true;
} else {

i3448 = false;

}
i3449 = i3448;
} else {

i3449 = false;

}
final Object i3450;
if ((boolean)i3449) {

i3450 = true;
} else {

i3450 = false;

}
i3451 = i3450;
} else {

i3451 = false;

}
final Object i3452;
if ((boolean)i3451) {

i3452 = true;
} else {

i3452 = false;

}
i3453 = i3452;
} else {

i3453 = false;

}
final Object i3696;
if ((boolean)i3453) {








final Object f3454 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head);







final Object f3455 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).head);






i3696 = new Cons(RuntimeContext.symbol("let"), new Cons(((Cons)((Cons)v1331).tail).head, new Cons(f3454, new Cons(f3455, Nil.NIL))));
} else {


final Object i3473;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3471;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)v1331).head)) {



final Object i3469;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3467;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-result"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3465;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3463;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-of"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3461;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3459;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-dereferencing"), ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head)) {






final Object i3457;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3456;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail)) {

i3456 = true;
} else {

i3456 = false;

}
i3457 = i3456;
} else {

i3457 = false;

}
final Object i3458;
if ((boolean)i3457) {

i3458 = true;
} else {

i3458 = false;

}
i3459 = i3458;
} else {

i3459 = false;

}
final Object i3460;
if ((boolean)i3459) {

i3460 = true;
} else {

i3460 = false;

}
i3461 = i3460;
} else {

i3461 = false;

}
final Object i3462;
if ((boolean)i3461) {

i3462 = true;
} else {

i3462 = false;

}
i3463 = i3462;
} else {

i3463 = false;

}
final Object i3464;
if ((boolean)i3463) {

i3464 = true;
} else {

i3464 = false;

}
i3465 = i3464;
} else {

i3465 = false;

}
final Object i3466;
if ((boolean)i3465) {

i3466 = true;
} else {

i3466 = false;

}
i3467 = i3466;
} else {

i3467 = false;

}
final Object i3468;
if ((boolean)i3467) {

i3468 = true;
} else {

i3468 = false;

}
i3469 = i3468;
} else {

i3469 = false;

}
final Object i3470;
if ((boolean)i3469) {

i3470 = true;
} else {

i3470 = false;

}
i3471 = i3470;
} else {

i3471 = false;

}
final Object i3472;
if ((boolean)i3471) {

i3472 = true;
} else {

i3472 = false;

}
i3473 = i3472;
} else {

i3473 = false;

}
final Object i3695;
if ((boolean)i3473) {






final Object f3474 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head);






i3695 = new Cons(RuntimeContext.symbol("shen-lazyderef"), new Cons(f3474, new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL)));
} else {


final Object i3492;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3490;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)v1331).head)) {



final Object i3488;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {




final Object i3486;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3484;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-then"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3482;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {






final Object i3480;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3478;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-else"), ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head)) {







final Object i3476;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail instanceof Cons)) {







final Object i3475;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail)) {

i3475 = true;
} else {

i3475 = false;

}
i3476 = i3475;
} else {

i3476 = false;

}
final Object i3477;
if ((boolean)i3476) {

i3477 = true;
} else {

i3477 = false;

}
i3478 = i3477;
} else {

i3478 = false;

}
final Object i3479;
if ((boolean)i3478) {

i3479 = true;
} else {

i3479 = false;

}
i3480 = i3479;
} else {

i3480 = false;

}
final Object i3481;
if ((boolean)i3480) {

i3481 = true;
} else {

i3481 = false;

}
i3482 = i3481;
} else {

i3482 = false;

}
final Object i3483;
if ((boolean)i3482) {

i3483 = true;
} else {

i3483 = false;

}
i3484 = i3483;
} else {

i3484 = false;

}
final Object i3485;
if ((boolean)i3484) {

i3485 = true;
} else {

i3485 = false;

}
i3486 = i3485;
} else {

i3486 = false;

}
final Object i3487;
if ((boolean)i3486) {

i3487 = true;
} else {

i3487 = false;

}
i3488 = i3487;
} else {

i3488 = false;

}
final Object i3489;
if ((boolean)i3488) {

i3489 = true;
} else {

i3489 = false;

}
i3490 = i3489;
} else {

i3490 = false;

}
final Object i3491;
if ((boolean)i3490) {

i3491 = true;
} else {

i3491 = false;

}
i3492 = i3491;
} else {

i3492 = false;

}
final Object i3694;
if ((boolean)i3492) {



final Object f3493 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)v1331).tail).head);





final Object f3494 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head);







final Object f3495 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).head);






i3694 = new Cons(RuntimeContext.symbol("if"), new Cons(f3493, new Cons(f3494, new Cons(f3495, Nil.NIL))));
} else {


final Object i3509;
if ((boolean)(v1331 instanceof Cons)) {



final Object i3507;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3505;
if ((boolean)Lang.equals(RuntimeContext.symbol("is"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3503;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3501;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-a"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3499;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3497;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-variable"), ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head)) {





final Object i3496;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail)) {

i3496 = true;
} else {

i3496 = false;

}
i3497 = i3496;
} else {

i3497 = false;

}
final Object i3498;
if ((boolean)i3497) {

i3498 = true;
} else {

i3498 = false;

}
i3499 = i3498;
} else {

i3499 = false;

}
final Object i3500;
if ((boolean)i3499) {

i3500 = true;
} else {

i3500 = false;

}
i3501 = i3500;
} else {

i3501 = false;

}
final Object i3502;
if ((boolean)i3501) {

i3502 = true;
} else {

i3502 = false;

}
i3503 = i3502;
} else {

i3503 = false;

}
final Object i3504;
if ((boolean)i3503) {

i3504 = true;
} else {

i3504 = false;

}
i3505 = i3504;
} else {

i3505 = false;

}
final Object i3506;
if ((boolean)i3505) {

i3506 = true;
} else {

i3506 = false;

}
i3507 = i3506;
} else {

i3507 = false;

}
final Object i3508;
if ((boolean)i3507) {

i3508 = true;
} else {

i3508 = false;

}
i3509 = i3508;
} else {

i3509 = false;

}
final Object i3693;
if ((boolean)i3509) {






i3693 = new Cons(RuntimeContext.symbol("shen-pvar?"), new Cons(((Cons)v1331).head, Nil.NIL));
} else {


final Object i3527;
if ((boolean)(v1331 instanceof Cons)) {



final Object i3525;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3523;
if ((boolean)Lang.equals(RuntimeContext.symbol("is"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3521;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3519;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-a"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3517;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3515;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-non-empty"), ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head)) {






final Object i3513;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3511;
if ((boolean)Lang.equals(RuntimeContext.symbol("list"), ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head)) {






final Object i3510;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail)) {

i3510 = true;
} else {

i3510 = false;

}
i3511 = i3510;
} else {

i3511 = false;

}
final Object i3512;
if ((boolean)i3511) {

i3512 = true;
} else {

i3512 = false;

}
i3513 = i3512;
} else {

i3513 = false;

}
final Object i3514;
if ((boolean)i3513) {

i3514 = true;
} else {

i3514 = false;

}
i3515 = i3514;
} else {

i3515 = false;

}
final Object i3516;
if ((boolean)i3515) {

i3516 = true;
} else {

i3516 = false;

}
i3517 = i3516;
} else {

i3517 = false;

}
final Object i3518;
if ((boolean)i3517) {

i3518 = true;
} else {

i3518 = false;

}
i3519 = i3518;
} else {

i3519 = false;

}
final Object i3520;
if ((boolean)i3519) {

i3520 = true;
} else {

i3520 = false;

}
i3521 = i3520;
} else {

i3521 = false;

}
final Object i3522;
if ((boolean)i3521) {

i3522 = true;
} else {

i3522 = false;

}
i3523 = i3522;
} else {

i3523 = false;

}
final Object i3524;
if ((boolean)i3523) {

i3524 = true;
} else {

i3524 = false;

}
i3525 = i3524;
} else {

i3525 = false;

}
final Object i3526;
if ((boolean)i3525) {

i3526 = true;
} else {

i3526 = false;

}
i3527 = i3526;
} else {

i3527 = false;

}
final Object i3692;
if ((boolean)i3527) {






i3692 = new Cons(RuntimeContext.symbol("cons?"), new Cons(((Cons)v1331).head, Nil.NIL));
} else {


final Object i3557;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3555;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-rename"), ((Cons)v1331).head)) {



final Object i3553;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3551;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3549;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3547;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-variables"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3545;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3543;
if ((boolean)Lang.equals(RuntimeContext.symbol("in"), ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head)) {






final Object i3541;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3539;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head)) {







final Object i3537;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail instanceof Cons)) {







final Object i3535;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).head)) {








final Object i3533;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail instanceof Cons)) {








final Object i3531;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-then"), ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).head)) {









final Object i3529;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).tail instanceof Cons)) {









final Object i3528;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).tail).tail)) {

i3528 = true;
} else {

i3528 = false;

}
i3529 = i3528;
} else {

i3529 = false;

}
final Object i3530;
if ((boolean)i3529) {

i3530 = true;
} else {

i3530 = false;

}
i3531 = i3530;
} else {

i3531 = false;

}
final Object i3532;
if ((boolean)i3531) {

i3532 = true;
} else {

i3532 = false;

}
i3533 = i3532;
} else {

i3533 = false;

}
final Object i3534;
if ((boolean)i3533) {

i3534 = true;
} else {

i3534 = false;

}
i3535 = i3534;
} else {

i3535 = false;

}
final Object i3536;
if ((boolean)i3535) {

i3536 = true;
} else {

i3536 = false;

}
i3537 = i3536;
} else {

i3537 = false;

}
final Object i3538;
if ((boolean)i3537) {

i3538 = true;
} else {

i3538 = false;

}
i3539 = i3538;
} else {

i3539 = false;

}
final Object i3540;
if ((boolean)i3539) {

i3540 = true;
} else {

i3540 = false;

}
i3541 = i3540;
} else {

i3541 = false;

}
final Object i3542;
if ((boolean)i3541) {

i3542 = true;
} else {

i3542 = false;

}
i3543 = i3542;
} else {

i3543 = false;

}
final Object i3544;
if ((boolean)i3543) {

i3544 = true;
} else {

i3544 = false;

}
i3545 = i3544;
} else {

i3545 = false;

}
final Object i3546;
if ((boolean)i3545) {

i3546 = true;
} else {

i3546 = false;

}
i3547 = i3546;
} else {

i3547 = false;

}
final Object i3548;
if ((boolean)i3547) {

i3548 = true;
} else {

i3548 = false;

}
i3549 = i3548;
} else {

i3549 = false;

}
final Object i3550;
if ((boolean)i3549) {

i3550 = true;
} else {

i3550 = false;

}
i3551 = i3550;
} else {

i3551 = false;

}
final Object i3552;
if ((boolean)i3551) {

i3552 = true;
} else {

i3552 = false;

}
i3553 = i3552;
} else {

i3553 = false;

}
final Object i3554;
if ((boolean)i3553) {

i3554 = true;
} else {

i3554 = false;

}
i3555 = i3554;
} else {

i3555 = false;

}
final Object i3556;
if ((boolean)i3555) {

i3556 = true;
} else {

i3556 = false;

}
i3557 = i3556;
} else {

i3557 = false;

}
final Object i3691;
if ((boolean)i3557) {








final Object f3558 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).tail).head);

i3691 = f3558;
} else {


final Object i3588;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3586;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-rename"), ((Cons)v1331).head)) {



final Object i3584;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3582;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3580;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3578;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-variables"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3576;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3574;
if ((boolean)Lang.equals(RuntimeContext.symbol("in"), ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head)) {






final Object i3572;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {







final Object i3570;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head instanceof Cons)) {







final Object i3568;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail instanceof Cons)) {







final Object i3566;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).head)) {








final Object i3564;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail instanceof Cons)) {








final Object i3562;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-then"), ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).head)) {









final Object i3560;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).tail instanceof Cons)) {









final Object i3559;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail).tail).tail)) {

i3559 = true;
} else {

i3559 = false;

}
i3560 = i3559;
} else {

i3560 = false;

}
final Object i3561;
if ((boolean)i3560) {

i3561 = true;
} else {

i3561 = false;

}
i3562 = i3561;
} else {

i3562 = false;

}
final Object i3563;
if ((boolean)i3562) {

i3563 = true;
} else {

i3563 = false;

}
i3564 = i3563;
} else {

i3564 = false;

}
final Object i3565;
if ((boolean)i3564) {

i3565 = true;
} else {

i3565 = false;

}
i3566 = i3565;
} else {

i3566 = false;

}
final Object i3567;
if ((boolean)i3566) {

i3567 = true;
} else {

i3567 = false;

}
i3568 = i3567;
} else {

i3568 = false;

}
final Object i3569;
if ((boolean)i3568) {

i3569 = true;
} else {

i3569 = false;

}
i3570 = i3569;
} else {

i3570 = false;

}
final Object i3571;
if ((boolean)i3570) {

i3571 = true;
} else {

i3571 = false;

}
i3572 = i3571;
} else {

i3572 = false;

}
final Object i3573;
if ((boolean)i3572) {

i3573 = true;
} else {

i3573 = false;

}
i3574 = i3573;
} else {

i3574 = false;

}
final Object i3575;
if ((boolean)i3574) {

i3575 = true;
} else {

i3575 = false;

}
i3576 = i3575;
} else {

i3576 = false;

}
final Object i3577;
if ((boolean)i3576) {

i3577 = true;
} else {

i3577 = false;

}
i3578 = i3577;
} else {

i3578 = false;

}
final Object i3579;
if ((boolean)i3578) {

i3579 = true;
} else {

i3579 = false;

}
i3580 = i3579;
} else {

i3580 = false;

}
final Object i3581;
if ((boolean)i3580) {

i3581 = true;
} else {

i3581 = false;

}
i3582 = i3581;
} else {

i3582 = false;

}
final Object i3583;
if ((boolean)i3582) {

i3583 = true;
} else {

i3583 = false;

}
i3584 = i3583;
} else {

i3584 = false;

}
final Object i3585;
if ((boolean)i3584) {

i3585 = true;
} else {

i3585 = false;

}
i3586 = i3585;
} else {

i3586 = false;

}
final Object i3587;
if ((boolean)i3586) {

i3587 = true;
} else {

i3587 = false;

}
i3588 = i3587;
} else {

i3588 = false;

}
final Object i3690;
if ((boolean)i3588) {


































final Object f3589 = ShenAum_to_shen.LAMBDA.apply(new Cons(RuntimeContext.symbol("shen-rename"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-variables"), new Cons(RuntimeContext.symbol("in"), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head).tail, ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail))))));






i3690 = new Cons(RuntimeContext.symbol("let"), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head).head, new Cons(new Cons(RuntimeContext.symbol("shen-newpv"), new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL)), new Cons(f3589, Nil.NIL))));
} else {


final Object i3607;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3605;
if ((boolean)Lang.equals(RuntimeContext.symbol("bind"), ((Cons)v1331).head)) {



final Object i3603;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {




final Object i3601;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3599;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-to"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3597;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {






final Object i3595;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3593;
if ((boolean)Lang.equals(RuntimeContext.symbol("in"), ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head)) {







final Object i3591;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail instanceof Cons)) {







final Object i3590;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).tail)) {

i3590 = true;
} else {

i3590 = false;

}
i3591 = i3590;
} else {

i3591 = false;

}
final Object i3592;
if ((boolean)i3591) {

i3592 = true;
} else {

i3592 = false;

}
i3593 = i3592;
} else {

i3593 = false;

}
final Object i3594;
if ((boolean)i3593) {

i3594 = true;
} else {

i3594 = false;

}
i3595 = i3594;
} else {

i3595 = false;

}
final Object i3596;
if ((boolean)i3595) {

i3596 = true;
} else {

i3596 = false;

}
i3597 = i3596;
} else {

i3597 = false;

}
final Object i3598;
if ((boolean)i3597) {

i3598 = true;
} else {

i3598 = false;

}
i3599 = i3598;
} else {

i3599 = false;

}
final Object i3600;
if ((boolean)i3599) {

i3600 = true;
} else {

i3600 = false;

}
i3601 = i3600;
} else {

i3601 = false;

}
final Object i3602;
if ((boolean)i3601) {

i3602 = true;
} else {

i3602 = false;

}
i3603 = i3602;
} else {

i3603 = false;

}
final Object i3604;
if ((boolean)i3603) {

i3604 = true;
} else {

i3604 = false;

}
i3605 = i3604;
} else {

i3605 = false;

}
final Object i3606;
if ((boolean)i3605) {

i3606 = true;
} else {

i3606 = false;

}
i3607 = i3606;
} else {

i3607 = false;

}
final Object i3689;
if ((boolean)i3607) {









final Object f3608 = ShenChwild.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head);















final Object f3609 = ShenAum_to_shen.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail).head);

























i3689 = new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-bindv"), new Cons(((Cons)((Cons)v1331).tail).head, new Cons(f3608, new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL)))), new Cons(new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Result"), new Cons(f3609, new Cons(new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-unbindv"), new Cons(((Cons)((Cons)v1331).tail).head, new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL))), new Cons(RuntimeContext.symbol("Result"), Nil.NIL))), Nil.NIL)))), Nil.NIL)));
} else {


final Object i3625;
if ((boolean)(v1331 instanceof Cons)) {



final Object i3623;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3621;
if ((boolean)Lang.equals(RuntimeContext.symbol("is"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3619;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3617;
if ((boolean)Lang.equals(RuntimeContext.symbol("identical"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3615;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3613;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-to"), ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head)) {






final Object i3611;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail instanceof Cons)) {






final Object i3610;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).tail)) {

i3610 = true;
} else {

i3610 = false;

}
i3611 = i3610;
} else {

i3611 = false;

}
final Object i3612;
if ((boolean)i3611) {

i3612 = true;
} else {

i3612 = false;

}
i3613 = i3612;
} else {

i3613 = false;

}
final Object i3614;
if ((boolean)i3613) {

i3614 = true;
} else {

i3614 = false;

}
i3615 = i3614;
} else {

i3615 = false;

}
final Object i3616;
if ((boolean)i3615) {

i3616 = true;
} else {

i3616 = false;

}
i3617 = i3616;
} else {

i3617 = false;

}
final Object i3618;
if ((boolean)i3617) {

i3618 = true;
} else {

i3618 = false;

}
i3619 = i3618;
} else {

i3619 = false;

}
final Object i3620;
if ((boolean)i3619) {

i3620 = true;
} else {

i3620 = false;

}
i3621 = i3620;
} else {

i3621 = false;

}
final Object i3622;
if ((boolean)i3621) {

i3622 = true;
} else {

i3622 = false;

}
i3623 = i3622;
} else {

i3623 = false;

}
final Object i3624;
if ((boolean)i3623) {

i3624 = true;
} else {

i3624 = false;

}
i3625 = i3624;
} else {

i3625 = false;

}
final Object i3688;
if ((boolean)i3625) {













i3688 = new Cons(RuntimeContext.symbol("="), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail).head, new Cons(((Cons)v1331).head, Nil.NIL)));
} else {

final Object i3687;
if ((boolean)Lang.equals(v1331, null)) {

i3687 = false;
} else {


final Object i3639;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3637;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)v1331).head)) {



final Object i3635;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3633;
if ((boolean)Lang.equals(RuntimeContext.symbol("head"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3631;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3629;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-of"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3627;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3626;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail)) {

i3626 = true;
} else {

i3626 = false;

}
i3627 = i3626;
} else {

i3627 = false;

}
final Object i3628;
if ((boolean)i3627) {

i3628 = true;
} else {

i3628 = false;

}
i3629 = i3628;
} else {

i3629 = false;

}
final Object i3630;
if ((boolean)i3629) {

i3630 = true;
} else {

i3630 = false;

}
i3631 = i3630;
} else {

i3631 = false;

}
final Object i3632;
if ((boolean)i3631) {

i3632 = true;
} else {

i3632 = false;

}
i3633 = i3632;
} else {

i3633 = false;

}
final Object i3634;
if ((boolean)i3633) {

i3634 = true;
} else {

i3634 = false;

}
i3635 = i3634;
} else {

i3635 = false;

}
final Object i3636;
if ((boolean)i3635) {

i3636 = true;
} else {

i3636 = false;

}
i3637 = i3636;
} else {

i3637 = false;

}
final Object i3638;
if ((boolean)i3637) {

i3638 = true;
} else {

i3638 = false;

}
i3639 = i3638;
} else {

i3639 = false;

}
final Object i3686;
if ((boolean)i3639) {






i3686 = new Cons(RuntimeContext.symbol("hd"), ((Cons)((Cons)((Cons)v1331).tail).tail).tail);
} else {


final Object i3653;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3651;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)v1331).head)) {



final Object i3649;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3647;
if ((boolean)Lang.equals(RuntimeContext.symbol("tail"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3645;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3643;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-of"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3641;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3640;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail)) {

i3640 = true;
} else {

i3640 = false;

}
i3641 = i3640;
} else {

i3641 = false;

}
final Object i3642;
if ((boolean)i3641) {

i3642 = true;
} else {

i3642 = false;

}
i3643 = i3642;
} else {

i3643 = false;

}
final Object i3644;
if ((boolean)i3643) {

i3644 = true;
} else {

i3644 = false;

}
i3645 = i3644;
} else {

i3645 = false;

}
final Object i3646;
if ((boolean)i3645) {

i3646 = true;
} else {

i3646 = false;

}
i3647 = i3646;
} else {

i3647 = false;

}
final Object i3648;
if ((boolean)i3647) {

i3648 = true;
} else {

i3648 = false;

}
i3649 = i3648;
} else {

i3649 = false;

}
final Object i3650;
if ((boolean)i3649) {

i3650 = true;
} else {

i3650 = false;

}
i3651 = i3650;
} else {

i3651 = false;

}
final Object i3652;
if ((boolean)i3651) {

i3652 = true;
} else {

i3652 = false;

}
i3653 = i3652;
} else {

i3653 = false;

}
final Object i3685;
if ((boolean)i3653) {






i3685 = new Cons(RuntimeContext.symbol("tl"), ((Cons)((Cons)((Cons)v1331).tail).tail).tail);
} else {


final Object i3665;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3663;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-pop"), ((Cons)v1331).head)) {



final Object i3661;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3659;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3657;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3655;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-stack"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {




final Object i3654;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1331).tail).tail).tail)) {

i3654 = true;
} else {

i3654 = false;

}
i3655 = i3654;
} else {

i3655 = false;

}
final Object i3656;
if ((boolean)i3655) {

i3656 = true;
} else {

i3656 = false;

}
i3657 = i3656;
} else {

i3657 = false;

}
final Object i3658;
if ((boolean)i3657) {

i3658 = true;
} else {

i3658 = false;

}
i3659 = i3658;
} else {

i3659 = false;

}
final Object i3660;
if ((boolean)i3659) {

i3660 = true;
} else {

i3660 = false;

}
i3661 = i3660;
} else {

i3661 = false;

}
final Object i3662;
if ((boolean)i3661) {

i3662 = true;
} else {

i3662 = false;

}
i3663 = i3662;
} else {

i3663 = false;

}
final Object i3664;
if ((boolean)i3663) {

i3664 = true;
} else {

i3664 = false;

}
i3665 = i3664;
} else {

i3665 = false;

}
final Object i3684;
if ((boolean)i3665) {













i3684 = new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-incinfs"), Nil.NIL), new Cons(new Cons(RuntimeContext.symbol("thaw"), new Cons(RuntimeContext.symbol("Continuation"), Nil.NIL)), Nil.NIL)));
} else {


final Object i3679;
if ((boolean)(v1331 instanceof Cons)) {


final Object i3677;
if ((boolean)Lang.equals(RuntimeContext.symbol("call"), ((Cons)v1331).head)) {



final Object i3675;
if ((boolean)(((Cons)v1331).tail instanceof Cons)) {



final Object i3673;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-the"), ((Cons)((Cons)v1331).tail).head)) {




final Object i3671;
if ((boolean)(((Cons)((Cons)v1331).tail).tail instanceof Cons)) {




final Object i3669;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-continuation"), ((Cons)((Cons)((Cons)v1331).tail).tail).head)) {





final Object i3667;
if ((boolean)(((Cons)((Cons)((Cons)v1331).tail).tail).tail instanceof Cons)) {





final Object i3666;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).tail)) {

i3666 = true;
} else {

i3666 = false;

}
i3667 = i3666;
} else {

i3667 = false;

}
final Object i3668;
if ((boolean)i3667) {

i3668 = true;
} else {

i3668 = false;

}
i3669 = i3668;
} else {

i3669 = false;

}
final Object i3670;
if ((boolean)i3669) {

i3670 = true;
} else {

i3670 = false;

}
i3671 = i3670;
} else {

i3671 = false;

}
final Object i3672;
if ((boolean)i3671) {

i3672 = true;
} else {

i3672 = false;

}
i3673 = i3672;
} else {

i3673 = false;

}
final Object i3674;
if ((boolean)i3673) {

i3674 = true;
} else {

i3674 = false;

}
i3675 = i3674;
} else {

i3675 = false;

}
final Object i3676;
if ((boolean)i3675) {

i3676 = true;
} else {

i3676 = false;

}
i3677 = i3676;
} else {

i3677 = false;

}
final Object i3678;
if ((boolean)i3677) {

i3678 = true;
} else {

i3678 = false;

}
i3679 = i3678;
} else {

i3679 = false;

}
final Object i3683;
if ((boolean)i3679) {








final Object f3680 = ShenChwild.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1331).tail).tail).tail).head);
final Object f3681 = ShenCall_the_continuation.LAMBDA.apply(f3680, RuntimeContext.symbol("ProcessN"), RuntimeContext.symbol("Continuation"));





i3683 = new Cons(RuntimeContext.symbol("do"), new Cons(new Cons(RuntimeContext.symbol("shen-incinfs"), Nil.NIL), new Cons(f3681, Nil.NIL)));
} else {

final Object i3682;
if ((boolean)true) {

i3682 = v1331;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3683 = i3682;

}
i3684 = i3683;

}
i3685 = i3684;

}
i3686 = i3685;

}
i3687 = i3686;

}
i3688 = i3687;

}
i3689 = i3688;

}
i3690 = i3689;

}
i3691 = i3690;

}
i3692 = i3691;

}
i3693 = i3692;

}
i3694 = i3693;

}
i3695 = i3694;

}
i3696 = i3695;

}
    return i3696;

}
}
