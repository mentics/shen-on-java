package shen.gen;



import com.mentics.shen.*;

public class ShenReadFileAsBytelistHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-read-file-as-bytelist-help");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v923, final Object v924, final Object v925) throws Exception {
return defined(v923, v924, v925);
}};
public static Object defined(final Object v923, final Object v924, final Object v925) throws Exception {

final Object i1093;
if ((boolean)Lang.equals(-1, v924)) {

i1093 = v925;
} else {

final Object i1092;
if ((boolean)true) {



final Object f1091 = ShenReadFileAsBytelistHelp.LAMBDA.apply(v923, ((java.io.InputStream)v923).read(), new Cons(v924, v925));

i1092 = f1091;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1093 = i1092;

}
    return i1093;

}
}
