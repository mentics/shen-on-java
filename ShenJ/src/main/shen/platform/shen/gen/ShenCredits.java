package shen.gen;



import com.mentics.shen.*;

public class ShenCredits {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-credits");
public static final Lambda LAMBDA = new Lambda0() {
public Object apply() throws Exception {
return defined();
}};
public static Object defined() throws Exception {
final Object f6442 = Intoutput.LAMBDA.apply("~%Shen 2010, copyright (C) 2010 Mark Tarver~%", Nil.NIL);

final Object f6443 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*version*")), Nil.NIL);
final Object f6444 = Intoutput.LAMBDA.apply("www.shenlanguage.org, ~A~%", f6443);


final Object f6445 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*implementation*")), Nil.NIL);
final Object f6446 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*language*")), f6445);
final Object f6447 = Intoutput.LAMBDA.apply("running under ~A, implementation: ~A", f6446);


final Object f6448 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*porters*")), Nil.NIL);
final Object f6449 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*port*")), f6448);
final Object f6450 = Intoutput.LAMBDA.apply("~%port ~A ported by ~A~%", f6449);
final Object f6451 = Do.LAMBDA.apply(f6447, f6450);
final Object f6452 = Do.LAMBDA.apply(f6444, f6451);
final Object f6453 = Do.LAMBDA.apply(f6442, f6452);

    return f6453;

}
}
