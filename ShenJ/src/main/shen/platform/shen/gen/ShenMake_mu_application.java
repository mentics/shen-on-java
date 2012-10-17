package shen.gen;



import com.mentics.shen.*;

public class ShenMake_mu_application {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-make_mu_application");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1308, final Object v1309) throws Exception {
return defined(v1308, v1309);
}};
public static Object defined(final Object v1308, final Object v1309) throws Exception {


final Object i3201;
if ((boolean)(v1308 instanceof Cons)) {


final Object i3199;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)v1308).head)) {



final Object i3197;
if ((boolean)(((Cons)v1308).tail instanceof Cons)) {



final Object i3195;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v1308).tail).head)) {




final Object i3193;
if ((boolean)(((Cons)((Cons)v1308).tail).tail instanceof Cons)) {




final Object i3191;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1308).tail).tail).tail)) {

final Object i3190;
if ((boolean)Lang.equals(Nil.NIL, v1309)) {

i3190 = true;
} else {

i3190 = false;

}
i3191 = i3190;
} else {

i3191 = false;

}
final Object i3192;
if ((boolean)i3191) {

i3192 = true;
} else {

i3192 = false;

}
i3193 = i3192;
} else {

i3193 = false;

}
final Object i3194;
if ((boolean)i3193) {

i3194 = true;
} else {

i3194 = false;

}
i3195 = i3194;
} else {

i3195 = false;

}
final Object i3196;
if ((boolean)i3195) {

i3196 = true;
} else {

i3196 = false;

}
i3197 = i3196;
} else {

i3197 = false;

}
final Object i3198;
if ((boolean)i3197) {

i3198 = true;
} else {

i3198 = false;

}
i3199 = i3198;
} else {

i3199 = false;

}
final Object i3200;
if ((boolean)i3199) {

i3200 = true;
} else {

i3200 = false;

}
i3201 = i3200;
} else {

i3201 = false;

}
final Object i3218;
if ((boolean)i3201) {




i3218 = ((Cons)((Cons)((Cons)v1308).tail).tail).head;
} else {


final Object i3213;
if ((boolean)(v1308 instanceof Cons)) {


final Object i3211;
if ((boolean)Lang.equals(RuntimeContext.symbol("shen-mu"), ((Cons)v1308).head)) {



final Object i3209;
if ((boolean)(((Cons)v1308).tail instanceof Cons)) {




final Object i3207;
if ((boolean)(((Cons)((Cons)v1308).tail).head instanceof Cons)) {




final Object i3205;
if ((boolean)(((Cons)((Cons)v1308).tail).tail instanceof Cons)) {




final Object i3203;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1308).tail).tail).tail)) {


final Object i3202;
if ((boolean)(v1309 instanceof Cons)) {

i3202 = true;
} else {

i3202 = false;

}
i3203 = i3202;
} else {

i3203 = false;

}
final Object i3204;
if ((boolean)i3203) {

i3204 = true;
} else {

i3204 = false;

}
i3205 = i3204;
} else {

i3205 = false;

}
final Object i3206;
if ((boolean)i3205) {

i3206 = true;
} else {

i3206 = false;

}
i3207 = i3206;
} else {

i3207 = false;

}
final Object i3208;
if ((boolean)i3207) {

i3208 = true;
} else {

i3208 = false;

}
i3209 = i3208;
} else {

i3209 = false;

}
final Object i3210;
if ((boolean)i3209) {

i3210 = true;
} else {

i3210 = false;

}
i3211 = i3210;
} else {

i3211 = false;

}
final Object i3212;
if ((boolean)i3211) {

i3212 = true;
} else {

i3212 = false;

}
i3213 = i3212;
} else {

i3213 = false;

}
final Object i3217;
if ((boolean)i3213) {















final Object f3214 = ShenMake_mu_application.LAMBDA.apply(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)v1308).tail).head).tail, ((Cons)((Cons)v1308).tail).tail)), ((Cons)v1309).tail);










i3217 = new Cons(new Cons(RuntimeContext.symbol("shen-mu"), new Cons(((Cons)((Cons)((Cons)v1308).tail).head).head, new Cons(f3214, Nil.NIL))), new Cons(((Cons)v1309).head, Nil.NIL));
} else {

final Object i3216;
if ((boolean)true) {
final Object f3215 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-make_mu_application"));

i3216 = f3215;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3217 = i3216;

}
i3218 = i3217;

}
    return i3218;

}
}
