package shen.gen;



import com.mentics.shen.*;

public class ShenMu_reduction {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-mu_reduction");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1316, final Object v1317) throws Exception {
return defined(v1316, v1317);
}};
public static Object defined(final Object v1316, final Object v1317) throws Exception {


final Object i3242;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3240;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3238;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3236;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3234;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).head instanceof Cons)) {





final Object i3232;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).head)) {






final Object i3230;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail instanceof Cons)) {







final Object i3228;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail).tail instanceof Cons)) {







final Object i3226;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail).tail).tail)) {





final Object i3224;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3222;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3220;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3219;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {

i3219 = true;
} else {

i3219 = false;

}
i3220 = i3219;
} else {

i3220 = false;

}
final Object i3221;
if ((boolean)i3220) {

i3221 = true;
} else {

i3221 = false;

}
i3222 = i3221;
} else {

i3222 = false;

}
final Object i3223;
if ((boolean)i3222) {

i3223 = true;
} else {

i3223 = false;

}
i3224 = i3223;
} else {

i3224 = false;

}
final Object i3225;
if ((boolean)i3224) {

i3225 = true;
} else {

i3225 = false;

}
i3226 = i3225;
} else {

i3226 = false;

}
final Object i3227;
if ((boolean)i3226) {

i3227 = true;
} else {

i3227 = false;

}
i3228 = i3227;
} else {

i3228 = false;

}
final Object i3229;
if ((boolean)i3228) {

i3229 = true;
} else {

i3229 = false;

}
i3230 = i3229;
} else {

i3230 = false;

}
final Object i3231;
if ((boolean)i3230) {

i3231 = true;
} else {

i3231 = false;

}
i3232 = i3231;
} else {

i3232 = false;

}
final Object i3233;
if ((boolean)i3232) {

i3233 = true;
} else {

i3233 = false;

}
i3234 = i3233;
} else {

i3234 = false;

}
final Object i3235;
if ((boolean)i3234) {

i3235 = true;
} else {

i3235 = false;

}
i3236 = i3235;
} else {

i3236 = false;

}
final Object i3237;
if ((boolean)i3236) {

i3237 = true;
} else {

i3237 = false;

}
i3238 = i3237;
} else {

i3238 = false;

}
final Object i3239;
if ((boolean)i3238) {

i3239 = true;
} else {

i3239 = false;

}
i3240 = i3239;
} else {

i3240 = false;

}
final Object i3241;
if ((boolean)i3240) {

i3241 = true;
} else {

i3241 = false;

}
i3242 = i3241;
} else {

i3242 = false;

}
final Object i3397;
if ((boolean)i3242) {





















final Object f3243 = ShenMu_reduction.LAMBDA.apply(new Cons(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail).head, ((Cons)((Cons)((Cons)v1316).head).tail).tail)), ((Cons)v1316).tail), ((Cons)((Cons)((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail).tail).head);

i3397 = f3243;
} else {


final Object i3259;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3257;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3255;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3253;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3251;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3249;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3247;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3245;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {




final Object i3244;
if ((boolean)Lang.equals(RuntimeContext.symbol("_"), ((Cons)((Cons)((Cons)v1316).head).tail).head)) {

i3244 = true;
} else {

i3244 = false;

}
i3245 = i3244;
} else {

i3245 = false;

}
final Object i3246;
if ((boolean)i3245) {

i3246 = true;
} else {

i3246 = false;

}
i3247 = i3246;
} else {

i3247 = false;

}
final Object i3248;
if ((boolean)i3247) {

i3248 = true;
} else {

i3248 = false;

}
i3249 = i3248;
} else {

i3249 = false;

}
final Object i3250;
if ((boolean)i3249) {

i3250 = true;
} else {

i3250 = false;

}
i3251 = i3250;
} else {

i3251 = false;

}
final Object i3252;
if ((boolean)i3251) {

i3252 = true;
} else {

i3252 = false;

}
i3253 = i3252;
} else {

i3253 = false;

}
final Object i3254;
if ((boolean)i3253) {

i3254 = true;
} else {

i3254 = false;

}
i3255 = i3254;
} else {

i3255 = false;

}
final Object i3256;
if ((boolean)i3255) {

i3256 = true;
} else {

i3256 = false;

}
i3257 = i3256;
} else {

i3257 = false;

}
final Object i3258;
if ((boolean)i3257) {

i3258 = true;
} else {

i3258 = false;

}
i3259 = i3258;
} else {

i3259 = false;

}
final Object i3396;
if ((boolean)i3259) {




final Object f3260 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, v1317);

