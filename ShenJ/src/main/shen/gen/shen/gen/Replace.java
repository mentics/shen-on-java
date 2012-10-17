package shen.gen;



import com.mentics.shen.*;

public class Replace {

public static final Symbol SYMBOL = RuntimeContext.symbol("replace");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v344, final Object v345, final Object v346) throws Exception {
return defined(v344, v345, v346);
}};
public static Object defined(final Object v344, final Object v345, final Object v346) throws Exception {


final Object i360;
if ((boolean)(v346 instanceof Cons)) {


final Object i358;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v346).head)) {



final Object i356;
if ((boolean)(((Cons)v346).tail instanceof Cons)) {




final Object i354;
if ((boolean)(((Cons)((Cons)v346).tail).tail instanceof Cons)) {





final Object i352;
if ((boolean)(((Cons)((Cons)((Cons)v346).tail).tail).tail instanceof Cons)) {





final Object i350;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v346).tail).tail).tail).tail)) {


final Object f348 = Equale.LAMBDA.apply(v344, ((Cons)((Cons)v346).tail).head);

final Object i349;
if ((boolean)f348) {

i349 = true;
} else {

i349 = false;

}
i350 = i349;
} else {

i350 = false;

}
final Object i351;
if ((boolean)i350) {

i351 = true;
} else {

i351 = false;

}
i352 = i351;
} else {

i352 = false;

}
final Object i353;
if ((boolean)i352) {

i353 = true;
} else {

i353 = false;

}
i354 = i353;
} else {

i354 = false;

}
final Object i355;
if ((boolean)i354) {

i355 = true;
} else {

i355 = false;

}
i356 = i355;
} else {

i356 = false;

}
final Object i357;
if ((boolean)i356) {

i357 = true;
} else {

i357 = false;

}
i358 = i357;
} else {

i358 = false;

}
final Object i359;
if ((boolean)i358) {

i359 = true;
} else {

i359 = false;

}
i360 = i359;
} else {

i360 = false;

}
final Object i425;
if ((boolean)i360) {

i425 = v346;
} else {

final Object i424;
if ((boolean)Lang.equals(v346, v344)) {

i424 = v345;
} else {


final Object i368;
if ((boolean)(v346 instanceof Cons)) {


final Object i366;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)v346).head)) {



final Object i364;
if ((boolean)(((Cons)v346).tail instanceof Cons)) {




final Object i362;
if ((boolean)(((Cons)((Cons)v346).tail).tail instanceof Cons)) {




final Object i361;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v346).tail).tail).tail)) {

i361 = true;
} else {

i361 = false;

}
i362 = i361;
} else {

i362 = false;

}
final Object i363;
if ((boolean)i362) {

i363 = true;
} else {

i363 = false;

}
i364 = i363;
} else {

i364 = false;

}
final Object i365;
if ((boolean)i364) {

i365 = true;
} else {

i365 = false;

}
i366 = i365;
} else {

i366 = false;

}
final Object i367;
if ((boolean)i366) {

i367 = true;
} else {

i367 = false;

}
i368 = i367;
} else {

i368 = false;

}
final Object i423;
if ((boolean)i368) {



final Object f369 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)v346).tail).head);




final Object f370 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)v346).tail).tail).head);





i423 = new Cons(RuntimeContext.symbol("="), new Cons(f369, new Cons(f370, Nil.NIL)));
} else {


final Object i381;
if ((boolean)(v346 instanceof Cons)) {


final Object i379;
if ((boolean)Lang.equals(RuntimeContext.symbol("/."), ((Cons)v346).head)) {



final Object i377;
if ((boolean)(((Cons)v346).tail instanceof Cons)) {




final Object i375;
if ((boolean)(((Cons)((Cons)v346).tail).tail instanceof Cons)) {




final Object i373;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v346).tail).tail).tail)) {


final Object f371 = FreeQ.LAMBDA.apply(v344, ((Cons)((Cons)v346).tail).head);

final Object i372;
if ((boolean)f371) {

i372 = true;
} else {

i372 = false;

}
i373 = i372;
} else {

i373 = false;

}
final Object i374;
if ((boolean)i373) {

i374 = true;
} else {

i374 = false;

}
i375 = i374;
} else {

i375 = false;

}
final Object i376;
if ((boolean)i375) {

i376 = true;
} else {

i376 = false;

}
i377 = i376;
} else {

i377 = false;

}
final Object i378;
if ((boolean)i377) {

i378 = true;
} else {

i378 = false;

}
i379 = i378;
} else {

i379 = false;

}
final Object i380;
if ((boolean)i379) {

i380 = true;
} else {

i380 = false;

}
i381 = i380;
} else {

i381 = false;

}
final Object i422;
if ((boolean)i381) {







final Object f382 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)v346).tail).tail).head);





