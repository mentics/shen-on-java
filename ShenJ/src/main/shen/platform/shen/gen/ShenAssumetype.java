package shen.gen;



import com.mentics.shen.*;

public class ShenAssumetype {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-assumetype");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1670) throws Exception {
return defined(v1670);
}};
public static Object defined(final Object v1670) throws Exception {


final Object i4258;
if ((boolean)(v1670 instanceof Cons)) {


final Object f4255 = Declare.LAMBDA.apply(((Cons)v1670).head, ((Cons)v1670).tail);

i4258 = f4255;
} else {

final Object i4257;
if ((boolean)true) {
final Object f4256 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-assumetype"));

i4257 = f4256;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4258 = i4257;

}
    return i4258;

}
}
