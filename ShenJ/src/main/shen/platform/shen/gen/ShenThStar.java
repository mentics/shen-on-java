package shen.gen;



import com.mentics.shen.*;

public class ShenThStar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-th*");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v786, final Object v787, final Object v788, final Object v789, final Object v790) throws Exception {
return defined(v786, v787, v788, v789, v790);
}};
public static Object defined(final Object v786, final Object v787, final Object v788, final Object v789, final Object v790) throws Exception {
final Object f124 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol123 = f124;
final Object f126 = ShenIncinfs.LAMBDA.apply();






final Lambda l128 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f127 = Fwhen.LAMBDA.apply(false, v789, v790);

    return f127;
  }
};final Object f129 = ShenShow.LAMBDA.apply(new Cons(v786, new Cons(RuntimeContext.symbol(":"), new Cons(v787, Nil.NIL))), v788, v789, l128);
final Object f130 = Do.LAMBDA.apply(f126, f129);

final Object case125 = f130;

final Object i1253;
if ((boolean)Lang.equals(case125, false)) {
final Object f133 = ShenNewpv.LAMBDA.apply(v789);

final Object f132 = f133;
final Object f134 = ShenIncinfs.LAMBDA.apply();
final Object f135 = ShenLazyderef.LAMBDA.apply(v786, v789);
final Object f136 = ShenTypedfQ.LAMBDA.apply(f135);
final Lambda l142 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f137 = ShenLazyderef.LAMBDA.apply(v786, v789);
final Object f138 = ShenSigf.LAMBDA.apply(f137);
final Lambda l140 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f139 = Call.LAMBDA.apply(new Cons(f132, new Cons(v787, Nil.NIL)), v789, v790);

    return f139;
  }
};final Object f141 = Bind.LAMBDA.apply(f132, f138, v789, l140);

    return f141;
  }
};final Object f143 = Fwhen.LAMBDA.apply(f136, v789, l142);
final Object f144 = Do.LAMBDA.apply(f134, f143);


final Object case131 = f144;

final Object i1252;
if ((boolean)Lang.equals(case131, false)) {
final Object f146 = ShenIncinfs.LAMBDA.apply();
final Object f147 = ShenBase.LAMBDA.apply(v786, v787, v789, v790);
final Object f148 = Do.LAMBDA.apply(f146, f147);

final Object case145 = f148;

final Object i1251;
if ((boolean)Lang.equals(case145, false)) {
final Object f150 = ShenIncinfs.LAMBDA.apply();
final Object f151 = ShenBy_hypothesis.LAMBDA.apply(v786, v787, v788, v789, v790);
final Object f152 = Do.LAMBDA.apply(f150, f151);

final Object case149 = f152;

final Object i1250;
if ((boolean)Lang.equals(case149, false)) {
final Object f155 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v678154 = f155;


final Object i171;
if ((boolean)(v678154 instanceof Cons)) {


final Object f156 = ((Cons)v678154).head;

final Object f158 = ShenLazyderef.LAMBDA.apply(((Cons)v678154).tail, v789);

final Object v679157 = f158;


final Object i170;
if ((boolean)(v679157 instanceof Cons)) {


final Object x159 = ((Cons)v679157).head;

final Object f161 = ShenLazyderef.LAMBDA.apply(((Cons)v679157).tail, v789);

final Object v680160 = f161;

final Object i169;
if ((boolean)Lang.equals(Nil.NIL, v680160)) {
final Object f163 = ShenNewpv.LAMBDA.apply(v789);

final Object b162 = f163;
final Object f164 = ShenIncinfs.LAMBDA.apply();






final Lambda l166 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f165 = ShenThStar.LAMBDA.apply(x159, b162, v788, v789, v790);

    return f165;
  }
};final Object f167 = ShenThStar.LAMBDA.apply(f156, new Cons(b162, new Cons(RuntimeContext.symbol("-->"), new Cons(v787, Nil.NIL))), v788, v789, l166);
final Object f168 = Do.LAMBDA.apply(f164, f167);


i169 = f168;
} else {

i169 = false;

}


i170 = i169;
} else {

i170 = false;

}


i171 = i170;
} else {

i171 = false;

}

final Object case153 = i171;

final Object i1249;
if ((boolean)Lang.equals(case153, false)) {
final Object f174 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v681173 = f174;


final Object i292;
if ((boolean)(v681173 instanceof Cons)) {

final Object f176 = ShenLazyderef.LAMBDA.apply(((Cons)v681173).head, v789);

final Object v682175 = f176;

final Object i291;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), v682175)) {

final Object f178 = ShenLazyderef.LAMBDA.apply(((Cons)v681173).tail, v789);

final Object v683177 = f178;


final Object i290;
if ((boolean)(v683177 instanceof Cons)) {


final Object x179 = ((Cons)v683177).head;

final Object f181 = ShenLazyderef.LAMBDA.apply(((Cons)v683177).tail, v789);

final Object v684180 = f181;


final Object i289;
if ((boolean)(v684180 instanceof Cons)) {


final Object y182 = ((Cons)v684180).head;

final Object f184 = ShenLazyderef.LAMBDA.apply(((Cons)v684180).tail, v789);

final Object v685183 = f184;

final Object i288;
if ((boolean)Lang.equals(Nil.NIL, v685183)) {
final Object f186 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v686185 = f186;


final Object i287;
if ((boolean)(v686185 instanceof Cons)) {

final Object f188 = ShenLazyderef.LAMBDA.apply(((Cons)v686185).head, v789);

final Object v687187 = f188;

final Object i272;
if ((boolean)Lang.equals(RuntimeContext.symbol("list"), v687187)) {

final Object f190 = ShenLazyderef.LAMBDA.apply(((Cons)v686185).tail, v789);

final Object v688189 = f190;


final Object i226;
if ((boolean)(v688189 instanceof Cons)) {


final Object a191 = ((Cons)v688189).head;

final Object f193 = ShenLazyderef.LAMBDA.apply(((Cons)v688189).tail, v789);

final Object v689192 = f193;

final Object i211;
if ((boolean)Lang.equals(Nil.NIL, v689192)) {
final Object f194 = ShenIncinfs.LAMBDA.apply();
final Lambda l196 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f195 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a191, Nil.NIL)), v788, v789, v790);

    return f195;
  }
};final Object f197 = ShenThStar.LAMBDA.apply(x179, a191, v788, v789, l196);
final Object f198 = Do.LAMBDA.apply(f194, f197);

i211 = f198;
} else {
final Object f199 = ShenPvarQ.LAMBDA.apply(v689192);

final Object i210;
if ((boolean)f199) {
final Object f200 = ShenBindv.LAMBDA.apply(v689192, Nil.NIL, v789);
final Object f202 = ShenIncinfs.LAMBDA.apply();
final Lambda l204 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f203 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a191, Nil.NIL)), v788, v789, v790);

    return f203;
  }
};final Object f205 = ShenThStar.LAMBDA.apply(x179, a191, v788, v789, l204);
final Object f206 = Do.LAMBDA.apply(f202, f205);

final Object result201 = f206;
final Object f207 = ShenUnbindv.LAMBDA.apply(v689192, v789);
final Object f208 = Do.LAMBDA.apply(f207, result201);

final Object f209 = Do.LAMBDA.apply(f200, f208);

i210 = f209;
} else {

i210 = false;

}
i211 = i210;

}


i226 = i211;
} else {
final Object f212 = ShenPvarQ.LAMBDA.apply(v688189);

final Object i225;
if ((boolean)f212) {
final Object f214 = ShenNewpv.LAMBDA.apply(v789);

final Object a213 = f214;


final Object f215 = ShenBindv.LAMBDA.apply(v688189, new Cons(a213, Nil.NIL), v789);
final Object f217 = ShenIncinfs.LAMBDA.apply();
final Lambda l219 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f218 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a213, Nil.NIL)), v788, v789, v790);

    return f218;
  }
};final Object f220 = ShenThStar.LAMBDA.apply(x179, a213, v788, v789, l219);
final Object f221 = Do.LAMBDA.apply(f217, f220);

final Object result216 = f221;
final Object f222 = ShenUnbindv.LAMBDA.apply(v688189, v789);
final Object f223 = Do.LAMBDA.apply(f222, result216);

final Object f224 = Do.LAMBDA.apply(f215, f223);


i225 = f224;
} else {

i225 = false;

}
i226 = i225;

}

i272 = i226;
} else {
final Object f227 = ShenPvarQ.LAMBDA.apply(v687187);

final Object i271;
if ((boolean)f227) {
final Object f228 = ShenBindv.LAMBDA.apply(v687187, RuntimeContext.symbol("list"), v789);

final Object f231 = ShenLazyderef.LAMBDA.apply(((Cons)v686185).tail, v789);

final Object v690230 = f231;


final Object i267;
if ((boolean)(v690230 instanceof Cons)) {


final Object a232 = ((Cons)v690230).head;

final Object f234 = ShenLazyderef.LAMBDA.apply(((Cons)v690230).tail, v789);

final Object v691233 = f234;

final Object i252;
if ((boolean)Lang.equals(Nil.NIL, v691233)) {
final Object f235 = ShenIncinfs.LAMBDA.apply();
final Lambda l237 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f236 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a232, Nil.NIL)), v788, v789, v790);

    return f236;
  }
};final Object f238 = ShenThStar.LAMBDA.apply(x179, a232, v788, v789, l237);
final Object f239 = Do.LAMBDA.apply(f235, f238);

i252 = f239;
} else {
final Object f240 = ShenPvarQ.LAMBDA.apply(v691233);

final Object i251;
if ((boolean)f240) {
final Object f241 = ShenBindv.LAMBDA.apply(v691233, Nil.NIL, v789);
final Object f243 = ShenIncinfs.LAMBDA.apply();
final Lambda l245 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f244 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a232, Nil.NIL)), v788, v789, v790);

    return f244;
  }
};final Object f246 = ShenThStar.LAMBDA.apply(x179, a232, v788, v789, l245);
final Object f247 = Do.LAMBDA.apply(f243, f246);

final Object result242 = f247;
final Object f248 = ShenUnbindv.LAMBDA.apply(v691233, v789);
final Object f249 = Do.LAMBDA.apply(f248, result242);

final Object f250 = Do.LAMBDA.apply(f241, f249);

i251 = f250;
} else {

i251 = false;

}
i252 = i251;

}