i422 = new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)((Cons)v346).tail).head, new Cons(f382, Nil.NIL)));
} else {


final Object i392;
if ((boolean)(v346 instanceof Cons)) {


final Object i390;
if ((boolean)Lang.equals(RuntimeContext.symbol("if"), ((Cons)v346).head)) {



final Object i388;
if ((boolean)(((Cons)v346).tail instanceof Cons)) {




final Object i386;
if ((boolean)(((Cons)((Cons)v346).tail).tail instanceof Cons)) {





final Object i384;
if ((boolean)(((Cons)((Cons)((Cons)v346).tail).tail).tail instanceof Cons)) {





final Object i383;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v346).tail).tail).tail).tail)) {

i383 = true;
} else {

i383 = false;

}
i384 = i383;
} else {

i384 = false;

}
final Object i385;
if ((boolean)i384) {

i385 = true;
} else {

i385 = false;

}
i386 = i385;
} else {

i386 = false;

}
final Object i387;
if ((boolean)i386) {

i387 = true;
} else {

i387 = false;

}
i388 = i387;
} else {

i388 = false;

}
final Object i389;
if ((boolean)i388) {

i389 = true;
} else {

i389 = false;

}
i390 = i389;
} else {

i390 = false;

}
final Object i391;
if ((boolean)i390) {

i391 = true;
} else {

i391 = false;

}
i392 = i391;
} else {

i392 = false;

}
final Object i421;
if ((boolean)i392) {



final Object f393 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)v346).tail).head);




final Object f394 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)v346).tail).tail).head);





final Object f395 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)((Cons)v346).tail).tail).tail).head);






i421 = new Cons(RuntimeContext.symbol("if"), new Cons(f393, new Cons(f394, new Cons(f395, Nil.NIL))));
} else {


final Object i405;
if ((boolean)(v346 instanceof Cons)) {


final Object i403;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v346).head)) {



final Object i401;
if ((boolean)(((Cons)v346).tail instanceof Cons)) {




final Object i399;
if ((boolean)(((Cons)((Cons)v346).tail).tail instanceof Cons)) {





final Object i397;
if ((boolean)(((Cons)((Cons)((Cons)v346).tail).tail).tail instanceof Cons)) {





final Object i396;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v346).tail).tail).tail).tail)) {

i396 = true;
} else {

i396 = false;

}
i397 = i396;
} else {

i397 = false;

}
final Object i398;
if ((boolean)i397) {

i398 = true;
} else {

i398 = false;

}
i399 = i398;
} else {

i399 = false;

}
final Object i400;
if ((boolean)i399) {

i400 = true;
} else {

i400 = false;

}
i401 = i400;
} else {

i401 = false;

}
final Object i402;
if ((boolean)i401) {

i402 = true;
} else {

i402 = false;

}
i403 = i402;
} else {

i403 = false;

}
final Object i404;
if ((boolean)i403) {

i404 = true;
} else {

i404 = false;

}
i405 = i404;
} else {

i405 = false;

}
final Object i420;
if ((boolean)i405) {







final Object f406 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)v346).tail).tail).head);





final Object f407 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)((Cons)v346).tail).tail).tail).head);






i420 = new Cons(RuntimeContext.symbol("let"), new Cons(((Cons)((Cons)v346).tail).head, new Cons(f406, new Cons(f407, Nil.NIL))));
} else {


final Object i415;
if ((boolean)(v346 instanceof Cons)) {


final Object i413;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)v346).head)) {



final Object i411;
if ((boolean)(((Cons)v346).tail instanceof Cons)) {




final Object i409;
if ((boolean)(((Cons)((Cons)v346).tail).tail instanceof Cons)) {




final Object i408;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v346).tail).tail).tail)) {

i408 = true;
} else {

i408 = false;

}
i409 = i408;
} else {

i409 = false;

}
final Object i410;
if ((boolean)i409) {

i410 = true;
} else {

i410 = false;

}
i411 = i410;
} else {

i411 = false;

}
final Object i412;
if ((boolean)i411) {

i412 = true;
} else {

i412 = false;

}
i413 = i412;
} else {

i413 = false;

}
final Object i414;
if ((boolean)i413) {

i414 = true;
} else {

i414 = false;

}
i415 = i414;
} else {

i415 = false;

}
final Object i419;
if ((boolean)i415) {



final Object f416 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)v346).tail).head);




final Object f417 = Replace.LAMBDA.apply(v344, v345, ((Cons)((Cons)((Cons)v346).tail).tail).head);





i419 = new Cons(RuntimeContext.symbol("@p"), new Cons(f416, new Cons(f417, Nil.NIL)));
} else {

final Object i418;
if ((boolean)true) {

i418 = v346;
} else {

throw new SimpleError((String)"True condition not found.");


}
i419 = i418;

}
i420 = i419;

}
i421 = i420;

}
i422 = i421;

}
i423 = i422;

}
i424 = i423;

}
i425 = i424;

}
    return i425;

}
}
