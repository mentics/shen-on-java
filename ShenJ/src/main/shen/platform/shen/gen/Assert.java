package shen.gen;



import com.mentics.shen.*;

public class Assert {

public static final Symbol SYMBOL = RuntimeContext.symbol("assert");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6930, final Object v6931, final Object v6932) throws Exception {
return defined(v6930, v6931, v6932);
}};
public static Object defined(final Object v6930, final Object v6931, final Object v6932) throws Exception {

final Object i7169;
if ((boolean)v6930) {

i7169 = v6932;
} else {

throw new SimpleError((String)v6931);


}
    return i7169;

}
}
