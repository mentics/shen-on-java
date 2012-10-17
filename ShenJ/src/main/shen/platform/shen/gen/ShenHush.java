package shen.gen;



import com.mentics.shen.*;

public class ShenHush {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-hush");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v959) throws Exception {
return defined(v959);
}};
public static Object defined(final Object v959) throws Exception {

final Object i1130;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v959)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*hush*"), RuntimeContext.symbol("shen-hushed"));
i1130 = RuntimeContext.symbol("shen-hushed");
} else {

final Object i1129;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v959)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*hush*"), RuntimeContext.symbol("shen-unhushed"));
i1129 = RuntimeContext.symbol("shen-unhushed");
} else {

final Object i1128;
if ((boolean)true) {
final Object f1127 = Interror.LAMBDA.apply("'hush' expects a + or a -~%", Nil.NIL);

i1128 = f1127;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1129 = i1128;

}
i1130 = i1129;

}
    return i1130;

}
}
