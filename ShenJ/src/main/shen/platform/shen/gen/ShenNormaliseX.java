package shen.gen;



import com.mentics.shen.*;

public class ShenNormaliseX {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-normalise-X");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1687) throws Exception {
return defined(v1687);
}};
public static Object defined(final Object v1687) throws Exception {

final Object f4500 = Assoc.LAMBDA.apply(v1687, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*synonyms*")));

final Object val4499 = f4500;
final Object f4501 = EmptyQ.LAMBDA.apply(val4499);

final Object i4502;
if ((boolean)f4501) {

i4502 = v1687;
} else {


i4502 = ((Cons)val4499).tail;

}

    return i4502;

}
}
