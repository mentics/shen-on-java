package shen.gen;



import com.mentics.shen.*;

public class ShenCatchCut {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-catch-cut");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1268) throws Exception {
return defined(v1268);
}};
public static Object defined(final Object v1268) throws Exception {
final Object f3055 = ShenOccursQ.LAMBDA.apply(RuntimeContext.symbol("cut"), v1268);


final Object i3057;
if ((boolean)!((boolean)f3055)) {

i3057 = v1268;
} else {

final Object i3056;
if ((boolean)true) {

















i3056 = new Cons(RuntimeContext.symbol("let"), new Cons(RuntimeContext.symbol("Throwcontrol"), new Cons(new Cons(RuntimeContext.symbol("shen-catchpoint"), Nil.NIL), new Cons(new Cons(RuntimeContext.symbol("shen-cutpoint"), new Cons(RuntimeContext.symbol("Throwcontrol"), new Cons(v1268, Nil.NIL))), Nil.NIL))));
} else {

throw new SimpleError((String)"True condition not found.");


}
i3057 = i3056;

}
    return i3057;

}
}
