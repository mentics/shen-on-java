package shen.gen;



import com.mentics.shen.*;

public class CombineTypes {

public static final Symbol SYMBOL = RuntimeContext.symbol("combine-types");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v2832, final Object v2833) throws Exception {
return defined(v2832, v2833);
}};
public static Object defined(final Object v2832, final Object v2833) throws Exception {

final Object i2837;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), v2832)) {

i2837 = v2833;
} else {

final Object i2836;
if ((boolean)Lang.equals(RuntimeContext.symbol("unreachable"), v2833)) {

i2836 = v2832;
} else {

final Object i2835;
if ((boolean)true) {


final Object i2834;
if ((boolean)!((boolean)Lang.equals(RuntimeContext.symbol("object"), v2832))) {

i2834 = v2832;
} else {

i2834 = v2833;

}
i2835 = i2834;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2836 = i2835;

}
i2837 = i2836;

}
    return i2837;

}
}
