package shen.gen;



import com.mentics.shen.*;

public class ShenStringToBytes {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-string->bytes");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v948) throws Exception {
return defined(v948);
}};
public static Object defined(final Object v948) throws Exception {

final Object i1126;
if ((boolean)Lang.equals("", v948)) {

i1126 = Nil.NIL;
} else {

final Object i1125;
if ((boolean)true) {





final Object f1124 = ShenStringToBytes.LAMBDA.apply(((String)v948).substring(1));


i1125 = new Cons(Integer.valueOf(((String) ((String)v948).substring(((Number)0).intValue(), ((Number)0).intValue()+1)).charAt(0)), f1124);
} else {

throw new SimpleError((String)"True condition not found.");


}
i1126 = i1125;

}
    return i1126;

}
}