i267 = i252;
} else {
final Object f253 = ShenPvarQ.LAMBDA.apply(v690230);

final Object i266;
if ((boolean)f253) {
final Object f255 = ShenNewpv.LAMBDA.apply(v789);

final Object a254 = f255;


final Object f256 = ShenBindv.LAMBDA.apply(v690230, new Cons(a254, Nil.NIL), v789);
final Object f258 = ShenIncinfs.LAMBDA.apply();
final Lambda l260 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f259 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a254, Nil.NIL)), v788, v789, v790);

    return f259;
  }
};final Object f261 = ShenThStar.LAMBDA.apply(x179, a254, v788, v789, l260);
final Object f262 = Do.LAMBDA.apply(f258, f261);

final Object result257 = f262;
final Object f263 = ShenUnbindv.LAMBDA.apply(v690230, v789);
final Object f264 = Do.LAMBDA.apply(f263, result257);

final Object f265 = Do.LAMBDA.apply(f256, f264);


i266 = f265;
} else {

i266 = false;

}
i267 = i266;

}

final Object result229 = i267;
final Object f268 = ShenUnbindv.LAMBDA.apply(v687187, v789);
final Object f269 = Do.LAMBDA.apply(f268, result229);

final Object f270 = Do.LAMBDA.apply(f228, f269);

i271 = f270;
} else {

i271 = false;

}
i272 = i271;

}

i287 = i272;
} else {
final Object f273 = ShenPvarQ.LAMBDA.apply(v686185);

final Object i286;
if ((boolean)f273) {
final Object f275 = ShenNewpv.LAMBDA.apply(v789);

final Object a274 = f275;




final Object f276 = ShenBindv.LAMBDA.apply(v686185, new Cons(RuntimeContext.symbol("list"), new Cons(a274, Nil.NIL)), v789);
final Object f278 = ShenIncinfs.LAMBDA.apply();
final Lambda l280 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f279 = ShenThStar.LAMBDA.apply(y182, new Cons(RuntimeContext.symbol("list"), new Cons(a274, Nil.NIL)), v788, v789, v790);

    return f279;
  }
};final Object f281 = ShenThStar.LAMBDA.apply(x179, a274, v788, v789, l280);
final Object f282 = Do.LAMBDA.apply(f278, f281);

final Object result277 = f282;
final Object f283 = ShenUnbindv.LAMBDA.apply(v686185, v789);
final Object f284 = Do.LAMBDA.apply(f283, result277);

final Object f285 = Do.LAMBDA.apply(f276, f284);


i286 = f285;
} else {

i286 = false;

}
i287 = i286;

}

i288 = i287;
} else {

i288 = false;

}


i289 = i288;
} else {

i289 = false;

}


i290 = i289;
} else {

i290 = false;

}

i291 = i290;
} else {

i291 = false;

}

i292 = i291;
} else {

i292 = false;

}

final Object case172 = i292;

final Object i1248;
if ((boolean)Lang.equals(case172, false)) {
final Object f295 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v692294 = f295;


final Object i433;
if ((boolean)(v692294 instanceof Cons)) {

final Object f297 = ShenLazyderef.LAMBDA.apply(((Cons)v692294).head, v789);

final Object v693296 = f297;

final Object i432;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), v693296)) {

final Object f299 = ShenLazyderef.LAMBDA.apply(((Cons)v692294).tail, v789);

final Object v694298 = f299;


final Object i431;
if ((boolean)(v694298 instanceof Cons)) {


final Object x300 = ((Cons)v694298).head;

final Object f302 = ShenLazyderef.LAMBDA.apply(((Cons)v694298).tail, v789);

final Object v695301 = f302;


final Object i430;
if ((boolean)(v695301 instanceof Cons)) {


final Object y303 = ((Cons)v695301).head;

final Object f305 = ShenLazyderef.LAMBDA.apply(((Cons)v695301).tail, v789);

final Object v696304 = f305;

final Object i429;
if ((boolean)Lang.equals(Nil.NIL, v696304)) {
final Object f307 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v697306 = f307;


final Object i428;
if ((boolean)(v697306 instanceof Cons)) {


final Object a308 = ((Cons)v697306).head;

final Object f310 = ShenLazyderef.LAMBDA.apply(((Cons)v697306).tail, v789);

final Object v698309 = f310;


final Object i411;
if ((boolean)(v698309 instanceof Cons)) {

final Object f312 = ShenLazyderef.LAMBDA.apply(((Cons)v698309).head, v789);

final Object v699311 = f312;

final Object i396;
if ((boolean)Lang.equals(RuntimeContext.symbol("*"), v699311)) {

final Object f314 = ShenLazyderef.LAMBDA.apply(((Cons)v698309).tail, v789);

final Object v700313 = f314;


final Object i350;
if ((boolean)(v700313 instanceof Cons)) {


final Object b315 = ((Cons)v700313).head;

final Object f317 = ShenLazyderef.LAMBDA.apply(((Cons)v700313).tail, v789);

final Object v701316 = f317;

final Object i335;
if ((boolean)Lang.equals(Nil.NIL, v701316)) {
final Object f318 = ShenIncinfs.LAMBDA.apply();
final Lambda l320 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f319 = ShenThStar.LAMBDA.apply(y303, b315, v788, v789, v790);

    return f319;
  }
};final Object f321 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l320);
final Object f322 = Do.LAMBDA.apply(f318, f321);

i335 = f322;
} else {
final Object f323 = ShenPvarQ.LAMBDA.apply(v701316);

final Object i334;
if ((boolean)f323) {
final Object f324 = ShenBindv.LAMBDA.apply(v701316, Nil.NIL, v789);
final Object f326 = ShenIncinfs.LAMBDA.apply();
final Lambda l328 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f327 = ShenThStar.LAMBDA.apply(y303, b315, v788, v789, v790);

    return f327;
  }
};final Object f329 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l328);
final Object f330 = Do.LAMBDA.apply(f326, f329);

final Object result325 = f330;
final Object f331 = ShenUnbindv.LAMBDA.apply(v701316, v789);
final Object f332 = Do.LAMBDA.apply(f331, result325);

final Object f333 = Do.LAMBDA.apply(f324, f332);

i334 = f333;
} else {

i334 = false;

}
i335 = i334;

}


i350 = i335;
} else {
final Object f336 = ShenPvarQ.LAMBDA.apply(v700313);

final Object i349;
if ((boolean)f336) {
final Object f338 = ShenNewpv.LAMBDA.apply(v789);

final Object b337 = f338;


final Object f339 = ShenBindv.LAMBDA.apply(v700313, new Cons(b337, Nil.NIL), v789);
final Object f341 = ShenIncinfs.LAMBDA.apply();
final Lambda l343 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f342 = ShenThStar.LAMBDA.apply(y303, b337, v788, v789, v790);

    return f342;
  }
};final Object f344 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l343);
final Object f345 = Do.LAMBDA.apply(f341, f344);

final Object result340 = f345;
final Object f346 = ShenUnbindv.LAMBDA.apply(v700313, v789);
final Object f347 = Do.LAMBDA.apply(f346, result340);

final Object f348 = Do.LAMBDA.apply(f339, f347);


i349 = f348;
} else {

i349 = false;

}
i350 = i349;

}

i396 = i350;
} else {
final Object f351 = ShenPvarQ.LAMBDA.apply(v699311);

final Object i395;
if ((boolean)f351) {
final Object f352 = ShenBindv.LAMBDA.apply(v699311, RuntimeContext.symbol("*"), v789);

final Object f355 = ShenLazyderef.LAMBDA.apply(((Cons)v698309).tail, v789);

final Object v702354 = f355;


final Object i391;
if ((boolean)(v702354 instanceof Cons)) {


final Object b356 = ((Cons)v702354).head;

final Object f358 = ShenLazyderef.LAMBDA.apply(((Cons)v702354).tail, v789);

final Object v703357 = f358;

final Object i376;
if ((boolean)Lang.equals(Nil.NIL, v703357)) {
final Object f359 = ShenIncinfs.LAMBDA.apply();
final Lambda l361 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f360 = ShenThStar.LAMBDA.apply(y303, b356, v788, v789, v790);

    return f360;
  }
};final Object f362 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l361);
final Object f363 = Do.LAMBDA.apply(f359, f362);

i376 = f363;
} else {
final Object f364 = ShenPvarQ.LAMBDA.apply(v703357);

final Object i375;
if ((boolean)f364) {
final Object f365 = ShenBindv.LAMBDA.apply(v703357, Nil.NIL, v789);
final Object f367 = ShenIncinfs.LAMBDA.apply();
final Lambda l369 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f368 = ShenThStar.LAMBDA.apply(y303, b356, v788, v789, v790);

    return f368;
  }
};final Object f370 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l369);
final Object f371 = Do.LAMBDA.apply(f367, f370);

final Object result366 = f371;
final Object f372 = ShenUnbindv.LAMBDA.apply(v703357, v789);
final Object f373 = Do.LAMBDA.apply(f372, result366);

final Object f374 = Do.LAMBDA.apply(f365, f373);

i375 = f374;
} else {

i375 = false;

}
i376 = i375;

}


i391 = i376;
} else {
final Object f377 = ShenPvarQ.LAMBDA.apply(v702354);

final Object i390;
if ((boolean)f377) {
final Object f379 = ShenNewpv.LAMBDA.apply(v789);

final Object b378 = f379;


final Object f380 = ShenBindv.LAMBDA.apply(v702354, new Cons(b378, Nil.NIL), v789);
final Object f382 = ShenIncinfs.LAMBDA.apply();
final Lambda l384 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f383 = ShenThStar.LAMBDA.apply(y303, b378, v788, v789, v790);

    return f383;
  }
};final Object f385 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l384);
final Object f386 = Do.LAMBDA.apply(f382, f385);

final Object result381 = f386;
final Object f387 = ShenUnbindv.LAMBDA.apply(v702354, v789);
final Object f388 = Do.LAMBDA.apply(f387, result381);

final Object f389 = Do.LAMBDA.apply(f380, f388);


i390 = f389;
} else {

i390 = false;

}
i391 = i390;

}

final Object result353 = i391;
final Object f392 = ShenUnbindv.LAMBDA.apply(v699311, v789);
final Object f393 = Do.LAMBDA.apply(f392, result353);

final Object f394 = Do.LAMBDA.apply(f352, f393);

i395 = f394;
} else {

i395 = false;

}
i396 = i395;

}

i411 = i396;
} else {
final Object f397 = ShenPvarQ.LAMBDA.apply(v698309);

final Object i410;
if ((boolean)f397) {
final Object f399 = ShenNewpv.LAMBDA.apply(v789);

final Object b398 = f399;




final Object f400 = ShenBindv.LAMBDA.apply(v698309, new Cons(RuntimeContext.symbol("*"), new Cons(b398, Nil.NIL)), v789);
final Object f402 = ShenIncinfs.LAMBDA.apply();
final Lambda l404 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f403 = ShenThStar.LAMBDA.apply(y303, b398, v788, v789, v790);

    return f403;
  }
};final Object f405 = ShenThStar.LAMBDA.apply(x300, a308, v788, v789, l404);
final Object f406 = Do.LAMBDA.apply(f402, f405);

