package shen.gen;



import com.mentics.shen.*;

public class Head {

public static final Symbol SYMBOL = RuntimeContext.symbol("head");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v847) throws Exception {
return defined(v847);
}};
public static Object defined(final Object v847) throws Exception {


final Object i988;
if ((boolean)(v847 instanceof Cons)) {


i988 = ((Cons)v847).head;
} else {

final Object i987;
if ((boolean)true) {
final Object f986 = Interror.LAMBDA.apply("head expects a non-empty list", Nil.NIL);

i987 = f986;
} else {

throw new SimpleError((String)"True condition not found.");


}
i988 = i987;

}
    return i988;

}
}
