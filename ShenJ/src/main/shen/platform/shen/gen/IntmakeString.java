package shen.gen;



import com.mentics.shen.*;

public class IntmakeString {

public static final Symbol SYMBOL = RuntimeContext.symbol("intmake-string");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1089, final Object v1090) throws Exception {
return defined(v1089, v1090);
}};
public static Object defined(final Object v1089, final Object v1090) throws Exception {
final Object f1149 = ShenExplodeString.LAMBDA.apply(v1089);
final Object f1150 = ShenMsH.LAMBDA.apply(f1149, v1090);

    return f1150;

}
}
