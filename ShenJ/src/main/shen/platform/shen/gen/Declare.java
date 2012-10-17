package shen.gen;



import com.mentics.shen.*;

public class Declare {

public static final Symbol SYMBOL = RuntimeContext.symbol("declare");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1681, final Object v1682) throws Exception {
return defined(v1681, v1682);
}};
public static Object defined(final Object v1681, final Object v1682) throws Exception {

final Object f4466 = Adjoin.LAMBDA.apply(v1681, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*signedfuncs*")));


RuntimeContext.globalProperties.put((Symbol)RuntimeContext.symbol("shen-*signedfuncs*"), f4466);
final Object record4465 = f4466;
Object t4470;
try {
final Object f4468 = ShenVariancyTest.LAMBDA.apply(v1681, v1682);

t4470 = f4468;
} catch (Throwable t) {
final Lambda l4469 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return RuntimeContext.symbol("shen-skip");
  }
};
t4470 = l4469.apply(t);
}
final Object t4471 = t4470;

final Object variancy4467 = t4471;
final Object f4473 = ShenNormaliseType.LAMBDA.apply(v1682);
final Object f4474 = ShenRcons_form.LAMBDA.apply(f4473);

final Object type4472 = f4474;
final Object f4476 = Concat.LAMBDA.apply(RuntimeContext.symbol("shen-type-signature-of-"), v1681);

final Object fStar4475 = f4476;
final Object f4478 = ShenParameters.LAMBDA.apply(1);

final Object parameters4477 = f4478;



















final Object clause4479 = new Cons(new Cons(fStar4475, new Cons(RuntimeContext.symbol("X"), Nil.NIL)), new Cons(RuntimeContext.symbol(":-"), new Cons(new Cons(new Cons(RuntimeContext.symbol("unify!"), new Cons(RuntimeContext.symbol("X"), new Cons(type4472, Nil.NIL))), Nil.NIL), Nil.NIL)));
final Object f4481 = ShenAum.LAMBDA.apply(clause4479, parameters4477);

final Object aUM_instruction4480 = f4481;
final Object f4483 = ShenAum_to_shen.LAMBDA.apply(aUM_instruction4480);

final Object code4482 = f4483;










final Object f4485 = Append.LAMBDA.apply(new Cons(RuntimeContext.symbol("ProcessN"), new Cons(RuntimeContext.symbol("Continuation"), Nil.NIL)), new Cons(RuntimeContext.symbol("->"), new Cons(code4482, Nil.NIL)));
final Object f4486 = Append.LAMBDA.apply(parameters4477, f4485);



final Object shenDef4484 = new Cons(RuntimeContext.symbol("define"), new Cons(fStar4475, f4486));
final Object f4488 = ShenEvalWithoutMacros.LAMBDA.apply(shenDef4484);

final Object eval4487 = f4488;











    return v1681;

}
}
