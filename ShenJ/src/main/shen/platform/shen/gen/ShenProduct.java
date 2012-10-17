package shen.gen;



import com.mentics.shen.*;

public class ShenProduct {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-product");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1221) throws Exception {
return defined(v1221);
}};
public static Object defined(final Object v1221) throws Exception {

final Object i2935;
if ((boolean)Lang.equals(Nil.NIL, v1221)) {

i2935 = 1;
} else {


final Object i2934;
if ((boolean)(v1221 instanceof Cons)) {



final Object f2931 = ShenProduct.LAMBDA.apply(((Cons)v1221).tail);


i2934 = Primitives.multiply.apply(((Cons)v1221).head, f2931);
} else {

final Object i2933;
if ((boolean)true) {
final Object f2932 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-product"));

i2933 = f2932;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2934 = i2933;

}
i2935 = i2934;

}
    return i2935;

}
}
