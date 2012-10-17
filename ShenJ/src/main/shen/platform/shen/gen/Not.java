package shen.gen;



import com.mentics.shen.*;

public class Not {

public static final Symbol SYMBOL = RuntimeContext.symbol("not");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v866) throws Exception {
return defined(v866);
}};
public static Object defined(final Object v866) throws Exception {

final Object i1027;
if ((boolean)v866) {

i1027 = false;
} else {

i1027 = true;

}
    return i1027;

}
}
