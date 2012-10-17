package shen.gen;



import com.mentics.shen.*;

public class OccursCheck {

public static final Symbol SYMBOL = RuntimeContext.symbol("occurs-check");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1293) throws Exception {
return defined(v1293);
}};
public static Object defined(final Object v1293) throws Exception {

final Object i3147;
if ((boolean)Lang.equals(RuntimeContext.symbol("+"), v1293)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*occurs*"), true);
i3147 = true;
} else {

final Object i3146;
if ((boolean)Lang.equals(RuntimeContext.symbol("-"), v1293)) {


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*occurs*"), false);
i3146 = false;
} else {

final Object i3145;
if ((boolean)true) {
final Object f3144 = Interror.LAMBDA.apply("occurs-check expects + or -~%", Nil.NIL);

i3145 = f3144;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3146 = i3145;

}
i3147 = i3146;

}
    return i3147;

}
}
