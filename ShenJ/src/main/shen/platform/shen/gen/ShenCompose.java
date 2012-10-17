package shen.gen;



import com.mentics.shen.*;

public class ShenCompose {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compose");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v532, final Object v533) throws Exception {
return defined(v532, v533);
}};
public static Object defined(final Object v532, final Object v533) throws Exception {

final Object i4302;
if ((boolean)Lang.equals(Nil.NIL, v532)) {

i4302 = v533;
} else {


final Object i4301;
if ((boolean)(v532 instanceof Cons)) {


final Object f4297 = RuntimeContext.dispatch(((Cons)v532).head).apply(v533);
final Object f4298 = ShenCompose.LAMBDA.apply(((Cons)v532).tail, f4297);

i4301 = f4298;
} else {

final Object i4300;
if ((boolean)true) {
final Object f4299 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-compose"));

i4300 = f4299;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4301 = i4300;

}
i4302 = i4301;

}
    return i4302;

}
}
