package shen.gen;



import com.mentics.shen.*;

public class ShenTerminalQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-terminal?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v358) throws Exception {
return defined(v358);
}};
public static Object defined(final Object v358) throws Exception {


final Object i4120;
if ((boolean)(v358 instanceof Cons)) {

i4120 = false;
} else {

final Object i4119;
if ((boolean)Lang.equals(RuntimeContext.symbol("-*-"), v358)) {

i4119 = false;
} else {

final Object i4118;
if ((boolean)true) {

i4118 = true;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4119 = i4118;

}
i4120 = i4119;

}
    return i4120;

}
}
