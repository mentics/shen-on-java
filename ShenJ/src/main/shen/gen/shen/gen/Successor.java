package shen.gen;



import com.mentics.shen.*;

public class Successor {

public static final Symbol SYMBOL = RuntimeContext.symbol("successor");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v222) throws Exception {
return defined(v222);
}};
public static Object defined(final Object v222) throws Exception {


final Object i224;
if ((boolean)(v222 instanceof Number)) {



i224 = Primitives.plus.apply(1, v222);
} else {

final Object i223;
if ((boolean)true) {

i223 = "error!";
} else {

throw new SimpleError((String)"True condition not found.");


}
i224 = i223;

}
    return i224;

}
}
