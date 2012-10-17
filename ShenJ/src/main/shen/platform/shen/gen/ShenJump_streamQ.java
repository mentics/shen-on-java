package shen.gen;



import com.mentics.shen.*;

public class ShenJump_streamQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-jump_stream?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v363) throws Exception {
return defined(v363);
}};
public static Object defined(final Object v363) throws Exception {

final Object i4122;
if ((boolean)Lang.equals(RuntimeContext.symbol("-*-"), v363)) {

i4122 = true;
} else {

final Object i4121;
if ((boolean)true) {

i4121 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4122 = i4121;

}
    return i4122;

}
}