i3396 = f3260;
} else {


final Object i3277;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3275;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3273;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3271;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3269;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3267;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3265;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3263;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {





final Object f3261 = ShenEphemeral_variableQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1316).head).tail).head, ((Cons)((Cons)v1316).tail).head);

final Object i3262;
if ((boolean)f3261) {

i3262 = true;
} else {

i3262 = false;

}
i3263 = i3262;
} else {

i3263 = false;

}
final Object i3264;
if ((boolean)i3263) {

i3264 = true;
} else {

i3264 = false;

}
i3265 = i3264;
} else {

i3265 = false;

}
final Object i3266;
if ((boolean)i3265) {

i3266 = true;
} else {

i3266 = false;

}
i3267 = i3266;
} else {

i3267 = false;

}
final Object i3268;
if ((boolean)i3267) {

i3268 = true;
} else {

i3268 = false;

}
i3269 = i3268;
} else {

i3269 = false;

}
final Object i3270;
if ((boolean)i3269) {

i3270 = true;
} else {

i3270 = false;

}
i3271 = i3270;
} else {

i3271 = false;

}
final Object i3272;
if ((boolean)i3271) {

i3272 = true;
} else {

i3272 = false;

}
i3273 = i3272;
} else {

i3273 = false;

}
final Object i3274;
if ((boolean)i3273) {

i3274 = true;
} else {

i3274 = false;

}
i3275 = i3274;
} else {

i3275 = false;

}
final Object i3276;
if ((boolean)i3275) {

i3276 = true;
} else {

i3276 = false;

}
i3277 = i3276;
} else {

i3277 = false;

}
final Object i3395;
if ((boolean)i3277) {









final Object f3278 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, v1317);
final Object f3279 = Subst.LAMBDA.apply(((Cons)((Cons)v1316).tail).head, ((Cons)((Cons)((Cons)v1316).head).tail).head, f3278);

i3395 = f3279;
} else {


final Object i3296;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3294;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3292;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3290;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3288;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3286;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3284;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3282;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {



final Object f3280 = VariableQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1316).head).tail).head);

final Object i3281;
if ((boolean)f3280) {

i3281 = true;
} else {

i3281 = false;

}
i3282 = i3281;
} else {

i3282 = false;

}
final Object i3283;
if ((boolean)i3282) {

i3283 = true;
} else {

i3283 = false;

}
i3284 = i3283;
} else {

i3284 = false;

}
final Object i3285;
if ((boolean)i3284) {

i3285 = true;
} else {

i3285 = false;

}
i3286 = i3285;
} else {

i3286 = false;

}
final Object i3287;
if ((boolean)i3286) {

i3287 = true;
} else {

i3287 = false;

}
i3288 = i3287;
} else {

i3288 = false;

}
final Object i3289;
if ((boolean)i3288) {

i3289 = true;
} else {

i3289 = false;

}
i3290 = i3289;
} else {

i3290 = false;

}
final Object i3291;
if ((boolean)i3290) {

i3291 = true;
} else {

i3291 = false;

}
i3292 = i3291;
} else {

i3292 = false;

}
final Object i3293;
if ((boolean)i3292) {

i3293 = true;
} else {

i3293 = false;

}
i3294 = i3293;
} else {

i3294 = false;

}
final Object i3295;
if ((boolean)i3294) {

i3295 = true;
} else {

i3295 = false;

}
i3296 = i3295;
} else {

i3296 = false;

}
final Object i3394;
if ((boolean)i3296) {














final Object f3297 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, v1317);








