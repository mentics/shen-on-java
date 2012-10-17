package shen.gen;



import com.mentics.shen.*;

public class ShenFunctionAbstraction {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-function-abstraction");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v563, final Object v564) throws Exception {
return defined(v563, v564);
}};
public static Object defined(final Object v563, final Object v564) throws Exception {

final Object i4720;
if ((boolean)Lang.equals(0, v564)) {





i4720 = new Cons(RuntimeContext.symbol("freeze"), new Cons(v563, Nil.NIL));
} else {

final Object i4719;
if ((boolean)Lang.equals(-1, v564)) {

i4719 = v563;
} else {

final Object i4718;
if ((boolean)true) {
final Object f4717 = ShenFunctionAbstractionHelp.LAMBDA.apply(v563, v564, Nil.NIL);

i4718 = f4717;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4719 = i4718;

}
i4720 = i4719;

}
    return i4720;

}
}
