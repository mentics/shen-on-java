package shen.gen;



import com.mentics.shen.*;

public class ShenDoubleToSingles {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-double->singles");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1582) throws Exception {
return defined(v1582);
}};
public static Object defined(final Object v1582) throws Exception {
final Object f6236 = ShenRightRule.LAMBDA.apply(v1582);

final Object f6237 = ShenLeftRule.LAMBDA.apply(v1582);




    return new Cons(f6236, new Cons(f6237, Nil.NIL));

}
}
