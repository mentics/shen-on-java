package shen.gen;



import com.mentics.shen.*;

public class Put {

public static final Symbol SYMBOL = RuntimeContext.symbol("put");
public static final Lambda LAMBDA = new Lambda4() {
public Object apply(final Object v814, final Object v815, final Object v816, final Object v817) throws Exception {
return defined(v814, v815, v816, v817);
}};
public static Object defined(final Object v814, final Object v815, final Object v816, final Object v817) throws Exception {
final Object f911 = Limit.LAMBDA.apply(v817);
final Object f912 = Hash.LAMBDA.apply(v814, f911);

final Object n910 = f912;
Object t916;
try {
final Object f914 = Ahvector.LAMBDA.apply(v817, n910);

t916 = f914;
} catch (Throwable t) {
final Lambda l915 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return Nil.NIL;
  }
};
t916 = l915.apply(t);
}
final Object t917 = t916;

final Object entry913 = t917;
final Object f919 = ShenChangePointerValue.LAMBDA.apply(v814, v815, v816, entry913);
final Object f920 = VectorZ.LAMBDA.apply(v817, n910, f919);

final Object change918 = f920;




    return v816;

}
}
