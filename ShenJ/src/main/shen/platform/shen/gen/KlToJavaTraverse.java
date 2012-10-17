package shen.gen;



import com.mentics.shen.*;

public class KlToJavaTraverse {

public static final Symbol SYMBOL = RuntimeContext.symbol("kl-to-java-traverse");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v7243, final Object v7244, final Object v7245) throws Exception {
return defined(v7243, v7244, v7245);
}};
public static Object defined(final Object v7243, final Object v7244, final Object v7245) throws Exception {


final Object i7346;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7344;
if ((boolean)Lang.equals(RuntimeContext.symbol("defun"), ((Cons)v7243).head)) {



final Object i7342;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7340;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {





final Object i7338;
if ((boolean)(((Cons)((Cons)((Cons)v7243).tail).tail).tail instanceof Cons)) {





final Object i7337;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).tail)) {

i7337 = true;
} else {

i7337 = false;

}
i7338 = i7337;
} else {

i7338 = false;

}
final Object i7339;
if ((boolean)i7338) {

i7339 = true;
} else {

i7339 = false;

}
i7340 = i7339;
} else {

i7340 = false;

}
final Object i7341;
if ((boolean)i7340) {

i7341 = true;
} else {

i7341 = false;

}
i7342 = i7341;
} else {

i7342 = false;

}
final Object i7343;
if ((boolean)i7342) {

i7343 = true;
} else {

i7343 = false;

}
i7344 = i7343;
} else {

i7344 = false;

}
final Object i7345;
if ((boolean)i7344) {

i7345 = true;
} else {

i7345 = false;

}
i7346 = i7345;
} else {

i7346 = false;

}
final Object i8423;
if ((boolean)i7346) {



final Object f7348 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head);

final Object arity7347 = f7348;
final Object f7350 = ToVar.LAMBDA.apply();



final Object f7351 = Map.LAMBDA.apply(f7350, ((Cons)((Cons)((Cons)v7243).tail).tail).head);
final Object f7352 = MethodSig.LAMBDA.apply(f7351);

final Object signature7349 = f7352;
final Object f7354 = ToVar.LAMBDA.apply();



final Object f7355 = Map.LAMBDA.apply(f7354, ((Cons)((Cons)((Cons)v7243).tail).tail).head);
final Object f7356 = MethodArgstring.LAMBDA.apply(f7355);

final Object argstring7353 = f7356;





final Object f7357 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head);

final Object f7358 = Put.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("arity"), f7357, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));




final Object f7360 = ToVarPair.LAMBDA.apply();



final Object f7361 = Map.LAMBDA.apply(f7360, ((Cons)((Cons)((Cons)v7243).tail).tail).head);
final Object f7362 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).head, RuntimeContext.symbol("object"), f7361);

final Object result7359 = f7362;





final Object f7363 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head);
final Object f7364 = Fst.LAMBDA.apply(result7359);
final Object f7365 = HandleUnreachableReturn.LAMBDA.apply(result7359);
final Object f7366 = Atp.LAMBDA.apply(f7365, Nil.NIL);
final Object f7367 = Atp.LAMBDA.apply(f7364, f7366);
final Object f7368 = Atp.LAMBDA.apply(signature7349, f7367);
final Object f7369 = Atp.LAMBDA.apply(argstring7353, f7368);
final Object f7370 = Atp.LAMBDA.apply(signature7349, f7369);
final Object f7371 = Atp.LAMBDA.apply(f7363, f7370);
final Object f7372 = Atp.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, f7371);
final Object f7373 = IntmakeString.LAMBDA.apply("\r\npublic static final Symbol SYMBOL = RuntimeContext.symbol(\"~A\");\r\npublic static final Lambda LAMBDA = new Lambda~A() {\r\npublic Object apply(~A) throws Exception {\r\nreturn defined(~A);\r\n}};\r\npublic static Object defined(~A) throws Exception {~%~A~%~A~%}", f7372);




final Object f7374 = Atp.LAMBDA.apply(String.valueOf(((Cons)((Cons)v7243).tail).head), RuntimeContext.symbol("func"));
final Object f7375 = Atp.LAMBDA.apply(f7373, f7374);
final Object f7376 = Do.LAMBDA.apply(f7358, f7375);




i8423 = f7376;
} else {


final Object i7386;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7384;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v7243).head)) {



final Object i7382;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7380;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {





final Object i7378;
if ((boolean)(((Cons)((Cons)((Cons)v7243).tail).tail).tail instanceof Cons)) {





final Object i7377;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).tail)) {

i7377 = true;
} else {

i7377 = false;

}
i7378 = i7377;
} else {

i7378 = false;

}
final Object i7379;
if ((boolean)i7378) {

i7379 = true;
} else {

i7379 = false;

}
i7380 = i7379;
} else {

i7380 = false;

}
final Object i7381;
if ((boolean)i7380) {

i7381 = true;
} else {

i7381 = false;

}
i7382 = i7381;
} else {

i7382 = false;

}
final Object i7383;
if ((boolean)i7382) {

i7383 = true;
} else {

i7383 = false;

}
i7384 = i7383;
} else {

i7384 = false;

}
final Object i7385;
if ((boolean)i7384) {

i7385 = true;
} else {

i7385 = false;

}
i7386 = i7385;
} else {

i7386 = false;

}
final Object i8422;
if ((boolean)i7386) {


final Object f7388 = Gensym.LAMBDA.apply(((Cons)((Cons)v7243).tail).head);
final Object f7389 = ToVar.LAMBDA.apply(f7388);

final Object varTOxDO7387 = f7389;



final Object f7391 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("object"), v7245);

final Object pValue7390 = f7391;






final Object f7393 = Atp.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, varTOxDO7387);


final Object f7394 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).head, v7244, new Cons(f7393, v7245));

final Object pBody7392 = f7394;
final Object f7395 = Fst.LAMBDA.apply(pValue7390);
final Object f7396 = Second.LAMBDA.apply(pValue7390);
final Object f7397 = Fst.LAMBDA.apply(pBody7392);
final Object f7398 = Atp.LAMBDA.apply(f7397, Nil.NIL);
final Object f7399 = Atp.LAMBDA.apply(f7396, f7398);
final Object f7400 = Atp.LAMBDA.apply(varTOxDO7387, f7399);
final Object f7401 = Atp.LAMBDA.apply(f7395, f7400);
final Object f7402 = IntmakeString.LAMBDA.apply("~A~%final Object ~A = ~A;~%~A~%", f7401);
final Object f7403 = Second.LAMBDA.apply(pBody7392);
final Object f7404 = Third.LAMBDA.apply(pBody7392);
final Object f7405 = Atp.LAMBDA.apply(f7403, f7404);
final Object f7406 = Atp.LAMBDA.apply(f7402, f7405);




i8422 = f7406;
} else {


final Object i7416;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7414;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)v7243).head)) {



final Object i7412;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7410;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {





final Object i7408;
if ((boolean)(((Cons)((Cons)((Cons)v7243).tail).tail).tail instanceof Cons)) {





final Object i7407;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).tail)) {

i7407 = true;
} else {

i7407 = false;

}
i7408 = i7407;
} else {

i7408 = false;

}
final Object i7409;
if ((boolean)i7408) {

i7409 = true;
} else {

i7409 = false;

}
i7410 = i7409;
} else {

i7410 = false;

}
final Object i7411;
if ((boolean)i7410) {

i7411 = true;
} else {

i7411 = false;

}
i7412 = i7411;
} else {

i7412 = false;

}
final Object i7413;
if ((boolean)i7412) {

i7413 = true;
} else {

i7413 = false;

}
i7414 = i7413;
} else {

i7414 = false;

}
final Object i7415;
if ((boolean)i7414) {

i7415 = true;
} else {

i7415 = false;

}
i7416 = i7415;
} else {

i7416 = false;

}
final Object i8421;
if ((boolean)i7416) {


final Object f7418 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("boolean"), v7245);

final Object pX07417 = f7418;



final Object f7420 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, v7244, v7245);

final Object pX17419 = f7420;




final Object f7422 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).head, v7244, v7245);

final Object pX27421 = f7422;
final Object f7424 = Gensym.LAMBDA.apply(RuntimeContext.symbol("i"));

final Object var7423 = f7424;
final Object f7426 = Third.LAMBDA.apply(pX07417);

final Object i7444;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f7426)) {
final Object f7427 = Fst.LAMBDA.apply(pX07417);
final Object f7428 = Atp.LAMBDA.apply(f7427, Nil.NIL);
final Object f7429 = IntmakeString.LAMBDA.apply("~A~%", f7428);

i7444 = f7429;
} else {
final Object f7430 = Fst.LAMBDA.apply(pX07417);
final Object f7431 = Second.LAMBDA.apply(pX07417);
final Object f7432 = Fst.LAMBDA.apply(pX17419);
final Object f7433 = HandleUnreachableAssignment.LAMBDA.apply(var7423, pX17419);
final Object f7434 = Fst.LAMBDA.apply(pX27421);
final Object f7435 = HandleUnreachableAssignment.LAMBDA.apply(var7423, pX27421);
final Object f7436 = Atp.LAMBDA.apply(f7435, Nil.NIL);
final Object f7437 = Atp.LAMBDA.apply(f7434, f7436);
final Object f7438 = Atp.LAMBDA.apply(f7433, f7437);
final Object f7439 = Atp.LAMBDA.apply(f7432, f7438);
final Object f7440 = Atp.LAMBDA.apply(f7431, f7439);
final Object f7441 = Atp.LAMBDA.apply(var7423, f7440);
final Object f7442 = Atp.LAMBDA.apply(f7430, f7441);
final Object f7443 = IntmakeString.LAMBDA.apply("~A~%final Object ~A;~%if ((boolean)~A) {~%~A~%~A} else {~%~A~%~A~%}", f7442);

i7444 = f7443;

}
final Object first7425 = i7444;

final Object f7445 = Third.LAMBDA.apply(pX07417);

final Object i7449;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), f7445)) {

i7449 = RuntimeContext.symbol("unreachable");
} else {
final Object f7446 = Third.LAMBDA.apply(pX17419);
final Object f7447 = Third.LAMBDA.apply(pX27421);
final Object f7448 = CombineTypes.LAMBDA.apply(f7446, f7447);

i7449 = f7448;

}final Object f7450 = Atp.LAMBDA.apply(String.valueOf(var7423), i7449);
final Object f7451 = Atp.LAMBDA.apply(first7425, f7450);






i8421 = f7451;
} else {


final Object i7453;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7452;
if ((boolean)Lang.equals(RuntimeContext.symbol("cond"), ((Cons)v7243).head)) {

i7452 = true;
} else {

i7452 = false;

}
i7453 = i7452;
} else {

i7453 = false;

}
final Object i8420;
if ((boolean)i7453) {

final Object f7454 = HandleCases.LAMBDA.apply(((Cons)v7243).tail);
final Object f7455 = KlToJavaTraverse.LAMBDA.apply(f7454, v7244, v7245);

i8420 = f7455;
} else {


final Object i7463;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7461;
if ((boolean)Lang.equals(RuntimeContext.symbol("trap-error"), ((Cons)v7243).head)) {



final Object i7459;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7457;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7456;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7456 = true;
} else {

i7456 = false;

}
i7457 = i7456;
} else {

i7457 = false;

}
final Object i7458;
if ((boolean)i7457) {

i7458 = true;
} else {

i7458 = false;

}
i7459 = i7458;
} else {

i7459 = false;

}
final Object i7460;
if ((boolean)i7459) {

i7460 = true;
} else {

i7460 = false;

}
i7461 = i7460;
} else {

i7461 = false;

}
final Object i7462;
if ((boolean)i7461) {

i7462 = true;
} else {

i7462 = false;

}
i7463 = i7462;
} else {

i7463 = false;

}
final Object i8419;
if ((boolean)i7463) {


final Object f7465 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("object"), v7245);

final Object evaled7464 = f7465;



final Object f7467 = ToVarPair.LAMBDA.apply(RuntimeContext.symbol("t"));


final Object f7468 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("lambda"), new Cons(f7467, v7245));

final Object handlerTOxDO7466 = f7468;
final Object f7470 = Gensym.LAMBDA.apply(RuntimeContext.symbol("t"));

final Object temp7469 = f7470;
final Object f7472 = Gensym.LAMBDA.apply(RuntimeContext.symbol("t"));