final Object result401 = f406;
final Object f407 = ShenUnbindv.LAMBDA.apply(v698309, v789);
final Object f408 = Do.LAMBDA.apply(f407, result401);

final Object f409 = Do.LAMBDA.apply(f400, f408);


i410 = f409;
} else {

i410 = false;

}
i411 = i410;

}


i428 = i411;
} else {
final Object f412 = ShenPvarQ.LAMBDA.apply(v697306);

final Object i427;
if ((boolean)f412) {
final Object f414 = ShenNewpv.LAMBDA.apply(v789);

final Object a413 = f414;
final Object f416 = ShenNewpv.LAMBDA.apply(v789);

final Object b415 = f416;






final Object f417 = ShenBindv.LAMBDA.apply(v697306, new Cons(a413, new Cons(RuntimeContext.symbol("*"), new Cons(b415, Nil.NIL))), v789);
final Object f419 = ShenIncinfs.LAMBDA.apply();
final Lambda l421 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f420 = ShenThStar.LAMBDA.apply(y303, b415, v788, v789, v790);

    return f420;
  }
};final Object f422 = ShenThStar.LAMBDA.apply(x300, a413, v788, v789, l421);
final Object f423 = Do.LAMBDA.apply(f419, f422);

final Object result418 = f423;
final Object f424 = ShenUnbindv.LAMBDA.apply(v697306, v789);
final Object f425 = Do.LAMBDA.apply(f424, result418);

final Object f426 = Do.LAMBDA.apply(f417, f425);



i427 = f426;
} else {

i427 = false;

}
i428 = i427;

}

i429 = i428;
} else {

i429 = false;

}


i430 = i429;
} else {

i430 = false;

}


i431 = i430;
} else {

i431 = false;

}

i432 = i431;
} else {

i432 = false;

}

i433 = i432;
} else {

i433 = false;

}

final Object case293 = i433;

final Object i1247;
if ((boolean)Lang.equals(case293, false)) {
final Object f436 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v704435 = f436;


final Object i554;
if ((boolean)(v704435 instanceof Cons)) {

final Object f438 = ShenLazyderef.LAMBDA.apply(((Cons)v704435).head, v789);

final Object v705437 = f438;

final Object i553;
if ((boolean)Lang.equals(RuntimeContext.symbol("@v"), v705437)) {

final Object f440 = ShenLazyderef.LAMBDA.apply(((Cons)v704435).tail, v789);

final Object v706439 = f440;


final Object i552;
if ((boolean)(v706439 instanceof Cons)) {


final Object x441 = ((Cons)v706439).head;

final Object f443 = ShenLazyderef.LAMBDA.apply(((Cons)v706439).tail, v789);

final Object v707442 = f443;


final Object i551;
if ((boolean)(v707442 instanceof Cons)) {


final Object y444 = ((Cons)v707442).head;

final Object f446 = ShenLazyderef.LAMBDA.apply(((Cons)v707442).tail, v789);

final Object v708445 = f446;

final Object i550;
if ((boolean)Lang.equals(Nil.NIL, v708445)) {
final Object f448 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v709447 = f448;


final Object i549;
if ((boolean)(v709447 instanceof Cons)) {

final Object f450 = ShenLazyderef.LAMBDA.apply(((Cons)v709447).head, v789);

final Object v710449 = f450;

final Object i534;
if ((boolean)Lang.equals(RuntimeContext.symbol("vector"), v710449)) {

final Object f452 = ShenLazyderef.LAMBDA.apply(((Cons)v709447).tail, v789);

final Object v711451 = f452;


final Object i488;
if ((boolean)(v711451 instanceof Cons)) {


final Object a453 = ((Cons)v711451).head;

final Object f455 = ShenLazyderef.LAMBDA.apply(((Cons)v711451).tail, v789);

final Object v712454 = f455;

final Object i473;
if ((boolean)Lang.equals(Nil.NIL, v712454)) {
final Object f456 = ShenIncinfs.LAMBDA.apply();
final Lambda l458 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f457 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a453, Nil.NIL)), v788, v789, v790);

    return f457;
  }
};final Object f459 = ShenThStar.LAMBDA.apply(x441, a453, v788, v789, l458);
final Object f460 = Do.LAMBDA.apply(f456, f459);

i473 = f460;
} else {
final Object f461 = ShenPvarQ.LAMBDA.apply(v712454);

final Object i472;
if ((boolean)f461) {
final Object f462 = ShenBindv.LAMBDA.apply(v712454, Nil.NIL, v789);
final Object f464 = ShenIncinfs.LAMBDA.apply();
final Lambda l466 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f465 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a453, Nil.NIL)), v788, v789, v790);

    return f465;
  }
};final Object f467 = ShenThStar.LAMBDA.apply(x441, a453, v788, v789, l466);
final Object f468 = Do.LAMBDA.apply(f464, f467);

final Object result463 = f468;
final Object f469 = ShenUnbindv.LAMBDA.apply(v712454, v789);
final Object f470 = Do.LAMBDA.apply(f469, result463);

final Object f471 = Do.LAMBDA.apply(f462, f470);

i472 = f471;
} else {

i472 = false;

}
i473 = i472;

}


i488 = i473;
} else {
final Object f474 = ShenPvarQ.LAMBDA.apply(v711451);

final Object i487;
if ((boolean)f474) {
final Object f476 = ShenNewpv.LAMBDA.apply(v789);

final Object a475 = f476;


final Object f477 = ShenBindv.LAMBDA.apply(v711451, new Cons(a475, Nil.NIL), v789);
final Object f479 = ShenIncinfs.LAMBDA.apply();
final Lambda l481 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f480 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a475, Nil.NIL)), v788, v789, v790);

    return f480;
  }
};final Object f482 = ShenThStar.LAMBDA.apply(x441, a475, v788, v789, l481);
final Object f483 = Do.LAMBDA.apply(f479, f482);

final Object result478 = f483;
final Object f484 = ShenUnbindv.LAMBDA.apply(v711451, v789);
final Object f485 = Do.LAMBDA.apply(f484, result478);

final Object f486 = Do.LAMBDA.apply(f477, f485);


i487 = f486;
} else {

i487 = false;

}
i488 = i487;

}

i534 = i488;
} else {
final Object f489 = ShenPvarQ.LAMBDA.apply(v710449);

final Object i533;
if ((boolean)f489) {
final Object f490 = ShenBindv.LAMBDA.apply(v710449, RuntimeContext.symbol("vector"), v789);

final Object f493 = ShenLazyderef.LAMBDA.apply(((Cons)v709447).tail, v789);

final Object v713492 = f493;


final Object i529;
if ((boolean)(v713492 instanceof Cons)) {


final Object a494 = ((Cons)v713492).head;

final Object f496 = ShenLazyderef.LAMBDA.apply(((Cons)v713492).tail, v789);

final Object v714495 = f496;

final Object i514;
if ((boolean)Lang.equals(Nil.NIL, v714495)) {
final Object f497 = ShenIncinfs.LAMBDA.apply();
final Lambda l499 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f498 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a494, Nil.NIL)), v788, v789, v790);

    return f498;
  }
};final Object f500 = ShenThStar.LAMBDA.apply(x441, a494, v788, v789, l499);
final Object f501 = Do.LAMBDA.apply(f497, f500);

i514 = f501;
} else {
final Object f502 = ShenPvarQ.LAMBDA.apply(v714495);

final Object i513;
if ((boolean)f502) {
final Object f503 = ShenBindv.LAMBDA.apply(v714495, Nil.NIL, v789);
final Object f505 = ShenIncinfs.LAMBDA.apply();
final Lambda l507 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f506 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a494, Nil.NIL)), v788, v789, v790);

    return f506;
  }
};final Object f508 = ShenThStar.LAMBDA.apply(x441, a494, v788, v789, l507);
final Object f509 = Do.LAMBDA.apply(f505, f508);

final Object result504 = f509;
final Object f510 = ShenUnbindv.LAMBDA.apply(v714495, v789);
final Object f511 = Do.LAMBDA.apply(f510, result504);

final Object f512 = Do.LAMBDA.apply(f503, f511);

i513 = f512;
} else {

i513 = false;

}
i514 = i513;

}


i529 = i514;
} else {
final Object f515 = ShenPvarQ.LAMBDA.apply(v713492);

final Object i528;
if ((boolean)f515) {
final Object f517 = ShenNewpv.LAMBDA.apply(v789);

final Object a516 = f517;


final Object f518 = ShenBindv.LAMBDA.apply(v713492, new Cons(a516, Nil.NIL), v789);
final Object f520 = ShenIncinfs.LAMBDA.apply();
final Lambda l522 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f521 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a516, Nil.NIL)), v788, v789, v790);

    return f521;
  }
};final Object f523 = ShenThStar.LAMBDA.apply(x441, a516, v788, v789, l522);
final Object f524 = Do.LAMBDA.apply(f520, f523);

final Object result519 = f524;
final Object f525 = ShenUnbindv.LAMBDA.apply(v713492, v789);
final Object f526 = Do.LAMBDA.apply(f525, result519);

final Object f527 = Do.LAMBDA.apply(f518, f526);


i528 = f527;
} else {

i528 = false;

}
i529 = i528;

}

final Object result491 = i529;
final Object f530 = ShenUnbindv.LAMBDA.apply(v710449, v789);
final Object f531 = Do.LAMBDA.apply(f530, result491);

final Object f532 = Do.LAMBDA.apply(f490, f531);

i533 = f532;
} else {

i533 = false;

}
i534 = i533;

}

i549 = i534;
} else {
final Object f535 = ShenPvarQ.LAMBDA.apply(v709447);

final Object i548;
if ((boolean)f535) {
final Object f537 = ShenNewpv.LAMBDA.apply(v789);

final Object a536 = f537;




final Object f538 = ShenBindv.LAMBDA.apply(v709447, new Cons(RuntimeContext.symbol("vector"), new Cons(a536, Nil.NIL)), v789);
final Object f540 = ShenIncinfs.LAMBDA.apply();
final Lambda l542 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f541 = ShenThStar.LAMBDA.apply(y444, new Cons(RuntimeContext.symbol("vector"), new Cons(a536, Nil.NIL)), v788, v789, v790);

    return f541;
  }
};final Object f543 = ShenThStar.LAMBDA.apply(x441, a536, v788, v789, l542);
final Object f544 = Do.LAMBDA.apply(f540, f543);

