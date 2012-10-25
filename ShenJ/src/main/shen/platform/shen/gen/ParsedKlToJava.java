package shen.gen;



import com.mentics.shen.*;

public class ParsedKlToJava {

public static final Symbol SYMBOL = RuntimeContext.symbol("parsed-kl-to-java");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v2314) throws Exception {
return defined(v2314);
}};
public static Object defined(final Object v2314) throws Exception {
final Object f2315 = Atp.LAMBDA.apply(v2314, Nil.NIL);
//final Object f2316 = IntmakeString.LAMBDA.apply("~%~%~%Evaluating: ~A~%~%", f2315);
final Object f2317 = null;//Intoutput.LAMBDA.apply(f2316, Nil.NIL);
final Object f2319 = KlToJavaTraverse.LAMBDA.apply(v2314, RuntimeContext.symbol("object"), Nil.NIL);

final Object result2318 = f2319;


final Object i2321;
if ((boolean)(v2314 instanceof Cons)) {


final Object i2320;
if ((boolean)Lang.equals(RuntimeContext.symbol("defun"), ((Cons)v2314).head)) {

i2320 = true;
} else {

i2320 = false;

}
i2321 = i2320;
} else {

i2321 = false;

}
final Object i2339;
if ((boolean)i2321) {
final Object f2322 = Fst.LAMBDA.apply(result2318);
final Object f2323 = Atp.LAMBDA.apply(f2322, Nil.NIL);
final Object f2324 = IntmakeString.LAMBDA.apply("Expected string triple from defun, was: ~A~%", f2323);
final Object f2325 = AssertTest.LAMBDA.apply(result2318, RuntimeContext.symbol("traverse-result-type?"), f2324);

i2339 = f2325;
} else {
final Object f2327 = Fst.LAMBDA.apply(result2318);
final Object f2328 = Atp.LAMBDA.apply("TODO", Nil.NIL);
final Object f2329 = IntmakeString.LAMBDA.apply("Expected string result body, but Result was: ~A~%", f2328);
final Object f2330 = AssertTest.LAMBDA.apply(f2327, RuntimeContext.symbol("string?"), f2329);

final Object code2326 = f2330;
final Object f2332 = Second.LAMBDA.apply(result2318);
final Object f2333 = AssertTest.LAMBDA.apply(f2332, RuntimeContext.symbol("string?"), "Expected string result expression.");

final Object expression2331 = f2333;
final Object f2334 = HandleUnreachableReturn.LAMBDA.apply(result2318);
final Object f2335 = Atp.LAMBDA.apply(f2334, Nil.NIL);
final Object f2336 = Atp.LAMBDA.apply(code2326, f2335);
final Object f2337 = IntmakeString.LAMBDA.apply("  public static Object run() throws Exception {~%~A;~%~A  }", f2336);
final Object f2338 = Atp.LAMBDA.apply(f2337, "");



i2339 = f2338;

}
final Object f2340 = Do.LAMBDA.apply(f2317, i2339);

    return f2340;

}
}
