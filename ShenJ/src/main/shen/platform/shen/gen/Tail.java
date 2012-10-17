package shen.gen;



import com.mentics.shen.*;

public class Tail {

public static final Symbol SYMBOL = RuntimeContext.symbol("tail");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v854) throws Exception {
return defined(v854);
}};
public static Object defined(final Object v854) throws Exception {


final Object i991;
if ((boolean)(v854 instanceof Cons)) {


i991 = ((Cons)v854).tail;
} else {

final Object i990;
if ((boolean)true) {
final Object f989 = Interror.LAMBDA.apply("tail expects a non-empty list", Nil.NIL);

i990 = f989;
} else {

throw new SimpleError((String)"True condition not found.");


}
i991 = i990;

}
    return i991;

}
}
