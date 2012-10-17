package shen.gen;



import com.mentics.shen.*;

public class WriteStringToFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("write-string-to-file");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6910, final Object v6911) throws Exception {
return defined(v6910, v6911);
}};
public static Object defined(final Object v6910, final Object v6911) throws Exception {



final Object o6993 = Lang.open(RuntimeContext.symbol("file"), v6910, RuntimeContext.symbol("out"));
final Object stream6992 = o6993;


((java.io.OutputStream)stream6992).write(((String)v6911).getBytes());
final Object write6994 = v6911;

((java.io.Closeable)stream6992).close();

final Object close6995 = Nil.NIL;




    return v6910;

}
}
