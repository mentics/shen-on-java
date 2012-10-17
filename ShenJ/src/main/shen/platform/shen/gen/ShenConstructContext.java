package shen.gen;



import com.mentics.shen.*;

public class ShenConstructContext {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-construct-context");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1637, final Object v1638) throws Exception {
return defined(v1637, v1638);
}};
public static Object defined(final Object v1637, final Object v1638) throws Exception {

final Object i6392;
if ((boolean)Lang.equals(true, v1637)) {

final Object i6391;
if ((boolean)Lang.equals(Nil.NIL, v1638)) {

i6391 = true;
} else {

i6391 = false;

}
i6392 = i6391;
} else {

i6392 = false;

}
final Object i6401;
if ((boolean)i6392) {

i6401 = RuntimeContext.symbol("Context_1957");
} else {

final Object i6394;
if ((boolean)Lang.equals(false, v1637)) {

final Object i6393;
if ((boolean)Lang.equals(Nil.NIL, v1638)) {

i6393 = true;
} else {

i6393 = false;

}
i6394 = i6393;
} else {

i6394 = false;

}
final Object i6400;
if ((boolean)i6394) {

i6400 = RuntimeContext.symbol("ContextOut_1957");
} else {


final Object i6399;
if ((boolean)(v1638 instanceof Cons)) {


final Object f6395 = ShenRecursive_cons_form.LAMBDA.apply(((Cons)v1638).head);


final Object f6396 = ShenConstructContext.LAMBDA.apply(v1637, ((Cons)v1638).tail);





i6399 = new Cons(RuntimeContext.symbol("cons"), new Cons(f6395, new Cons(f6396, Nil.NIL)));
} else {

final Object i6398;
if ((boolean)true) {
final Object f6397 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-construct-context"));

i6398 = f6397;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6399 = i6398;

}
i6400 = i6399;

}
i6401 = i6400;

}
    return i6401;

}
}
