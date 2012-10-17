package shen.gen;



import com.mentics.shen.*;

public class ShenBlankFail {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-blank-fail");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1100) throws Exception {
return defined(v1100);
}};
public static Object defined(final Object v1100) throws Exception {

final Object i1228;
if ((boolean)Lang.equals(v1100, null)) {

i1228 = RuntimeContext.symbol("shen-vector-failure-object");
} else {

final Object i1227;
if ((boolean)true) {

i1227 = v1100;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1228 = i1227;

}
    return i1228;

}
}
