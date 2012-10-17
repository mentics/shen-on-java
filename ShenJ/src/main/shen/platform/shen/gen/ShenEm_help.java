package shen.gen;



import com.mentics.shen.*;

public class ShenEm_help {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-em_help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1287) throws Exception {
return defined(v1287);
}};
public static Object defined(final Object v1287) throws Exception {


final Object i3119;
if ((boolean)(v1287 instanceof Cons)) {


final Object i3117;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1287).head)) {



final Object i3115;
if ((boolean)(((Cons)v1287).tail instanceof Cons)) {




final Object i3113;
if ((boolean)(((Cons)((Cons)v1287).tail).tail instanceof Cons)) {




final Object i3112;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1287).tail).tail).tail)) {

i3112 = true;
} else {

i3112 = false;

}
i3113 = i3112;
} else {

i3113 = false;

}
final Object i3114;
if ((boolean)i3113) {

i3114 = true;
} else {

i3114 = false;

}
i3115 = i3114;
} else {

i3115 = false;

}
final Object i3116;
if ((boolean)i3115) {

i3116 = true;
} else {

i3116 = false;

}
i3117 = i3116;
} else {

i3117 = false;

}
final Object i3118;
if ((boolean)i3117) {

i3118 = true;
} else {

i3118 = false;

}
i3119 = i3118;
} else {

i3119 = false;

}
final Object i3121;
if ((boolean)i3119) {

i3121 = v1287;
} else {

final Object i3120;
if ((boolean)true) {







i3120 = new Cons(RuntimeContext.symbol("mode"), new Cons(v1287, new Cons(RuntimeContext.symbol("+"), Nil.NIL)));
} else {

throw new SimpleError((String)"True condition not found.");


}
i3121 = i3120;

}
    return i3121;

}
}
