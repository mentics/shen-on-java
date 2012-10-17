package shen.gen;



import com.mentics.shen.*;

public class Track {

public static final Symbol SYMBOL = RuntimeContext.symbol("track");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1125) throws Exception {
return defined(v1125);
}};
public static Object defined(final Object v1125) throws Exception {
final Object f6754 = Ps.LAMBDA.apply(v1125);

final Object source6753 = f6754;
final Object f6755 = ShenTrackFunction.LAMBDA.apply(source6753);


    return f6755;

}
}