final Object result7471 = f7472;
final Object f7473 = Fst.LAMBDA.apply(evaled7464);
final Object f7474 = Second.LAMBDA.apply(evaled7464);
final Object f7475 = Fst.LAMBDA.apply(handlerTOxDO7466);
final Object f7476 = Second.LAMBDA.apply(handlerTOxDO7466);
final Object f7477 = Atp.LAMBDA.apply(temp7469, Nil.NIL);
final Object f7478 = Atp.LAMBDA.apply(result7471, f7477);
final Object f7479 = Atp.LAMBDA.apply(f7476, f7478);
final Object f7480 = Atp.LAMBDA.apply(temp7469, f7479);
final Object f7481 = Atp.LAMBDA.apply(f7475, f7480);
final Object f7482 = Atp.LAMBDA.apply(f7474, f7481);
final Object f7483 = Atp.LAMBDA.apply(temp7469, f7482);
final Object f7484 = Atp.LAMBDA.apply(f7473, f7483);
final Object f7485 = Atp.LAMBDA.apply(temp7469, f7484);
final Object f7486 = IntmakeString.LAMBDA.apply("Object ~A;~%try {~%~A~%~A = ~A;~%} catch (Throwable t) {~%~A~%~A = ~A.apply(t);~%}~%final Object ~A = ~A;~%", f7485);

final Object f7487 = Atp.LAMBDA.apply(String.valueOf(result7471), RuntimeContext.symbol("object"));
final Object f7488 = Atp.LAMBDA.apply(f7486, f7487);





i8419 = f7488;
} else {


final Object i7498;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7496;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), ((Cons)v7243).head)) {



final Object i7494;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7492;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).head)) {




final Object i7490;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7489;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7489 = true;
} else {

i7489 = false;

}
i7490 = i7489;
} else {

i7490 = false;

}
final Object i7491;
if ((boolean)i7490) {

i7491 = true;
} else {

i7491 = false;

}
i7492 = i7491;
} else {

i7492 = false;

}
final Object i7493;
if ((boolean)i7492) {

i7493 = true;
} else {

i7493 = false;

}
i7494 = i7493;
} else {

i7494 = false;

}
final Object i7495;
if ((boolean)i7494) {

i7495 = true;
} else {

i7495 = false;

}
i7496 = i7495;
} else {

i7496 = false;

}
final Object i7497;
if ((boolean)i7496) {

i7497 = true;
} else {

i7497 = false;

}
i7498 = i7497;
} else {

i7498 = false;

}
final Object i8418;
if ((boolean)i7498) {



final Object f7500 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("object"), v7245);

final Object bodyTOxDO7499 = f7500;
final Object f7502 = Gensym.LAMBDA.apply(RuntimeContext.symbol("l"));

final Object result7501 = f7502;
final Object f7503 = Fst.LAMBDA.apply(bodyTOxDO7499);
final Object f7504 = HandleUnreachableReturn.LAMBDA.apply(bodyTOxDO7499);
final Object f7505 = Atp.LAMBDA.apply(f7504, Nil.NIL);
final Object f7506 = Atp.LAMBDA.apply(f7503, f7505);
final Object f7507 = Atp.LAMBDA.apply(result7501, f7506);
final Object f7508 = IntmakeString.LAMBDA.apply("final Lambda ~A = new Lambda0() {~%  public Object apply() throws Exception {~%    ~A~%~A  }~%};", f7507);

final Object f7509 = Atp.LAMBDA.apply(String.valueOf(result7501), RuntimeContext.symbol("lambda"));
final Object f7510 = Atp.LAMBDA.apply(f7508, f7509);



i8418 = f7510;
} else {


final Object i7518;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7516;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), ((Cons)v7243).head)) {



final Object i7514;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7512;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7511;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7511 = true;
} else {

i7511 = false;

}
i7512 = i7511;
} else {

i7512 = false;

}
final Object i7513;
if ((boolean)i7512) {

i7513 = true;
} else {

i7513 = false;

}
i7514 = i7513;
} else {

i7514 = false;

}
final Object i7515;
if ((boolean)i7514) {

i7515 = true;
} else {

i7515 = false;

}
i7516 = i7515;
} else {

i7516 = false;

}
final Object i7517;
if ((boolean)i7516) {

i7517 = true;
} else {

i7517 = false;

}
i7518 = i7517;
} else {

i7518 = false;

}
final Object i8417;
if ((boolean)i7518) {


final Object f7520 = ToVar.LAMBDA.apply(((Cons)((Cons)v7243).tail).head);

final Object varTOxDO7519 = f7520;





final Object f7522 = ToVarPair.LAMBDA.apply(((Cons)((Cons)v7243).tail).head);


final Object f7523 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("object"), new Cons(f7522, v7245));

final Object bodyTOxDO7521 = f7523;
final Object f7525 = Gensym.LAMBDA.apply(RuntimeContext.symbol("l"));

final Object result7524 = f7525;
final Object f7526 = Fst.LAMBDA.apply(bodyTOxDO7521);
final Object f7527 = HandleUnreachableReturn.LAMBDA.apply(bodyTOxDO7521);
final Object f7528 = Atp.LAMBDA.apply(f7527, Nil.NIL);
final Object f7529 = Atp.LAMBDA.apply(f7526, f7528);
final Object f7530 = Atp.LAMBDA.apply(varTOxDO7519, f7529);
final Object f7531 = Atp.LAMBDA.apply(result7524, f7530);
final Object f7532 = IntmakeString.LAMBDA.apply("final Lambda ~A = new Lambda1() {~%  public Object apply(final Object ~A) throws Exception {~%    ~A~%~A  }~%};", f7531);

final Object f7533 = Atp.LAMBDA.apply(String.valueOf(result7524), RuntimeContext.symbol("lambda"));
final Object f7534 = Atp.LAMBDA.apply(f7532, f7533);




i8417 = f7534;
} else {


final Object i7540;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7538;
if ((boolean)Lang.equals(RuntimeContext.symbol("simple-error"), ((Cons)v7243).head)) {



final Object i7536;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7535;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7535 = true;
} else {

i7535 = false;

}
i7536 = i7535;
} else {

i7536 = false;

}
final Object i7537;
if ((boolean)i7536) {

i7537 = true;
} else {

i7537 = false;

}
i7538 = i7537;
} else {

i7538 = false;

}
final Object i7539;
if ((boolean)i7538) {

i7539 = true;
} else {

i7539 = false;

}
i7540 = i7539;
} else {

i7540 = false;

}
final Object i8416;
if ((boolean)i7540) {


final Object f7542 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("string"), v7245);

final Object messageTOxDO7541 = f7542;
final Object f7543 = Fst.LAMBDA.apply(messageTOxDO7541);
final Object f7544 = Second.LAMBDA.apply(messageTOxDO7541);
final Object f7545 = Atp.LAMBDA.apply(f7544, Nil.NIL);
final Object f7546 = Atp.LAMBDA.apply(f7543, f7545);
final Object f7547 = IntmakeString.LAMBDA.apply("~A~%throw new SimpleError((String)~A);~%", f7546);
final Object f7548 = Atp.LAMBDA.apply("", RuntimeContext.symbol("unreachable"));
final Object f7549 = Atp.LAMBDA.apply(f7547, f7548);


i8416 = f7549;
} else {


final Object i7555;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7553;
if ((boolean)Lang.equals(RuntimeContext.symbol("error-to-string"), ((Cons)v7243).head)) {



final Object i7551;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7550;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7550 = true;
} else {

i7550 = false;

}
i7551 = i7550;
} else {

i7551 = false;

}
final Object i7552;
if ((boolean)i7551) {

i7552 = true;
} else {

i7552 = false;

}
i7553 = i7552;
} else {

i7553 = false;

}
final Object i7554;
if ((boolean)i7553) {

i7554 = true;
} else {

i7554 = false;

}
i7555 = i7554;
} else {

i7555 = false;

}
final Object i8415;
if ((boolean)i7555) {


final Object f7557 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("exception"), v7245);

final Object exceptionTOxDO7556 = f7557;
final Object f7558 = Fst.LAMBDA.apply(exceptionTOxDO7556);
final Object f7559 = Atp.LAMBDA.apply(f7558, Nil.NIL);
final Object f7560 = IntmakeString.LAMBDA.apply("~A~%", f7559);
final Object f7561 = Second.LAMBDA.apply(exceptionTOxDO7556);
final Object f7562 = Atp.LAMBDA.apply(f7561, Nil.NIL);
final Object f7563 = IntmakeString.LAMBDA.apply("Lang.errorToString(~A)", f7562);
final Object f7564 = Atp.LAMBDA.apply(f7563, RuntimeContext.symbol("string"));
final Object f7565 = Atp.LAMBDA.apply(f7560, f7564);


i8415 = f7565;
} else {


final Object i7571;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7569;
if ((boolean)Lang.equals(RuntimeContext.symbol("str"), ((Cons)v7243).head)) {



final Object i7567;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7566;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7566 = true;
} else {

i7566 = false;

}
i7567 = i7566;
} else {

i7567 = false;

}
final Object i7568;
if ((boolean)i7567) {

i7568 = true;
} else {

i7568 = false;

}
i7569 = i7568;
} else {

i7569 = false;

}
final Object i7570;
if ((boolean)i7569) {

i7570 = true;
} else {

i7570 = false;

}
i7571 = i7570;
} else {

i7571 = false;

}
final Object i8414;
if ((boolean)i7571) {


final Object f7572 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "String.valueOf(~A)", RuntimeContext.symbol("string"));

i8414 = f7572;
} else {


final Object i7578;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7576;
if ((boolean)Lang.equals(RuntimeContext.symbol("intern"), ((Cons)v7243).head)) {



final Object i7574;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7573;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7573 = true;
} else {

i7573 = false;

}
i7574 = i7573;
} else {

i7574 = false;

}
final Object i7575;
if ((boolean)i7574) {

i7575 = true;
} else {

i7575 = false;

}
i7576 = i7575;
} else {

i7576 = false;

}
final Object i7577;
if ((boolean)i7576) {

i7577 = true;
} else {

i7577 = false;

}
i7578 = i7577;
} else {

i7578 = false;

}
final Object i8413;
if ((boolean)i7578) {


final Object f7579 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "RuntimeContext.symbol((String)~A)", RuntimeContext.symbol("symbol"));

i8413 = f7579;
} else {


final Object i7585;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7583;
if ((boolean)Lang.equals(RuntimeContext.symbol("absvector?"), ((Cons)v7243).head)) {



final Object i7581;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7580;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7580 = true;
} else {

i7580 = false;

}
i7581 = i7580;
} else {

i7581 = false;

}
final Object i7582;
if ((boolean)i7581) {

i7582 = true;
} else {

i7582 = false;

}
i7583 = i7582;
} else {

i7583 = false;

}
final Object i7584;
if ((boolean)i7583) {

i7584 = true;
} else {

i7584 = false;

}
i7585 = i7584;
} else {

i7585 = false;

}
final Object i8412;
if ((boolean)i7585) {


final Object f7586 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "(~A instanceof Object[])", RuntimeContext.symbol("boolean"));

i8412 = f7586;
} else {


final Object i7592;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7590;
if ((boolean)Lang.equals(RuntimeContext.symbol("get-time"), ((Cons)v7243).head)) {



final Object i7588;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7587;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7587 = true;
} else {

i7587 = false;

}
i7588 = i7587;
} else {

i7588 = false;

}
final Object i7589;
if ((boolean)i7588) {

i7589 = true;
} else {

i7589 = false;

}
i7590 = i7589;
} else {

i7590 = false;

}
final Object i7591;
if ((boolean)i7590) {

i7591 = true;
} else {

i7591 = false;

}
i7592 = i7591;
} else {

i7592 = false;

}
final Object i8411;
if ((boolean)i7592) {


final Object f7593 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "Lang.getTime(~A)", RuntimeContext.symbol("object"));

i8411 = f7593;
} else {


final Object i7603;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7601;
if ((boolean)Lang.equals(RuntimeContext.symbol("open"), ((Cons)v7243).head)) {



final Object i7599;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7597;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {





final Object i7595;
if ((boolean)(((Cons)((Cons)((Cons)v7243).tail).tail).tail instanceof Cons)) {





final Object i7594;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).tail)) {

i7594 = true;
} else {

i7594 = false;

}
i7595 = i7594;
} else {

i7595 = false;

}
final Object i7596;
if ((boolean)i7595) {

i7596 = true;
} else {

i7596 = false;

}
i7597 = i7596;
} else {

i7597 = false;

}
final Object i7598;
if ((boolean)i7597) {

i7598 = true;
} else {

i7598 = false;

}
i7599 = i7598;
} else {

i7599 = false;

}
final Object i7600;
if ((boolean)i7599) {

i7600 = true;
} else {

i7600 = false;

}
i7601 = i7600;
} else {

i7601 = false;

}
final Object i7602;
if ((boolean)i7601) {

i7602 = true;
} else {

i7602 = false;

}
i7603 = i7602;
} else {

i7603 = false;

}
final Object i8410;
if ((boolean)i7603) {


final Object f7605 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("symbol"), v7245);

