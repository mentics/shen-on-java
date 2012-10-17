package shen.gen;



import com.mentics.shen.*;

public class ShenCopyVectorStage2 {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-copy-vector-stage-2");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v1354, final Object v1355, final Object v1356, final Object v1357) throws Exception {
return defined(v1354, v1355, v1356, v1357);
}};
public static Object defined(final Object v1354, final Object v1355, final Object v1356, final Object v1357) throws Exception {

final Object i3725;
if ((boolean)Lang.equals(v1355, v1354)) {

i3725 = v1357;
} else {

final Object i3724;
if ((boolean)true) {





((Object[])v1357)[((Number)v1354).intValue()] = v1356;final Object f3723 = ShenCopyVectorStage2.LAMBDA.apply(Primitives.plus.apply(v1354, 1), v1355, v1356, v1357);

i3724 = f3723;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3725 = i3724;

}
    return i3725;

}
}