final Object result539 = f544;
final Object f545 = ShenUnbindv.LAMBDA.apply(v709447, v789);
final Object f546 = Do.LAMBDA.apply(f545, result539);

final Object f547 = Do.LAMBDA.apply(f538, f546);


i548 = f547;
} else {

i548 = false;

}
i549 = i548;

}

i550 = i549;
} else {

i550 = false;

}


i551 = i550;
} else {

i551 = false;

}


i552 = i551;
} else {

i552 = false;

}

i553 = i552;
} else {

i553 = false;

}

i554 = i553;
} else {

i554 = false;

}

final Object case434 = i554;

final Object i1246;
if ((boolean)Lang.equals(case434, false)) {
final Object f557 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v715556 = f557;


final Object i592;
if ((boolean)(v715556 instanceof Cons)) {

final Object f559 = ShenLazyderef.LAMBDA.apply(((Cons)v715556).head, v789);

final Object v716558 = f559;

final Object i591;
if ((boolean)Lang.equals(RuntimeContext.symbol("@s"), v716558)) {

final Object f561 = ShenLazyderef.LAMBDA.apply(((Cons)v715556).tail, v789);

final Object v717560 = f561;


final Object i590;
if ((boolean)(v717560 instanceof Cons)) {


final Object x562 = ((Cons)v717560).head;

final Object f564 = ShenLazyderef.LAMBDA.apply(((Cons)v717560).tail, v789);

final Object v718563 = f564;


final Object i589;
if ((boolean)(v718563 instanceof Cons)) {


final Object y565 = ((Cons)v718563).head;

final Object f567 = ShenLazyderef.LAMBDA.apply(((Cons)v718563).tail, v789);

final Object v719566 = f567;

final Object i588;
if ((boolean)Lang.equals(Nil.NIL, v719566)) {
final Object f569 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v720568 = f569;

final Object i587;
if ((boolean)Lang.equals(RuntimeContext.symbol("string"), v720568)) {
final Object f570 = ShenIncinfs.LAMBDA.apply();
final Lambda l572 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f571 = ShenThStar.LAMBDA.apply(y565, RuntimeContext.symbol("string"), v788, v789, v790);

    return f571;
  }
};final Object f573 = ShenThStar.LAMBDA.apply(x562, RuntimeContext.symbol("string"), v788, v789, l572);
final Object f574 = Do.LAMBDA.apply(f570, f573);

i587 = f574;
} else {
final Object f575 = ShenPvarQ.LAMBDA.apply(v720568);

final Object i586;
if ((boolean)f575) {
final Object f576 = ShenBindv.LAMBDA.apply(v720568, RuntimeContext.symbol("string"), v789);
final Object f578 = ShenIncinfs.LAMBDA.apply();
final Lambda l580 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f579 = ShenThStar.LAMBDA.apply(y565, RuntimeContext.symbol("string"), v788, v789, v790);

    return f579;
  }
};final Object f581 = ShenThStar.LAMBDA.apply(x562, RuntimeContext.symbol("string"), v788, v789, l580);
final Object f582 = Do.LAMBDA.apply(f578, f581);

final Object result577 = f582;
final Object f583 = ShenUnbindv.LAMBDA.apply(v720568, v789);
final Object f584 = Do.LAMBDA.apply(f583, result577);

final Object f585 = Do.LAMBDA.apply(f576, f584);

i586 = f585;
} else {

i586 = false;

}
i587 = i586;

}

i588 = i587;
} else {

i588 = false;

}


i589 = i588;
} else {

i589 = false;

}


i590 = i589;
} else {

i590 = false;

}

i591 = i590;
} else {

i591 = false;

}

i592 = i591;
} else {

i592 = false;

}

final Object case555 = i592;

final Object i1245;
if ((boolean)Lang.equals(case555, false)) {
final Object f595 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v721594 = f595;


final Object i837;
if ((boolean)(v721594 instanceof Cons)) {

final Object f597 = ShenLazyderef.LAMBDA.apply(((Cons)v721594).head, v789);

final Object v722596 = f597;

final Object i836;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), v722596)) {

final Object f599 = ShenLazyderef.LAMBDA.apply(((Cons)v721594).tail, v789);

final Object v723598 = f599;


final Object i835;
if ((boolean)(v723598 instanceof Cons)) {


final Object x600 = ((Cons)v723598).head;

final Object f602 = ShenLazyderef.LAMBDA.apply(((Cons)v723598).tail, v789);

final Object v724601 = f602;


final Object i834;
if ((boolean)(v724601 instanceof Cons)) {


final Object y603 = ((Cons)v724601).head;

final Object f605 = ShenLazyderef.LAMBDA.apply(((Cons)v724601).tail, v789);

final Object v725604 = f605;

final Object i833;
if ((boolean)Lang.equals(Nil.NIL, v725604)) {
final Object f607 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v726606 = f607;


final Object i832;
if ((boolean)(v726606 instanceof Cons)) {


final Object a608 = ((Cons)v726606).head;

final Object f610 = ShenLazyderef.LAMBDA.apply(((Cons)v726606).tail, v789);

final Object v727609 = f610;


final Object i802;
if ((boolean)(v727609 instanceof Cons)) {

final Object f612 = ShenLazyderef.LAMBDA.apply(((Cons)v727609).head, v789);

final Object v728611 = f612;

final Object i774;
if ((boolean)Lang.equals(RuntimeContext.symbol("-->"), v728611)) {

final Object f614 = ShenLazyderef.LAMBDA.apply(((Cons)v727609).tail, v789);

final Object v729613 = f614;


final Object i689;
if ((boolean)(v729613 instanceof Cons)) {


final Object b615 = ((Cons)v729613).head;

final Object f617 = ShenLazyderef.LAMBDA.apply(((Cons)v729613).tail, v789);

final Object v730616 = f617;

final Object i661;
if ((boolean)Lang.equals(Nil.NIL, v730616)) {
final Object f619 = ShenNewpv.LAMBDA.apply(v789);

final Object z618 = f619;
final Object f621 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO620 = f621;
final Object f622 = ShenIncinfs.LAMBDA.apply();
final Lambda l633 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f623 = ShenPlaceholder.LAMBDA.apply();
final Lambda l631 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f624 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO620, v789);
final Object f625 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f626 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f627 = ShenEbr.LAMBDA.apply(f624, f625, f626);
final Lambda l629 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f628 = ShenThStar.LAMBDA.apply(z618, b615, new Cons(new Cons(xTOxDOTOxDO620, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f628;
  }
};final Object f630 = Bind.LAMBDA.apply(z618, f627, v789, l629);

    return f630;
  }
};final Object f632 = Bind.LAMBDA.apply(xTOxDOTOxDO620, f623, v789, l631);

    return f632;
  }
};final Object f634 = Cut.LAMBDA.apply(throwcontrol123, v789, l633);
final Object f635 = Do.LAMBDA.apply(f622, f634);



i661 = f635;
} else {
final Object f636 = ShenPvarQ.LAMBDA.apply(v730616);

final Object i660;
if ((boolean)f636) {
final Object f637 = ShenBindv.LAMBDA.apply(v730616, Nil.NIL, v789);
final Object f640 = ShenNewpv.LAMBDA.apply(v789);

final Object z639 = f640;
final Object f642 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO641 = f642;
final Object f643 = ShenIncinfs.LAMBDA.apply();
final Lambda l654 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f644 = ShenPlaceholder.LAMBDA.apply();
final Lambda l652 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f645 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO641, v789);
final Object f646 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f647 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f648 = ShenEbr.LAMBDA.apply(f645, f646, f647);
final Lambda l650 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f649 = ShenThStar.LAMBDA.apply(z639, b615, new Cons(new Cons(xTOxDOTOxDO641, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f649;
  }
};final Object f651 = Bind.LAMBDA.apply(z639, f648, v789, l650);

    return f651;
  }
};final Object f653 = Bind.LAMBDA.apply(xTOxDOTOxDO641, f644, v789, l652);

    return f653;
  }
};final Object f655 = Cut.LAMBDA.apply(throwcontrol123, v789, l654);
final Object f656 = Do.LAMBDA.apply(f643, f655);



final Object result638 = f656;
final Object f657 = ShenUnbindv.LAMBDA.apply(v730616, v789);
final Object f658 = Do.LAMBDA.apply(f657, result638);

final Object f659 = Do.LAMBDA.apply(f637, f658);

i660 = f659;
} else {

i660 = false;

}
i661 = i660;

}


i689 = i661;
} else {
final Object f662 = ShenPvarQ.LAMBDA.apply(v729613);

final Object i688;
if ((boolean)f662) {
final Object f664 = ShenNewpv.LAMBDA.apply(v789);

final Object b663 = f664;


final Object f665 = ShenBindv.LAMBDA.apply(v729613, new Cons(b663, Nil.NIL), v789);
final Object f668 = ShenNewpv.LAMBDA.apply(v789);

final Object z667 = f668;
final Object f670 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO669 = f670;
final Object f671 = ShenIncinfs.LAMBDA.apply();
final Lambda l682 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f672 = ShenPlaceholder.LAMBDA.apply();
final Lambda l680 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f673 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO669, v789);
final Object f674 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f675 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f676 = ShenEbr.LAMBDA.apply(f673, f674, f675);
final Lambda l678 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f677 = ShenThStar.LAMBDA.apply(z667, b663, new Cons(new Cons(xTOxDOTOxDO669, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f677;
  }
};final Object f679 = Bind.LAMBDA.apply(z667, f676, v789, l678);

    return f679;
  }
};final Object f681 = Bind.LAMBDA.apply(xTOxDOTOxDO669, f672, v789, l680);

    return f681;
  }
};final Object f683 = Cut.LAMBDA.apply(throwcontrol123, v789, l682);
final Object f684 = Do.LAMBDA.apply(f671, f683);



final Object result666 = f684;
final Object f685 = ShenUnbindv.LAMBDA.apply(v729613, v789);
final Object f686 = Do.LAMBDA.apply(f685, result666);

final Object f687 = Do.LAMBDA.apply(f665, f686);


i688 = f687;
} else {

i688 = false;

}
i689 = i688;

}

