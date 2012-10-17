package shen.gen;



import com.mentics.shen.*;

public class ShenCopyfromvector {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-copyfromvector");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v752, final Object v753, final Object v754, final Object v755) throws Exception {
return defined(v752, v753, v754, v755);
}};
public static Object defined(final Object v752, final Object v753, final Object v754, final Object v755) throws Exception {
Object t845;
try {
final Object f842 = Ahvector.LAMBDA.apply(v752, v754);
final Object f843 = VectorZ.LAMBDA.apply(v753, v755, f842);

t845 = f843;
} catch (Throwable t) {
final Lambda l844 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return v753;
  }
};
t845 = l844.apply(t);
}
final Object t846 = t845;

    return t846;

}
}