final Object streamTypeTOxDO7604 = f7605;



final Object f7607 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("string"), v7245);

final Object locationTOxDO7606 = f7607;




final Object f7609 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).head, RuntimeContext.symbol("symbol"), v7245);

final Object directionTOxDO7608 = f7609;
final Object f7611 = Gensym.LAMBDA.apply(RuntimeContext.symbol("o"));

final Object var7610 = f7611;
final Object f7612 = Fst.LAMBDA.apply(streamTypeTOxDO7604);
final Object f7613 = Fst.LAMBDA.apply(locationTOxDO7606);
final Object f7614 = Fst.LAMBDA.apply(directionTOxDO7608);
final Object f7615 = Second.LAMBDA.apply(streamTypeTOxDO7604);
final Object f7616 = Second.LAMBDA.apply(locationTOxDO7606);
final Object f7617 = Second.LAMBDA.apply(directionTOxDO7608);
final Object f7618 = Atp.LAMBDA.apply(f7617, Nil.NIL);
final Object f7619 = Atp.LAMBDA.apply(f7616, f7618);
final Object f7620 = Atp.LAMBDA.apply(f7615, f7619);
final Object f7621 = Atp.LAMBDA.apply(var7610, f7620);
final Object f7622 = Atp.LAMBDA.apply(f7614, f7621);
final Object f7623 = Atp.LAMBDA.apply(f7613, f7622);
final Object f7624 = Atp.LAMBDA.apply(f7612, f7623);
final Object f7625 = IntmakeString.LAMBDA.apply("~A~%~A~%~A~%final Object ~A = Lang.open(~A, ~A, ~A);", f7624);

final Object f7626 = Atp.LAMBDA.apply(String.valueOf(var7610), RuntimeContext.symbol("stream"));
final Object f7627 = Atp.LAMBDA.apply(f7625, f7626);





i8410 = f7627;
} else {


final Object i7633;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7631;
if ((boolean)Lang.equals(RuntimeContext.symbol("close"), ((Cons)v7243).head)) {



final Object i7629;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7628;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7628 = true;
} else {

i7628 = false;

}
i7629 = i7628;
} else {

i7629 = false;

}
final Object i7630;
if ((boolean)i7629) {

i7630 = true;
} else {

i7630 = false;

}
i7631 = i7630;
} else {

i7631 = false;

}
final Object i7632;
if ((boolean)i7631) {

i7632 = true;
} else {

i7632 = false;

}
i7633 = i7632;
} else {

i7633 = false;

}
final Object i8409;
if ((boolean)i7633) {


final Object f7635 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("stream"), v7245);

final Object streamTOxDO7634 = f7635;
final Object f7636 = Fst.LAMBDA.apply(streamTOxDO7634);
final Object f7637 = Second.LAMBDA.apply(streamTOxDO7634);
final Object f7638 = Atp.LAMBDA.apply(f7637, Nil.NIL);
final Object f7639 = Atp.LAMBDA.apply(f7636, f7638);
final Object f7640 = IntmakeString.LAMBDA.apply("~A~%((java.io.Closeable)~A).close();~%", f7639);
final Object f7641 = Atp.LAMBDA.apply("Nil.NIL", RuntimeContext.symbol("list"));
final Object f7642 = Atp.LAMBDA.apply(f7640, f7641);


i8409 = f7642;
} else {


final Object i7650;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7648;
if ((boolean)Lang.equals(RuntimeContext.symbol("pr"), ((Cons)v7243).head)) {



final Object i7646;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7644;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7643;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7643 = true;
} else {

i7643 = false;

}
i7644 = i7643;
} else {

i7644 = false;

}
final Object i7645;
if ((boolean)i7644) {

i7645 = true;
} else {

i7645 = false;

}
i7646 = i7645;
} else {

i7646 = false;

}
final Object i7647;
if ((boolean)i7646) {

i7647 = true;
} else {

i7647 = false;

}
i7648 = i7647;
} else {

i7648 = false;

}
final Object i7649;
if ((boolean)i7648) {

i7649 = true;
} else {

i7649 = false;

}
i7650 = i7649;
} else {

i7650 = false;

}
final Object i8408;
if ((boolean)i7650) {


final Object f7652 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("string"), v7245);

final Object stringTOxDO7651 = f7652;



final Object f7654 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("stream"), v7245);

final Object streamTOxDO7653 = f7654;
final Object f7655 = Fst.LAMBDA.apply(stringTOxDO7651);
final Object f7656 = Fst.LAMBDA.apply(streamTOxDO7653);
final Object f7657 = Second.LAMBDA.apply(streamTOxDO7653);
final Object f7658 = Second.LAMBDA.apply(stringTOxDO7651);
final Object f7659 = Atp.LAMBDA.apply(f7658, Nil.NIL);
final Object f7660 = Atp.LAMBDA.apply(f7657, f7659);
final Object f7661 = Atp.LAMBDA.apply(f7656, f7660);
final Object f7662 = Atp.LAMBDA.apply(f7655, f7661);
final Object f7663 = IntmakeString.LAMBDA.apply("~A~%~A~%((java.io.OutputStream)~A).write(((String)~A).getBytes());", f7662);
final Object f7664 = Second.LAMBDA.apply(stringTOxDO7651);
final Object f7665 = Atp.LAMBDA.apply(f7664, RuntimeContext.symbol("string"));
final Object f7666 = Atp.LAMBDA.apply(f7663, f7665);



i8408 = f7666;
} else {


final Object i7670;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7668;
if ((boolean)Lang.equals(RuntimeContext.symbol("read-byte"), ((Cons)v7243).head)) {


final Object i7667;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7667 = true;
} else {

i7667 = false;

}
i7668 = i7667;
} else {

i7668 = false;

}
final Object i7669;
if ((boolean)i7668) {

i7669 = true;
} else {

i7669 = false;

}
i7670 = i7669;
} else {

i7670 = false;

}
final Object i8407;
if ((boolean)i7670) {
final Object f7671 = SingleParam.LAMBDA.apply("", v7244, v7245, "System.in.read()", RuntimeContext.symbol("number"));

i8407 = f7671;
} else {


final Object i7677;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7675;
if ((boolean)Lang.equals(RuntimeContext.symbol("read-byte"), ((Cons)v7243).head)) {



final Object i7673;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7672;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7672 = true;
} else {

i7672 = false;

}
i7673 = i7672;
} else {

i7673 = false;

}
final Object i7674;
if ((boolean)i7673) {

i7674 = true;
} else {

i7674 = false;

}
i7675 = i7674;
} else {

i7675 = false;

}
final Object i7676;
if ((boolean)i7675) {

i7676 = true;
} else {

i7676 = false;

}
i7677 = i7676;
} else {

i7677 = false;

}
final Object i8406;
if ((boolean)i7677) {


final Object f7678 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "((java.io.InputStream)~A).read()", RuntimeContext.symbol("number"));

i8406 = f7678;
} else {


final Object i7682;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7680;
if ((boolean)Lang.equals(RuntimeContext.symbol("not"), ((Cons)v7243).head)) {


final Object i7679;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7679 = true;
} else {

i7679 = false;

}
i7680 = i7679;
} else {

i7680 = false;

}
final Object i7681;
if ((boolean)i7680) {

i7681 = true;
} else {

i7681 = false;

}
i7682 = i7681;
} else {

i7682 = false;

}
final Object i8405;
if ((boolean)i7682) {
final Object f7684 = Gensym.LAMBDA.apply(RuntimeContext.symbol("n"));

final Object expression7683 = f7684;










final Object f7685 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(expression7683, new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(expression7683, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8405 = f7685;
} else {


final Object i7691;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7689;
if ((boolean)Lang.equals(RuntimeContext.symbol("not"), ((Cons)v7243).head)) {



final Object i7687;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7686;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7686 = true;
} else {

i7686 = false;

}
i7687 = i7686;
} else {

i7687 = false;

}
final Object i7688;
if ((boolean)i7687) {

i7688 = true;
} else {

i7688 = false;

}
i7689 = i7688;
} else {

i7689 = false;

}
final Object i7690;
if ((boolean)i7689) {

i7690 = true;
} else {

i7690 = false;

}
i7691 = i7690;
} else {

i7691 = false;

}
final Object i8404;
if ((boolean)i7691) {

final Object i7693;
if ((boolean)Lang.equals(RuntimeContext.symbol("boolean"), v7244)) {

i7693 = true;
} else {

final Object i7692;
if ((boolean)Lang.equals(RuntimeContext.symbol("object"), v7244)) {

i7692 = true;
} else {

i7692 = false;

}
i7693 = i7692;

}

final Object f7695 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("boolean"), v7245);

final Object expressionTOxDO7694 = f7695;
final Object f7696 = Fst.LAMBDA.apply(expressionTOxDO7694);
final Object f7697 = Atp.LAMBDA.apply(f7696, Nil.NIL);
final Object f7698 = IntmakeString.LAMBDA.apply("~A~%", f7697);
final Object f7699 = Second.LAMBDA.apply(expressionTOxDO7694);
final Object f7700 = Atp.LAMBDA.apply(f7699, Nil.NIL);
final Object f7701 = IntmakeString.LAMBDA.apply("!((boolean)~A)", f7700);
final Object f7702 = Atp.LAMBDA.apply(f7701, RuntimeContext.symbol("boolean"));
final Object f7703 = Atp.LAMBDA.apply(f7698, f7702);

final Object f7704 = Assert.LAMBDA.apply(i7693, "Expected boolean or object for not operation.", f7703);

i8404 = f7704;
} else {


final Object i7708;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7706;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)v7243).head)) {


final Object i7705;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7705 = true;
} else {

i7705 = false;

}
i7706 = i7705;
} else {

i7706 = false;

}
final Object i7707;
if ((boolean)i7706) {

i7707 = true;
} else {

i7707 = false;

}
i7708 = i7707;
} else {

i7708 = false;

}
final Object i8403;
if ((boolean)i7708) {
final Object f7710 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg07709 = f7710;
final Object f7712 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg17711 = f7712;


















final Object f7713 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg07709, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg17711, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(arg07709, new Cons(arg17711, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);



i8403 = f7713;
} else {


final Object i7719;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7717;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)v7243).head)) {



final Object i7715;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7714;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7714 = true;
} else {

i7714 = false;

}
i7715 = i7714;
} else {

i7715 = false;

}
final Object i7716;
if ((boolean)i7715) {

i7716 = true;
} else {

i7716 = false;

}
i7717 = i7716;
} else {

i7717 = false;

}
final Object i7718;
if ((boolean)i7717) {

i7718 = true;
} else {

i7718 = false;

}
i7719 = i7718;
} else {

i7719 = false;

}
final Object i8402;
if ((boolean)i7719) {
final Object f7721 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg17720 = f7721;














final Object f7722 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg17720, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(arg17720, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8402 = f7722;
} else {


final Object i7730;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7728;
if ((boolean)Lang.equals(RuntimeContext.symbol("and"), ((Cons)v7243).head)) {



final Object i7726;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7724;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7723;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7723 = true;
} else {

i7723 = false;

}
i7724 = i7723;
} else {

i7724 = false;

}
final Object i7725;
if ((boolean)i7724) {

i7725 = true;
} else {

i7725 = false;

}
i7726 = i7725;
} else {

i7726 = false;

}
final Object i7727;
if ((boolean)i7726) {

i7727 = true;
} else {

i7727 = false;

}
i7728 = i7727;
} else {

i7728 = false;

}
final Object i7729;
if ((boolean)i7728) {

i7729 = true;
} else {

i7729 = false;

}
i7730 = i7729;
} else {

i7730 = false;

}
final Object i8401;
if ((boolean)i7730) {





















final Object f7731 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)((Cons)v7243).tail).tail).head, new Cons(true, new Cons(false, Nil.NIL)))), new Cons(false, Nil.NIL)))), RuntimeContext.symbol("boolean"), v7245);