i774 = i689;
} else {
final Object f690 = ShenPvarQ.LAMBDA.apply(v728611);

final Object i773;
if ((boolean)f690) {
final Object f691 = ShenBindv.LAMBDA.apply(v728611, RuntimeContext.symbol("-->"), v789);

final Object f694 = ShenLazyderef.LAMBDA.apply(((Cons)v727609).tail, v789);

final Object v731693 = f694;


final Object i769;
if ((boolean)(v731693 instanceof Cons)) {


final Object b695 = ((Cons)v731693).head;

final Object f697 = ShenLazyderef.LAMBDA.apply(((Cons)v731693).tail, v789);

final Object v732696 = f697;

final Object i741;
if ((boolean)Lang.equals(Nil.NIL, v732696)) {
final Object f699 = ShenNewpv.LAMBDA.apply(v789);

final Object z698 = f699;
final Object f701 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO700 = f701;
final Object f702 = ShenIncinfs.LAMBDA.apply();
final Lambda l713 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f703 = ShenPlaceholder.LAMBDA.apply();
final Lambda l711 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f704 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO700, v789);
final Object f705 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f706 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f707 = ShenEbr.LAMBDA.apply(f704, f705, f706);
final Lambda l709 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f708 = ShenThStar.LAMBDA.apply(z698, b695, new Cons(new Cons(xTOxDOTOxDO700, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f708;
  }
};final Object f710 = Bind.LAMBDA.apply(z698, f707, v789, l709);

    return f710;
  }
};final Object f712 = Bind.LAMBDA.apply(xTOxDOTOxDO700, f703, v789, l711);

    return f712;
  }
};final Object f714 = Cut.LAMBDA.apply(throwcontrol123, v789, l713);
final Object f715 = Do.LAMBDA.apply(f702, f714);



i741 = f715;
} else {
final Object f716 = ShenPvarQ.LAMBDA.apply(v732696);

final Object i740;
if ((boolean)f716) {
final Object f717 = ShenBindv.LAMBDA.apply(v732696, Nil.NIL, v789);
final Object f720 = ShenNewpv.LAMBDA.apply(v789);

final Object z719 = f720;
final Object f722 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO721 = f722;
final Object f723 = ShenIncinfs.LAMBDA.apply();
final Lambda l734 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f724 = ShenPlaceholder.LAMBDA.apply();
final Lambda l732 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f725 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO721, v789);
final Object f726 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f727 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f728 = ShenEbr.LAMBDA.apply(f725, f726, f727);
final Lambda l730 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f729 = ShenThStar.LAMBDA.apply(z719, b695, new Cons(new Cons(xTOxDOTOxDO721, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f729;
  }
};final Object f731 = Bind.LAMBDA.apply(z719, f728, v789, l730);

    return f731;
  }
};final Object f733 = Bind.LAMBDA.apply(xTOxDOTOxDO721, f724, v789, l732);

    return f733;
  }
};final Object f735 = Cut.LAMBDA.apply(throwcontrol123, v789, l734);
final Object f736 = Do.LAMBDA.apply(f723, f735);



final Object result718 = f736;
final Object f737 = ShenUnbindv.LAMBDA.apply(v732696, v789);
final Object f738 = Do.LAMBDA.apply(f737, result718);

final Object f739 = Do.LAMBDA.apply(f717, f738);

i740 = f739;
} else {

i740 = false;

}
i741 = i740;

}


i769 = i741;
} else {
final Object f742 = ShenPvarQ.LAMBDA.apply(v731693);

final Object i768;
if ((boolean)f742) {
final Object f744 = ShenNewpv.LAMBDA.apply(v789);

final Object b743 = f744;


final Object f745 = ShenBindv.LAMBDA.apply(v731693, new Cons(b743, Nil.NIL), v789);
final Object f748 = ShenNewpv.LAMBDA.apply(v789);

final Object z747 = f748;
final Object f750 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO749 = f750;
final Object f751 = ShenIncinfs.LAMBDA.apply();
final Lambda l762 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f752 = ShenPlaceholder.LAMBDA.apply();
final Lambda l760 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f753 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO749, v789);
final Object f754 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f755 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f756 = ShenEbr.LAMBDA.apply(f753, f754, f755);
final Lambda l758 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f757 = ShenThStar.LAMBDA.apply(z747, b743, new Cons(new Cons(xTOxDOTOxDO749, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f757;
  }
};final Object f759 = Bind.LAMBDA.apply(z747, f756, v789, l758);

    return f759;
  }
};final Object f761 = Bind.LAMBDA.apply(xTOxDOTOxDO749, f752, v789, l760);

    return f761;
  }
};final Object f763 = Cut.LAMBDA.apply(throwcontrol123, v789, l762);
final Object f764 = Do.LAMBDA.apply(f751, f763);



final Object result746 = f764;
final Object f765 = ShenUnbindv.LAMBDA.apply(v731693, v789);
final Object f766 = Do.LAMBDA.apply(f765, result746);

final Object f767 = Do.LAMBDA.apply(f745, f766);


i768 = f767;
} else {

i768 = false;

}
i769 = i768;

}

final Object result692 = i769;
final Object f770 = ShenUnbindv.LAMBDA.apply(v728611, v789);
final Object f771 = Do.LAMBDA.apply(f770, result692);

final Object f772 = Do.LAMBDA.apply(f691, f771);

i773 = f772;
} else {

i773 = false;

}
i774 = i773;

}

i802 = i774;
} else {
final Object f775 = ShenPvarQ.LAMBDA.apply(v727609);

final Object i801;
if ((boolean)f775) {
final Object f777 = ShenNewpv.LAMBDA.apply(v789);

final Object b776 = f777;




final Object f778 = ShenBindv.LAMBDA.apply(v727609, new Cons(RuntimeContext.symbol("-->"), new Cons(b776, Nil.NIL)), v789);
final Object f781 = ShenNewpv.LAMBDA.apply(v789);

final Object z780 = f781;
final Object f783 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO782 = f783;
final Object f784 = ShenIncinfs.LAMBDA.apply();
final Lambda l795 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f785 = ShenPlaceholder.LAMBDA.apply();
final Lambda l793 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f786 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO782, v789);
final Object f787 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f788 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f789 = ShenEbr.LAMBDA.apply(f786, f787, f788);
final Lambda l791 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f790 = ShenThStar.LAMBDA.apply(z780, b776, new Cons(new Cons(xTOxDOTOxDO782, new Cons(RuntimeContext.symbol(":"), new Cons(a608, Nil.NIL))), v788), v789, v790);

    return f790;
  }
};final Object f792 = Bind.LAMBDA.apply(z780, f789, v789, l791);

    return f792;
  }
};final Object f794 = Bind.LAMBDA.apply(xTOxDOTOxDO782, f785, v789, l793);

    return f794;
  }
};final Object f796 = Cut.LAMBDA.apply(throwcontrol123, v789, l795);
final Object f797 = Do.LAMBDA.apply(f784, f796);



final Object result779 = f797;
final Object f798 = ShenUnbindv.LAMBDA.apply(v727609, v789);
final Object f799 = Do.LAMBDA.apply(f798, result779);

final Object f800 = Do.LAMBDA.apply(f778, f799);


i801 = f800;
} else {

i801 = false;

}
i802 = i801;

}


i832 = i802;
} else {
final Object f803 = ShenPvarQ.LAMBDA.apply(v726606);

final Object i831;
if ((boolean)f803) {
final Object f805 = ShenNewpv.LAMBDA.apply(v789);

final Object a804 = f805;
final Object f807 = ShenNewpv.LAMBDA.apply(v789);

final Object b806 = f807;






final Object f808 = ShenBindv.LAMBDA.apply(v726606, new Cons(a804, new Cons(RuntimeContext.symbol("-->"), new Cons(b806, Nil.NIL))), v789);
final Object f811 = ShenNewpv.LAMBDA.apply(v789);

final Object z810 = f811;
final Object f813 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO812 = f813;
final Object f814 = ShenIncinfs.LAMBDA.apply();
final Lambda l825 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f815 = ShenPlaceholder.LAMBDA.apply();
final Lambda l823 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f816 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO812, v789);
final Object f817 = ShenLazyderef.LAMBDA.apply(x600, v789);
final Object f818 = ShenLazyderef.LAMBDA.apply(y603, v789);
final Object f819 = ShenEbr.LAMBDA.apply(f816, f817, f818);
final Lambda l821 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f820 = ShenThStar.LAMBDA.apply(z810, b806, new Cons(new Cons(xTOxDOTOxDO812, new Cons(RuntimeContext.symbol(":"), new Cons(a804, Nil.NIL))), v788), v789, v790);

    return f820;
  }
};final Object f822 = Bind.LAMBDA.apply(z810, f819, v789, l821);

    return f822;
  }
};final Object f824 = Bind.LAMBDA.apply(xTOxDOTOxDO812, f815, v789, l823);

    return f824;
  }
};final Object f826 = Cut.LAMBDA.apply(throwcontrol123, v789, l825);
final Object f827 = Do.LAMBDA.apply(f814, f826);



final Object result809 = f827;
final Object f828 = ShenUnbindv.LAMBDA.apply(v726606, v789);
final Object f829 = Do.LAMBDA.apply(f828, result809);

final Object f830 = Do.LAMBDA.apply(f808, f829);



i831 = f830;
} else {

i831 = false;

}
i832 = i831;

}

i833 = i832;
} else {

i833 = false;

}


i834 = i833;
} else {

i834 = false;

}


i835 = i834;
} else {

i835 = false;

}

i836 = i835;
} else {

i836 = false;

}

i837 = i836;
} else {

i837 = false;

}

final Object case593 = i837;

