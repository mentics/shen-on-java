package shen.gen;



import com.mentics.shen.*;

public class ReadFileAsBytelist {

public static final Symbol SYMBOL = RuntimeContext.symbol("read-file-as-bytelist");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v922) throws Exception {
return defined(v922);
}};
public static Object defined(final Object v922) throws Exception {



final Object o1085 = Lang.open(RuntimeContext.symbol("file"), v922, RuntimeContext.symbol("in"));
final Object stream1084 = o1085;


final Object byte1086 = ((java.io.InputStream)stream1084).read();
final Object f1088 = ShenReadFileAsBytelistHelp.LAMBDA.apply(stream1084, byte1086, Nil.NIL);

final Object bytes1087 = f1088;

((java.io.Closeable)stream1084).close();

final Object close1089 = Nil.NIL;
final Object f1090 = Reverse.LAMBDA.apply(bytes1087);





    return f1090;

}
}
