package shen.gen;



import com.mentics.shen.*;

public class ShenRememberDatatype {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-remember-datatype");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1577) throws Exception {
return defined(v1577);
}};
public static Object defined(final Object v1577) throws Exception {


final Object i6211;
if ((boolean)(v1577 instanceof Cons)) {


final Object f6205 = Adjoin.LAMBDA.apply(((Cons)v1577).head, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*datatypes*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*datatypes*"), f6205);

final Object f6206 = Adjoin.LAMBDA.apply(((Cons)v1577).head, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*alldatatypes*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*alldatatypes*"), f6206);
final Object f6207 = Do.LAMBDA.apply(f6206, ((Cons)v1577).head);
final Object f6208 = Do.LAMBDA.apply(f6205, f6207);

i6211 = f6208;
} else {

final Object i6210;
if ((boolean)true) {
final Object f6209 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-remember-datatype"));

i6210 = f6209;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6211 = i6210;

}
    return i6211;

}
}