final Object i1244;
if ((boolean)Lang.equals(case593, false)) {
final Object f840 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v733839 = f840;


final Object i881;
if ((boolean)(v733839 instanceof Cons)) {

final Object f842 = ShenLazyderef.LAMBDA.apply(((Cons)v733839).head, v789);

final Object v734841 = f842;

final Object i880;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), v734841)) {

final Object f844 = ShenLazyderef.LAMBDA.apply(((Cons)v733839).tail, v789);

final Object v735843 = f844;


final Object i879;
if ((boolean)(v735843 instanceof Cons)) {


final Object x845 = ((Cons)v735843).head;

final Object f847 = ShenLazyderef.LAMBDA.apply(((Cons)v735843).tail, v789);

final Object v736846 = f847;


final Object i878;
if ((boolean)(v736846 instanceof Cons)) {


final Object y848 = ((Cons)v736846).head;

final Object f850 = ShenLazyderef.LAMBDA.apply(((Cons)v736846).tail, v789);

final Object v737849 = f850;


final Object i877;
if ((boolean)(v737849 instanceof Cons)) {


final Object z851 = ((Cons)v737849).head;

final Object f853 = ShenLazyderef.LAMBDA.apply(((Cons)v737849).tail, v789);

final Object v738852 = f853;

final Object i876;
if ((boolean)Lang.equals(Nil.NIL, v738852)) {
final Object f855 = ShenNewpv.LAMBDA.apply(v789);

final Object w854 = f855;
final Object f857 = ShenNewpv.LAMBDA.apply(v789);

final Object xTOxDOTOxDO856 = f857;
final Object f859 = ShenNewpv.LAMBDA.apply(v789);

final Object b858 = f859;
final Object f860 = ShenIncinfs.LAMBDA.apply();
final Lambda l873 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l871 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f861 = ShenPlaceholder.LAMBDA.apply();
final Lambda l869 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f862 = ShenLazyderef.LAMBDA.apply(xTOxDOTOxDO856, v789);
final Object f863 = ShenLazyderef.LAMBDA.apply(x845, v789);
final Object f864 = ShenLazyderef.LAMBDA.apply(z851, v789);
final Object f865 = ShenEbr.LAMBDA.apply(f862, f863, f864);
final Lambda l867 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f866 = ShenThStar.LAMBDA.apply(w854, v787, new Cons(new Cons(xTOxDOTOxDO856, new Cons(RuntimeContext.symbol(":"), new Cons(b858, Nil.NIL))), v788), v789, v790);

    return f866;
  }
};final Object f868 = Bind.LAMBDA.apply(w854, f865, v789, l867);

    return f868;
  }
};final Object f870 = Bind.LAMBDA.apply(xTOxDOTOxDO856, f861, v789, l869);

    return f870;
  }
};final Object f872 = ShenThStar.LAMBDA.apply(y848, b858, v788, v789, l871);

    return f872;
  }
};final Object f874 = Cut.LAMBDA.apply(throwcontrol123, v789, l873);
final Object f875 = Do.LAMBDA.apply(f860, f874);




i876 = f875;
} else {

i876 = false;

}


i877 = i876;
} else {

i877 = false;

}


i878 = i877;
} else {

i878 = false;

}


i879 = i878;
} else {

i879 = false;

}

i880 = i879;
} else {

i880 = false;

}

i881 = i880;
} else {

i881 = false;

}

final Object case838 = i881;

final Object i1243;
if ((boolean)Lang.equals(case838, false)) {
final Object f884 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v739883 = f884;


final Object i1022;
if ((boolean)(v739883 instanceof Cons)) {

final Object f886 = ShenLazyderef.LAMBDA.apply(((Cons)v739883).head, v789);

final Object v740885 = f886;

final Object i1021;
if ((boolean)Lang.equals(RuntimeContext.symbol("open"), v740885)) {

final Object f888 = ShenLazyderef.LAMBDA.apply(((Cons)v739883).tail, v789);

final Object v741887 = f888;


final Object i1020;
if ((boolean)(v741887 instanceof Cons)) {

final Object f890 = ShenLazyderef.LAMBDA.apply(((Cons)v741887).head, v789);

final Object v742889 = f890;

final Object i1019;
if ((boolean)Lang.equals(RuntimeContext.symbol("file"), v742889)) {

final Object f892 = ShenLazyderef.LAMBDA.apply(((Cons)v741887).tail, v789);

final Object v743891 = f892;


final Object i1018;
if ((boolean)(v743891 instanceof Cons)) {


final Object fileName893 = ((Cons)v743891).head;

final Object f895 = ShenLazyderef.LAMBDA.apply(((Cons)v743891).tail, v789);

final Object v744894 = f895;


final Object i1017;
if ((boolean)(v744894 instanceof Cons)) {


final Object direction674896 = ((Cons)v744894).head;

final Object f898 = ShenLazyderef.LAMBDA.apply(((Cons)v744894).tail, v789);

final Object v745897 = f898;

final Object i1016;
if ((boolean)Lang.equals(Nil.NIL, v745897)) {
final Object f900 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v746899 = f900;


final Object i1015;
if ((boolean)(v746899 instanceof Cons)) {

final Object f902 = ShenLazyderef.LAMBDA.apply(((Cons)v746899).head, v789);

final Object v747901 = f902;

final Object i998;
if ((boolean)Lang.equals(RuntimeContext.symbol("stream"), v747901)) {

final Object f904 = ShenLazyderef.LAMBDA.apply(((Cons)v746899).tail, v789);

final Object v748903 = f904;


final Object i946;
if ((boolean)(v748903 instanceof Cons)) {


final Object direction905 = ((Cons)v748903).head;

final Object f907 = ShenLazyderef.LAMBDA.apply(((Cons)v748903).tail, v789);

final Object v749906 = f907;

final Object i929;
if ((boolean)Lang.equals(Nil.NIL, v749906)) {
final Object f908 = ShenIncinfs.LAMBDA.apply();
final Lambda l912 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l910 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f909 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f909;
  }
};final Object f911 = Cut.LAMBDA.apply(throwcontrol123, v789, l910);

    return f911;
  }
};final Object f913 = UnifyBang.LAMBDA.apply(direction905, direction674896, v789, l912);
final Object f914 = Do.LAMBDA.apply(f908, f913);

i929 = f914;
} else {
final Object f915 = ShenPvarQ.LAMBDA.apply(v749906);

final Object i928;
if ((boolean)f915) {
final Object f916 = ShenBindv.LAMBDA.apply(v749906, Nil.NIL, v789);
final Object f918 = ShenIncinfs.LAMBDA.apply();
final Lambda l922 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l920 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f919 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f919;
  }
};final Object f921 = Cut.LAMBDA.apply(throwcontrol123, v789, l920);

    return f921;
  }
};final Object f923 = UnifyBang.LAMBDA.apply(direction905, direction674896, v789, l922);
final Object f924 = Do.LAMBDA.apply(f918, f923);

final Object result917 = f924;
final Object f925 = ShenUnbindv.LAMBDA.apply(v749906, v789);
final Object f926 = Do.LAMBDA.apply(f925, result917);

final Object f927 = Do.LAMBDA.apply(f916, f926);

i928 = f927;
} else {

i928 = false;

}
i929 = i928;

}


i946 = i929;
} else {
final Object f930 = ShenPvarQ.LAMBDA.apply(v748903);

final Object i945;
if ((boolean)f930) {
final Object f932 = ShenNewpv.LAMBDA.apply(v789);

final Object direction931 = f932;


final Object f933 = ShenBindv.LAMBDA.apply(v748903, new Cons(direction931, Nil.NIL), v789);
final Object f935 = ShenIncinfs.LAMBDA.apply();
final Lambda l939 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l937 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f936 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f936;
  }
};final Object f938 = Cut.LAMBDA.apply(throwcontrol123, v789, l937);

    return f938;
  }
};final Object f940 = UnifyBang.LAMBDA.apply(direction931, direction674896, v789, l939);
final Object f941 = Do.LAMBDA.apply(f935, f940);

final Object result934 = f941;
final Object f942 = ShenUnbindv.LAMBDA.apply(v748903, v789);
final Object f943 = Do.LAMBDA.apply(f942, result934);

final Object f944 = Do.LAMBDA.apply(f933, f943);


i945 = f944;
} else {

i945 = false;

}
i946 = i945;

}

i998 = i946;
} else {
final Object f947 = ShenPvarQ.LAMBDA.apply(v747901);

final Object i997;
if ((boolean)f947) {
final Object f948 = ShenBindv.LAMBDA.apply(v747901, RuntimeContext.symbol("stream"), v789);

final Object f951 = ShenLazyderef.LAMBDA.apply(((Cons)v746899).tail, v789);

final Object v750950 = f951;


final Object i993;
if ((boolean)(v750950 instanceof Cons)) {


final Object direction952 = ((Cons)v750950).head;

final Object f954 = ShenLazyderef.LAMBDA.apply(((Cons)v750950).tail, v789);

final Object v751953 = f954;

final Object i976;
if ((boolean)Lang.equals(Nil.NIL, v751953)) {
final Object f955 = ShenIncinfs.LAMBDA.apply();
final Lambda l959 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l957 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f956 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f956;
  }
};final Object f958 = Cut.LAMBDA.apply(throwcontrol123, v789, l957);

    return f958;
  }
};final Object f960 = UnifyBang.LAMBDA.apply(direction952, direction674896, v789, l959);
final Object f961 = Do.LAMBDA.apply(f955, f960);

i976 = f961;
} else {
final Object f962 = ShenPvarQ.LAMBDA.apply(v751953);

final Object i975;
if ((boolean)f962) {
final Object f963 = ShenBindv.LAMBDA.apply(v751953, Nil.NIL, v789);
final Object f965 = ShenIncinfs.LAMBDA.apply();
final Lambda l969 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l967 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f966 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f966;
  }
};final Object f968 = Cut.LAMBDA.apply(throwcontrol123, v789, l967);

    return f968;
  }
};final Object f970 = UnifyBang.LAMBDA.apply(direction952, direction674896, v789, l969);
final Object f971 = Do.LAMBDA.apply(f965, f970);

final Object result964 = f971;
final Object f972 = ShenUnbindv.LAMBDA.apply(v751953, v789);
final Object f973 = Do.LAMBDA.apply(f972, result964);

final Object f974 = Do.LAMBDA.apply(f963, f973);

i975 = f974;
} else {

i975 = false;

}
i976 = i975;

}


i993 = i976;
} else {
final Object f977 = ShenPvarQ.LAMBDA.apply(v750950);

final Object i992;
if ((boolean)f977) {
final Object f979 = ShenNewpv.LAMBDA.apply(v789);

final Object direction978 = f979;


final Object f980 = ShenBindv.LAMBDA.apply(v750950, new Cons(direction978, Nil.NIL), v789);
final Object f982 = ShenIncinfs.LAMBDA.apply();
final Lambda l986 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l984 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f983 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f983;
  }
};final Object f985 = Cut.LAMBDA.apply(throwcontrol123, v789, l984);

    return f985;
  }
};final Object f987 = UnifyBang.LAMBDA.apply(direction978, direction674896, v789, l986);
final Object f988 = Do.LAMBDA.apply(f982, f987);

final Object result981 = f988;
final Object f989 = ShenUnbindv.LAMBDA.apply(v750950, v789);
final Object f990 = Do.LAMBDA.apply(f989, result981);

final Object f991 = Do.LAMBDA.apply(f980, f990);


i992 = f991;
} else {

i992 = false;

}
i993 = i992;

}

final Object result949 = i993;
final Object f994 = ShenUnbindv.LAMBDA.apply(v747901, v789);
final Object f995 = Do.LAMBDA.apply(f994, result949);

final Object f996 = Do.LAMBDA.apply(f948, f995);

i997 = f996;
} else {

i997 = false;

}
i998 = i997;

}

