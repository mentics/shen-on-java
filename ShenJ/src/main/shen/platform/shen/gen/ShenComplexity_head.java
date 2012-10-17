package shen.gen;



import com.mentics.shen.*;

public class ShenComplexity_head {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-complexity_head");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1211) throws Exception {
return defined(v1211);
}};
public static Object defined(final Object v1211) throws Exception {


final Object i2844;
if ((boolean)(v1211 instanceof Cons)) {
final Lambda l2839 = new Lambda1() {
  public Object apply(final Object v1212) throws Exception {
    final Object f2838 = ShenComplexity.LAMBDA.apply(v1212);

    return f2838;
  }
};
final Object f2840 = Map.LAMBDA.apply(l2839, ((Cons)v1211).tail);
final Object f2841 = ShenProduct.LAMBDA.apply(f2840);

i2844 = f2841;
} else {

final Object i2843;
if ((boolean)true) {
final Object f2842 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-complexity_head"));

i2843 = f2842;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2844 = i2843;

}
    return i2844;

}
}
