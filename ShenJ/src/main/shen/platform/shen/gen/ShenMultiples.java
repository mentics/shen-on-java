package shen.gen;



import com.mentics.shen.*;

public class ShenMultiples {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-multiples");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v834, final Object v835) throws Exception {
return defined(v834, v835);
}};
public static Object defined(final Object v834, final Object v835) throws Exception {


final Object i963;
if ((boolean)(v835 instanceof Cons)) {




final Object i962;
if ((boolean)(((Number)(((Cons)v835).head)).doubleValue() > ((Number)(v834)).doubleValue())) {

i962 = true;
} else {

i962 = false;

}
i963 = i962;
} else {

i963 = false;

}
final Object i968;
if ((boolean)i963) {


i968 = ((Cons)v835).tail;
} else {


final Object i967;
if ((boolean)(v835 instanceof Cons)) {





final Object f964 = ShenMultiples.LAMBDA.apply(v834, new Cons(Primitives.multiply.apply(2, ((Cons)v835).head), v835));

i967 = f964;
} else {

final Object i966;
if ((boolean)true) {
final Object f965 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-multiples"));

i966 = f965;
} else {

throw new SimpleError((String)"True condition not found.");


}
i967 = i966;

}
i968 = i967;

}
    return i968;

}
}
