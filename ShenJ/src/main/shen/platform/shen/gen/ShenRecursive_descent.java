package shen.gen;



import com.mentics.shen.*;

public class ShenRecursive_descent {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-recursive_descent");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v343, final Object v344, final Object v345) throws Exception {
return defined(v343, v344, v345);
}};
public static Object defined(final Object v343, final Object v344, final Object v345) throws Exception {


final Object i4108;
if ((boolean)(v343 instanceof Cons)) {






final Object test4099 = new Cons(((Cons)v343).head, new Cons(v344, Nil.NIL));


final Object f4101 = Concat.LAMBDA.apply(RuntimeContext.symbol("Parse_"), ((Cons)v343).head);
final Object f4102 = ShenSyntax.LAMBDA.apply(((Cons)v343).tail, f4101, v345);

final Object action4100 = f4102;



final Object else4103 = new Cons(RuntimeContext.symbol("fail"), Nil.NIL);


final Object f4104 = Concat.LAMBDA.apply(RuntimeContext.symbol("Parse_"), ((Cons)v343).head);









final Object f4105 = Concat.LAMBDA.apply(RuntimeContext.symbol("Parse_"), ((Cons)v343).head);























i4108 = new Cons(RuntimeContext.symbol("let"), new Cons(f4104, new Cons(test4099, new Cons(new Cons(RuntimeContext.symbol("if"), new Cons(new Cons(RuntimeContext.symbol("not"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(new Cons(RuntimeContext.symbol("fail"), Nil.NIL), new Cons(f4105, Nil.NIL))), Nil.NIL)), new Cons(action4100, new Cons(else4103, Nil.NIL)))), Nil.NIL))));
} else {

final Object i4107;
if ((boolean)true) {
final Object f4106 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-recursive_descent"));

i4107 = f4106;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4108 = i4107;

}
    return i4108;

}
}
