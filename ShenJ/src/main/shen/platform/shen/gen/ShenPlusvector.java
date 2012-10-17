package shen.gen;



import com.mentics.shen.*;

public class ShenPlusvector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-+vector");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v496) throws Exception {
return defined(v496);
}};
public static Object defined(final Object v496) throws Exception {
final Object f2323 = Vector.LAMBDA.apply(0);

final Object i2326;
if ((boolean)Lang.equals(v496, f2323)) {

i2326 = false;
} else {

final Object i2325;
if ((boolean)true) {
final Object f2324 = VectorQ.LAMBDA.apply(v496);

i2325 = f2324;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2326 = i2325;

}
    return i2326;

}
}