i8401 = f7731;
} else {


final Object i7735;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7733;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), ((Cons)v7243).head)) {


final Object i7732;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7732 = true;
} else {

i7732 = false;

}
i7733 = i7732;
} else {

i7733 = false;

}
final Object i7734;
if ((boolean)i7733) {

i7734 = true;
} else {

i7734 = false;

}
i7735 = i7734;
} else {

i7735 = false;

}
final Object i8400;
if ((boolean)i7735) {
final Object f7737 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg07736 = f7737;
final Object f7739 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg17738 = f7739;


















final Object f7740 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg07736, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg17738, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(arg07736, new Cons(arg17738, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);



i8400 = f7740;
} else {


final Object i7746;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7744;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), ((Cons)v7243).head)) {



final Object i7742;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7741;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7741 = true;
} else {

i7741 = false;

}
i7742 = i7741;
} else {

i7742 = false;

}
final Object i7743;
if ((boolean)i7742) {

i7743 = true;
} else {

i7743 = false;

}
i7744 = i7743;
} else {

i7744 = false;

}
final Object i7745;
if ((boolean)i7744) {

i7745 = true;
} else {

i7745 = false;

}
i7746 = i7745;
} else {

i7746 = false;

}
final Object i8399;
if ((boolean)i7746) {
final Object f7748 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object arg17747 = f7748;














final Object f7749 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg17747, new Cons(new Cons(RuntimeContext.symbol("and"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(arg17747, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8399 = f7749;
} else {


final Object i7757;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7755;
if ((boolean)Lang.equals(RuntimeContext.symbol("or"), ((Cons)v7243).head)) {



final Object i7753;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7751;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7750;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7750 = true;
} else {

i7750 = false;

}
i7751 = i7750;
} else {

i7751 = false;

}
final Object i7752;
if ((boolean)i7751) {

i7752 = true;
} else {

i7752 = false;

}
i7753 = i7752;
} else {

i7753 = false;

}
final Object i7754;
if ((boolean)i7753) {

i7754 = true;
} else {

i7754 = false;

}
i7755 = i7754;
} else {

i7755 = false;

}
final Object i7756;
if ((boolean)i7755) {

i7756 = true;
} else {

i7756 = false;

}
i7757 = i7756;
} else {

i7757 = false;

}
final Object i8398;
if ((boolean)i7757) {





















final Object f7758 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(true, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)((Cons)((Cons)v7243).tail).tail).head, new Cons(true, new Cons(false, Nil.NIL)))), Nil.NIL)))), RuntimeContext.symbol("boolean"), v7245);

i8398 = f7758;
} else {


final Object i7762;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7760;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), ((Cons)v7243).head)) {


final Object i7759;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7759 = true;
} else {

i7759 = false;

}
i7760 = i7759;
} else {

i7760 = false;

}
final Object i7761;
if ((boolean)i7760) {

i7761 = true;
} else {

i7761 = false;

}
i7762 = i7761;
} else {

i7762 = false;

}
final Object i8397;
if ((boolean)i7762) {
final Object f7764 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object name7763 = f7764;
final Object f7766 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object value7765 = f7766;


















final Object f7767 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(name7763, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(value7765, new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(name7763, new Cons(value7765, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);



i8397 = f7767;
} else {


final Object i7773;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7771;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), ((Cons)v7243).head)) {



final Object i7769;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7768;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7768 = true;
} else {

i7768 = false;

}
i7769 = i7768;
} else {

i7769 = false;

}
final Object i7770;
if ((boolean)i7769) {

i7770 = true;
} else {

i7770 = false;

}
i7771 = i7770;
} else {

i7771 = false;

}
final Object i7772;
if ((boolean)i7771) {

i7772 = true;
} else {

i7772 = false;

}
i7773 = i7772;
} else {

i7773 = false;

}
final Object i8396;
if ((boolean)i7773) {
final Object f7775 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object value7774 = f7775;














final Object f7776 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(value7774, new Cons(new Cons(RuntimeContext.symbol("set"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(value7774, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8396 = f7776;
} else {


final Object i7784;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7782;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), ((Cons)v7243).head)) {



final Object i7780;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7778;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7777;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7777 = true;
} else {

i7777 = false;

}
i7778 = i7777;
} else {

i7778 = false;

}
final Object i7779;
if ((boolean)i7778) {

i7779 = true;
} else {

i7779 = false;

}
i7780 = i7779;
} else {

i7780 = false;

}
final Object i7781;
if ((boolean)i7780) {

i7781 = true;
} else {

i7781 = false;

}
i7782 = i7781;
} else {

i7782 = false;

}
final Object i7783;
if ((boolean)i7782) {

i7783 = true;
} else {

i7783 = false;

}
i7784 = i7783;
} else {

i7784 = false;

}
final Object i8395;
if ((boolean)i7784) {


final Object f7786 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245);

final Object nameTOxDO7785 = f7786;



final Object f7788 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, v7244, v7245);

final Object valueTOxDO7787 = f7788;
final Object f7789 = Fst.LAMBDA.apply(valueTOxDO7787);
final Object f7790 = Fst.LAMBDA.apply(nameTOxDO7785);
final Object f7791 = Second.LAMBDA.apply(nameTOxDO7785);
final Object f7792 = Second.LAMBDA.apply(valueTOxDO7787);
final Object f7793 = Atp.LAMBDA.apply(f7792, Nil.NIL);
final Object f7794 = Atp.LAMBDA.apply(f7791, f7793);
final Object f7795 = Atp.LAMBDA.apply(f7790, f7794);
final Object f7796 = Atp.LAMBDA.apply(f7789, f7795);
final Object f7797 = IntmakeString.LAMBDA.apply("~A~%~A~%RuntimeContext.globalProperties.put((Symbol)~A, ~A);", f7796);
final Object f7798 = Second.LAMBDA.apply(valueTOxDO7787);
final Object f7799 = Third.LAMBDA.apply(valueTOxDO7787);
final Object f7800 = Atp.LAMBDA.apply(f7798, f7799);
final Object f7801 = Atp.LAMBDA.apply(f7797, f7800);



i8395 = f7801;
} else {


final Object i7805;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7803;
if ((boolean)Lang.equals(RuntimeContext.symbol("value"), ((Cons)v7243).head)) {


final Object i7802;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7802 = true;
} else {

i7802 = false;

}
i7803 = i7802;
} else {

i7803 = false;

}
final Object i7804;
if ((boolean)i7803) {

i7804 = true;
} else {

i7804 = false;

}
i7805 = i7804;
} else {

i7805 = false;

}
final Object i8394;
if ((boolean)i7805) {
final Object f7807 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object name7806 = f7807;










final Object f7808 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(name7806, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(name7806, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8394 = f7808;
} else {


final Object i7814;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7812;
if ((boolean)Lang.equals(RuntimeContext.symbol("value"), ((Cons)v7243).head)) {



final Object i7810;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7809;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7809 = true;
} else {

i7809 = false;

}
i7810 = i7809;
} else {

i7810 = false;

}
final Object i7811;
if ((boolean)i7810) {

i7811 = true;
} else {

i7811 = false;

}
i7812 = i7811;
} else {

i7812 = false;

}
final Object i7813;
if ((boolean)i7812) {

i7813 = true;
} else {

i7813 = false;

}
i7814 = i7813;
} else {

i7814 = false;

}
final Object i8393;
if ((boolean)i7814) {


final Object f7815 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "RuntimeContext.globalProperties.get(~A)", RuntimeContext.symbol("object"));

i8393 = f7815;
} else {


final Object i7819;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7817;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons?"), ((Cons)v7243).head)) {


final Object i7816;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7816 = true;
} else {

i7816 = false;

}
i7817 = i7816;
} else {

i7817 = false;

}
final Object i7818;
if ((boolean)i7817) {

i7818 = true;
} else {

i7818 = false;

}
i7819 = i7818;
} else {

i7819 = false;

}
final Object i8392;
if ((boolean)i7819) {
final Object f7821 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a07820 = f7821;










final Object f7822 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a07820, new Cons(new Cons(RuntimeContext.symbol("value"), new Cons(a07820, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8392 = f7822;
} else {


final Object i7828;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7826;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons?"), ((Cons)v7243).head)) {



final Object i7824;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7823;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7823 = true;
} else {

i7823 = false;

}
i7824 = i7823;
} else {

i7824 = false;

}
final Object i7825;
if ((boolean)i7824) {

i7825 = true;
} else {

i7825 = false;

}
i7826 = i7825;
} else {

i7826 = false;

}
final Object i7827;
if ((boolean)i7826) {

i7827 = true;
} else {

i7827 = false;

}
i7828 = i7827;
} else {

i7828 = false;

}
final Object i8391;
if ((boolean)i7828) {


final Object f7829 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "(~A instanceof Cons)", RuntimeContext.symbol("boolean"));

i8391 = f7829;
} else {


final Object i7833;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7831;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v7243).head)) {


final Object i7830;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7830 = true;
} else {

i7830 = false;

}
i7831 = i7830;
} else {

i7831 = false;

}
final Object i7832;
if ((boolean)i7831) {

i7832 = true;
} else {

i7832 = false;

}
i7833 = i7832;
} else {

i7833 = false;

}
final Object i8390;
if ((boolean)i7833) {
final Object f7835 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a07834 = f7835;
final Object f7837 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a17836 = f7837;


















final Object f7838 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a07834, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(a17836, new Cons(new Cons(RuntimeContext.symbol("cons"), new Cons(a07834, new Cons(a17836, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);



i8390 = f7838;
} else {


final Object i7844;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7842;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v7243).head)) {



final Object i7840;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7839;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7839 = true;
} else {

i7839 = false;

}
i7840 = i7839;
} else {

i7840 = false;

}
final Object i7841;
if ((boolean)i7840) {

i7841 = true;
} else {

i7841 = false;

}
i7842 = i7841;
} else {

i7842 = false;

}
final Object i7843;
if ((boolean)i7842) {

i7843 = true;
} else {

i7843 = false;

}
i7844 = i7843;
} else {

i7844 = false;

}
final Object i8389;
if ((boolean)i7844) {
final Object f7846 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a17845 = f7846;














final Object f7847 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a17845, new Cons(new Cons(RuntimeContext.symbol("cons"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(a17845, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8389 = f7847;
} else {


final Object i7855;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7853;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v7243).head)) {



final Object i7851;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7849;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7848;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7848 = true;
} else {

i7848 = false;

}
i7849 = i7848;
} else {

i7849 = false;

}
final Object i7850;
if ((boolean)i7849) {

i7850 = true;
} else {

i7850 = false;

}
i7851 = i7850;
} else {

i7851 = false;

}
final Object i7852;
if ((boolean)i7851) {

i7852 = true;
} else {

i7852 = false;

}
i7853 = i7852;
} else {

i7853 = false;

}
final Object i7854;
if ((boolean)i7853) {

i7854 = true;
} else {

i7854 = false;

}
i7855 = i7854;
} else {

i7855 = false;

}
final Object i8388;
if ((boolean)i7855) {





final Object f7856 = TwoParams.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, ((Cons)((Cons)((Cons)v7243).tail).tail).head, v7244, v7245, "new Cons(~A, ~A)", RuntimeContext.symbol("cons"));