i3394 = new Cons(RuntimeContext.symbol("let"), new Cons(((Cons)((Cons)((Cons)v1316).head).tail).head, new Cons(RuntimeContext.symbol("shen-be"), new Cons(((Cons)((Cons)v1316).tail).head, new Cons(RuntimeContext.symbol("in"), new Cons(f3297, Nil.NIL))))));
} else {


final Object i3316;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3314;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3312;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3310;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3308;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3306;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3304;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3302;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {

final Object i3300;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v1317)) {



final Object f3298 = ShenProlog_constantQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1316).head).tail).head);

final Object i3299;
if ((boolean)f3298) {

i3299 = true;
} else {

i3299 = false;

}
i3300 = i3299;
} else {

i3300 = false;

}
final Object i3301;
if ((boolean)i3300) {

i3301 = true;
} else {

i3301 = false;

}
i3302 = i3301;
} else {

i3302 = false;

}
final Object i3303;
if ((boolean)i3302) {

i3303 = true;
} else {

i3303 = false;

}
i3304 = i3303;
} else {

i3304 = false;

}
final Object i3305;
if ((boolean)i3304) {

i3305 = true;
} else {

i3305 = false;

}
i3306 = i3305;
} else {

i3306 = false;

}
final Object i3307;
if ((boolean)i3306) {

i3307 = true;
} else {

i3307 = false;

}
i3308 = i3307;
} else {

i3308 = false;

}
final Object i3309;
if ((boolean)i3308) {

i3309 = true;
} else {

i3309 = false;

}
i3310 = i3309;
} else {

i3310 = false;

}
final Object i3311;
if ((boolean)i3310) {

i3311 = true;
} else {

i3311 = false;

}
i3312 = i3311;
} else {

i3312 = false;

}
final Object i3313;
if ((boolean)i3312) {

i3313 = true;
} else {

i3313 = false;

}
i3314 = i3313;
} else {

i3314 = false;

}
final Object i3315;
if ((boolean)i3314) {

i3315 = true;
} else {

i3315 = false;

}
i3316 = i3315;
} else {

i3316 = false;

}
final Object i3393;
if ((boolean)i3316) {
final Object f3318 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));

final Object z3317 = f3318;


































final Object f3319 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, RuntimeContext.symbol("-"));


















