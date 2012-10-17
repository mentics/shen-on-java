package shen.gen;



import com.mentics.shen.*;

public class ShenRecordSource {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-record-source");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v414, final Object v415) throws Exception {
return defined(v414, v415);
}};
public static Object defined(final Object v414, final Object v415) throws Exception {


final Object i1883;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*installing-kl*"))) {

i1883 = RuntimeContext.symbol("shen-skip");
} else {

final Object i1882;
if ((boolean)true) {

final Object f1881 = Put.LAMBDA.apply(v414, RuntimeContext.symbol("shen-source"), v415, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

i1882 = f1881;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1883 = i1882;

}
    return i1883;

}
}
