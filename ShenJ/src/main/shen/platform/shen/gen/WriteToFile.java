package shen.gen;



import com.mentics.shen.*;

public class WriteToFile {

public static final Symbol SYMBOL = RuntimeContext.symbol("write-to-file");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1679, final Object v1680) throws Exception {
return defined(v1679, v1680);
}};
public static Object defined(final Object v1679, final Object v1680) throws Exception {

final Object f4282 = Atp.LAMBDA.apply(v1679, Nil.NIL);
final Object f4283 = Atp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("*home-directory*")), f4282);
final Object f4284 = IntmakeString.LAMBDA.apply("~A~A", f4283);

final Object absPath4281 = f4284;



final Object o4286 = Lang.open(RuntimeContext.symbol("file"), absPath4281, RuntimeContext.symbol("out"));
final Object stream4285 = o4286;
final Object f4288 = Atp.LAMBDA.apply(v1680, Nil.NIL);
final Object f4289 = IntmakeString.LAMBDA.apply("~S~%~%", f4288);

final Object string4287 = f4289;


((java.io.OutputStream)stream4285).write(((String)string4287).getBytes());
final Object write4290 = string4287;

((java.io.Closeable)stream4285).close();

final Object close4291 = Nil.NIL;






    return v1680;

}
}
