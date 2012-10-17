package shen.gen;



import com.mentics.shen.*;

public class ShenStoreArity {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-store-arity");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v491, final Object v492) throws Exception {
return defined(v491, v492);
}};
public static Object defined(final Object v491, final Object v492) throws Exception {


final Object i2132;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*installing-kl*"))) {

i2132 = RuntimeContext.symbol("shen-skip");
} else {

final Object i2131;
if ((boolean)true) {

final Object f2130 = Put.LAMBDA.apply(v491, RuntimeContext.symbol("arity"), v492, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

i2131 = f2130;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2132 = i2131;

}
    return i2132;

}
}
