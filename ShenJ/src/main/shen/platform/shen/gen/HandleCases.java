package shen.gen;



import com.mentics.shen.*;

public class HandleCases {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-cases");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2853) throws Exception {
return defined(v2853);
}};
public static Object defined(final Object v2853) throws Exception {


final Object i2855;
if ((boolean)(v2853 instanceof Cons)) {


final Object i2854;
if ((boolean)Lang.equals(true, ((Cons)v2853).head)) {

i2854 = true;
} else {

i2854 = false;

}
i2855 = i2854;
} else {

i2855 = false;

}
final Object i2865;
if ((boolean)i2855) {


i2865 = ((Cons)v2853).tail;
} else {


final Object i2857;
if ((boolean)(v2853 instanceof Cons)) {


final Object i2856;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v2853).tail)) {

i2856 = true;
} else {

i2856 = false;

}
i2857 = i2856;
} else {

i2857 = false;

}
final Object i2864;
if ((boolean)i2857) {





final Object f2858 = HandleCase.LAMBDA.apply(((Cons)v2853).head, new Cons(RuntimeContext.symbol("simple-error"), new Cons("True condition not found.", Nil.NIL)));

i2864 = f2858;
} else {


final Object i2863;
if ((boolean)(v2853 instanceof Cons)) {


final Object f2859 = HandleCases.LAMBDA.apply(((Cons)v2853).tail);
final Object f2860 = HandleCase.LAMBDA.apply(((Cons)v2853).head, f2859);

i2863 = f2860;
} else {

final Object i2862;
if ((boolean)true) {
final Object f2861 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("handle-cases"));

i2862 = f2861;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2863 = i2862;

}
i2864 = i2863;

}
i2865 = i2864;

}
    return i2865;

}
}
