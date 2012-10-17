package shen.gen;



import com.mentics.shen.*;

public class ShenRemoveBar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remove-bar");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1556) throws Exception {
return defined(v1556);
}};
public static Object defined(final Object v1556) throws Exception {


final Object i5955;
if ((boolean)(v1556 instanceof Cons)) {



final Object i5953;
if ((boolean)(((Cons)v1556).tail instanceof Cons)) {




final Object i5951;
if ((boolean)(((Cons)((Cons)v1556).tail).tail instanceof Cons)) {




final Object i5949;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v1556).tail).tail).tail)) {



final Object i5948;
if ((boolean)Lang.equals(((Cons)((Cons)v1556).tail).head, RuntimeContext.symbol("bar!"))) {

i5948 = true;
} else {

i5948 = false;

}
i5949 = i5948;
} else {

i5949 = false;

}
final Object i5950;
if ((boolean)i5949) {

i5950 = true;
} else {

i5950 = false;

}
i5951 = i5950;
} else {

i5951 = false;

}
final Object i5952;
if ((boolean)i5951) {

i5952 = true;
} else {

i5952 = false;

}
i5953 = i5952;
} else {

i5953 = false;

}
final Object i5954;
if ((boolean)i5953) {

i5954 = true;
} else {

i5954 = false;

}
i5955 = i5954;
} else {

i5955 = false;

}
final Object i5960;
if ((boolean)i5955) {







i5960 = new Cons(((Cons)v1556).head, ((Cons)((Cons)((Cons)v1556).tail).tail).head);
} else {


final Object i5959;
if ((boolean)(v1556 instanceof Cons)) {

final Object f5956 = ShenRemoveBar.LAMBDA.apply(((Cons)v1556).head);


final Object f5957 = ShenRemoveBar.LAMBDA.apply(((Cons)v1556).tail);


i5959 = new Cons(f5956, f5957);
} else {

final Object i5958;
if ((boolean)true) {

i5958 = v1556;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5959 = i5958;

}
i5960 = i5959;

}
    return i5960;

}
}
