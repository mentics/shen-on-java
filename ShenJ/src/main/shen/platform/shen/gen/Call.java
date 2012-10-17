package shen.gen;



import com.mentics.shen.*;

public class Call {

public static final Symbol SYMBOL = RuntimeContext.symbol("call");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1512, final Object v1513, final Object v1514) throws Exception {
return defined(v1512, v1513, v1514);
}};
public static Object defined(final Object v1512, final Object v1513, final Object v1514) throws Exception {


final Object i3865;
if ((boolean)(v1512 instanceof Cons)) {

final Object f3861 = ShenLazyderef.LAMBDA.apply(((Cons)v1512).head, v1513);
final Object f3862 = ShenM_prolog_to_sProlog_predicate.LAMBDA.apply(f3861);

final Object f3863 = ShenCallHelp.LAMBDA.apply(f3862, ((Cons)v1512).tail, v1513, v1514);

i3865 = f3863;
} else {

final Object i3864;
if ((boolean)true) {

i3864 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3865 = i3864;

}
    return i3865;

}
}
