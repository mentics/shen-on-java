package shen.gen;



import com.mentics.shen.*;

public class Declare {

public static final Symbol SYMBOL = RuntimeContext.symbol("declare");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1681, final Object v1682) throws Exception {
return defined(v1681, v1682);
}};
public static Object defined(final Object v1681, final Object v1682) throws Exception {

final Object f8 = Adjoin.LAMBDA.apply(v1681, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*signedfuncs*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*signedfuncs*"), f8);
final Object record7 = f8;
Object t12;
try {
final Object f10 = ShenVariancyTest.LAMBDA.apply(v1681, v1682);

t12 = f10;
} catch (Throwable t) {
final Lambda l11 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return RuntimeContext.symbol("shen-skip");
  }
};
t12 = l11.apply(t);
}
final Object t13 = t12;

final Object variancy9 = t13;
final Object f15 = ShenNormaliseType.LAMBDA.apply(v1682);
final Object f16 = ShenRcons_form.LAMBDA.apply(f15);

final Object type14 = f16;
final Object f18 = Concat.LAMBDA.apply(RuntimeContext.symbol("shen-type-signature-of-"), v1681);

final Object fStar17 = f18;
final Object f20 = ShenParameters.LAMBDA.apply(1);

final Object parameters19 = f20;



















final Object clause21 = new Cons(new Cons(fStar17, new Cons(RuntimeContext.symbol("X"), Nil.NIL)), new Cons(RuntimeContext.symbol(":-"), new Cons(new Cons(new Cons(RuntimeContext.symbol("unify!"), new Cons(RuntimeContext.symbol("X"), new Cons(type14, Nil.NIL))), Nil.NIL), Nil.NIL)));
final Object f23 = ShenAum.LAMBDA.apply(clause21, parameters19);

final Object aUM_instruction22 = f23;
final Object f25 = ShenAum_to_shen.LAMBDA.apply(aUM_instruction22);

final Object code24 = f25;










final Object f27 = Append.LAMBDA.apply(new Cons(RuntimeContext.symbol("ProcessN"), new Cons(RuntimeContext.symbol("Continuation"), Nil.NIL)), new Cons(RuntimeContext.symbol("->"), new Cons(code24, Nil.NIL)));
final Object f28 = Append.LAMBDA.apply(parameters19, f27);



final Object shenDef26 = new Cons(RuntimeContext.symbol("define"), new Cons(fStar17, f28));
final Object f30 = ShenEvalWithoutMacros.LAMBDA.apply(shenDef26);

final Object eval29 = f30;











    return v1681;

}
}