i1015 = i998;
} else {
final Object f999 = ShenPvarQ.LAMBDA.apply(v746899);

final Object i1014;
if ((boolean)f999) {
final Object f1001 = ShenNewpv.LAMBDA.apply(v789);

final Object direction1000 = f1001;




final Object f1002 = ShenBindv.LAMBDA.apply(v746899, new Cons(RuntimeContext.symbol("stream"), new Cons(direction1000, Nil.NIL)), v789);
final Object f1004 = ShenIncinfs.LAMBDA.apply();
final Lambda l1008 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l1006 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f1005 = ShenThStar.LAMBDA.apply(fileName893, RuntimeContext.symbol("string"), v788, v789, v790);

    return f1005;
  }
};final Object f1007 = Cut.LAMBDA.apply(throwcontrol123, v789, l1006);

    return f1007;
  }
};final Object f1009 = UnifyBang.LAMBDA.apply(direction1000, direction674896, v789, l1008);
final Object f1010 = Do.LAMBDA.apply(f1004, f1009);

final Object result1003 = f1010;
final Object f1011 = ShenUnbindv.LAMBDA.apply(v746899, v789);
final Object f1012 = Do.LAMBDA.apply(f1011, result1003);

final Object f1013 = Do.LAMBDA.apply(f1002, f1012);


i1014 = f1013;
} else {

i1014 = false;

}
i1015 = i1014;

}

i1016 = i1015;
} else {

i1016 = false;

}


i1017 = i1016;
} else {

i1017 = false;

}


i1018 = i1017;
} else {

i1018 = false;

}

i1019 = i1018;
} else {

i1019 = false;

}

i1020 = i1019;
} else {

i1020 = false;

}

i1021 = i1020;
} else {

i1021 = false;

}

i1022 = i1021;
} else {

i1022 = false;

}

final Object case882 = i1022;

final Object i1242;
if ((boolean)Lang.equals(case882, false)) {
final Object f1025 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7521024 = f1025;


final Object i1047;
if ((boolean)(v7521024 instanceof Cons)) {

final Object f1027 = ShenLazyderef.LAMBDA.apply(((Cons)v7521024).head, v789);

final Object v7531026 = f1027;

final Object i1046;
if ((boolean)Lang.equals(RuntimeContext.symbol("type"), v7531026)) {

final Object f1029 = ShenLazyderef.LAMBDA.apply(((Cons)v7521024).tail, v789);

final Object v7541028 = f1029;


final Object i1045;
if ((boolean)(v7541028 instanceof Cons)) {


final Object x1030 = ((Cons)v7541028).head;

final Object f1032 = ShenLazyderef.LAMBDA.apply(((Cons)v7541028).tail, v789);

final Object v7551031 = f1032;


final Object i1044;
if ((boolean)(v7551031 instanceof Cons)) {


final Object a1033 = ((Cons)v7551031).head;

final Object f1035 = ShenLazyderef.LAMBDA.apply(((Cons)v7551031).tail, v789);

final Object v7561034 = f1035;

final Object i1043;
if ((boolean)Lang.equals(Nil.NIL, v7561034)) {
final Object f1036 = ShenIncinfs.LAMBDA.apply();
final Lambda l1040 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l1038 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f1037 = ShenThStar.LAMBDA.apply(x1030, a1033, v788, v789, v790);

    return f1037;
  }
};final Object f1039 = Unify.LAMBDA.apply(a1033, v787, v789, l1038);

    return f1039;
  }
};final Object f1041 = Cut.LAMBDA.apply(throwcontrol123, v789, l1040);
final Object f1042 = Do.LAMBDA.apply(f1036, f1041);

i1043 = f1042;
} else {

i1043 = false;

}


i1044 = i1043;
} else {

i1044 = false;

}


i1045 = i1044;
} else {

i1045 = false;

}

i1046 = i1045;
} else {

i1046 = false;

}

i1047 = i1046;
} else {

i1047 = false;

}

final Object case1023 = i1047;

final Object i1241;
if ((boolean)Lang.equals(case1023, false)) {
final Object f1050 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7571049 = f1050;


final Object i1076;
if ((boolean)(v7571049 instanceof Cons)) {

final Object f1052 = ShenLazyderef.LAMBDA.apply(((Cons)v7571049).head, v789);

final Object v7581051 = f1052;

final Object i1075;
if ((boolean)Lang.equals(RuntimeContext.symbol("input+"), v7581051)) {

final Object f1054 = ShenLazyderef.LAMBDA.apply(((Cons)v7571049).tail, v789);

final Object v7591053 = f1054;


final Object i1074;
if ((boolean)(v7591053 instanceof Cons)) {

final Object f1056 = ShenLazyderef.LAMBDA.apply(((Cons)v7591053).head, v789);

final Object v7601055 = f1056;

final Object i1073;
if ((boolean)Lang.equals(RuntimeContext.symbol(":"), v7601055)) {

final Object f1058 = ShenLazyderef.LAMBDA.apply(((Cons)v7591053).tail, v789);

final Object v7611057 = f1058;


final Object i1072;
if ((boolean)(v7611057 instanceof Cons)) {


final Object a1059 = ((Cons)v7611057).head;

final Object f1061 = ShenLazyderef.LAMBDA.apply(((Cons)v7611057).tail, v789);

final Object v7621060 = f1061;

final Object i1071;
if ((boolean)Lang.equals(Nil.NIL, v7621060)) {
final Object f1063 = ShenNewpv.LAMBDA.apply(v789);

final Object c1062 = f1063;
final Object f1064 = ShenIncinfs.LAMBDA.apply();
final Object f1065 = ShenLazyderef.LAMBDA.apply(a1059, v789);
final Object f1066 = ShenNormaliseType.LAMBDA.apply(f1065);
final Lambda l1068 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f1067 = Unify.LAMBDA.apply(v787, c1062, v789, v790);

    return f1067;
  }
};final Object f1069 = Bind.LAMBDA.apply(c1062, f1066, v789, l1068);
final Object f1070 = Do.LAMBDA.apply(f1064, f1069);


i1071 = f1070;
} else {

i1071 = false;

}


i1072 = i1071;
} else {

i1072 = false;

}

i1073 = i1072;
} else {

i1073 = false;

}

i1074 = i1073;
} else {

i1074 = false;

}

i1075 = i1074;
} else {

i1075 = false;

}

i1076 = i1075;
} else {

i1076 = false;

}

final Object case1048 = i1076;

final Object i1240;
if ((boolean)Lang.equals(case1048, false)) {
final Object f1079 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7631078 = f1079;


final Object i1103;
if ((boolean)(v7631078 instanceof Cons)) {

final Object f1081 = ShenLazyderef.LAMBDA.apply(((Cons)v7631078).head, v789);

final Object v7641080 = f1081;

final Object i1102;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), v7641080)) {

final Object f1083 = ShenLazyderef.LAMBDA.apply(((Cons)v7631078).tail, v789);

final Object v7651082 = f1083;


final Object i1101;
if ((boolean)(v7651082 instanceof Cons)) {


final Object p1084 = ((Cons)v7651082).head;

final Object f1086 = ShenLazyderef.LAMBDA.apply(((Cons)v7651082).tail, v789);

final Object v7661085 = f1086;


final Object i1100;
if ((boolean)(v7661085 instanceof Cons)) {


final Object x1087 = ((Cons)v7661085).head;

final Object f1089 = ShenLazyderef.LAMBDA.apply(((Cons)v7661085).tail, v789);

final Object v7671088 = f1089;

final Object i1099;
if ((boolean)Lang.equals(Nil.NIL, v7671088)) {
final Object f1090 = ShenIncinfs.LAMBDA.apply();
final Lambda l1096 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l1094 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l1092 = new Lambda0() {
  public Object apply() throws Exception {
    







final Object f1091 = ShenThStar.LAMBDA.apply(x1087, v787, new Cons(new Cons(p1084, new Cons(RuntimeContext.symbol(":"), new Cons(RuntimeContext.symbol("verified"), Nil.NIL))), v788), v789, v790);

    return f1091;
  }
};final Object f1093 = Cut.LAMBDA.apply(throwcontrol123, v789, l1092);

    return f1093;
  }
};final Object f1095 = ShenThStar.LAMBDA.apply(p1084, RuntimeContext.symbol("boolean"), v788, v789, l1094);

    return f1095;
  }
};final Object f1097 = Cut.LAMBDA.apply(throwcontrol123, v789, l1096);
final Object f1098 = Do.LAMBDA.apply(f1090, f1097);

i1099 = f1098;
} else {

i1099 = false;

}


i1100 = i1099;
} else {

i1100 = false;

}


i1101 = i1100;
} else {

i1101 = false;

}

i1102 = i1101;
} else {

i1102 = false;

}

i1103 = i1102;
} else {

i1103 = false;

}

final Object case1077 = i1103;

final Object i1239;
if ((boolean)Lang.equals(case1077, false)) {
final Object f1106 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7681105 = f1106;


final Object i1128;
if ((boolean)(v7681105 instanceof Cons)) {

final Object f1108 = ShenLazyderef.LAMBDA.apply(((Cons)v7681105).head, v789);

final Object v7691107 = f1108;

final Object i1127;
if ((boolean)Lang.equals(RuntimeContext.symbol("set"), v7691107)) {

final Object f1110 = ShenLazyderef.LAMBDA.apply(((Cons)v7681105).tail, v789);

final Object v7701109 = f1110;


final Object i1126;
if ((boolean)(v7701109 instanceof Cons)) {


final Object var1111 = ((Cons)v7701109).head;

final Object f1113 = ShenLazyderef.LAMBDA.apply(((Cons)v7701109).tail, v789);

final Object v7711112 = f1113;


final Object i1125;
if ((boolean)(v7711112 instanceof Cons)) {


final Object val1114 = ((Cons)v7711112).head;

final Object f1116 = ShenLazyderef.LAMBDA.apply(((Cons)v7711112).tail, v789);

final Object v7721115 = f1116;

final Object i1124;
if ((boolean)Lang.equals(Nil.NIL, v7721115)) {
final Object f1117 = ShenIncinfs.LAMBDA.apply();
final Lambda l1121 = new Lambda0() {
  public Object apply() throws Exception {
    



final Lambda l1119 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f1118 = ShenThStar.LAMBDA.apply(val1114, v787, v788, v789, v790);

    return f1118;
  }
};final Object f1120 = ShenThStar.LAMBDA.apply(new Cons(RuntimeContext.symbol("value"), new Cons(var1111, Nil.NIL)), v787, v788, v789, l1119);

    return f1120;
  }
};final Object f1122 = Cut.LAMBDA.apply(throwcontrol123, v789, l1121);
final Object f1123 = Do.LAMBDA.apply(f1117, f1122);

i1124 = f1123;
} else {

i1124 = false;

}


i1125 = i1124;
} else {

i1125 = false;

}


i1126 = i1125;
} else {

i1126 = false;

}

i1127 = i1126;
} else {

i1127 = false;

}

