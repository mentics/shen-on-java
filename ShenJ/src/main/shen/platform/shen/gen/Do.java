package shen.gen;



import com.mentics.shen.*;

public class Do {

public static final Symbol SYMBOL = RuntimeContext.symbol("do");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v784, final Object v785) throws Exception {
return defined(v784, v785);
}};
public static Object defined(final Object v784, final Object v785) throws Exception {

    return v785;

}
}
