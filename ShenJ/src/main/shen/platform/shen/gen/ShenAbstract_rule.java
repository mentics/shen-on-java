package shen.gen;



import com.mentics.shen.*;

public class ShenAbstract_rule {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-abstract_rule");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v480) throws Exception {
return defined(v480);
}};
public static Object defined(final Object v480) throws Exception {


final Object i2094;
if ((boolean)(v480 instanceof Cons)) {



final Object i2092;
if ((boolean)(((Cons)v480).tail instanceof Cons)) {



final Object i2091;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v480).tail).tail)) {

i2091 = true;
} else {

i2091 = false;

}
i2092 = i2091;
} else {

i2092 = false;

}
final Object i2093;
if ((boolean)i2092) {

i2093 = true;
} else {

i2093 = false;

}
i2094 = i2093;
} else {

i2094 = false;

}
final Object i2098;
if ((boolean)i2094) {



final Object f2095 = ShenAbstraction_build.LAMBDA.apply(((Cons)v480).head, ((Cons)((Cons)v480).tail).head);

i2098 = f2095;
} else {

final Object i2097;
if ((boolean)true) {
final Object f2096 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-abstract_rule"));

i2097 = f2096;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2098 = i2097;

}
    return i2098;

}
}
