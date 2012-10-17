package shen.gen;



import com.mentics.shen.*;

public class ShenErrCondition {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-err-condition");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v528) throws Exception {
return defined(v528);
}};
public static Object defined(final Object v528) throws Exception {


final Object i2501;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*installing-kl*"))) {









i2501 = new Cons(true, new Cons(new Cons(RuntimeContext.symbol("shen-sys-error"), new Cons(v528, Nil.NIL)), Nil.NIL));
} else {

final Object i2500;
if ((boolean)true) {









i2500 = new Cons(true, new Cons(new Cons(RuntimeContext.symbol("shen-f_error"), new Cons(v528, Nil.NIL)), Nil.NIL));
} else {

throw new SimpleError((String)"True condition not found.");


}
i2501 = i2500;

}
    return i2501;

}
}
