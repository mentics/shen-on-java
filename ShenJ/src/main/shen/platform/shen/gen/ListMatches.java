package shen.gen;



import com.mentics.shen.*;

public class ListMatches {

public static final Symbol SYMBOL = RuntimeContext.symbol("list-matches");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6952, final Object v6953) throws Exception {
return defined(v6952, v6953);
}};
public static Object defined(final Object v6952, final Object v6953) throws Exception {

final Object i7204;
if ((boolean)Lang.equals(Nil.NIL, v6953)) {

i7204 = false;
} else {


final Object i7203;
if ((boolean)(v6953 instanceof Cons)) {

final Object f7198 = RuntimeContext.dispatch(v6952).apply(((Cons)v6953).head);

final Object i7200;
if ((boolean)f7198) {

i7200 = true;
} else {

final Object f7199 = ListMatches.LAMBDA.apply(v6952, ((Cons)v6953).tail);

i7200 = f7199;

}
i7203 = i7200;
} else {

final Object i7202;
if ((boolean)true) {
final Object f7201 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("list-matches"));

i7202 = f7201;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7203 = i7202;

}
i7204 = i7203;

}
    return i7204;

}
}
