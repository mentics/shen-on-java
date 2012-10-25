package shen.gen;



import com.mentics.shen.*;

public class ShenNormaliseX {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-normalise-X");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1687) throws Exception {
return defined(v1687);
}};
public static Object defined(final Object v1687) throws Exception {

final Object f42 = Assoc.LAMBDA.apply(v1687, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*synonyms*")));

final Object val41 = f42;
final Object f43 = EmptyQ.LAMBDA.apply(val41);

final Object i44;
if ((boolean)f43) {

i44 = v1687;
} else {


i44 = ((Cons)val41).tail;

}

    return i44;

}
}
