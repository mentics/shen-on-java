package shen.gen;



import com.mentics.shen.*;

public class EnsureNotReserved {

public static final Symbol SYMBOL = RuntimeContext.symbol("ensure-not-reserved");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6917) throws Exception {
return defined(v6917);
}};
public static Object defined(final Object v6917) throws Exception {

final Object f7001 = ElementQ.LAMBDA.apply(v6917, RuntimeContext.globalProperties.get(RuntimeContext.symbol("*java-reserved*")));

final Object i7002;
if ((boolean)f7001) {



i7002 = ((String)"_" + (String)v6917);
} else {

i7002 = v6917;

}
    return i7002;

}
}