i8388 = f7856;
} else {


final Object i7860;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7858;
if ((boolean)Lang.equals(RuntimeContext.symbol("hd"), ((Cons)v7243).head)) {


final Object i7857;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7857 = true;
} else {

i7857 = false;

}
i7858 = i7857;
} else {

i7858 = false;

}
final Object i7859;
if ((boolean)i7858) {

i7859 = true;
} else {

i7859 = false;

}
i7860 = i7859;
} else {

i7860 = false;

}
final Object i8387;
if ((boolean)i7860) {
final Object f7862 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a07861 = f7862;










final Object f7863 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a07861, new Cons(new Cons(RuntimeContext.symbol("hd"), new Cons(a07861, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8387 = f7863;
} else {


final Object i7869;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7867;
if ((boolean)Lang.equals(RuntimeContext.symbol("hd"), ((Cons)v7243).head)) {



final Object i7865;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7864;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7864 = true;
} else {

i7864 = false;

}
i7865 = i7864;
} else {

i7865 = false;

}
final Object i7866;
if ((boolean)i7865) {

i7866 = true;
} else {

i7866 = false;

}
i7867 = i7866;
} else {

i7867 = false;

}
final Object i7868;
if ((boolean)i7867) {

i7868 = true;
} else {

i7868 = false;

}
i7869 = i7868;
} else {

i7869 = false;

}
final Object i8386;
if ((boolean)i7869) {


final Object f7870 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "((Cons)~A).head", RuntimeContext.symbol("object"));

i8386 = f7870;
} else {


final Object i7874;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7872;
if ((boolean)Lang.equals(RuntimeContext.symbol("tl"), ((Cons)v7243).head)) {


final Object i7871;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7871 = true;
} else {

i7871 = false;

}
i7872 = i7871;
} else {

i7872 = false;

}
final Object i7873;
if ((boolean)i7872) {

i7873 = true;
} else {

i7873 = false;

}
i7874 = i7873;
} else {

i7874 = false;

}
final Object i8385;
if ((boolean)i7874) {
final Object f7876 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a07875 = f7876;










final Object f7877 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a07875, new Cons(new Cons(RuntimeContext.symbol("tl"), new Cons(a07875, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8385 = f7877;
} else {


final Object i7883;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7881;
if ((boolean)Lang.equals(RuntimeContext.symbol("tl"), ((Cons)v7243).head)) {



final Object i7879;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7878;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7878 = true;
} else {

i7878 = false;

}
i7879 = i7878;
} else {

i7879 = false;

}
final Object i7880;
if ((boolean)i7879) {

i7880 = true;
} else {

i7880 = false;

}
i7881 = i7880;
} else {

i7881 = false;

}
final Object i7882;
if ((boolean)i7881) {

i7882 = true;
} else {

i7882 = false;

}
i7883 = i7882;
} else {

i7883 = false;

}
final Object i8384;
if ((boolean)i7883) {


final Object f7884 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "((Cons)~A).tail", RuntimeContext.symbol("object"));

i8384 = f7884;
} else {


final Object i7888;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7886;
if ((boolean)Lang.equals(RuntimeContext.symbol("freeze"), ((Cons)v7243).head)) {


final Object i7885;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7885 = true;
} else {

i7885 = false;

}
i7886 = i7885;
} else {

i7886 = false;

}
final Object i7887;
if ((boolean)i7886) {

i7887 = true;
} else {

i7887 = false;

}
i7888 = i7887;
} else {

i7888 = false;

}
final Object i8383;
if ((boolean)i7888) {
final Object f7890 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object expression7889 = f7890;










final Object f7891 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(expression7889, new Cons(new Cons(RuntimeContext.symbol("freeze"), new Cons(expression7889, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8383 = f7891;
} else {


final Object i7897;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7895;
if ((boolean)Lang.equals(RuntimeContext.symbol("freeze"), ((Cons)v7243).head)) {



final Object i7893;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7892;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7892 = true;
} else {

i7892 = false;

}
i7893 = i7892;
} else {

i7893 = false;

}
final Object i7894;
if ((boolean)i7893) {

i7894 = true;
} else {

i7894 = false;

}
i7895 = i7894;
} else {

i7895 = false;

}
final Object i7896;
if ((boolean)i7895) {

i7896 = true;
} else {

i7896 = false;

}
i7897 = i7896;
} else {

i7897 = false;

}
final Object i8382;
if ((boolean)i7897) {





final Object f7898 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(Nil.NIL, ((Cons)v7243).tail)), RuntimeContext.symbol("lambda"), v7245);

i8382 = f7898;
} else {


final Object i7902;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7900;
if ((boolean)Lang.equals(RuntimeContext.symbol("eval-kl"), ((Cons)v7243).head)) {


final Object i7899;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7899 = true;
} else {

i7899 = false;

}
i7900 = i7899;
} else {

i7900 = false;

}
final Object i7901;
if ((boolean)i7900) {

i7901 = true;
} else {

i7901 = false;

}
i7902 = i7901;
} else {

i7902 = false;

}
final Object i8381;
if ((boolean)i7902) {
final Object f7904 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object expression7903 = f7904;










final Object f7905 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(expression7903, new Cons(new Cons(RuntimeContext.symbol("eval-kl"), new Cons(expression7903, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8381 = f7905;
} else {


final Object i7911;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7909;
if ((boolean)Lang.equals(RuntimeContext.symbol("eval-kl"), ((Cons)v7243).head)) {



final Object i7907;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7906;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7906 = true;
} else {

i7906 = false;

}
i7907 = i7906;
} else {

i7907 = false;

}
final Object i7908;
if ((boolean)i7907) {

i7908 = true;
} else {

i7908 = false;

}
i7909 = i7908;
} else {

i7909 = false;

}
final Object i7910;
if ((boolean)i7909) {

i7910 = true;
} else {

i7910 = false;

}
i7911 = i7910;
} else {

i7911 = false;

}
final Object i8380;
if ((boolean)i7911) {


final Object f7912 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "RuntimeContext.evalKl(~A)", RuntimeContext.symbol("object"));

i8380 = f7912;
} else {


final Object i7916;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7914;
if ((boolean)Lang.equals(RuntimeContext.symbol("number?"), ((Cons)v7243).head)) {


final Object i7913;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7913 = true;
} else {

i7913 = false;

}
i7914 = i7913;
} else {

i7914 = false;

}
final Object i7915;
if ((boolean)i7914) {

i7915 = true;
} else {

i7915 = false;

}
i7916 = i7915;
} else {

i7916 = false;

}
final Object i8379;
if ((boolean)i7916) {
final Object f7918 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a07917 = f7918;










final Object f7919 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a07917, new Cons(new Cons(RuntimeContext.symbol("number?"), new Cons(a07917, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8379 = f7919;
} else {


final Object i7925;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7923;
if ((boolean)Lang.equals(RuntimeContext.symbol("number?"), ((Cons)v7243).head)) {



final Object i7921;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7920;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7920 = true;
} else {

i7920 = false;

}
i7921 = i7920;
} else {

i7921 = false;

}
final Object i7922;
if ((boolean)i7921) {

i7922 = true;
} else {

i7922 = false;

}
i7923 = i7922;
} else {

i7923 = false;

}
final Object i7924;
if ((boolean)i7923) {

i7924 = true;
} else {

i7924 = false;

}
i7925 = i7924;
} else {

i7925 = false;

}
final Object i8378;
if ((boolean)i7925) {


final Object f7927 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("object"), v7245);

final Object a0TOxDO7926 = f7927;
final Object f7928 = Fst.LAMBDA.apply(a0TOxDO7926);
final Object f7929 = Atp.LAMBDA.apply(f7928, Nil.NIL);
final Object f7930 = IntmakeString.LAMBDA.apply("~A~%", f7929);
final Object f7931 = Third.LAMBDA.apply(a0TOxDO7926);

final Object i7934;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), f7931)) {


final Object f7932 = FindFirstQ.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7245);


final Object i7933;
if ((boolean)!((boolean)f7932)) {

i7933 = true;
} else {

i7933 = false;

}
i7934 = i7933;
} else {

i7934 = false;

}
final Object i7944;
if ((boolean)i7934) {

i7944 = "false";
} else {
final Object f7935 = Third.LAMBDA.apply(a0TOxDO7926);

final Object i7943;
if ((boolean)Lang.equals(RuntimeContext.symbol("string"), f7935)) {

i7943 = "false";
} else {
final Object f7936 = Third.LAMBDA.apply(a0TOxDO7926);
final Object f7937 = NumericTypeQ.LAMBDA.apply(f7936);

final Object i7942;
if ((boolean)f7937) {

i7942 = "true";
} else {

final Object i7941;
if ((boolean)true) {
final Object f7938 = Second.LAMBDA.apply(a0TOxDO7926);
final Object f7939 = Atp.LAMBDA.apply(f7938, Nil.NIL);
final Object f7940 = IntmakeString.LAMBDA.apply("(~A instanceof Number)", f7939);

i7941 = f7940;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7942 = i7941;

}
i7943 = i7942;

}
i7944 = i7943;

}final Object f7945 = Atp.LAMBDA.apply(i7944, RuntimeContext.symbol("boolean"));
final Object f7946 = Atp.LAMBDA.apply(f7930, f7945);


i8378 = f7946;
} else {


final Object i7949;
if ((boolean)(v7243 instanceof Cons)) {









final Object f7947 = ElementQ.LAMBDA.apply(((Cons)v7243).head, new Cons(RuntimeContext.symbol("+"), new Cons(RuntimeContext.symbol("-"), new Cons(RuntimeContext.symbol("*"), new Cons(RuntimeContext.symbol("/"), Nil.NIL)))));

final Object i7948;
if ((boolean)f7947) {

i7948 = true;
} else {

i7948 = false;

}
i7949 = i7948;
} else {

i7949 = false;

}
final Object i8377;
if ((boolean)i7949) {


final Object f7950 = Arithmetic.LAMBDA.apply(((Cons)v7243).head, ((Cons)v7243).tail, v7245);

i8377 = f7950;
} else {


final Object i7953;
if ((boolean)(v7243 instanceof Cons)) {









final Object f7951 = ElementQ.LAMBDA.apply(((Cons)v7243).head, new Cons(RuntimeContext.symbol("<"), new Cons(RuntimeContext.symbol(">"), new Cons(RuntimeContext.symbol("<="), new Cons(RuntimeContext.symbol(">="), Nil.NIL)))));

final Object i7952;
if ((boolean)f7951) {

i7952 = true;
} else {

i7952 = false;

}
i7953 = i7952;
} else {

i7953 = false;

}
final Object i8376;
if ((boolean)i7953) {


final Object f7954 = Comparison.LAMBDA.apply(((Cons)v7243).head, ((Cons)v7243).tail, v7245);

i8376 = f7954;
} else {


final Object i7958;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7956;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v7243).head)) {


final Object i7955;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i7955 = true;
} else {

i7955 = false;

}
i7956 = i7955;
} else {

i7956 = false;

}
final Object i7957;
if ((boolean)i7956) {

i7957 = true;
} else {

i7957 = false;

}
i7958 = i7957;
} else {

i7958 = false;

}
final Object i8375;
if ((boolean)i7958) {
final Object f7960 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a07959 = f7960;
final Object f7962 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a17961 = f7962;


















final Object f7963 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a07959, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(a17961, new Cons(new Cons(RuntimeContext.symbol("="), new Cons(a07959, new Cons(a17961, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);



i8375 = f7963;
} else {


final Object i7969;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7967;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v7243).head)) {



final Object i7965;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i7964;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i7964 = true;
} else {

i7964 = false;

}
i7965 = i7964;
} else {

i7965 = false;

}
final Object i7966;
if ((boolean)i7965) {

i7966 = true;
} else {

i7966 = false;

}
i7967 = i7966;
} else {

i7967 = false;

}
final Object i7968;
if ((boolean)i7967) {

i7968 = true;
} else {

i7968 = false;

}
i7969 = i7968;
} else {

i7969 = false;

}
final Object i8374;
if ((boolean)i7969) {
final Object f7971 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a17970 = f7971;














final Object f7972 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a17970, new Cons(new Cons(RuntimeContext.symbol("="), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(a17970, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8374 = f7972;
} else {


final Object i7980;
if ((boolean)(v7243 instanceof Cons)) {


final Object i7978;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v7243).head)) {



final Object i7976;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i7974;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i7973;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i7973 = true;
} else {

i7973 = false;

}
i7974 = i7973;
} else {

i7974 = false;

}
final Object i7975;
if ((boolean)i7974) {

i7975 = true;
} else {

i7975 = false;

}
i7976 = i7975;
} else {

i7976 = false;

}
final Object i7977;
if ((boolean)i7976) {

i7977 = true;
} else {

i7977 = false;

}
i7978 = i7977;
} else {

i7978 = false;

}
final Object i7979;
if ((boolean)i7978) {

i7979 = true;
} else {

i7979 = false;

}
i7980 = i7979;
} else {

i7980 = false;

}
final Object i8373;
if ((boolean)i7980) {

final Object i7982;
if ((boolean)Lang.equals(v7244, RuntimeContext.symbol("boolean"))) {

i7982 = true;
} else {

final Object i7981;
if ((boolean)Lang.equals(v7244, RuntimeContext.symbol("object"))) {

i7981 = true;
} else {

i7981 = false;

}
i7982 = i7981;

}
final Object i8007;
if ((boolean)i7982) {


final Object f7984 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("object"), v7245);

final Object pX07983 = f7984;



final Object f7986 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("object"), v7245);

