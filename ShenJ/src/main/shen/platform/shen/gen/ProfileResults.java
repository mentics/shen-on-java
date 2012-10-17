package shen.gen;



import com.mentics.shen.*;

public class ProfileResults {

public static final Symbol SYMBOL = RuntimeContext.symbol("profile-results");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1164) throws Exception {
return defined(v1164);
}};
public static Object defined(final Object v1164) throws Exception {
final Object f6850 = ShenGetProfile.LAMBDA.apply(v1164);

final Object results6849 = f6850;
final Object f6852 = ShenPutProfile.LAMBDA.apply(v1164, 0);

final Object initialise6851 = f6852;
final Object f6853 = Atp.LAMBDA.apply(v1164, results6849);



    return f6853;

}
}
