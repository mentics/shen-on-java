package shen.gen;



import com.mentics.shen.*;

public class ShenRcons_form {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-rcons_form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1318) throws Exception {
return defined(v1318);
}};
public static Object defined(final Object v1318) throws Exception {


final Object i3401;
if ((boolean)(v1318 instanceof Cons)) {


final Object f3398 = ShenRcons_form.LAMBDA.apply(((Cons)v1318).head);


final Object f3399 = ShenRcons_form.LAMBDA.apply(((Cons)v1318).tail);





i3401 = new Cons(RuntimeContext.symbol("cons"), new Cons(f3398, new Cons(f3399, Nil.NIL)));
} else {

final Object i3400;
if ((boolean)true) {

i3400 = v1318;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3401 = i3400;

}
    return i3401;

}
}
