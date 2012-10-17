package shen.gen;



import com.mentics.shen.*;

public class ShenAmacroruleZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<macrorule>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v545) throws Exception {
return defined(v545);
}};
public static Object defined(final Object v545) throws Exception {
final Object f4396 = ShenApatternsZ.LAMBDA.apply(v545);

final Object parse_ApatternsZ4395 = f4396;


final Object i4426;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ4395))) {
final Object f4397 = Fst.LAMBDA.apply(parse_ApatternsZ4395);


final Object i4400;
if ((boolean)(f4397 instanceof Cons)) {
final Object f4398 = Fst.LAMBDA.apply(parse_ApatternsZ4395);


final Object i4399;
if ((boolean)Lang.equals(RuntimeContext.symbol("->"), ((Cons)f4398).head)) {

i4399 = true;
} else {

i4399 = false;

}
i4400 = i4399;
} else {

i4400 = false;

}
final Object i4425;
if ((boolean)i4400) {
final Object f4402 = Fst.LAMBDA.apply(parse_ApatternsZ4395);

final Object f4403 = Snd.LAMBDA.apply(parse_ApatternsZ4395);
final Object f4404 = ShenReassemble.LAMBDA.apply(((Cons)f4402).tail, f4403);
final Object f4405 = ShenAmacroactionZ.LAMBDA.apply(f4404);

final Object parse_AmacroactionZ4401 = f4405;


final Object i4424;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacroactionZ4401))) {
final Object f4406 = Fst.LAMBDA.apply(parse_AmacroactionZ4401);


final Object i4409;
if ((boolean)(f4406 instanceof Cons)) {
final Object f4407 = Fst.LAMBDA.apply(parse_AmacroactionZ4401);


final Object i4408;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)f4407).head)) {

i4408 = true;
} else {

i4408 = false;

}
i4409 = i4408;
} else {

i4409 = false;

}
final Object i4423;
if ((boolean)i4409) {
final Object f4411 = Fst.LAMBDA.apply(parse_AmacroactionZ4401);

final Object f4412 = Snd.LAMBDA.apply(parse_AmacroactionZ4401);
final Object f4413 = ShenReassemble.LAMBDA.apply(((Cons)f4411).tail, f4412);
final Object f4414 = ShenAguardZ.LAMBDA.apply(f4413);

final Object parse_AguardZ4410 = f4414;


final Object i4422;
if ((boolean)!((boolean)Lang.equals(null, parse_AguardZ4410))) {
final Object f4415 = Fst.LAMBDA.apply(parse_AguardZ4410);
final Object f4416 = Snd.LAMBDA.apply(parse_ApatternsZ4395);

final Object f4417 = Snd.LAMBDA.apply(parse_AmacroactionZ4401);

final Object f4418 = Snd.LAMBDA.apply(parse_AguardZ4410);

final Object f4419 = Append.LAMBDA.apply(f4417, new Cons(RuntimeContext.symbol("where"), f4418));

final Object f4420 = Append.LAMBDA.apply(f4416, new Cons(RuntimeContext.symbol("->"), f4419));
final Object f4421 = ShenReassemble.LAMBDA.apply(f4415, f4420);

i4422 = f4421;
} else {

i4422 = null;

}

i4423 = i4422;
} else {

i4423 = null;

}
i4424 = i4423;
} else {

i4424 = null;

}

i4425 = i4424;
} else {

i4425 = null;

}
i4426 = i4425;
} else {

i4426 = null;

}

final Object result4394 = i4426;

final Object i4503;
if ((boolean)Lang.equals(result4394, null)) {
final Object f4429 = ShenApatternsZ.LAMBDA.apply(v545);

final Object parse_ApatternsZ4428 = f4429;


final Object i4446;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ4428))) {
final Object f4430 = Fst.LAMBDA.apply(parse_ApatternsZ4428);


final Object i4433;
if ((boolean)(f4430 instanceof Cons)) {
final Object f4431 = Fst.LAMBDA.apply(parse_ApatternsZ4428);


final Object i4432;
if ((boolean)Lang.equals(RuntimeContext.symbol("->"), ((Cons)f4431).head)) {

i4432 = true;
} else {

i4432 = false;

}
i4433 = i4432;
} else {

i4433 = false;

}
final Object i4445;
if ((boolean)i4433) {
final Object f4435 = Fst.LAMBDA.apply(parse_ApatternsZ4428);

final Object f4436 = Snd.LAMBDA.apply(parse_ApatternsZ4428);
final Object f4437 = ShenReassemble.LAMBDA.apply(((Cons)f4435).tail, f4436);
final Object f4438 = ShenAmacroactionZ.LAMBDA.apply(f4437);

final Object parse_AmacroactionZ4434 = f4438;


final Object i4444;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacroactionZ4434))) {
final Object f4439 = Fst.LAMBDA.apply(parse_AmacroactionZ4434);
final Object f4440 = Snd.LAMBDA.apply(parse_ApatternsZ4428);

final Object f4441 = Snd.LAMBDA.apply(parse_AmacroactionZ4434);

final Object f4442 = Append.LAMBDA.apply(f4440, new Cons(RuntimeContext.symbol("->"), f4441));
final Object f4443 = ShenReassemble.LAMBDA.apply(f4439, f4442);

i4444 = f4443;
} else {

i4444 = null;

}

i4445 = i4444;
} else {

i4445 = null;

}
i4446 = i4445;
} else {

i4446 = null;

}

final Object result4427 = i4446;

