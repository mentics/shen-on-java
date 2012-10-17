package shen.gen;



import com.mentics.shen.*;

public class ShenTStarAssume {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-t*-assume");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v904, final Object v905, final Object v906, final Object v907) throws Exception {
return defined(v904, v905, v906, v907);
}};
public static Object defined(final Object v904, final Object v905, final Object v906, final Object v907) throws Exception {
final Object f3202 = ShenCatchpoint.LAMBDA.apply();

final Object throwcontrol3201 = f3202;
final Object f3205 = ShenLazyderef.LAMBDA.apply(v904, v906);

final Object v4753204 = f3205;


final Object i3224;
if ((boolean)(v4753204 instanceof Cons)) {


final Object x3206 = ((Cons)v4753204).head;


final Object y3207 = ((Cons)v4753204).tail;
final Object f3209 = ShenNewpv.LAMBDA.apply(v906);

final Object a13208 = f3209;
final Object f3211 = ShenNewpv.LAMBDA.apply(v906);

final Object a23210 = f3211;
final Object f3212 = ShenIncinfs.LAMBDA.apply();
final Lambda l3221 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3219 = new Lambda0() {
  public Object apply() throws Exception {
    final Lambda l3217 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3213 = ShenLazyderef.LAMBDA.apply(a13208, v906);
final Object f3214 = ShenLazyderef.LAMBDA.apply(a23210, v906);
final Object f3215 = Append.LAMBDA.apply(f3213, f3214);
final Object f3216 = Bind.LAMBDA.apply(v905, f3215, v906, v907);

    return f3216;
  }
};final Object f3218 = ShenTStarAssume.LAMBDA.apply(y3207, a23210, v906, l3217);

    return f3218;
  }
};final Object f3220 = ShenTStarAssume.LAMBDA.apply(x3206, a13208, v906, l3219);

    return f3220;
  }
};final Object f3222 = Cut.LAMBDA.apply(throwcontrol3201, v906, l3221);
final Object f3223 = Do.LAMBDA.apply(f3212, f3222);





i3224 = f3223;
} else {

i3224 = false;

}

final Object case3203 = i3224;

final Object i3254;
if ((boolean)Lang.equals(case3203, false)) {
final Object f3227 = ShenNewpv.LAMBDA.apply(v906);

final Object a3226 = f3227;
final Object f3228 = ShenIncinfs.LAMBDA.apply();
final Object f3229 = ShenLazyderef.LAMBDA.apply(v904, v906);
final Object f3230 = ShenPlaceholderQ.LAMBDA.apply(f3229);
final Lambda l3234 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3231 = ShenLazyderef.LAMBDA.apply(v904, v906);


final Object f3232 = ShenLazyderef.LAMBDA.apply(a3226, v906);






final Object f3233 = Bind.LAMBDA.apply(v905, new Cons(new Cons(f3231, new Cons(RuntimeContext.symbol(":"), new Cons(f3232, Nil.NIL))), Nil.NIL), v906, v907);

    return f3233;
  }
};final Object f3235 = Fwhen.LAMBDA.apply(f3230, v906, l3234);
final Object f3236 = Do.LAMBDA.apply(f3228, f3235);


final Object case3225 = f3236;

final Object i3253;
if ((boolean)Lang.equals(case3225, false)) {
final Object f3238 = ShenLazyderef.LAMBDA.apply(v905, v906);

final Object v4763237 = f3238;

final Object i3252;
if ((boolean)Lang.equals(Nil.NIL, v4763237)) {
final Object f3239 = ShenIncinfs.LAMBDA.apply();
final Object f3240 = Thaw.LAMBDA.apply(v907);
final Object f3241 = Do.LAMBDA.apply(f3239, f3240);

i3252 = f3241;
} else {
final Object f3242 = ShenPvarQ.LAMBDA.apply(v4763237);

final Object i3251;
if ((boolean)f3242) {
final Object f3243 = ShenBindv.LAMBDA.apply(v4763237, Nil.NIL, v906);
final Object f3245 = ShenIncinfs.LAMBDA.apply();
final Object f3246 = Thaw.LAMBDA.apply(v907);
final Object f3247 = Do.LAMBDA.apply(f3245, f3246);

final Object result3244 = f3247;
final Object f3248 = ShenUnbindv.LAMBDA.apply(v4763237, v906);
final Object f3249 = Do.LAMBDA.apply(f3248, result3244);

final Object f3250 = Do.LAMBDA.apply(f3243, f3249);

i3251 = f3250;
} else {

i3251 = false;

}
i3252 = i3251;

}

i3253 = i3252;
} else {

i3253 = case3225;

}

i3254 = i3253;
} else {

i3254 = case3203;

}
final Object f3255 = ShenCutpoint.LAMBDA.apply(throwcontrol3201, i3254);


    return f3255;

}
}
