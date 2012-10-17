package shen.gen;



import com.mentics.shen.*;

public class Print {

public static final Symbol SYMBOL = RuntimeContext.symbol("print");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1081) throws Exception {
return defined(v1081);
}};
public static Object defined(final Object v1081) throws Exception {




final Object f1131 = Atp.LAMBDA.apply(v1081, RuntimeContext.symbol("shen-skip"));
final Object f1132 = ShenMsH.LAMBDA.apply(new Cons("~", new Cons("S", Nil.NIL)), f1131);

final Object f1133 = ShenStoutput.LAMBDA.apply(0);

((java.io.OutputStream)f1133).write(((String)f1132).getBytes());final Object f1134 = Do.LAMBDA.apply(f1132, v1081);

    return f1134;

}
}
