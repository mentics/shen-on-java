package shen.gen;



import com.mentics.shen.*;

public class ShenPrompt {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prompt");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {


final Object i6590;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tc*"))) {

final Object f6584 = Length.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*history*")));
final Object f6585 = Atp.LAMBDA.apply(f6584, Nil.NIL);
final Object f6586 = Intoutput.LAMBDA.apply("~%~%(~A+) ", f6585);

i6590 = f6586;
} else {

final Object f6587 = Length.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*history*")));
final Object f6588 = Atp.LAMBDA.apply(f6587, Nil.NIL);
final Object f6589 = Intoutput.LAMBDA.apply("~%~%(~A-) ", f6588);

i6590 = f6589;

}
    return i6590;

}
}
