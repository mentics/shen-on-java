package shen.gen;



import com.mentics.shen.*;

public class ShenAtvHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-@v-help");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v747, final Object v748, final Object v749, final Object v750) throws Exception {
return defined(v747, v748, v749, v750);
}};
public static Object defined(final Object v747, final Object v748, final Object v749, final Object v750) throws Exception {

final Object i841;
if ((boolean)Lang.equals(v749, v748)) {


final Object f837 = ShenCopyfromvector.LAMBDA.apply(v747, v750, v749, Primitives.plus.apply(v749, 1));

i841 = f837;
} else {

final Object i840;
if ((boolean)true) {




final Object f838 = ShenCopyfromvector.LAMBDA.apply(v747, v750, v748, Primitives.plus.apply(v748, 1));
final Object f839 = ShenAtvHelp.LAMBDA.apply(v747, Primitives.plus.apply(v748, 1), v749, f838);

i840 = f839;
} else {

throw new SimpleError((String)"True condition not found.");


}
i841 = i840;

}
    return i841;

}
}
