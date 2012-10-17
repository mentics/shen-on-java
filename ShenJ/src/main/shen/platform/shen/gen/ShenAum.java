package shen.gen;



import com.mentics.shen.*;

public class ShenAum {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-aum");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1294, final Object v1295) throws Exception {
return defined(v1294, v1295);
}};
public static Object defined(final Object v1294, final Object v1295) throws Exception {


final Object i3157;
if ((boolean)(v1294 instanceof Cons)) {



final Object i3155;
if ((boolean)(((Cons)v1294).head instanceof Cons)) {



final Object i3153;
if ((boolean)(((Cons)v1294).tail instanceof Cons)) {



final Object i3151;
if ((boolean)Lang.equals(RuntimeContext.symbol(":-"), ((Cons)((Cons)v1294).tail).head)) {




final Object i3149;
if ((boolean)(((Cons)((Cons)v1294).tail).tail instanceof Cons)) {




final Object i3148;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1294).tail).tail).tail)) {

i3148 = true;
} else {

i3148 = false;

}
i3149 = i3148;
} else {

i3149 = false;

}
final Object i3150;
if ((boolean)i3149) {

i3150 = true;
} else {

i3150 = false;

}
i3151 = i3150;
} else {

i3151 = false;

}
final Object i3152;
if ((boolean)i3151) {

i3152 = true;
} else {

i3152 = false;

}
i3153 = i3152;
} else {

i3153 = false;

}
final Object i3154;
if ((boolean)i3153) {

i3154 = true;
} else {

i3154 = false;

}
i3155 = i3154;
} else {

i3155 = false;

}
final Object i3156;
if ((boolean)i3155) {

i3156 = true;
} else {

i3156 = false;

}
i3157 = i3156;
} else {

i3157 = false;

}
final Object i3164;
if ((boolean)i3157) {









final Object f3159 = ShenContinuation_call.LAMBDA.apply(((Cons)((Cons)v1294).head).tail, ((Cons)((Cons)((Cons)v1294).tail).tail).head);




final Object f3160 = ShenMake_mu_application.LAMBDA.apply(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)v1294).head).tail, new Cons(f3159, Nil.NIL))), v1295);

final Object muApplication3158 = f3160;
final Object f3161 = ShenMu_reduction.LAMBDA.apply(muApplication3158, RuntimeContext.symbol("+"));


i3164 = f3161;
} else {

final Object i3163;
if ((boolean)true) {
final Object f3162 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-aum"));

i3163 = f3162;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3164 = i3163;

}
    return i3164;

}
}