final Object pX17985 = f7986;
final Object f7987 = Fst.LAMBDA.apply(pX07983);
final Object f7988 = Fst.LAMBDA.apply(pX17985);
final Object f7989 = Ats.LAMBDA.apply(f7987, f7988);
final Object f7990 = Third.LAMBDA.apply(pX07983);
final Object f7991 = PrimitiveTypeQ.LAMBDA.apply(f7990);

final Object i8002;
if ((boolean)f7991) {
final Object f7992 = Second.LAMBDA.apply(pX07983);
final Object f7993 = Second.LAMBDA.apply(pX17985);
final Object f7994 = Atp.LAMBDA.apply(f7993, Nil.NIL);
final Object f7995 = Atp.LAMBDA.apply(f7992, f7994);
final Object f7996 = IntmakeString.LAMBDA.apply("Lang.equals(~A, ~A)", f7995);

i8002 = f7996;
} else {
final Object f7997 = Second.LAMBDA.apply(pX07983);
final Object f7998 = Second.LAMBDA.apply(pX17985);
final Object f7999 = Atp.LAMBDA.apply(f7998, Nil.NIL);
final Object f8000 = Atp.LAMBDA.apply(f7997, f7999);
final Object f8001 = IntmakeString.LAMBDA.apply("Lang.equals(~A, ~A)", f8000);

i8002 = f8001;

}final Object f8003 = Atp.LAMBDA.apply(i8002, RuntimeContext.symbol("boolean"));
final Object f8004 = Atp.LAMBDA.apply(f7989, f8003);



i8007 = f8004;
} else {
final Object f8005 = Atp.LAMBDA.apply(v7244, Nil.NIL);
final Object f8006 = IntmakeString.LAMBDA.apply("Expected boolean type assertion for = operator, but was ~A", f8005);

throw new SimpleError((String)f8006);


}
i8373 = i8007;
} else {


final Object i8011;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8009;
if ((boolean)Lang.equals(RuntimeContext.symbol("string?"), ((Cons)v7243).head)) {


final Object i8008;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8008 = true;
} else {

i8008 = false;

}
i8009 = i8008;
} else {

i8009 = false;

}
final Object i8010;
if ((boolean)i8009) {

i8010 = true;
} else {

i8010 = false;

}
i8011 = i8010;
} else {

i8011 = false;

}
final Object i8372;
if ((boolean)i8011) {
final Object f8013 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object a08012 = f8013;










final Object f8014 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(a08012, new Cons(new Cons(RuntimeContext.symbol("string?"), new Cons(a08012, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8372 = f8014;
} else {


final Object i8020;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8018;
if ((boolean)Lang.equals(RuntimeContext.symbol("string?"), ((Cons)v7243).head)) {



final Object i8016;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8015;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8015 = true;
} else {

i8015 = false;

}
i8016 = i8015;
} else {

i8016 = false;

}
final Object i8017;
if ((boolean)i8016) {

i8017 = true;
} else {

i8017 = false;

}
i8018 = i8017;
} else {

i8018 = false;

}
final Object i8019;
if ((boolean)i8018) {

i8019 = true;
} else {

i8019 = false;

}
i8020 = i8019;
} else {

i8020 = false;

}
final Object i8371;
if ((boolean)i8020) {


final Object f8022 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("string"), v7245);

final Object a0TOxDO8021 = f8022;
final Object f8023 = Fst.LAMBDA.apply(a0TOxDO8021);
final Object f8024 = Atp.LAMBDA.apply(f8023, Nil.NIL);
final Object f8025 = IntmakeString.LAMBDA.apply("~A~%", f8024);
final Object f8026 = Second.LAMBDA.apply(a0TOxDO8021);
final Object f8027 = Atp.LAMBDA.apply(f8026, Nil.NIL);
final Object f8028 = IntmakeString.LAMBDA.apply("(~A instanceof String)", f8027);
final Object f8029 = Atp.LAMBDA.apply(f8028, RuntimeContext.symbol("boolean"));
final Object f8030 = Atp.LAMBDA.apply(f8025, f8029);


i8371 = f8030;
} else {


final Object i8034;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8032;
if ((boolean)Lang.equals(RuntimeContext.symbol("tlstr"), ((Cons)v7243).head)) {


final Object i8031;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8031 = true;
} else {

i8031 = false;

}
i8032 = i8031;
} else {

i8032 = false;

}
final Object i8033;
if ((boolean)i8032) {

i8033 = true;
} else {

i8033 = false;

}
i8034 = i8033;
} else {

i8034 = false;

}
final Object i8370;
if ((boolean)i8034) {
final Object f8036 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string8035 = f8036;




final Object f8037 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("tlstr"), new Cons(string8035, Nil.NIL)), RuntimeContext.symbol("string"), v7245);


i8370 = f8037;
} else {


final Object i8043;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8041;
if ((boolean)Lang.equals(RuntimeContext.symbol("tlstr"), ((Cons)v7243).head)) {



final Object i8039;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8038;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8038 = true;
} else {

i8038 = false;

}
i8039 = i8038;
} else {

i8039 = false;

}
final Object i8040;
if ((boolean)i8039) {

i8040 = true;
} else {

i8040 = false;

}
i8041 = i8040;
} else {

i8041 = false;

}
final Object i8042;
if ((boolean)i8041) {

i8042 = true;
} else {

i8042 = false;

}
i8043 = i8042;
} else {

i8043 = false;

}
final Object i8369;
if ((boolean)i8043) {


final Object f8045 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("string"), v7245);

final Object stringTOxDO8044 = f8045;
final Object f8046 = Fst.LAMBDA.apply(stringTOxDO8044);
final Object f8047 = Atp.LAMBDA.apply(f8046, Nil.NIL);
final Object f8048 = IntmakeString.LAMBDA.apply("~A~%", f8047);
final Object f8049 = Second.LAMBDA.apply(stringTOxDO8044);
final Object f8050 = Atp.LAMBDA.apply(f8049, Nil.NIL);
final Object f8051 = IntmakeString.LAMBDA.apply("((String)~A).substring(1)", f8050);
final Object f8052 = Atp.LAMBDA.apply(f8051, RuntimeContext.symbol("string"));
final Object f8053 = Atp.LAMBDA.apply(f8048, f8052);


i8369 = f8053;
} else {


final Object i8057;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8055;
if ((boolean)Lang.equals(RuntimeContext.symbol("pos"), ((Cons)v7243).head)) {


final Object i8054;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8054 = true;
} else {

i8054 = false;

}
i8055 = i8054;
} else {

i8055 = false;

}
final Object i8056;
if ((boolean)i8055) {

i8056 = true;
} else {

i8056 = false;

}
i8057 = i8056;
} else {

i8057 = false;

}
final Object i8368;
if ((boolean)i8057) {
final Object f8059 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string8058 = f8059;
final Object f8061 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object position8060 = f8061;






final Object f8062 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("pos"), new Cons(string8058, new Cons(position8060, Nil.NIL))), RuntimeContext.symbol("boolean"), v7245);



i8368 = f8062;
} else {


final Object i8068;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8066;
if ((boolean)Lang.equals(RuntimeContext.symbol("pos"), ((Cons)v7243).head)) {



final Object i8064;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8063;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8063 = true;
} else {

i8063 = false;

}
i8064 = i8063;
} else {

i8064 = false;

}
final Object i8065;
if ((boolean)i8064) {

i8065 = true;
} else {

i8065 = false;

}
i8066 = i8065;
} else {

i8066 = false;

}
final Object i8067;
if ((boolean)i8066) {

i8067 = true;
} else {

i8067 = false;

}
i8068 = i8067;
} else {

i8068 = false;

}
final Object i8367;
if ((boolean)i8068) {
final Object f8070 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object position8069 = f8070;








final Object f8071 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("pos"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(position8069, Nil.NIL))), RuntimeContext.symbol("boolean"), v7245);


i8367 = f8071;
} else {


final Object i8079;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8077;
if ((boolean)Lang.equals(RuntimeContext.symbol("pos"), ((Cons)v7243).head)) {



final Object i8075;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i8073;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i8072;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i8072 = true;
} else {

i8072 = false;

}
i8073 = i8072;
} else {

i8073 = false;

}
final Object i8074;
if ((boolean)i8073) {

i8074 = true;
} else {

i8074 = false;

}
i8075 = i8074;
} else {

i8075 = false;

}
final Object i8076;
if ((boolean)i8075) {

i8076 = true;
} else {

i8076 = false;

}
i8077 = i8076;
} else {

i8077 = false;

}
final Object i8078;
if ((boolean)i8077) {

i8078 = true;
} else {

i8078 = false;

}
i8079 = i8078;
} else {

i8079 = false;

}
final Object i8366;
if ((boolean)i8079) {


final Object f8081 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("string"), v7245);

final Object stringTOxDO8080 = f8081;



final Object f8083 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("number"), v7245);

final Object positionTOxDO8082 = f8083;
final Object f8084 = Fst.LAMBDA.apply(stringTOxDO8080);
final Object f8085 = Fst.LAMBDA.apply(positionTOxDO8082);
final Object f8086 = Atp.LAMBDA.apply(f8085, Nil.NIL);
final Object f8087 = Atp.LAMBDA.apply(f8084, f8086);
final Object f8088 = IntmakeString.LAMBDA.apply("~A~%~A~%", f8087);
final Object f8089 = Second.LAMBDA.apply(stringTOxDO8080);
final Object f8090 = Second.LAMBDA.apply(positionTOxDO8082);
final Object f8091 = Second.LAMBDA.apply(positionTOxDO8082);
final Object f8092 = Atp.LAMBDA.apply(f8091, Nil.NIL);
final Object f8093 = Atp.LAMBDA.apply(f8090, f8092);
final Object f8094 = Atp.LAMBDA.apply(f8089, f8093);
final Object f8095 = IntmakeString.LAMBDA.apply("((String)~A).substring(((Number)~A).intValue(), ((Number)~A).intValue()+1)", f8094);
final Object f8096 = Atp.LAMBDA.apply(f8095, RuntimeContext.symbol("string"));
final Object f8097 = Atp.LAMBDA.apply(f8088, f8096);



