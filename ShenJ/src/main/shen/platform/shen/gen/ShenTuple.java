package shen.gen;



import com.mentics.shen.*;

public class ShenTuple {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-tuple");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1101) throws Exception {
return defined(v1101);
}};
public static Object defined(final Object v1101) throws Exception {
final Object f1229 = Fst.LAMBDA.apply(v1101);
final Object f1230 = Snd.LAMBDA.apply(v1101);
final Object f1231 = Atp.LAMBDA.apply(f1230, Nil.NIL);
final Object f1232 = Atp.LAMBDA.apply(f1229, f1231);
final Object f1233 = IntmakeString.LAMBDA.apply("(@p ~S ~S)", f1232);

    return f1233;

}
}
