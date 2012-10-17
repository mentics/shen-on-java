package shen.gen;



import com.mentics.shen.*;

public class ShenExtractSegvars {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-extract-segvars");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v298) throws Exception {
return defined(v298);
}};
public static Object defined(final Object v298) throws Exception {
final Object f3950 = ShenSegvarQ.LAMBDA.apply(v298);

final Object i3956;
if ((boolean)f3950) {



i3956 = new Cons(v298, Nil.NIL);
} else {


final Object i3955;
if ((boolean)(v298 instanceof Cons)) {

final Object f3951 = ShenExtractSegvars.LAMBDA.apply(((Cons)v298).head);

final Object f3952 = ShenExtractSegvars.LAMBDA.apply(((Cons)v298).tail);
final Object f3953 = Union.LAMBDA.apply(f3951, f3952);

i3955 = f3953;
} else {

final Object i3954;
if ((boolean)true) {

i3954 = Nil.NIL;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3955 = i3954;

}
i3956 = i3955;

}
    return i3956;

}
}
