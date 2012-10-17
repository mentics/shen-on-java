package shen.gen;



import com.mentics.shen.*;

public class Spy {

public static final Symbol SYMBOL = RuntimeContext.symbol("spy");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1139) throws Exception {
return defined(v1139);
}};
public static Object defined(final Object v1139) throws Exception {

final Object i6782;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v1139)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*spy*"), true);
i6782 = true;
} else {

final Object i6781;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v1139)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*spy*"), false);
i6781 = false;
} else {

final Object i6780;
if ((boolean)true) {
final Object f6779 = Interror.LAMBDA.apply("spy expects a + or a -.~%", Nil.NIL);

i6780 = f6779;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6781 = i6780;

}
i6782 = i6781;

}
    return i6782;

}
}
