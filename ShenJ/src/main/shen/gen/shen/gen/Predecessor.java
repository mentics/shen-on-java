package shen.gen;



import com.mentics.shen.*;

public class Predecessor {

public static final Symbol SYMBOL = RuntimeContext.symbol("predecessor");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v229) throws Exception {
return defined(v229);
}};
public static Object defined(final Object v229) throws Exception {


final Object i231;
if ((boolean)(v229 instanceof Number)) {



i231 = Primitives.minus.apply(v229, 1);
} else {

final Object i230;
if ((boolean)true) {

i230 = "error!";
} else {

throw new SimpleError((String)"True condition not found.");


}
i231 = i230;

}
    return i231;

}
}
