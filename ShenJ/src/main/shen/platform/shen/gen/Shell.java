package shen.gen;



import com.mentics.shen.*;

public class Shell {

public static final Symbol SYMBOL = RuntimeContext.symbol("shell");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6909) throws Exception {
return defined(v6909);
}};
public static Object defined(final Object v6909) throws Exception {
final Object f6990 = ShellStream.LAMBDA.apply(v6909);

final Object stream6989 = f6990;
final Object f6991 = StreamToString.LAMBDA.apply(stream6989, "");


    return f6991;

}
}
