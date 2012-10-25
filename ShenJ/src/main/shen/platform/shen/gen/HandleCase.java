package shen.gen;



import com.mentics.shen.*;

public class HandleCase {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-case");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v2866, final Object v2867) throws Exception {
return defined(v2866, v2867);
}};
public static Object defined(final Object v2866, final Object v2867) throws Exception {


final Object i2871;
if ((boolean)(v2866 instanceof Cons)) {



final Object i2869;
if ((boolean)(((Cons)v2866).tail instanceof Cons)) {



final Object i2868;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v2866).tail).tail)) {

i2868 = true;
} else {

i2868 = false;

}
i2869 = i2868;
} else {

i2869 = false;

}
final Object i2870;
if ((boolean)i2869) {

i2870 = true;
} else {

i2870 = false;

}
i2871 = i2870;
} else {

i2871 = false;

}
final Object i2874;
if ((boolean)i2871) {












i2874 = new Cons(RuntimeContext.symbol("if"), new Cons(((Cons)v2866).head, new Cons(((Cons)((Cons)v2866).tail).head, new Cons(v2867, Nil.NIL))));
} else {

final Object i2873;
if ((boolean)true) {
final Object f2872 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("handle-case"));

i2873 = f2872;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2874 = i2873;

}
    return i2874;

}
}
