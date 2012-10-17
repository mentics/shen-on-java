package shen.gen;



import com.mentics.shen.*;

public class Atp {

public static final Symbol SYMBOL = RuntimeContext.symbol("@p");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v738, final Object v739) throws Exception {
return defined(v738, v739);
}};
public static Object defined(final Object v738, final Object v739) throws Exception {

final Object[] a815 = new Object[((Number)3).intValue()];

final Object vector814 = a815;



((Object[])vector814)[((Number)0).intValue()] = RuntimeContext.symbol("shen-tuple");
final Object tag816 = vector814;



((Object[])vector814)[((Number)1).intValue()] = v738;
final Object fst817 = vector814;



((Object[])vector814)[((Number)2).intValue()] = v739;
final Object snd818 = vector814;





    return vector814;

}
}
