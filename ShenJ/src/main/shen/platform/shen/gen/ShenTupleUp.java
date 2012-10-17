package shen.gen;



import com.mentics.shen.*;

public class ShenTupleUp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-tuple-up");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v560) throws Exception {
return defined(v560);
}};
public static Object defined(final Object v560) throws Exception {


final Object i4685;
if ((boolean)(v560 instanceof Cons)) {




final Object f4683 = ShenTupleUp.LAMBDA.apply(((Cons)v560).tail);





i4685 = new Cons(RuntimeContext.symbol("@p"), new Cons(((Cons)v560).head, new Cons(f4683, Nil.NIL)));
} else {

final Object i4684;
if ((boolean)true) {

i4684 = v560;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4685 = i4684;

}
    return i4685;

}
}
