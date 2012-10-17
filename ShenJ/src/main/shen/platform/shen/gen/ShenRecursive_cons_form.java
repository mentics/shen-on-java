package shen.gen;



import com.mentics.shen.*;

public class ShenRecursive_cons_form {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-recursive_cons_form");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1639) throws Exception {
return defined(v1639);
}};
public static Object defined(final Object v1639) throws Exception {


final Object i6405;
if ((boolean)(v1639 instanceof Cons)) {


final Object f6402 = ShenRecursive_cons_form.LAMBDA.apply(((Cons)v1639).head);


final Object f6403 = ShenRecursive_cons_form.LAMBDA.apply(((Cons)v1639).tail);





i6405 = new Cons(RuntimeContext.symbol("cons"), new Cons(f6402, new Cons(f6403, Nil.NIL)));
} else {

final Object i6404;
if ((boolean)true) {

i6404 = v1639;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6405 = i6404;

}
    return i6405;

}
}
