package shen.gen;



import com.mentics.shen.*;

public class ShenInsert_modes {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert_modes");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1197) throws Exception {
return defined(v1197);
}};
public static Object defined(final Object v1197) throws Exception {


final Object i2769;
if ((boolean)(v1197 instanceof Cons)) {


final Object i2767;
if ((boolean)Lang.equals(RuntimeContext.symbol("mode"), ((Cons)v1197).head)) {



final Object i2765;
if ((boolean)(((Cons)v1197).tail instanceof Cons)) {




final Object i2763;
if ((boolean)(((Cons)((Cons)v1197).tail).tail instanceof Cons)) {




final Object i2762;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1197).tail).tail).tail)) {

i2762 = true;
} else {

i2762 = false;

}
i2763 = i2762;
} else {

i2763 = false;

}
final Object i2764;
if ((boolean)i2763) {

i2764 = true;
} else {

i2764 = false;

}
i2765 = i2764;
} else {

i2765 = false;

}
final Object i2766;
if ((boolean)i2765) {

i2766 = true;
} else {

i2766 = false;

}
i2767 = i2766;
} else {

i2767 = false;

}
final Object i2768;
if ((boolean)i2767) {

i2768 = true;
} else {

i2768 = false;

}
i2769 = i2768;
} else {

i2769 = false;

}
final Object i2774;
if ((boolean)i2769) {

i2774 = v1197;
} else {

final Object i2773;
if ((boolean)Lang.equals(Nil.NIL, v1197)) {

i2773 = Nil.NIL;
} else {


final Object i2772;
if ((boolean)(v1197 instanceof Cons)) {










final Object f2770 = ShenInsert_modes.LAMBDA.apply(((Cons)v1197).tail);







i2772 = new Cons(new Cons(RuntimeContext.symbol("mode"), new Cons(((Cons)v1197).head, new Cons(RuntimeContext.symbol("+"), Nil.NIL))), new Cons(RuntimeContext.symbol("mode"), new Cons(f2770, new Cons(RuntimeContext.symbol("-"), Nil.NIL))));
} else {

final Object i2771;
if ((boolean)true) {

i2771 = v1197;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2772 = i2771;

}
i2773 = i2772;

}
i2774 = i2773;

}
    return i2774;

}
}
