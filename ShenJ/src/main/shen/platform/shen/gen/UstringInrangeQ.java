package shen.gen;



import com.mentics.shen.*;

public class UstringInrangeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("ustring-inrange?");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6871, final Object v6872, final Object v6873) throws Exception {
return defined(v6871, v6872, v6873);
}};
public static Object defined(final Object v6871, final Object v6872, final Object v6873) throws Exception {



final Object i6898;
if ((boolean)(((Number)(v6871)).doubleValue() >= ((Number)(v6872)).doubleValue())) {



final Object i6897;
if ((boolean)(((Number)(v6871)).doubleValue() <= ((Number)(v6873)).doubleValue())) {

i6897 = true;
} else {

i6897 = false;

}
i6898 = i6897;
} else {

i6898 = false;

}
    return i6898;

}
}
