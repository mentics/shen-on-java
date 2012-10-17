package shen.gen;



import com.mentics.shen.*;

public class ReadFileAsString {

public static final Symbol SYMBOL = RuntimeContext.symbol("read-file-as-string");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v926) throws Exception {
return defined(v926);
}};
public static Object defined(final Object v926) throws Exception {



final Object o1095 = Lang.open(RuntimeContext.symbol("file"), v926, RuntimeContext.symbol("in"));
final Object stream1094 = o1095;

final Object f1096 = ShenRfasH.LAMBDA.apply(stream1094, ((java.io.InputStream)stream1094).read(), "");


    return f1096;

}
}