i3393 = new Cons(RuntimeContext.symbol("let"), new Cons(z3317, new Cons(RuntimeContext.symbol("shen-be"), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-result"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(RuntimeContext.symbol("shen-dereferencing"), ((Cons)v1316).tail)))), new Cons(RuntimeContext.symbol("in"), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(z3317, new Cons(RuntimeContext.symbol("is"), new Cons(RuntimeContext.symbol("identical"), new Cons(RuntimeContext.symbol("shen-to"), new Cons(((Cons)((Cons)((Cons)v1316).head).tail).head, Nil.NIL))))), new Cons(RuntimeContext.symbol("shen-then"), new Cons(f3319, new Cons(RuntimeContext.symbol("shen-else"), new Cons(null, Nil.NIL)))))), Nil.NIL))))));
} else {


final Object i3338;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3336;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3334;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3332;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3330;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3328;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3326;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3324;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {

final Object i3322;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v1317)) {



final Object f3320 = ShenProlog_constantQ.LAMBDA.apply(((Cons)((Cons)((Cons)v1316).head).tail).head);

final Object i3321;
if ((boolean)f3320) {

i3321 = true;
} else {

i3321 = false;

}
i3322 = i3321;
} else {

i3322 = false;

}
final Object i3323;
if ((boolean)i3322) {

i3323 = true;
} else {

i3323 = false;

}
i3324 = i3323;
} else {

i3324 = false;

}
final Object i3325;
if ((boolean)i3324) {

i3325 = true;
} else {

i3325 = false;

}
i3326 = i3325;
} else {

i3326 = false;

}
final Object i3327;
if ((boolean)i3326) {

i3327 = true;
} else {

i3327 = false;

}
i3328 = i3327;
} else {

i3328 = false;

}
final Object i3329;
if ((boolean)i3328) {

i3329 = true;
} else {

i3329 = false;

}
i3330 = i3329;
} else {

i3330 = false;

}
final Object i3331;
if ((boolean)i3330) {

i3331 = true;
} else {

i3331 = false;

}
i3332 = i3331;
} else {

i3332 = false;

}
final Object i3333;
if ((boolean)i3332) {

i3333 = true;
} else {

i3333 = false;

}
i3334 = i3333;
} else {

i3334 = false;

}
final Object i3335;
if ((boolean)i3334) {

i3335 = true;
} else {

i3335 = false;

}
i3336 = i3335;
} else {

i3336 = false;

}
final Object i3337;
if ((boolean)i3336) {

i3337 = true;
} else {

i3337 = false;

}
i3338 = i3337;
} else {

i3338 = false;

}
final Object i3392;
if ((boolean)i3338) {
final Object f3340 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));

final Object z3339 = f3340;


































final Object f3341 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, RuntimeContext.symbol("+"));

























final Object f3342 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, RuntimeContext.symbol("+"));
































i3392 = new Cons(RuntimeContext.symbol("let"), new Cons(z3339, new Cons(RuntimeContext.symbol("shen-be"), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-result"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(RuntimeContext.symbol("shen-dereferencing"), ((Cons)v1316).tail)))), new Cons(RuntimeContext.symbol("in"), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(z3339, new Cons(RuntimeContext.symbol("is"), new Cons(RuntimeContext.symbol("identical"), new Cons(RuntimeContext.symbol("shen-to"), new Cons(((Cons)((Cons)((Cons)v1316).head).tail).head, Nil.NIL))))), new Cons(RuntimeContext.symbol("shen-then"), new Cons(f3341, new Cons(RuntimeContext.symbol("shen-else"), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(z3339, new Cons(RuntimeContext.symbol("is"), new Cons(RuntimeContext.symbol("shen-a"), new Cons(RuntimeContext.symbol("shen-variable"), Nil.NIL)))), new Cons(RuntimeContext.symbol("shen-then"), new Cons(new Cons(RuntimeContext.symbol("bind"), new Cons(z3339, new Cons(RuntimeContext.symbol("shen-to"), new Cons(((Cons)((Cons)((Cons)v1316).head).tail).head, new Cons(RuntimeContext.symbol("in"), new Cons(f3342, Nil.NIL)))))), new Cons(RuntimeContext.symbol("shen-else"), new Cons(null, Nil.NIL)))))), Nil.NIL)))))), Nil.NIL))))));
} else {


final Object i3360;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3358;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3356;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3354;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3352;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).head instanceof Cons)) {





final Object i3350;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3348;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3346;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3344;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {

final Object i3343;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v1317)) {

i3343 = true;
} else {

i3343 = false;

}
i3344 = i3343;
} else {

i3344 = false;

}
final Object i3345;
if ((boolean)i3344) {

i3345 = true;
} else {

i3345 = false;

}
i3346 = i3345;
} else {

i3346 = false;

}
final Object i3347;
if ((boolean)i3346) {

i3347 = true;
} else {

i3347 = false;

}
i3348 = i3347;
} else {

i3348 = false;

}
final Object i3349;
if ((boolean)i3348) {

i3349 = true;
} else {

i3349 = false;

}
i3350 = i3349;
} else {

i3350 = false;

}
final Object i3351;
if ((boolean)i3350) {

i3351 = true;
} else {

i3351 = false;

}
i3352 = i3351;
} else {

i3352 = false;

}
final Object i3353;
if ((boolean)i3352) {

i3353 = true;
} else {

i3353 = false;

}
i3354 = i3353;
} else {

i3354 = false;

}
final Object i3355;
if ((boolean)i3354) {

i3355 = true;
} else {

i3355 = false;

}
i3356 = i3355;
} else {

i3356 = false;

}
final Object i3357;
if ((boolean)i3356) {

i3357 = true;
} else {

i3357 = false;

}
i3358 = i3357;
} else {

i3358 = false;

}
final Object i3359;
if ((boolean)i3358) {

i3359 = true;
} else {

i3359 = false;

}
i3360 = i3359;
} else {

i3360 = false;

}
final Object i3391;
if ((boolean)i3360) {
final Object f3362 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));

