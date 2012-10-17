package shen.gen;



import com.mentics.shen.*;

public class ShenProlog_constantQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prolog_constant?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1330) throws Exception {
return defined(v1330);
}};
public static Object defined(final Object v1330) throws Exception {


final Object i3435;
if ((boolean)(v1330 instanceof Cons)) {

i3435 = false;
} else {

final Object i3434;
if ((boolean)true) {

i3434 = true;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3435 = i3434;

}
    return i3435;

}
}
