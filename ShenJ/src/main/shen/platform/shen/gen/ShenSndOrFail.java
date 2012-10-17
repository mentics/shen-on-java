package shen.gen;



import com.mentics.shen.*;

public class ShenSndOrFail {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-snd-or-fail");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v341) throws Exception {
return defined(v341);
}};
public static Object defined(final Object v341) throws Exception {
final Object f4087 = TupleQ.LAMBDA.apply(v341);

final Object i4090;
if ((boolean)f4087) {
final Object f4088 = Snd.LAMBDA.apply(v341);

i4090 = f4088;
} else {

final Object i4089;
if ((boolean)true) {

i4089 = null;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4090 = i4089;

}
    return i4090;

}
}
