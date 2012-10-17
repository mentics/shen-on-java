package shen.gen;



import com.mentics.shen.*;

public class EmptyQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("empty?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v801) throws Exception {
return defined(v801);
}};
public static Object defined(final Object v801) throws Exception {

final Object i903;
if ((boolean)Lang.equals(Nil.NIL, v801)) {

i903 = true;
} else {

final Object i902;
if ((boolean)true) {

i902 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i903 = i902;

}
    return i903;

}
}
