package shen.gen;



import com.mentics.shen.*;

public class ShenFillvector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-fillvector");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v713, final Object v714, final Object v715, final Object v716) throws Exception {
return defined(v713, v714, v715, v716);
}};
public static Object defined(final Object v713, final Object v714, final Object v715, final Object v716) throws Exception {

final Object i742;
if ((boolean)Lang.equals(v715, v714)) {



((Object[])v713)[((Number)v715).intValue()] = v716;
i742 = v713;
} else {

final Object i741;
if ((boolean)true) {



((Object[])v713)[((Number)v714).intValue()] = v716;

final Object f740 = ShenFillvector.LAMBDA.apply(v713, Primitives.plus.apply(1, v714), v715, v716);

i741 = f740;
} else {

throw new SimpleError((String)"True condition not found.");


}
i742 = i741;

}
    return i742;

}
}
