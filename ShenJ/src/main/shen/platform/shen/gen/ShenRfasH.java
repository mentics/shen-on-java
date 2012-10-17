package shen.gen;



import com.mentics.shen.*;

public class ShenRfasH {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-rfas-h");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v927, final Object v928, final Object v929) throws Exception {
return defined(v927, v928, v929);
}};
public static Object defined(final Object v927, final Object v928, final Object v929) throws Exception {

final Object i1100;
if ((boolean)Lang.equals(-1, v928)) {

((java.io.Closeable)v927).close();
final Object f1097 = Do.LAMBDA.apply(Nil.NIL, v929);

i1100 = f1097;
} else {

final Object i1099;
if ((boolean)true) {




final Object f1098 = ShenRfasH.LAMBDA.apply(v927, ((java.io.InputStream)v927).read(), ((String)v929 + (String)new String(Character.toChars(((Number) (v928)).intValue()))));

i1099 = f1098;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1100 = i1099;

}
    return i1100;

}
}
