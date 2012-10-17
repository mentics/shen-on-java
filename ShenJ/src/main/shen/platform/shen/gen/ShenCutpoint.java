package shen.gen;



import com.mentics.shen.*;

public class ShenCutpoint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cutpoint");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1273, final Object v1274) throws Exception {
return defined(v1273, v1274);
}};
public static Object defined(final Object v1273, final Object v1274) throws Exception {

final Object i3059;
if ((boolean)Lang.equals(v1274, v1273)) {

i3059 = false;
} else {

final Object i3058;
if ((boolean)true) {

i3058 = v1274;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3059 = i3058;

}
    return i3059;

}
}