final Object z3361 = f3362;








































































final Object f3363 = ShenMu_reduction.LAMBDA.apply(new Cons(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).head, new Cons(new Cons(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail, ((Cons)((Cons)((Cons)v1316).head).tail).tail)), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("tail"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(z3361, Nil.NIL)))), Nil.NIL)), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("head"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(z3361, Nil.NIL)))), Nil.NIL)), RuntimeContext.symbol("-"));


















i3391 = new Cons(RuntimeContext.symbol("let"), new Cons(z3361, new Cons(RuntimeContext.symbol("shen-be"), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-result"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(RuntimeContext.symbol("shen-dereferencing"), ((Cons)v1316).tail)))), new Cons(RuntimeContext.symbol("in"), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(z3361, new Cons(RuntimeContext.symbol("is"), new Cons(RuntimeContext.symbol("shen-a"), new Cons(RuntimeContext.symbol("shen-non-empty"), new Cons(RuntimeContext.symbol("list"), Nil.NIL))))), new Cons(RuntimeContext.symbol("shen-then"), new Cons(f3363, new Cons(RuntimeContext.symbol("shen-else"), new Cons(null, Nil.NIL)))))), Nil.NIL))))));
} else {


final Object i3381;
if ((boolean)(v1316 instanceof Cons)) {



final Object i3379;
if ((boolean)(((Cons)v1316).head instanceof Cons)) {



final Object i3377;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)((Cons)v1316).head).head)) {




final Object i3375;
if ((boolean)(((Cons)((Cons)v1316).head).tail instanceof Cons)) {





final Object i3373;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).head instanceof Cons)) {





final Object i3371;
if ((boolean)(((Cons)((Cons)((Cons)v1316).head).tail).tail instanceof Cons)) {





final Object i3369;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).tail)) {



final Object i3367;
if ((boolean)(((Cons)v1316).tail instanceof Cons)) {



final Object i3365;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1316).tail).tail)) {

final Object i3364;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v1317)) {

i3364 = true;
} else {

i3364 = false;

}
i3365 = i3364;
} else {

i3365 = false;

}
final Object i3366;
if ((boolean)i3365) {

i3366 = true;
} else {

i3366 = false;

}
i3367 = i3366;
} else {

i3367 = false;

}
final Object i3368;
if ((boolean)i3367) {

i3368 = true;
} else {

i3368 = false;

}
i3369 = i3368;
} else {

i3369 = false;

}
final Object i3370;
if ((boolean)i3369) {

i3370 = true;
} else {

i3370 = false;

}
i3371 = i3370;
} else {

i3371 = false;

}
final Object i3372;
if ((boolean)i3371) {

i3372 = true;
} else {

i3372 = false;

}
i3373 = i3372;
} else {

i3373 = false;

}
final Object i3374;
if ((boolean)i3373) {

i3374 = true;
} else {

i3374 = false;

}
i3375 = i3374;
} else {

i3375 = false;

}
final Object i3376;
if ((boolean)i3375) {

i3376 = true;
} else {

i3376 = false;

}
i3377 = i3376;
} else {

i3377 = false;

}
final Object i3378;
if ((boolean)i3377) {

i3378 = true;
} else {

i3378 = false;

}
i3379 = i3378;
} else {

i3379 = false;

}
final Object i3380;
if ((boolean)i3379) {

i3380 = true;
} else {

i3380 = false;

}
i3381 = i3380;
} else {

i3381 = false;

}
final Object i3390;
if ((boolean)i3381) {
final Object f3383 = Gensym.LAMBDA.apply(RuntimeContext.symbol("V"));

final Object z3382 = f3383;








































































final Object f3384 = ShenMu_reduction.LAMBDA.apply(new Cons(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).head, new Cons(new Cons(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).head).tail, ((Cons)((Cons)((Cons)v1316).head).tail).tail)), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("tail"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(z3382, Nil.NIL)))), Nil.NIL)), Nil.NIL))), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("head"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(z3382, Nil.NIL)))), Nil.NIL)), RuntimeContext.symbol("+"));




















