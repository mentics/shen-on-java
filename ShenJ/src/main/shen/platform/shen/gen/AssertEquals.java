package shen.gen;



import com.mentics.shen.*;

public class AssertEquals {

public static final Symbol SYMBOL = RuntimeContext.symbol("assertEquals");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v6933, final Object v6934, final Object v6935) throws Exception {
return defined(v6933, v6934, v6935);
}};
public static Object defined(final Object v6933, final Object v6934, final Object v6935) throws Exception {

final Object i7170;
if ((boolean)Lang.equals(v6933, v6934)) {

i7170 = v6933;
} else {

throw new SimpleError((String)v6935);


}
    return i7170;

}
}
