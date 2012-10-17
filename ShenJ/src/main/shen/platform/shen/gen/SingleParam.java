package shen.gen;



import com.mentics.shen.*;

public class SingleParam {

public static final Symbol SYMBOL = RuntimeContext.symbol("single-param");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v7260, final Object v7261, final Object v7262, final Object v7263, final Object v7264) throws Exception {
return defined(v7260, v7261, v7262, v7263, v7264);
}};
public static Object defined(final Object v7260, final Object v7261, final Object v7262, final Object v7263, final Object v7264) throws Exception {
final Object f8791 = KlToJavaTraverse.LAMBDA.apply(v7260, v7261, v7262);

final Object argTOxDO8790 = f8791;
final Object f8792 = Fst.LAMBDA.apply(argTOxDO8790);
final Object f8793 = Atp.LAMBDA.apply(f8792, Nil.NIL);
final Object f8794 = IntmakeString.LAMBDA.apply("~A~%", f8793);
final Object f8795 = Second.LAMBDA.apply(argTOxDO8790);
final Object f8796 = Atp.LAMBDA.apply(f8795, Nil.NIL);
final Object f8797 = IntmakeString.LAMBDA.apply(v7263, f8796);
final Object f8798 = Atp.LAMBDA.apply(f8797, v7264);
final Object f8799 = Atp.LAMBDA.apply(f8794, f8798);


    return f8799;

}
}
