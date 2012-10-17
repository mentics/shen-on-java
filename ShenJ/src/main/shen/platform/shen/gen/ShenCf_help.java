package shen.gen;



import com.mentics.shen.*;

public class ShenCf_help {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cf_help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1288) throws Exception {
return defined(v1288);
}};
public static Object defined(final Object v1288) throws Exception {


final Object i3139;
if ((boolean)(v1288 instanceof Cons)) {


final Object i3137;
if ((boolean)Lang.equals(RuntimeContext.symbol("where"), ((Cons)v1288).head)) {



final Object i3135;
if ((boolean)(((Cons)v1288).tail instanceof Cons)) {




final Object i3133;
if ((boolean)(((Cons)((Cons)v1288).tail).head instanceof Cons)) {




final Object i3131;
if ((boolean)Lang.equals(RuntimeContext.symbol("="), ((Cons)((Cons)((Cons)v1288).tail).head).head)) {





final Object i3129;
if ((boolean)(((Cons)((Cons)((Cons)v1288).tail).head).tail instanceof Cons)) {






final Object i3127;
if ((boolean)(((Cons)((Cons)((Cons)((Cons)v1288).tail).head).tail).tail instanceof Cons)) {






final Object i3125;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)((Cons)v1288).tail).head).tail).tail).tail)) {




final Object i3123;
if ((boolean)(((Cons)((Cons)v1288).tail).tail instanceof Cons)) {




final Object i3122;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1288).tail).tail).tail)) {

i3122 = true;
} else {

i3122 = false;

}
i3123 = i3122;
} else {

i3123 = false;

}
final Object i3124;
if ((boolean)i3123) {

i3124 = true;
} else {

i3124 = false;

}
i3125 = i3124;
} else {

i3125 = false;

}
final Object i3126;
if ((boolean)i3125) {

i3126 = true;
} else {

i3126 = false;

}
i3127 = i3126;
} else {

i3127 = false;

}
final Object i3128;
if ((boolean)i3127) {

i3128 = true;
} else {

i3128 = false;

}
i3129 = i3128;
} else {

i3129 = false;

}
final Object i3130;
if ((boolean)i3129) {

i3130 = true;
} else {

i3130 = false;

}
i3131 = i3130;
} else {

i3131 = false;

}
final Object i3132;
if ((boolean)i3131) {

i3132 = true;
} else {

i3132 = false;

}
i3133 = i3132;
} else {

i3133 = false;

}
final Object i3134;
if ((boolean)i3133) {

i3134 = true;
} else {

i3134 = false;

}
i3135 = i3134;
} else {

i3135 = false;

}
final Object i3136;
if ((boolean)i3135) {

i3136 = true;
} else {

i3136 = false;

}
i3137 = i3136;
} else {

i3137 = false;

}
final Object i3138;
if ((boolean)i3137) {

i3138 = true;
} else {

i3138 = false;

}
i3139 = i3138;
} else {

i3139 = false;

}
final Object i3143;
if ((boolean)i3139) {


final Object i3140;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*occurs*"))) {

i3140 = RuntimeContext.symbol("unify!");
} else {

i3140 = RuntimeContext.symbol("unify");

}








final Object f3141 = ShenCf_help.LAMBDA.apply(((Cons)((Cons)((Cons)v1288).tail).tail).head);


i3143 = new Cons(new Cons(i3140, ((Cons)((Cons)((Cons)v1288).tail).head).tail), f3141);
} else {

final Object i3142;
if ((boolean)true) {

i3142 = v1288;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3143 = i3142;

}
    return i3143;

}
}
