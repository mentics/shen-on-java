package shen.gen;



import com.mentics.shen.*;

public class StreamToString {

public static final Symbol SYMBOL = RuntimeContext.symbol("stream->string");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6907, final Object v6908) throws Exception {
return defined(v6907, v6908);
}};
public static Object defined(final Object v6907, final Object v6908) throws Exception {
Object t6984;
try {


t6984 = ((java.io.InputStream)v6907).read();
} catch (Throwable t) {
final Lambda l6983 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    
    return -1;
  }
};
t6984 = l6983.apply(t);
}
final Object t6985 = t6984;

final Object byte6982 = t6985;

final Object i6988;
if ((boolean)Lang.equals(byte6982, -1)) {

i6988 = v6908;
} else {

final Object f6986 = Ats.LAMBDA.apply(v6908, new String(Character.toChars(((Number) (byte6982)).intValue())));
final Object f6987 = StreamToString.LAMBDA.apply(v6907, f6986);

i6988 = f6987;

}

    return i6988;

}
}
