package shen.gen;



import com.mentics.shen.*;

public class ShenLineariseClause {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-linearise-clause");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1283) throws Exception {
return defined(v1283);
}};
public static Object defined(final Object v1283) throws Exception {


final Object i3090;
if ((boolean)(v1283 instanceof Cons)) {



final Object i3088;
if ((boolean)(((Cons)v1283).tail instanceof Cons)) {



final Object i3086;
if ((boolean)Lang.equals(RuntimeContext.symbol(":-"), ((Cons)((Cons)v1283).tail).head)) {




final Object i3084;
if ((boolean)(((Cons)((Cons)v1283).tail).tail instanceof Cons)) {




final Object i3083;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1283).tail).tail).tail)) {

i3083 = true;
} else {

i3083 = false;

}
i3084 = i3083;
} else {

i3084 = false;

}
final Object i3085;
if ((boolean)i3084) {

i3085 = true;
} else {

i3085 = false;

}
i3086 = i3085;
} else {

i3086 = false;

}
final Object i3087;
if ((boolean)i3086) {

i3087 = true;
} else {

i3087 = false;

}
i3088 = i3087;
} else {

i3088 = false;

}
final Object i3089;
if ((boolean)i3088) {

i3089 = true;
} else {

i3089 = false;

}
i3090 = i3089;
} else {

i3090 = false;

}
final Object i3096;
if ((boolean)i3090) {





final Object f3092 = ShenLinearise.LAMBDA.apply(new Cons(((Cons)v1283).head, ((Cons)((Cons)v1283).tail).tail));

final Object linear3091 = f3092;
final Object f3093 = ShenClause_form.LAMBDA.apply(linear3091);


i3096 = f3093;
} else {

final Object i3095;
if ((boolean)true) {
final Object f3094 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-linearise-clause"));

i3095 = f3094;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3096 = i3095;

}
    return i3096;

}
}
