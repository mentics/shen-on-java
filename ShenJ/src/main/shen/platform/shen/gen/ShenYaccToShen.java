package shen.gen;



import com.mentics.shen.*;

public class ShenYaccToShen {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-yacc->shen");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v299, final Object v300, final Object v301) throws Exception {
return defined(v299, v300, v301);
}};
public static Object defined(final Object v299, final Object v300, final Object v301) throws Exception {


final Lambda l3959 = new Lambda1() {
  public Object apply(final Object v302) throws Exception {
    final Object f3958 = ShenCc_body.LAMBDA.apply(v302);

    return f3958;
  }
};final Object f3960 = ShenSplit_cc_rules.LAMBDA.apply(v300, Nil.NIL);
final Object f3961 = Map.LAMBDA.apply(l3959, f3960);
final Object f3962 = ShenYacc_cases.LAMBDA.apply(f3961);



final Object main3957 = new Cons(RuntimeContext.symbol("define"), new Cons(v299, f3962));
final Object f3963 = EmptyQ.LAMBDA.apply(v301);

final Object i3967;
if ((boolean)f3963) {

i3967 = main3957;
} else {




final Lambda l3965 = new Lambda1() {
  public Object apply(final Object v303) throws Exception {
    final Object f3964 = ShenSegdef.LAMBDA.apply(v303);

    return f3964;
  }
};final Object f3966 = Map.LAMBDA.apply(l3965, v301);





i3967 = new Cons(RuntimeContext.symbol("package"), new Cons(RuntimeContext.symbol("null"), new Cons(Nil.NIL, new Cons(main3957, f3966))));

}

    return i3967;

}
}