i8366 = f8097;
} else {


final Object i8101;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8099;
if ((boolean)Lang.equals(RuntimeContext.symbol("cn"), ((Cons)v7243).head)) {


final Object i8098;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8098 = true;
} else {

i8098 = false;

}
i8099 = i8098;
} else {

i8099 = false;

}
final Object i8100;
if ((boolean)i8099) {

i8100 = true;
} else {

i8100 = false;

}
i8101 = i8100;
} else {

i8101 = false;

}
final Object i8365;
if ((boolean)i8101) {
final Object f8103 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string08102 = f8103;
final Object f8105 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string18104 = f8105;


















final Object f8106 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(string08102, new Cons(new Cons(RuntimeContext.symbol("lambda"), new Cons(string18104, new Cons(new Cons(RuntimeContext.symbol("cn"), new Cons(string08102, new Cons(string18104, Nil.NIL))), Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);



i8365 = f8106;
} else {


final Object i8112;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8110;
if ((boolean)Lang.equals(RuntimeContext.symbol("cn"), ((Cons)v7243).head)) {



final Object i8108;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8107;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8107 = true;
} else {

i8107 = false;

}
i8108 = i8107;
} else {

i8108 = false;

}
final Object i8109;
if ((boolean)i8108) {

i8109 = true;
} else {

i8109 = false;

}
i8110 = i8109;
} else {

i8110 = false;

}
final Object i8111;
if ((boolean)i8110) {

i8111 = true;
} else {

i8111 = false;

}
i8112 = i8111;
} else {

i8112 = false;

}
final Object i8364;
if ((boolean)i8112) {
final Object f8114 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string18113 = f8114;














final Object f8115 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(string18113, new Cons(new Cons(RuntimeContext.symbol("cn"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(string18113, Nil.NIL))), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8364 = f8115;
} else {


final Object i8123;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8121;
if ((boolean)Lang.equals(RuntimeContext.symbol("cn"), ((Cons)v7243).head)) {



final Object i8119;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i8117;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i8116;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i8116 = true;
} else {

i8116 = false;

}
i8117 = i8116;
} else {

i8117 = false;

}
final Object i8118;
if ((boolean)i8117) {

i8118 = true;
} else {

i8118 = false;

}
i8119 = i8118;
} else {

i8119 = false;

}
final Object i8120;
if ((boolean)i8119) {

i8120 = true;
} else {

i8120 = false;

}
i8121 = i8120;
} else {

i8121 = false;

}
final Object i8122;
if ((boolean)i8121) {

i8122 = true;
} else {

i8122 = false;

}
i8123 = i8122;
} else {

i8123 = false;

}
final Object i8363;
if ((boolean)i8123) {





final Object f8124 = TwoParams.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, ((Cons)((Cons)((Cons)v7243).tail).tail).head, v7244, v7245, "((String)~A + (String)~A)", RuntimeContext.symbol("string"));

i8363 = f8124;
} else {


final Object i8128;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8126;
if ((boolean)Lang.equals(RuntimeContext.symbol("n->string"), ((Cons)v7243).head)) {


final Object i8125;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8125 = true;
} else {

i8125 = false;

}
i8126 = i8125;
} else {

i8126 = false;

}
final Object i8127;
if ((boolean)i8126) {

i8127 = true;
} else {

i8127 = false;

}
i8128 = i8127;
} else {

i8128 = false;

}
final Object i8362;
if ((boolean)i8128) {
final Object f8130 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object number8129 = f8130;










final Object f8131 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(number8129, new Cons(new Cons(RuntimeContext.symbol("n->string"), new Cons(number8129, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8362 = f8131;
} else {


final Object i8137;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8135;
if ((boolean)Lang.equals(RuntimeContext.symbol("n->string"), ((Cons)v7243).head)) {



final Object i8133;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8132;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8132 = true;
} else {

i8132 = false;

}
i8133 = i8132;
} else {

i8133 = false;

}
final Object i8134;
if ((boolean)i8133) {

i8134 = true;
} else {

i8134 = false;

}
i8135 = i8134;
} else {

i8135 = false;

}
final Object i8136;
if ((boolean)i8135) {

i8136 = true;
} else {

i8136 = false;

}
i8137 = i8136;
} else {

i8137 = false;

}
final Object i8361;
if ((boolean)i8137) {


final Object f8139 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("number"), v7245);

final Object numberTOxDO8138 = f8139;
final Object f8141 = Third.LAMBDA.apply(numberTOxDO8138);

final Object i8142;
if ((boolean)Lang.equals(RuntimeContext.symbol("number"), f8141)) {

i8142 = "new String(Character.toChars(((Number) (~A)).intValue()))";
} else {

i8142 = "new String(Character.toChars(((Number) (~A)).intValue()))";

}
final Object template8140 = i8142;
final Object f8143 = Fst.LAMBDA.apply(numberTOxDO8138);
final Object f8144 = Atp.LAMBDA.apply(f8143, Nil.NIL);
final Object f8145 = IntmakeString.LAMBDA.apply("~A~%", f8144);
final Object f8146 = Second.LAMBDA.apply(numberTOxDO8138);
final Object f8147 = Atp.LAMBDA.apply(f8146, Nil.NIL);
final Object f8148 = IntmakeString.LAMBDA.apply(template8140, f8147);
final Object f8149 = Atp.LAMBDA.apply(f8148, RuntimeContext.symbol("string"));
final Object f8150 = Atp.LAMBDA.apply(f8145, f8149);



i8361 = f8150;
} else {


final Object i8154;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8152;
if ((boolean)Lang.equals(RuntimeContext.symbol("string->n"), ((Cons)v7243).head)) {


final Object i8151;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8151 = true;
} else {

i8151 = false;

}
i8152 = i8151;
} else {

i8152 = false;

}
final Object i8153;
if ((boolean)i8152) {

i8153 = true;
} else {

i8153 = false;

}
i8154 = i8153;
} else {

i8154 = false;

}
final Object i8360;
if ((boolean)i8154) {
final Object f8156 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object string8155 = f8156;










final Object f8157 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(string8155, new Cons(new Cons(RuntimeContext.symbol("string->n"), new Cons(string8155, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8360 = f8157;
} else {


final Object i8163;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8161;
if ((boolean)Lang.equals(RuntimeContext.symbol("string->n"), ((Cons)v7243).head)) {



final Object i8159;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8158;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8158 = true;
} else {

i8158 = false;

}
i8159 = i8158;
} else {

i8159 = false;

}
final Object i8160;
if ((boolean)i8159) {

i8160 = true;
} else {

i8160 = false;

}
i8161 = i8160;
} else {

i8161 = false;

}
final Object i8162;
if ((boolean)i8161) {

i8162 = true;
} else {

i8162 = false;

}
i8163 = i8162;
} else {

i8163 = false;

}
final Object i8359;
if ((boolean)i8163) {


final Object f8164 = SingleParam.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, v7244, v7245, "Integer.valueOf(((String) ~A).charAt(0))", RuntimeContext.symbol("number"));

i8359 = f8164;
} else {


final Object i8168;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8166;
if ((boolean)Lang.equals(RuntimeContext.symbol("absvector"), ((Cons)v7243).head)) {


final Object i8165;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8165 = true;
} else {

i8165 = false;

}
i8166 = i8165;
} else {

i8166 = false;

}
final Object i8167;
if ((boolean)i8166) {

i8167 = true;
} else {

i8167 = false;

}
i8168 = i8167;
} else {

i8168 = false;

}
final Object i8358;
if ((boolean)i8168) {
final Object f8170 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object arg8169 = f8170;










final Object f8171 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(arg8169, new Cons(new Cons(RuntimeContext.symbol("absvector"), new Cons(arg8169, Nil.NIL)), Nil.NIL))), RuntimeContext.symbol("lambda"), v7245);


i8358 = f8171;
} else {


final Object i8177;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8175;
if ((boolean)Lang.equals(RuntimeContext.symbol("absvector"), ((Cons)v7243).head)) {



final Object i8173;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8172;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8172 = true;
} else {

i8172 = false;

}
i8173 = i8172;
} else {

i8173 = false;

}
final Object i8174;
if ((boolean)i8173) {

i8174 = true;
} else {

i8174 = false;

}
i8175 = i8174;
} else {

i8175 = false;

}
final Object i8176;
if ((boolean)i8175) {

i8176 = true;
} else {

i8176 = false;

}
i8177 = i8176;
} else {

i8177 = false;

}
final Object i8357;
if ((boolean)i8177) {


final Object f8179 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("integer"), v7245);

final Object sizeTOxDO8178 = f8179;
final Object f8181 = Gensym.LAMBDA.apply(RuntimeContext.symbol("a"));

final Object result8180 = f8181;
final Object f8182 = Fst.LAMBDA.apply(sizeTOxDO8178);
final Object f8183 = Second.LAMBDA.apply(sizeTOxDO8178);
final Object f8184 = Atp.LAMBDA.apply(f8183, Nil.NIL);
final Object f8185 = Atp.LAMBDA.apply(result8180, f8184);
final Object f8186 = Atp.LAMBDA.apply(f8182, f8185);
final Object f8187 = IntmakeString.LAMBDA.apply("~A~%final Object[] ~A = new Object[((Number)~A).intValue()];~%", f8186);

final Object f8188 = Atp.LAMBDA.apply(String.valueOf(result8180), RuntimeContext.symbol("vector"));
final Object f8189 = Atp.LAMBDA.apply(f8187, f8188);



i8357 = f8189;
} else {


final Object i8199;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8197;
if ((boolean)Lang.equals(RuntimeContext.symbol("address->"), ((Cons)v7243).head)) {



final Object i8195;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i8193;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {





final Object i8191;
if ((boolean)(((Cons)((Cons)((Cons)v7243).tail).tail).tail instanceof Cons)) {





final Object i8190;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).tail)) {

i8190 = true;
} else {

i8190 = false;

}
i8191 = i8190;
} else {

i8191 = false;

}
final Object i8192;
if ((boolean)i8191) {

i8192 = true;
} else {

i8192 = false;

}
i8193 = i8192;
} else {

i8193 = false;

}
final Object i8194;
if ((boolean)i8193) {

i8194 = true;
} else {

i8194 = false;

}
i8195 = i8194;
} else {

i8195 = false;

}
final Object i8196;
if ((boolean)i8195) {

i8196 = true;
} else {

i8196 = false;

}
i8197 = i8196;
} else {

i8197 = false;

}
final Object i8198;
if ((boolean)i8197) {

i8198 = true;
} else {

i8198 = false;

}
i8199 = i8198;
} else {

i8199 = false;

}
final Object i8356;
if ((boolean)i8199) {


final Object f8201 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, RuntimeContext.symbol("vector"), v7245);

final Object vectorTOxDO8200 = f8201;



final Object f8203 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)v7243).tail).tail).head, RuntimeContext.symbol("number"), v7245);

final Object indexTOxDO8202 = f8203;




final Object f8205 = KlToJavaTraverse.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v7243).tail).tail).tail).head, RuntimeContext.symbol("object"), v7245);

final Object valueTOxDO8204 = f8205;
final Object f8206 = Fst.LAMBDA.apply(vectorTOxDO8200);
final Object f8207 = Fst.LAMBDA.apply(indexTOxDO8202);
final Object f8208 = Fst.LAMBDA.apply(valueTOxDO8204);
final Object f8209 = Second.LAMBDA.apply(vectorTOxDO8200);
final Object f8210 = Second.LAMBDA.apply(indexTOxDO8202);
final Object f8211 = Second.LAMBDA.apply(valueTOxDO8204);
final Object f8212 = Atp.LAMBDA.apply(f8211, Nil.NIL);
final Object f8213 = Atp.LAMBDA.apply(f8210, f8212);
final Object f8214 = Atp.LAMBDA.apply(f8209, f8213);
final Object f8215 = Atp.LAMBDA.apply(f8208, f8214);
final Object f8216 = Atp.LAMBDA.apply(f8207, f8215);
final Object f8217 = Atp.LAMBDA.apply(f8206, f8216);
final Object f8218 = IntmakeString.LAMBDA.apply("~A~%~A~%~A~%((Object[])~A)[((Number)~A).intValue()] = ~A;", f8217);
final Object f8219 = Second.LAMBDA.apply(vectorTOxDO8200);
final Object f8220 = Atp.LAMBDA.apply(f8219, RuntimeContext.symbol("vector"));
final Object f8221 = Atp.LAMBDA.apply(f8218, f8220);




i8356 = f8221;
} else {


final Object i8225;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8223;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-address"), ((Cons)v7243).head)) {


final Object i8222;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8222 = true;
} else {

i8222 = false;

}
i8223 = i8222;
} else {

i8223 = false;

}
final Object i8224;
if ((boolean)i8223) {

i8224 = true;
} else {

i8224 = false;

}
i8225 = i8224;
} else {

i8225 = false;

}
final Object i8355;
if ((boolean)i8225) {
final Object f8227 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object vector8226 = f8227;
final Object f8229 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object index8228 = f8229;










final Object f8230 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(new Cons(RuntimeContext.symbol("<-address"), new Cons(vector8226, new Cons(index8228, Nil.NIL))), Nil.NIL)), RuntimeContext.symbol("lambda"), v7245);



