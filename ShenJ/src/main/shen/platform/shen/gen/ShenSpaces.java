package shen.gen;



import com.mentics.shen.*;

public class ShenSpaces {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-spaces");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1149) throws Exception {
return defined(v1149);
}};
public static Object defined(final Object v1149) throws Exception {

final Object i6812;
if ((boolean)Lang.equals(0, v1149)) {

i6812 = "";
} else {

final Object i6811;
if ((boolean)true) {



final Object f6810 = ShenSpaces.LAMBDA.apply(Primitives.minus.apply(v1149, 1));


i6811 = ((String)" " + (String)f6810);
} else {

throw new SimpleError((String)"True condition not found.");


}
i6812 = i6811;

}
    return i6812;

}
}
