package shen.gen;



import com.mentics.shen.*;

public class Match {

public static final Symbol SYMBOL = RuntimeContext.symbol("match");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v253, final Object v254) throws Exception {
return defined(v253, v254);
}};
public static Object defined(final Object v253, final Object v254) throws Exception {
final Object f255 = Equale.LAMBDA.apply(v253, v254);

final Object i317;
if ((boolean)f255) {

i317 = Nil.NIL;
} else {
final Object f256 = VariableQ.LAMBDA.apply(v253);

final Object i316;
if ((boolean)f256) {
final Object f257 = Atp.LAMBDA.apply(v253, v254);



i316 = new Cons(f257, Nil.NIL);
} else {


final Object i275;
if ((boolean)(v253 instanceof Cons)) {


final Object i273;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v253).head)) {



final Object i271;
if ((boolean)(((Cons)v253).tail instanceof Cons)) {




final Object i269;
if ((boolean)(((Cons)((Cons)v253).tail).tail instanceof Cons)) {




final Object i267;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v253).tail).tail).tail)) {


final Object i265;
if ((boolean)(v254 instanceof Cons)) {


final Object i263;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v254).head)) {



final Object i261;
if ((boolean)(((Cons)v254).tail instanceof Cons)) {




final Object i259;
if ((boolean)(((Cons)((Cons)v254).tail).tail instanceof Cons)) {




final Object i258;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v254).tail).tail).tail)) {

i258 = true;
} else {

i258 = false;

}
i259 = i258;
} else {

i259 = false;

}
final Object i260;
if ((boolean)i259) {

i260 = true;
} else {

i260 = false;

}
i261 = i260;
} else {

i261 = false;

}
final Object i262;
if ((boolean)i261) {

i262 = true;
} else {

i262 = false;

}
i263 = i262;
} else {

i263 = false;

}
final Object i264;
if ((boolean)i263) {

i264 = true;
} else {

i264 = false;

}
i265 = i264;
} else {

i265 = false;

}
final Object i266;
if ((boolean)i265) {

i266 = true;
} else {

i266 = false;

}
i267 = i266;
} else {

i267 = false;

}
final Object i268;
if ((boolean)i267) {

i268 = true;
} else {

i268 = false;

}
i269 = i268;
} else {

i269 = false;

}
final Object i270;
if ((boolean)i269) {

i270 = true;
} else {

i270 = false;

}
i271 = i270;
} else {

i271 = false;

}
final Object i272;
if ((boolean)i271) {

i272 = true;
} else {

i272 = false;

}
i273 = i272;
} else {

i273 = false;

}
final Object i274;
if ((boolean)i273) {

i274 = true;
} else {

i274 = false;

}
i275 = i274;
} else {

i275 = false;

}
final Object i315;
if ((boolean)i275) {




final Object f277 = Match.LAMBDA.apply(((Cons)((Cons)v253).tail).head, ((Cons)((Cons)v254).tail).head);

final Object match1276 = f277;
final Object f278 = No_matchQ.LAMBDA.apply(match1276);

final Object i284;
if ((boolean)f278) {

i284 = match1276;
} else {






final Object f280 = Match.LAMBDA.apply(((Cons)((Cons)((Cons)v253).tail).tail).head, ((Cons)((Cons)((Cons)v254).tail).tail).head);

final Object match2279 = f280;
final Object f281 = No_matchQ.LAMBDA.apply(match2279);

final Object i283;
if ((boolean)f281) {

i283 = match2279;
} else {
final Object f282 = Append.LAMBDA.apply(match1276, match2279);

i283 = f282;

}

i284 = i283;

}

i315 = i284;
} else {


final Object i302;
if ((boolean)(v253 instanceof Cons)) {


final Object i300;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)v253).head)) {



final Object i298;
if ((boolean)(((Cons)v253).tail instanceof Cons)) {




final Object i296;
if ((boolean)(((Cons)((Cons)v253).tail).tail instanceof Cons)) {




final Object i294;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v253).tail).tail).tail)) {


final Object i292;
if ((boolean)(v254 instanceof Cons)) {


final Object i290;
if ((boolean)Lang.equals(RuntimeContext.symbol("@p"), ((Cons)v254).head)) {



final Object i288;
if ((boolean)(((Cons)v254).tail instanceof Cons)) {




final Object i286;
if ((boolean)(((Cons)((Cons)v254).tail).tail instanceof Cons)) {




final Object i285;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v254).tail).tail).tail)) {

i285 = true;
} else {

i285 = false;

}
i286 = i285;
} else {

i286 = false;

}
final Object i287;
if ((boolean)i286) {

i287 = true;
} else {

i287 = false;

}
i288 = i287;
} else {

i288 = false;

}
final Object i289;
if ((boolean)i288) {

i289 = true;
} else {

i289 = false;

}
i290 = i289;
} else {

i290 = false;

}
final Object i291;
if ((boolean)i290) {

i291 = true;
} else {

i291 = false;

}
i292 = i291;
} else {

i292 = false;

}
final Object i293;
if ((boolean)i292) {

i293 = true;
} else {

i293 = false;

}
i294 = i293;
} else {

i294 = false;

}
final Object i295;
if ((boolean)i294) {

i295 = true;
} else {

i295 = false;

}
i296 = i295;
} else {

i296 = false;

}
final Object i297;
if ((boolean)i296) {

i297 = true;
} else {

i297 = false;

}
i298 = i297;
} else {

i298 = false;

}
final Object i299;
if ((boolean)i298) {

i299 = true;
} else {

i299 = false;

}
i300 = i299;
} else {

i300 = false;

}
final Object i301;
if ((boolean)i300) {

i301 = true;
} else {

i301 = false;

}
i302 = i301;
} else {

i302 = false;

}
final Object i314;
if ((boolean)i302) {




final Object f304 = Match.LAMBDA.apply(((Cons)((Cons)v253).tail).head, ((Cons)((Cons)v254).tail).head);

final Object match1303 = f304;
final Object f305 = No_matchQ.LAMBDA.apply(match1303);

final Object i311;
if ((boolean)f305) {

i311 = match1303;
} else {






final Object f307 = Match.LAMBDA.apply(((Cons)((Cons)((Cons)v253).tail).tail).head, ((Cons)((Cons)((Cons)v254).tail).tail).head);

final Object match2306 = f307;
final Object f308 = No_matchQ.LAMBDA.apply(match2306);

final Object i310;
if ((boolean)f308) {

i310 = match2306;
} else {
final Object f309 = Append.LAMBDA.apply(match1303, match2306);

i310 = f309;

}

i311 = i310;

}

i314 = i311;
} else {

final Object i313;
if ((boolean)true) {
final Object f312 = Atp.LAMBDA.apply(RuntimeContext.symbol("no"), RuntimeContext.symbol("matching"));



i313 = new Cons(f312, Nil.NIL);
} else {

throw new SimpleError((String)"True condition not found.");


}
i314 = i313;

}
i315 = i314;

}
i316 = i315;

}
i317 = i316;

}
    return i317;

}
}
