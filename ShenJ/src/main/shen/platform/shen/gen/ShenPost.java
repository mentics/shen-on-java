package shen.gen;



import com.mentics.shen.*;

public class ShenPost {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-post");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1042, final Object v1043) throws Exception {
return defined(v1042, v1043);
}};
public static Object defined(final Object v1042, final Object v1043) throws Exception {

final Object i5585;
if ((boolean)Lang.equals(Nil.NIL, v1042)) {

i5585 = 0;
} else {


final Object i5584;
if ((boolean)(v1042 instanceof Cons)) {


final Object f5580 = ShenExpt.LAMBDA.apply(10, Primitives.minus.apply(0, v1043));







final Object f5581 = ShenPost.LAMBDA.apply(((Cons)v1042).tail, Primitives.plus.apply(v1043, 1));


i5584 = Primitives.plus.apply(Primitives.multiply.apply(f5580, ((Cons)v1042).head), f5581);
} else {

final Object i5583;
if ((boolean)true) {
final Object f5582 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-post"));

i5583 = f5582;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5584 = i5583;

}
i5585 = i5584;

}
    return i5585;

}
}
