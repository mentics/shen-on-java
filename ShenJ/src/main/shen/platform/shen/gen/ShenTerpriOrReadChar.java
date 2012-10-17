package shen.gen;



import com.mentics.shen.*;

public class ShenTerpriOrReadChar {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-terpri-or-read-char");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {


final Object i6785;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*step*"))) {


final Object f6783 = ShenCheckByte.LAMBDA.apply(((java.io.InputStream)RuntimeContext.globalProperties.get(RuntimeContext.symbol("*stinput*"))).read());

i6785 = f6783;
} else {
final Object f6784 = Nl.LAMBDA.apply(1);

i6785 = f6784;

}
    return i6785;

}
}
