package shen.gen;



import com.mentics.shen.*;

public class ShenList_streamQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-list_stream?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v329) throws Exception {
return defined(v329);
}};
public static Object defined(final Object v329) throws Exception {


final Object i4070;
if ((boolean)(v329 instanceof Cons)) {

i4070 = true;
} else {

final Object i4069;
if ((boolean)true) {

i4069 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4070 = i4069;

}
    return i4070;

}
}
