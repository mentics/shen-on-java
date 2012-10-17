package shen.gen;



import com.mentics.shen.*;

public class ShenAlphanumsQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-alphanums?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v729) throws Exception {
return defined(v729);
}};
public static Object defined(final Object v729) throws Exception {

final Object i786;
if ((boolean)Lang.equals(Nil.NIL, v729)) {

i786 = true;
} else {


final Object i785;
if ((boolean)(v729 instanceof Cons)) {

final Object f779 = ShenAlphanumQ.LAMBDA.apply(((Cons)v729).head);

final Object i782;
if ((boolean)f779) {

final Object f780 = ShenAlphanumsQ.LAMBDA.apply(((Cons)v729).tail);

final Object i781;
if ((boolean)f780) {

i781 = true;
} else {

i781 = false;

}
i782 = i781;
} else {

i782 = false;

}
i785 = i782;
} else {

final Object i784;
if ((boolean)true) {
final Object f783 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-alphanums?"));

i784 = f783;
} else {

throw new SimpleError((String)"True condition not found.");


}
i785 = i784;

}
i786 = i785;

}
    return i786;

}
}
