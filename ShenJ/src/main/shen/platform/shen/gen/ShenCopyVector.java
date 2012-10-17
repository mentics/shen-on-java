package shen.gen;



import com.mentics.shen.*;

public class ShenCopyVector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-copy-vector");
public static final Lambda LAMBDA = new Lambda5() {
public Object apply(final Object v1340, final Object v1341, final Object v1342, final Object v1343, final Object v1344) throws Exception {
return defined(v1340, v1341, v1342, v1343, v1344);
}};
public static Object defined(final Object v1340, final Object v1341, final Object v1342, final Object v1343, final Object v1344) throws Exception {






final Object f3718 = ShenCopyVectorStage1.LAMBDA.apply(1, v1340, v1341, Primitives.plus.apply(1, v1342));
final Object f3719 = ShenCopyVectorStage2.LAMBDA.apply(Primitives.plus.apply(1, v1342), Primitives.plus.apply(v1343, 1), v1344, f3718);

    return f3719;

}
}
