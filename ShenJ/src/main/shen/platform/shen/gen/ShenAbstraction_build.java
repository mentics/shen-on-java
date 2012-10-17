package shen.gen;



import com.mentics.shen.*;

public class ShenAbstraction_build {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-abstraction_build");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v481, final Object v482) throws Exception {
return defined(v481, v482);
}};
public static Object defined(final Object v481, final Object v482) throws Exception {

final Object i2103;
if ((boolean)Lang.equals(Nil.NIL, v481)) {

i2103 = v482;
} else {


final Object i2102;
if ((boolean)(v481 instanceof Cons)) {




final Object f2099 = ShenAbstraction_build.LAMBDA.apply(((Cons)v481).tail, v482);





i2102 = new Cons(RuntimeContext.symbol("/."), new Cons(((Cons)v481).head, new Cons(f2099, Nil.NIL)));
} else {

final Object i2101;
if ((boolean)true) {
final Object f2100 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-abstraction_build"));

i2101 = f2100;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2102 = i2101;

}
i2103 = i2102;

}
    return i2103;

}
}
