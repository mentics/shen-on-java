package shen.gen;



import com.mentics.shen.*;

public class ShenConc {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-conc");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v908, final Object v909, final Object v910, final Object v911, final Object v912) throws Exception {
return defined(v908, v909, v910, v911, v912);
}};
public static Object defined(final Object v908, final Object v909, final Object v910, final Object v911, final Object v912) throws Exception {
final Object f3258 = ShenLazyderef.LAMBDA.apply(v908, v911);

final Object v4713257 = f3258;

final Object i3263;
if ((boolean)Lang.equals(Nil.NIL, v4713257)) {
final Object f3259 = ShenIncinfs.LAMBDA.apply();
final Object f3260 = ShenLazyderef.LAMBDA.apply(v909, v911);
final Object f3261 = Bind.LAMBDA.apply(v910, f3260, v911, v912);
final Object f3262 = Do.LAMBDA.apply(f3259, f3261);

i3263 = f3262;
} else {

i3263 = false;

}

final Object case3256 = i3263;

final Object i3278;
if ((boolean)Lang.equals(case3256, false)) {
final Object f3265 = ShenLazyderef.LAMBDA.apply(v908, v911);

final Object v4723264 = f3265;


final Object i3277;
if ((boolean)(v4723264 instanceof Cons)) {


final Object x3266 = ((Cons)v4723264).head;


final Object y3267 = ((Cons)v4723264).tail;
final Object f3269 = ShenNewpv.LAMBDA.apply(v911);

final Object z3268 = f3269;
final Object f3270 = ShenIncinfs.LAMBDA.apply();
final Object f3271 = ShenLazyderef.LAMBDA.apply(x3266, v911);

final Object f3272 = ShenLazyderef.LAMBDA.apply(z3268, v911);

final Lambda l3274 = new Lambda0() {
  public Object apply() throws Exception {
    final Object f3273 = ShenConc.LAMBDA.apply(y3267, v909, z3268, v911, v912);

    return f3273;
  }
};final Object f3275 = Bind.LAMBDA.apply(v910, new Cons(f3271, f3272), v911, l3274);
final Object f3276 = Do.LAMBDA.apply(f3270, f3275);




i3277 = f3276;
} else {

i3277 = false;

}

i3278 = i3277;
} else {

i3278 = case3256;

}

    return i3278;

}
}
