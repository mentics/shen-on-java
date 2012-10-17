package shen.gen;



import com.mentics.shen.*;

public class HandleCase {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-case");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v7288, final Object v7289) throws Exception {
return defined(v7288, v7289);
}};
public static Object defined(final Object v7288, final Object v7289) throws Exception {


final Object i8958;
if ((boolean)(v7288 instanceof Cons)) {



final Object i8956;
if ((boolean)(((Cons)v7288).tail instanceof Cons)) {



final Object i8955;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v7288).tail).tail)) {

i8955 = true;
} else {

i8955 = false;

}
i8956 = i8955;
} else {

i8956 = false;

}
final Object i8957;
if ((boolean)i8956) {

i8957 = true;
} else {

i8957 = false;

}
i8958 = i8957;
} else {

i8958 = false;

}
final Object i8961;
if ((boolean)i8958) {












i8961 = new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)v7288).head, new Cons(((Cons)((Cons)v7288).tail).head, new Cons(v7289, Nil.NIL))));
} else {

final Object i8960;
if ((boolean)true) {
final Object f8959 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("handle-case"));

i8960 = f8959;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8961 = i8960;

}
    return i8961;

}
}
