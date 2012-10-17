package shen.gen;



import com.mentics.shen.*;

public class AeZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("<e>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v693) throws Exception {
return defined(v693);
}};
public static Object defined(final Object v693) throws Exception {
final Object f707 = TupleQ.LAMBDA.apply(v693);

final Object i712;
if ((boolean)f707) {
final Object f708 = Fst.LAMBDA.apply(v693);
final Object f709 = Atp.LAMBDA.apply(f708, Nil.NIL);

i712 = f709;
} else {

final Object i711;
if ((boolean)true) {
final Object f710 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("<e>"));

i711 = f710;
} else {

throw new SimpleError((String)"True condition not found.");


}
i712 = i711;

}
    return i712;

}
}