i1128 = i1127;
} else {

i1128 = false;

}

final Object case1104 = i1128;

final Object i1238;
if ((boolean)Lang.equals(case1104, false)) {
final Object f1131 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7731130 = f1131;


final Object i1154;
if ((boolean)(v7731130 instanceof Cons)) {

final Object f1133 = ShenLazyderef.LAMBDA.apply(((Cons)v7731130).head, v789);

final Object v7741132 = f1133;

final Object i1153;
if ((boolean)Lang.equals(RuntimeContext.symbol("fail"), v7741132)) {

final Object f1135 = ShenLazyderef.LAMBDA.apply(((Cons)v7731130).tail, v789);

final Object v7751134 = f1135;

final Object i1152;
if ((boolean)Lang.equals(Nil.NIL, v7751134)) {
final Object f1137 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v7761136 = f1137;

final Object i1151;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), v7761136)) {
final Object f1138 = ShenIncinfs.LAMBDA.apply();
final Object f1139 = Thaw.LAMBDA.apply(v790);
final Object f1140 = Do.LAMBDA.apply(f1138, f1139);

i1151 = f1140;
} else {
final Object f1141 = ShenPvarQ.LAMBDA.apply(v7761136);

final Object i1150;
if ((boolean)f1141) {
final Object f1142 = ShenBindv.LAMBDA.apply(v7761136, RuntimeContext.symbol("symbol"), v789);
final Object f1144 = ShenIncinfs.LAMBDA.apply();
final Object f1145 = Thaw.LAMBDA.apply(v790);
final Object f1146 = Do.LAMBDA.apply(f1144, f1145);

final Object result1143 = f1146;
final Object f1147 = ShenUnbindv.LAMBDA.apply(v7761136, v789);
final Object f1148 = Do.LAMBDA.apply(f1147, result1143);

final Object f1149 = Do.LAMBDA.apply(f1142, f1148);

i1150 = f1149;
} else {

i1150 = false;

}
i1151 = i1150;

}

i1152 = i1151;
} else {

i1152 = false;

}

i1153 = i1152;
} else {

i1153 = false;

}

i1154 = i1153;
} else {

i1154 = false;

}

final Object case1129 = i1154;

final Object i1237;
if ((boolean)Lang.equals(case1129, false)) {
final Object f1157 = ShenNewpv.LAMBDA.apply(v789);

final Object newHyp1156 = f1157;
final Object f1158 = ShenIncinfs.LAMBDA.apply();
final Lambda l1160 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f1159 = ShenThStar.LAMBDA.apply(v786, v787, newHyp1156, v789, v790);

    return f1159;
  }
};final Object f1161 = ShenTStarHyps.LAMBDA.apply(v788, newHyp1156, v789, l1160);
final Object f1162 = Do.LAMBDA.apply(f1158, f1161);


final Object case1155 = f1162;

final Object i1236;
if ((boolean)Lang.equals(case1155, false)) {
final Object f1165 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7771164 = f1165;


final Object i1179;
if ((boolean)(v7771164 instanceof Cons)) {

final Object f1167 = ShenLazyderef.LAMBDA.apply(((Cons)v7771164).head, v789);

final Object v7781166 = f1167;

final Object i1178;
if ((boolean)Lang.equals(RuntimeContext.symbol("define"), v7781166)) {

final Object f1169 = ShenLazyderef.LAMBDA.apply(((Cons)v7771164).tail, v789);

final Object v7791168 = f1169;


final Object i1177;
if ((boolean)(v7791168 instanceof Cons)) {


final Object f1170 = ((Cons)v7791168).head;


final Object x1171 = ((Cons)v7791168).tail;
final Object f1172 = ShenIncinfs.LAMBDA.apply();
final Lambda l1174 = new Lambda0() {
  public Object apply() throws Exception {
    



final Object f1173 = ShenTStarDef.LAMBDA.apply(new Cons(RuntimeContext.symbol("define"), new Cons(f1170, x1171)), v787, v788, v789, v790);

    return f1173;
  }
};final Object f1175 = Cut.LAMBDA.apply(throwcontrol123, v789, l1174);
final Object f1176 = Do.LAMBDA.apply(f1172, f1175);



i1177 = f1176;
} else {

i1177 = false;

}

i1178 = i1177;
} else {

i1178 = false;

}

i1179 = i1178;
} else {

i1179 = false;

}

final Object case1163 = i1179;

final Object i1235;
if ((boolean)Lang.equals(case1163, false)) {
final Object f1182 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7801181 = f1182;


final Object i1202;
if ((boolean)(v7801181 instanceof Cons)) {

final Object f1184 = ShenLazyderef.LAMBDA.apply(((Cons)v7801181).head, v789);

final Object v7811183 = f1184;

final Object i1201;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-process-datatype"), v7811183)) {
final Object f1186 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v7821185 = f1186;

final Object i1200;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), v7821185)) {
final Object f1187 = ShenIncinfs.LAMBDA.apply();
final Object f1188 = Thaw.LAMBDA.apply(v790);
final Object f1189 = Do.LAMBDA.apply(f1187, f1188);

i1200 = f1189;
} else {
final Object f1190 = ShenPvarQ.LAMBDA.apply(v7821185);

final Object i1199;
if ((boolean)f1190) {
final Object f1191 = ShenBindv.LAMBDA.apply(v7821185, RuntimeContext.symbol("symbol"), v789);
final Object f1193 = ShenIncinfs.LAMBDA.apply();
final Object f1194 = Thaw.LAMBDA.apply(v790);
final Object f1195 = Do.LAMBDA.apply(f1193, f1194);

final Object result1192 = f1195;
final Object f1196 = ShenUnbindv.LAMBDA.apply(v7821185, v789);
final Object f1197 = Do.LAMBDA.apply(f1196, result1192);

final Object f1198 = Do.LAMBDA.apply(f1191, f1197);

i1199 = f1198;
} else {

i1199 = false;

}
i1200 = i1199;

}

i1201 = i1200;
} else {

i1201 = false;

}

i1202 = i1201;
} else {

i1202 = false;

}

final Object case1180 = i1202;

final Object i1234;
if ((boolean)Lang.equals(case1180, false)) {
final Object f1205 = ShenLazyderef.LAMBDA.apply(v786, v789);

final Object v7831204 = f1205;


final Object i1225;
if ((boolean)(v7831204 instanceof Cons)) {

final Object f1207 = ShenLazyderef.LAMBDA.apply(((Cons)v7831204).head, v789);

final Object v7841206 = f1207;

final Object i1224;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-synonyms-help"), v7841206)) {
final Object f1209 = ShenLazyderef.LAMBDA.apply(v787, v789);

final Object v7851208 = f1209;

final Object i1223;
if ((boolean)Lang.equals(RuntimeContext.symbol("symbol"), v7851208)) {
final Object f1210 = ShenIncinfs.LAMBDA.apply();
final Object f1211 = Thaw.LAMBDA.apply(v790);
final Object f1212 = Do.LAMBDA.apply(f1210, f1211);

i1223 = f1212;
} else {
final Object f1213 = ShenPvarQ.LAMBDA.apply(v7851208);

final Object i1222;
if ((boolean)f1213) {
final Object f1214 = ShenBindv.LAMBDA.apply(v7851208, RuntimeContext.symbol("symbol"), v789);
final Object f1216 = ShenIncinfs.LAMBDA.apply();
final Object f1217 = Thaw.LAMBDA.apply(v790);
final Object f1218 = Do.LAMBDA.apply(f1216, f1217);

final Object result1215 = f1218;
final Object f1219 = ShenUnbindv.LAMBDA.apply(v7851208, v789);
final Object f1220 = Do.LAMBDA.apply(f1219, result1215);

final Object f1221 = Do.LAMBDA.apply(f1214, f1220);

i1222 = f1221;
} else {

i1222 = false;

}
i1223 = i1222;

}

i1224 = i1223;
} else {

i1224 = false;

}

i1225 = i1224;
} else {

i1225 = false;

}

final Object case1203 = i1225;

final Object i1233;
if ((boolean)Lang.equals(case1203, false)) {
final Object f1227 = ShenNewpv.LAMBDA.apply(v789);

final Object datatypes1226 = f1227;
final Object f1228 = ShenIncinfs.LAMBDA.apply();

final Lambda l1230 = new Lambda0() {
  public Object apply() throws Exception {
    





final Object f1229 = ShenUdefsStar.LAMBDA.apply(new Cons(v786, new Cons(RuntimeContext.symbol(":"), new Cons(v787, Nil.NIL))), v788, datatypes1226, v789, v790);

    return f1229;
  }
};final Object f1231 = Bind.LAMBDA.apply(datatypes1226, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*")), v789, l1230);
final Object f1232 = Do.LAMBDA.apply(f1228, f1231);


i1233 = f1232;
} else {

i1233 = case1203;

}

i1234 = i1233;
} else {

i1234 = case1180;

}

i1235 = i1234;
} else {

i1235 = case1163;

}

i1236 = i1235;
} else {

i1236 = case1155;

}

i1237 = i1236;
} else {

i1237 = case1129;

}

i1238 = i1237;
} else {

i1238 = case1104;

}

i1239 = i1238;
} else {

i1239 = case1077;

}

i1240 = i1239;
} else {

i1240 = case1048;

}

i1241 = i1240;
} else {

i1241 = case1023;

}

i1242 = i1241;
} else {

i1242 = case882;

}

i1243 = i1242;
} else {

i1243 = case838;

}

i1244 = i1243;
} else {

i1244 = case593;

}

i1245 = i1244;
} else {

i1245 = case555;

}

i1246 = i1245;
} else {

i1246 = case434;

}

i1247 = i1246;
} else {

i1247 = case293;

}

i1248 = i1247;
} else {

i1248 = case172;

}

i1249 = i1248;
} else {

i1249 = case153;

}

i1250 = i1249;
} else {

i1250 = case149;

}

i1251 = i1250;
} else {

i1251 = case145;

}

i1252 = i1251;
} else {

i1252 = case131;

}

i1253 = i1252;
} else {

i1253 = case125;

}
final Object f1254 = ShenCutpoint.LAMBDA.apply(throwcontrol123, i1253);


    return f1254;

}
}
