package shen.gen;



import com.mentics.shen.*;

public class ShenAritycheckAction {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-aritycheck-action");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v476) throws Exception {
return defined(v476);
}};
public static Object defined(final Object v476) throws Exception {


final Object i2078;
if ((boolean)(v476 instanceof Cons)) {


final Object f2072 = ShenAah.LAMBDA.apply(((Cons)v476).head, ((Cons)v476).tail);
final Lambda l2074 = new Lambda1() {
  public Object apply(final Object v477) throws Exception {
    final Object f2073 = ShenAritycheckAction.LAMBDA.apply(v477);

    return f2073;
  }
};final Object f2075 = Map.LAMBDA.apply(l2074, v476);
final Object f2076 = Do.LAMBDA.apply(f2072, f2075);

i2078 = f2076;
} else {

final Object i2077;
if ((boolean)true) {

i2077 = RuntimeContext.symbol("shen-skip");
} else {

throw new SimpleError((String)"True condition not found.");


}
i2078 = i2077;

}
    return i2078;

}
}
