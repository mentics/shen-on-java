package shen.gen;



import com.mentics.shen.*;

public class ShenTypeSignatureOfReadFileAsBytelist {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-type-signature-of-read-file-as-bytelist");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v721, final Object v722, final Object v723) throws Exception {
return defined(v721, v722, v723);
}};
public static Object defined(final Object v721, final Object v722, final Object v723) throws Exception {
final Object f724 = ShenIncinfs.LAMBDA.apply();










final Object f725 = UnifyBang.LAMBDA.apply(v721, new Cons(RuntimeContext.symbol("string"), new Cons(RuntimeContext.symbol("-->"), new Cons(new Cons(RuntimeContext.symbol("list"), new Cons(RuntimeContext.symbol("number"), Nil.NIL)), Nil.NIL))), v722, v723);
final Object f726 = Do.LAMBDA.apply(f724, f725);

    return f726;

}
}