final Object i4502;
if ((boolean)Lang.equals(result4427, null)) {
final Object f4449 = ShenApatternsZ.LAMBDA.apply(v545);

final Object parse_ApatternsZ4448 = f4449;


final Object i4479;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ4448))) {
final Object f4450 = Fst.LAMBDA.apply(parse_ApatternsZ4448);


final Object i4453;
if ((boolean)(f4450 instanceof Cons)) {
final Object f4451 = Fst.LAMBDA.apply(parse_ApatternsZ4448);


final Object i4452;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-"), ((Cons)f4451).head)) {

i4452 = true;
} else {

i4452 = false;

}
i4453 = i4452;
} else {

i4453 = false;

}
final Object i4478;
if ((boolean)i4453) {
final Object f4455 = Fst.LAMBDA.apply(parse_ApatternsZ4448);

final Object f4456 = Snd.LAMBDA.apply(parse_ApatternsZ4448);
final Object f4457 = ShenReassemble.LAMBDA.apply(((Cons)f4455).tail, f4456);
final Object f4458 = ShenAmacroactionZ.LAMBDA.apply(f4457);

final Object parse_AmacroactionZ4454 = f4458;


final Object i4477;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacroactionZ4454))) {
final Object f4459 = Fst.LAMBDA.apply(parse_AmacroactionZ4454);


final Object i4462;
if ((boolean)(f4459 instanceof Cons)) {
final Object f4460 = Fst.LAMBDA.apply(parse_AmacroactionZ4454);


final Object i4461;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)f4460).head)) {

i4461 = true;
} else {

i4461 = false;

}
i4462 = i4461;
} else {

i4462 = false;

}
final Object i4476;
if ((boolean)i4462) {
final Object f4464 = Fst.LAMBDA.apply(parse_AmacroactionZ4454);

final Object f4465 = Snd.LAMBDA.apply(parse_AmacroactionZ4454);
final Object f4466 = ShenReassemble.LAMBDA.apply(((Cons)f4464).tail, f4465);
final Object f4467 = ShenAguardZ.LAMBDA.apply(f4466);

final Object parse_AguardZ4463 = f4467;


final Object i4475;
if ((boolean)!((boolean)Lang.equals(null, parse_AguardZ4463))) {
final Object f4468 = Fst.LAMBDA.apply(parse_AguardZ4463);
final Object f4469 = Snd.LAMBDA.apply(parse_ApatternsZ4448);

final Object f4470 = Snd.LAMBDA.apply(parse_AmacroactionZ4454);

final Object f4471 = Snd.LAMBDA.apply(parse_AguardZ4463);

final Object f4472 = Append.LAMBDA.apply(f4470, new Cons(RuntimeContext.symbol("where"), f4471));

final Object f4473 = Append.LAMBDA.apply(f4469, new Cons(RuntimeContext.symbol("<-"), f4472));
final Object f4474 = ShenReassemble.LAMBDA.apply(f4468, f4473);

i4475 = f4474;
} else {

i4475 = null;

}

i4476 = i4475;
} else {

i4476 = null;

}
i4477 = i4476;
} else {

i4477 = null;

}

i4478 = i4477;
} else {

i4478 = null;

}
i4479 = i4478;
} else {

i4479 = null;

}

final Object result4447 = i4479;

final Object i4501;
if ((boolean)Lang.equals(result4447, null)) {
final Object f4482 = ShenApatternsZ.LAMBDA.apply(v545);

final Object parse_ApatternsZ4481 = f4482;


final Object i4499;
if ((boolean)!((boolean)Lang.equals(null, parse_ApatternsZ4481))) {
final Object f4483 = Fst.LAMBDA.apply(parse_ApatternsZ4481);


final Object i4486;
if ((boolean)(f4483 instanceof Cons)) {
final Object f4484 = Fst.LAMBDA.apply(parse_ApatternsZ4481);


final Object i4485;
if ((boolean)Lang.equals(RuntimeContext.symbol("<-"), ((Cons)f4484).head)) {

i4485 = true;
} else {

i4485 = false;

}
i4486 = i4485;
} else {

i4486 = false;

}
final Object i4498;
if ((boolean)i4486) {
final Object f4488 = Fst.LAMBDA.apply(parse_ApatternsZ4481);

final Object f4489 = Snd.LAMBDA.apply(parse_ApatternsZ4481);
final Object f4490 = ShenReassemble.LAMBDA.apply(((Cons)f4488).tail, f4489);
final Object f4491 = ShenAmacroactionZ.LAMBDA.apply(f4490);

final Object parse_AmacroactionZ4487 = f4491;


final Object i4497;
if ((boolean)!((boolean)Lang.equals(null, parse_AmacroactionZ4487))) {
final Object f4492 = Fst.LAMBDA.apply(parse_AmacroactionZ4487);
final Object f4493 = Snd.LAMBDA.apply(parse_ApatternsZ4481);

final Object f4494 = Snd.LAMBDA.apply(parse_AmacroactionZ4487);

final Object f4495 = Append.LAMBDA.apply(f4493, new Cons(RuntimeContext.symbol("<-"), f4494));
final Object f4496 = ShenReassemble.LAMBDA.apply(f4492, f4495);

i4497 = f4496;
} else {

i4497 = null;

}

i4498 = i4497;
} else {

i4498 = null;

}
i4499 = i4498;
} else {

i4499 = null;

}

final Object result4480 = i4499;

final Object i4500;
if ((boolean)Lang.equals(result4480, null)) {

i4500 = null;
} else {

i4500 = result4480;

}

i4501 = i4500;
} else {

i4501 = result4447;

}

i4502 = i4501;
} else {

i4502 = result4427;

}

i4503 = i4502;
} else {

i4503 = result4394;

}

    return i4503;

}
}
