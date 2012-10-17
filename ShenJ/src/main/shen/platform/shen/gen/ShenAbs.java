package shen.gen;



import com.mentics.shen.*;

public class ShenAbs {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-abs");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v910) throws Exception {
return defined(v910);
}};
public static Object defined(final Object v910) throws Exception {



final Object i1066;
if ((boolean)(((Number)(v910)).doubleValue() > ((Number)(0)).doubleValue())) {

i1066 = v910;
} else {



i1066 = Primitives.minus.apply(0, v910);

}
    return i1066;

}
}
