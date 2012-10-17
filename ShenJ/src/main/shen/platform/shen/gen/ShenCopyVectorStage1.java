package shen.gen;



import com.mentics.shen.*;

public class ShenCopyVectorStage1 {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-copy-vector-stage-1");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1347, final Object v1348, final Object v1349, final Object v1350) throws Exception {
return defined(v1347, v1348, v1349, v1350);
}};
public static Object defined(final Object v1347, final Object v1348, final Object v1349, final Object v1350) throws Exception {

final Object i3722;
if ((boolean)Lang.equals(v1350, v1347)) {

i3722 = v1349;
} else {

final Object i3721;
if ((boolean)true) {







((Object[])v1349)[((Number)v1347).intValue()] = ((Object[])v1348)[((Number)v1347).intValue()];final Object f3720 = ShenCopyVectorStage1.LAMBDA.apply(Primitives.plus.apply(1, v1347), v1348, v1349, v1350);

i3721 = f3720;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3722 = i3721;

}
    return i3722;

}
}
