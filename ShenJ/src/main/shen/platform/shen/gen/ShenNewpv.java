package shen.gen;



import com.mentics.shen.*;

public class ShenNewpv {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-newpv");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1334) throws Exception {
return defined(v1334);
}};
public static Object defined(final Object v1334) throws Exception {






final Object countPlus13703 = Primitives.plus.apply(((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*varcounter*")))[((Number)v1334).intValue()], 1);




((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*varcounter*")))[((Number)v1334).intValue()] = countPlus13703;
final Object incVar3704 = RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*varcounter*"));




final Object vector3705 = ((Object[])RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*prologvectors*")))[((Number)v1334).intValue()];
final Object f3707 = Limit.LAMBDA.apply(vector3705);

final Object i3709;
if ((boolean)Lang.equals(countPlus13703, f3707)) {
final Object f3708 = ShenResizeprocessvector.LAMBDA.apply(v1334, countPlus13703);

i3709 = f3708;
} else {

i3709 = RuntimeContext.symbol("shen-skip");

}
final Object resizeVectorIfNeeded3706 = i3709;
final Object f3710 = ShenMkPvar.LAMBDA.apply(countPlus13703);





    return f3710;

}
}