final Object f3385 = ShenExtract_vars.LAMBDA.apply(((Cons)((Cons)((Cons)v1316).head).tail).head);









final Object f3386 = ShenRemove_modes.LAMBDA.apply(((Cons)((Cons)((Cons)v1316).head).tail).head);
final Object f3387 = ShenRcons_form.LAMBDA.apply(f3386);






final Object f3388 = ShenMu_reduction.LAMBDA.apply(((Cons)((Cons)((Cons)((Cons)v1316).head).tail).tail).head, RuntimeContext.symbol("+"));









































i3390 = new Cons(RuntimeContext.symbol("let"), new Cons(z3382, new Cons(RuntimeContext.symbol("shen-be"), new Cons(new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-result"), new Cons(RuntimeContext.symbol("shen-of"), new Cons(RuntimeContext.symbol("shen-dereferencing"), ((Cons)v1316).tail)))), new Cons(RuntimeContext.symbol("in"), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(z3382, new Cons(RuntimeContext.symbol("is"), new Cons(RuntimeContext.symbol("shen-a"), new Cons(RuntimeContext.symbol("shen-non-empty"), new Cons(RuntimeContext.symbol("list"), Nil.NIL))))), new Cons(RuntimeContext.symbol("shen-then"), new Cons(f3384, new Cons(RuntimeContext.symbol("shen-else"), new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(z3382, new Cons(RuntimeContext.symbol("is"), new Cons(RuntimeContext.symbol("shen-a"), new Cons(RuntimeContext.symbol("shen-variable"), Nil.NIL)))), new Cons(RuntimeContext.symbol("shen-then"), new Cons(new Cons(RuntimeContext.symbol("shen-rename"), new Cons(RuntimeContext.symbol("shen-the"), new Cons(RuntimeContext.symbol("shen-variables"), new Cons(RuntimeContext.symbol("in"), new Cons(f3385, new Cons(RuntimeContext.symbol("and"), new Cons(RuntimeContext.symbol("shen-then"), new Cons(new Cons(RuntimeContext.symbol("bind"), new Cons(z3382, new Cons(RuntimeContext.symbol("shen-to"), new Cons(f3387, new Cons(RuntimeContext.symbol("in"), new Cons(f3388, Nil.NIL)))))), Nil.NIL)))))))), new Cons(RuntimeContext.symbol("shen-else"), new Cons(null, Nil.NIL)))))), Nil.NIL)))))), Nil.NIL))))));
} else {

final Object i3389;
if ((boolean)true) {

i3389 = v1316;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3390 = i3389;

}
i3391 = i3390;

}
i3392 = i3391;

}
i3393 = i3392;

}
i3394 = i3393;

}
i3395 = i3394;

}
i3396 = i3395;

}
i3397 = i3396;

}
    return i3397;

}
}
