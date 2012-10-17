package shen.gen;



import com.mentics.shen.*;

public class ShenApplication_build {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-application_build");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v484, final Object v485) throws Exception {
return defined(v484, v485);
}};
public static Object defined(final Object v484, final Object v485) throws Exception {

final Object i2112;
if ((boolean)Lang.equals(Nil.NIL, v484)) {

i2112 = v485;
} else {


final Object i2111;
if ((boolean)(v484 instanceof Cons)) {






final Object f2108 = ShenApplication_build.LAMBDA.apply(((Cons)v484).tail, new Cons(v485, new Cons(((Cons)v484).head, Nil.NIL)));

i2111 = f2108;
} else {

final Object i2110;
if ((boolean)true) {
final Object f2109 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-application_build"));

i2110 = f2109;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2111 = i2110;

}
i2112 = i2111;

}
    return i2112;

}
}
