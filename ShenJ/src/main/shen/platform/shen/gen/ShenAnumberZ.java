package shen.gen;



import com.mentics.shen.*;

public class ShenAnumberZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<number>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1026) throws Exception {
return defined(v1026);
}};
public static Object defined(final Object v1026) throws Exception {
final Object f5356 = ShenAminusZ.LAMBDA.apply(v1026);

final Object parse_AminusZ5355 = f5356;


final Object i5363;
if ((boolean)!((boolean)Lang.equals(null, parse_AminusZ5355))) {
final Object f5358 = ShenAnumberZ.LAMBDA.apply(parse_AminusZ5355);

final Object parse_AnumberZ5357 = f5358;


final Object i5362;
if ((boolean)!((boolean)Lang.equals(null, parse_AnumberZ5357))) {
final Object f5359 = Fst.LAMBDA.apply(parse_AnumberZ5357);

final Object f5360 = Snd.LAMBDA.apply(parse_AnumberZ5357);

final Object f5361 = ShenReassemble.LAMBDA.apply(f5359, Primitives.minus.apply(0, f5360));

i5362 = f5361;
} else {

i5362 = null;

}

i5363 = i5362;
} else {

i5363 = null;

}

final Object result5354 = i5363;

final Object i5447;
if ((boolean)Lang.equals(result5354, null)) {
final Object f5366 = ShenAplusZ.LAMBDA.apply(v1026);

final Object parse_AplusZ5365 = f5366;


final Object i5373;
if ((boolean)!((boolean)Lang.equals(null, parse_AplusZ5365))) {
final Object f5368 = ShenAnumberZ.LAMBDA.apply(parse_AplusZ5365);

final Object parse_AnumberZ5367 = f5368;


final Object i5372;
if ((boolean)!((boolean)Lang.equals(null, parse_AnumberZ5367))) {
final Object f5369 = Fst.LAMBDA.apply(parse_AnumberZ5367);
final Object f5370 = Snd.LAMBDA.apply(parse_AnumberZ5367);
final Object f5371 = ShenReassemble.LAMBDA.apply(f5369, f5370);

i5372 = f5371;
} else {

i5372 = null;

}

i5373 = i5372;
} else {

i5373 = null;

}

final Object result5364 = i5373;

final Object i5446;
if ((boolean)Lang.equals(result5364, null)) {
final Object f5376 = ShenApredigitsZ.LAMBDA.apply(v1026);

final Object parse_ApredigitsZ5375 = f5376;


final Object i5398;
if ((boolean)!((boolean)Lang.equals(null, parse_ApredigitsZ5375))) {
final Object f5378 = ShenAstopZ.LAMBDA.apply(parse_ApredigitsZ5375);

final Object parse_AstopZ5377 = f5378;


final Object i5397;
if ((boolean)!((boolean)Lang.equals(null, parse_AstopZ5377))) {
final Object f5380 = ShenApostdigitsZ.LAMBDA.apply(parse_AstopZ5377);

final Object parse_ApostdigitsZ5379 = f5380;


final Object i5396;
if ((boolean)!((boolean)Lang.equals(null, parse_ApostdigitsZ5379))) {
final Object f5382 = ShenAEZ.LAMBDA.apply(parse_ApostdigitsZ5379);

final Object parse_AEZ5381 = f5382;


final Object i5395;
if ((boolean)!((boolean)Lang.equals(null, parse_AEZ5381))) {
final Object f5384 = ShenAlog10Z.LAMBDA.apply(parse_AEZ5381);

final Object parse_Alog10Z5383 = f5384;


final Object i5394;
if ((boolean)!((boolean)Lang.equals(null, parse_Alog10Z5383))) {
final Object f5385 = Fst.LAMBDA.apply(parse_Alog10Z5383);
final Object f5386 = Snd.LAMBDA.apply(parse_Alog10Z5383);
final Object f5387 = ShenExpt.LAMBDA.apply(10, f5386);

final Object f5388 = Snd.LAMBDA.apply(parse_ApredigitsZ5375);
final Object f5389 = Reverse.LAMBDA.apply(f5388);
final Object f5390 = ShenPre.LAMBDA.apply(f5389, 0);

final Object f5391 = Snd.LAMBDA.apply(parse_ApostdigitsZ5379);
final Object f5392 = ShenPost.LAMBDA.apply(f5391, 1);


final Object f5393 = ShenReassemble.LAMBDA.apply(f5385, Primitives.multiply.apply(f5387, Primitives.plus.apply(f5390, f5392)));

i5394 = f5393;
} else {

i5394 = null;

}

i5395 = i5394;
} else {

i5395 = null;

}

i5396 = i5395;
} else {

i5396 = null;

}

i5397 = i5396;
} else {

i5397 = null;

}

i5398 = i5397;
} else {

i5398 = null;

}

final Object result5374 = i5398;

final Object i5445;
if ((boolean)Lang.equals(result5374, null)) {
final Object f5401 = ShenAdigitsZ.LAMBDA.apply(v1026);

final Object parse_AdigitsZ5400 = f5401;


final Object i5415;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5400))) {
final Object f5403 = ShenAEZ.LAMBDA.apply(parse_AdigitsZ5400);

final Object parse_AEZ5402 = f5403;


final Object i5414;
if ((boolean)!((boolean)Lang.equals(null, parse_AEZ5402))) {
final Object f5405 = ShenAlog10Z.LAMBDA.apply(parse_AEZ5402);

final Object parse_Alog10Z5404 = f5405;


final Object i5413;
if ((boolean)!((boolean)Lang.equals(null, parse_Alog10Z5404))) {
final Object f5406 = Fst.LAMBDA.apply(parse_Alog10Z5404);
final Object f5407 = Snd.LAMBDA.apply(parse_Alog10Z5404);
final Object f5408 = ShenExpt.LAMBDA.apply(10, f5407);

final Object f5409 = Snd.LAMBDA.apply(parse_AdigitsZ5400);
final Object f5410 = Reverse.LAMBDA.apply(f5409);
final Object f5411 = ShenPre.LAMBDA.apply(f5410, 0);

final Object f5412 = ShenReassemble.LAMBDA.apply(f5406, Primitives.multiply.apply(f5408, f5411));

i5413 = f5412;
} else {

i5413 = null;

}

i5414 = i5413;
} else {

i5414 = null;

}

i5415 = i5414;
} else {

i5415 = null;

}

final Object result5399 = i5415;

final Object i5444;
if ((boolean)Lang.equals(result5399, null)) {
final Object f5418 = ShenApredigitsZ.LAMBDA.apply(v1026);

final Object parse_ApredigitsZ5417 = f5418;


final Object i5432;
if ((boolean)!((boolean)Lang.equals(null, parse_ApredigitsZ5417))) {
final Object f5420 = ShenAstopZ.LAMBDA.apply(parse_ApredigitsZ5417);

final Object parse_AstopZ5419 = f5420;


final Object i5431;
if ((boolean)!((boolean)Lang.equals(null, parse_AstopZ5419))) {
final Object f5422 = ShenApostdigitsZ.LAMBDA.apply(parse_AstopZ5419);

final Object parse_ApostdigitsZ5421 = f5422;


final Object i5430;
if ((boolean)!((boolean)Lang.equals(null, parse_ApostdigitsZ5421))) {
final Object f5423 = Fst.LAMBDA.apply(parse_ApostdigitsZ5421);
final Object f5424 = Snd.LAMBDA.apply(parse_ApredigitsZ5417);
final Object f5425 = Reverse.LAMBDA.apply(f5424);
final Object f5426 = ShenPre.LAMBDA.apply(f5425, 0);

final Object f5427 = Snd.LAMBDA.apply(parse_ApostdigitsZ5421);
final Object f5428 = ShenPost.LAMBDA.apply(f5427, 1);

final Object f5429 = ShenReassemble.LAMBDA.apply(f5423, Primitives.plus.apply(f5426, f5428));

i5430 = f5429;
} else {

i5430 = null;

}

i5431 = i5430;
} else {

i5431 = null;

}

i5432 = i5431;
} else {

i5432 = null;

}

final Object result5416 = i5432;

final Object i5443;
if ((boolean)Lang.equals(result5416, null)) {
final Object f5435 = ShenAdigitsZ.LAMBDA.apply(v1026);

final Object parse_AdigitsZ5434 = f5435;


final Object i5441;
if ((boolean)!((boolean)Lang.equals(null, parse_AdigitsZ5434))) {
final Object f5436 = Fst.LAMBDA.apply(parse_AdigitsZ5434);
final Object f5437 = Snd.LAMBDA.apply(parse_AdigitsZ5434);
final Object f5438 = Reverse.LAMBDA.apply(f5437);
final Object f5439 = ShenPre.LAMBDA.apply(f5438, 0);
final Object f5440 = ShenReassemble.LAMBDA.apply(f5436, f5439);

i5441 = f5440;
} else {

i5441 = null;

}

final Object result5433 = i5441;

final Object i5442;
if ((boolean)Lang.equals(result5433, null)) {

i5442 = null;
} else {

i5442 = result5433;

}

i5443 = i5442;
} else {

i5443 = result5416;

}

i5444 = i5443;
} else {

i5444 = result5399;

}

i5445 = i5444;
} else {

i5445 = result5374;

}

i5446 = i5445;
} else {

i5446 = result5364;

}

i5447 = i5446;
} else {

i5447 = result5354;

}

    return i5447;

}
}
