package shen.gen;



import com.mentics.shen.*;

public class ShenCompress50 {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-compress-50");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v978, final Object v979) throws Exception {
return defined(v978, v979);
}};
public static Object defined(final Object v978, final Object v979) throws Exception {

final Object i4767;
if ((boolean)Lang.equals(Nil.NIL, v979)) {

i4767 = "";
} else {

final Object i4766;
if ((boolean)Lang.equals(0, v978)) {

i4766 = "";
} else {


final Object i4765;
if ((boolean)(v979 instanceof Cons)) {






final Object f4762 = ShenCompress50.LAMBDA.apply(Primitives.minus.apply(v978, 1), ((Cons)v979).tail);


i4765 = ((String)new String(Character.toChars(((Number) (((Cons)v979).head)).intValue())) + (String)f4762);
} else {

final Object i4764;
if ((boolean)true) {
final Object f4763 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-compress-50"));

i4764 = f4763;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4765 = i4764;

}
i4766 = i4765;

}
i4767 = i4766;

}
    return i4767;

}
}