i8355 = f8230;
} else {


final Object i8236;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8234;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-address"), ((Cons)v7243).head)) {



final Object i8232;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {



final Object i8231;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7243).tail).tail)) {

i8231 = true;
} else {

i8231 = false;

}
i8232 = i8231;
} else {

i8232 = false;

}
final Object i8233;
if ((boolean)i8232) {

i8233 = true;
} else {

i8233 = false;

}
i8234 = i8233;
} else {

i8234 = false;

}
final Object i8235;
if ((boolean)i8234) {

i8235 = true;
} else {

i8235 = false;

}
i8236 = i8235;
} else {

i8236 = false;

}
final Object i8354;
if ((boolean)i8236) {
final Object f8238 = Gensym.LAMBDA.apply(RuntimeContext.symbol("s"));

final Object index8237 = f8238;












final Object f8239 = KlToJavaTraverse.LAMBDA.apply(new Cons(RuntimeContext.symbol("lambda"), new Cons(new Cons(RuntimeContext.symbol("<-address"), new Cons(((Cons)((Cons)v7243).tail).head, new Cons(index8237, Nil.NIL))), Nil.NIL)), RuntimeContext.symbol("lambda"), v7245);


i8354 = f8239;
} else {


final Object i8247;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8245;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-address"), ((Cons)v7243).head)) {



final Object i8243;
if ((boolean)(((Cons)v7243).tail instanceof Cons)) {




final Object i8241;
if ((boolean)(((Cons)((Cons)v7243).tail).tail instanceof Cons)) {




final Object i8240;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v7243).tail).tail).tail)) {

i8240 = true;
} else {

i8240 = false;

}
i8241 = i8240;
} else {

i8241 = false;

}
final Object i8242;
if ((boolean)i8241) {

i8242 = true;
} else {

i8242 = false;

}
i8243 = i8242;
} else {

i8243 = false;

}
final Object i8244;
if ((boolean)i8243) {

i8244 = true;
} else {

i8244 = false;

}
i8245 = i8244;
} else {

i8245 = false;

}
final Object i8246;
if ((boolean)i8245) {

i8246 = true;
} else {

i8246 = false;

}
i8247 = i8246;
} else {

i8247 = false;

}
final Object i8353;
if ((boolean)i8247) {





final Object f8248 = TwoParams.LAMBDA.apply(((Cons)((Cons)v7243).tail).head, ((Cons)((Cons)((Cons)v7243).tail).tail).head, v7244, v7245, "((Object[])~A)[((Number)~A).intValue()]", RuntimeContext.symbol("object"));

i8353 = f8248;
} else {


final Object i8252;
if ((boolean)(v7243 instanceof Cons)) {


final Object i8250;
if ((boolean)Lang.equals(RuntimeContext.symbol("fail"), ((Cons)v7243).head)) {


final Object i8249;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7243).tail)) {

i8249 = true;
} else {

i8249 = false;

}
i8250 = i8249;
} else {

i8250 = false;

}
final Object i8251;
if ((boolean)i8250) {

i8251 = true;
} else {

i8251 = false;

}
i8252 = i8251;
} else {

i8252 = false;

}
final Object i8352;
if ((boolean)i8252) {
final Object f8253 = Atp.LAMBDA.apply("null", RuntimeContext.symbol("object"));
final Object f8254 = Atp.LAMBDA.apply("", f8253);

i8352 = f8254;
} else {


final Object i8351;
if ((boolean)(v7243 instanceof Cons)) {




final Object directQ8255 = !((boolean)(((Cons)v7243).head instanceof Cons));



final Object i8261;
if ((boolean)(((Cons)v7243).head instanceof Cons)) {

final Object f8257 = KlToJavaTraverse.LAMBDA.apply(((Cons)v7243).head, RuntimeContext.symbol("lambda"), v7245);

i8261 = f8257;
} else {

final Object f8258 = ToVar.LAMBDA.apply(((Cons)v7243).head);
final Object f8259 = Atp.LAMBDA.apply(f8258, RuntimeContext.symbol("symbol"));
final Object f8260 = Atp.LAMBDA.apply("", f8259);

i8261 = f8260;

}
final Object funcTOxDO8256 = i8261;
final Object f8263 = Flip3.LAMBDA.apply(RuntimeContext.symbol("kl-to-java-traverse"));
final Object f8264 = ((Lambda)f8263).apply(v7245, RuntimeContext.symbol("object"));

final Object f8265 = Map.LAMBDA.apply(f8264, ((Cons)v7243).tail);

final Object evaledArgs8262 = f8265;
final Object f8267 = Fst.LAMBDA.apply();
final Object f8268 = Map.LAMBDA.apply(f8267, evaledArgs8262);
final Object f8269 = StringJoin.LAMBDA.apply("", f8268);

final Object argsPrepString8266 = f8269;
final Object f8271 = Second.LAMBDA.apply();
final Object f8272 = Map.LAMBDA.apply(f8271, evaledArgs8262);
final Object f8273 = StringJoin.LAMBDA.apply(", ", f8272);

final Object argsString8270 = f8273;
final Object f8275 = Fst.LAMBDA.apply(funcTOxDO8256);

final Object funcPrepString8274 = f8275;
final Object f8277 = Second.LAMBDA.apply(funcTOxDO8256);

final Object funcString8276 = f8277;
final Lambda l8280 = new Lambda1() {
  public Object apply(final Object x) throws Exception {
    final Object f8279 = Third.LAMBDA.apply(x);

    return Lang.equals(RuntimeContext.symbol("unreachable"), f8279);
  }
};final Object f8281 = ListMatches.LAMBDA.apply(l8280, evaledArgs8262);

final Object unreachableQ8278 = f8281;
final Object f8283 = Gensym.LAMBDA.apply(RuntimeContext.symbol("f"));

final Object result8282 = f8283;

final Object i8314;
if ((boolean)unreachableQ8278) {

i8314 = "";
} else {

final Object f8285 = FindFirstQ.LAMBDA.apply(((Cons)v7243).head, v7245);

final Object i8313;
if ((boolean)f8285) {
final Object f8286 = Atp.LAMBDA.apply(argsString8270, Nil.NIL);
final Object f8287 = Atp.LAMBDA.apply(funcString8276, f8286);
final Object f8288 = Atp.LAMBDA.apply(result8282, f8287);
final Object f8289 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.dispatch(~A).apply(~A);~%", f8288);

i8313 = f8289;
} else {

final Object i8312;
if ((boolean)directQ8255) {


final Object f8290 = NameToClassName.LAMBDA.apply(String.valueOf(((Cons)v7243).head));
final Object f8291 = Atp.LAMBDA.apply(argsString8270, Nil.NIL);
final Object f8292 = Atp.LAMBDA.apply(f8290, f8291);
final Object f8293 = Atp.LAMBDA.apply(result8282, f8292);
final Object f8294 = IntmakeString.LAMBDA.apply("final Object ~A = ~A.LAMBDA.apply(~A);~%", f8293);

i8312 = f8294;
} else {
final Object f8295 = Third.LAMBDA.apply(funcTOxDO8256);

final Object i8311;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), f8295)) {
final Object f8296 = Atp.LAMBDA.apply(argsString8270, Nil.NIL);
final Object f8297 = Atp.LAMBDA.apply(funcString8276, f8296);
final Object f8298 = Atp.LAMBDA.apply(result8282, f8297);
final Object f8299 = IntmakeString.LAMBDA.apply("final Object ~A = ((Lambda)~A).apply(~A);~%", f8298);

i8311 = f8299;
} else {
final Object f8300 = Third.LAMBDA.apply(funcTOxDO8256);

final Object i8310;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), f8300)) {
final Object f8301 = Atp.LAMBDA.apply(argsString8270, Nil.NIL);
final Object f8302 = Atp.LAMBDA.apply(funcString8276, f8301);
final Object f8303 = Atp.LAMBDA.apply(result8282, f8302);
final Object f8304 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.symbolDispatch((Symbol)~A).apply(~A);~%", f8303);

i8310 = f8304;
} else {

final Object i8309;
if ((boolean)true) {
final Object f8305 = Atp.LAMBDA.apply(argsString8270, Nil.NIL);
final Object f8306 = Atp.LAMBDA.apply(funcString8276, f8305);
final Object f8307 = Atp.LAMBDA.apply(result8282, f8306);
final Object f8308 = IntmakeString.LAMBDA.apply("final Object ~A = RuntimeContext.dispatch(~A).apply(~A);~%", f8307);

i8309 = f8308;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8310 = i8309;

}
i8311 = i8310;

}
i8312 = i8311;

}
i8313 = i8312;

}
i8314 = i8313;

}
final Object eval8284 = i8314;
final Object f8315 = Atp.LAMBDA.apply(eval8284, Nil.NIL);
final Object f8316 = Atp.LAMBDA.apply(argsPrepString8266, f8315);
final Object f8317 = Atp.LAMBDA.apply(funcPrepString8274, f8316);
final Object f8318 = IntmakeString.LAMBDA.apply("~A~A~A", f8317);


final Object i8319;
if ((boolean)unreachableQ8278) {

i8319 = RuntimeContext.symbol("unreachable");
} else {

i8319 = v7244;

}final Object f8320 = Atp.LAMBDA.apply(String.valueOf(result8282), i8319);
final Object f8321 = Atp.LAMBDA.apply(f8318, f8320);











i8351 = f8321;
} else {

final Object i8350;
if ((boolean)Lang.equals(Nil.NIL, v7243)) {
final Object f8322 = Atp.LAMBDA.apply("Nil.NIL", RuntimeContext.symbol("nil"));
final Object f8323 = Atp.LAMBDA.apply("", f8322);

i8350 = f8323;
} else {

final Object i8349;
if ((boolean)true) {




final Object str8324 = String.valueOf(v7243);
final Object f8325 = FindFirstQ.LAMBDA.apply(v7243, v7245);

final Object i8344;
if ((boolean)f8325) {
final Object f8326 = GetSecond.LAMBDA.apply(v7243, v7245);

i8344 = f8326;
} else {
final Object f8327 = SymbolQ.LAMBDA.apply(v7243);

final Object i8343;
if ((boolean)f8327) {
final Object f8328 = Atp.LAMBDA.apply(str8324, Nil.NIL);
final Object f8329 = IntmakeString.LAMBDA.apply("RuntimeContext.symbol(\"~A\")", f8328);

i8343 = f8329;
} else {


final Object i8342;
if ((boolean)(v7243 instanceof String)) {
final Object f8330 = EscapeJavaString.LAMBDA.apply(v7243);
final Object f8331 = Ats.LAMBDA.apply(f8330, "\"");
final Object f8332 = Ats.LAMBDA.apply("\"", f8331);

i8342 = f8332;
} else {
final Object f8333 = IntegerQ.LAMBDA.apply(v7243);

final Object i8341;
if ((boolean)f8333) {
final Object f8334 = Atp.LAMBDA.apply(v7243, Nil.NIL);
final Object f8335 = IntmakeString.LAMBDA.apply("~A", f8334);

i8341 = f8335;
} else {
final Object f8336 = FloatQ.LAMBDA.apply(v7243);

final Object i8340;
if ((boolean)f8336) {
final Object f8337 = Atp.LAMBDA.apply(v7243, Nil.NIL);
final Object f8338 = IntmakeString.LAMBDA.apply("~Ad", f8337);

i8340 = f8338;
} else {

final Object i8339;
if ((boolean)true) {

i8339 = str8324;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8340 = i8339;

}
i8341 = i8340;

}
i8342 = i8341;

}
i8343 = i8342;

}
i8344 = i8343;

}
final Object f8345 = TypeOf.LAMBDA.apply(v7243);
final Object f8346 = Atp.LAMBDA.apply(i8344, f8345);
final Object f8347 = Atp.LAMBDA.apply("", f8346);
final Object f8348 = Assert.LAMBDA.apply(!((boolean)(v7243 instanceof Cons)), "Invalid input to kl-to-java-traverse. List found where atom expected.", f8347);

i8349 = f8348;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8350 = i8349;

}
i8351 = i8350;

}
i8352 = i8351;

}
i8353 = i8352;

}
i8354 = i8353;

}
i8355 = i8354;

}
i8356 = i8355;

}
i8357 = i8356;

}
i8358 = i8357;

}
i8359 = i8358;

}
i8360 = i8359;

}
i8361 = i8360;

}
i8362 = i8361;

}
i8363 = i8362;

}
i8364 = i8363;

}
i8365 = i8364;

}
i8366 = i8365;

}
i8367 = i8366;

}
i8368 = i8367;

}
i8369 = i8368;

}
i8370 = i8369;

}
i8371 = i8370;

}
i8372 = i8371;

}
i8373 = i8372;

}
i8374 = i8373;

}
i8375 = i8374;

}
i8376 = i8375;

}
i8377 = i8376;

}
i8378 = i8377;

}
i8379 = i8378;

}
i8380 = i8379;

}
i8381 = i8380;

}
i8382 = i8381;

}
i8383 = i8382;

}
i8384 = i8383;

}
i8385 = i8384;

}
i8386 = i8385;

}
i8387 = i8386;

}
i8388 = i8387;

}
i8389 = i8388;

}
i8390 = i8389;

}
i8391 = i8390;

}
i8392 = i8391;

}
i8393 = i8392;

}
i8394 = i8393;

}
i8395 = i8394;

}
i8396 = i8395;

}
i8397 = i8396;

}
i8398 = i8397;

}
i8399 = i8398;

}
i8400 = i8399;

}
i8401 = i8400;

}
i8402 = i8401;

}
i8403 = i8402;

}
i8404 = i8403;

}
i8405 = i8404;

}
i8406 = i8405;

}
i8407 = i8406;

}
i8408 = i8407;

}
i8409 = i8408;

}
i8410 = i8409;

}
i8411 = i8410;

}
i8412 = i8411;

}
i8413 = i8412;

}
i8414 = i8413;

}
i8415 = i8414;

}
i8416 = i8415;

}
i8417 = i8416;

}
i8418 = i8417;

}
i8419 = i8418;

}
i8420 = i8419;

}
i8421 = i8420;

}
i8422 = i8421;

}
i8423 = i8422;

}
    return i8423;

}
}
