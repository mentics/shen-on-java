package shen.gen;



import com.mentics.shen.*;

public class ParsedKlToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("parsed-kl-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7252) throws Exception {
return defined(v7252);
}};
public static Object defined(final Object v7252) throws Exception {
final Object f8451 = Atp.LAMBDA.apply(v7252, Nil.NIL);
final Object f8452 = IntmakeString.LAMBDA.apply("~%~%~%Evaluating: ~A~%~%", f8451);
final Object f8453 = Intoutput.LAMBDA.apply(f8452, Nil.NIL);
final Object f8455 = KlToJavaTraverse.LAMBDA.apply(v7252, RuntimeContext.symbol("object"), Nil.NIL);

final Object result8454 = f8455;


final Object i8457;
if ((boolean)(v7252 instanceof Cons)) {


final Object i8456;
if ((boolean)Lang.equals(RuntimeContext.symbol("defun"), ((Cons)v7252).head)) {

i8456 = true;
} else {

i8456 = false;

}
i8457 = i8456;
} else {

i8457 = false;

}
final Object i8475;
if ((boolean)i8457) {
final Object f8458 = Fst.LAMBDA.apply(result8454);
final Object f8459 = Atp.LAMBDA.apply(f8458, Nil.NIL);
final Object f8460 = IntmakeString.LAMBDA.apply("Expected string triple from defun, was: ~A~%", f8459);
final Object f8461 = AssertTest.LAMBDA.apply(result8454, RuntimeContext.symbol("traverse-result-type?"), f8460);

i8475 = f8461;
} else {
final Object f8463 = Fst.LAMBDA.apply(result8454);
final Object f8464 = Atp.LAMBDA.apply("TODO", Nil.NIL);
final Object f8465 = IntmakeString.LAMBDA.apply("Expected string result body, but Result was: ~A~%", f8464);
final Object f8466 = AssertTest.LAMBDA.apply(f8463, RuntimeContext.symbol("string?"), f8465);

final Object code8462 = f8466;
final Object f8468 = Second.LAMBDA.apply(result8454);
final Object f8469 = AssertTest.LAMBDA.apply(f8468, RuntimeContext.symbol("string?"), "Expected string result expression.");

final Object expression8467 = f8469;
final Object f8470 = HandleUnreachableReturn.LAMBDA.apply(result8454);
final Object f8471 = Atp.LAMBDA.apply(f8470, Nil.NIL);
final Object f8472 = Atp.LAMBDA.apply(code8462, f8471);
final Object f8473 = IntmakeString.LAMBDA.apply("  public static Object run() throws Exception {~%~A;~%~A  }", f8472);
final Object f8474 = Atp.LAMBDA.apply(f8473, "");



i8475 = f8474;

}
final Object f8476 = Do.LAMBDA.apply(f8453, i8475);

    return f8476;

}
}
