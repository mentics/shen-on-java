package shen.gen;



import com.mentics.shen.*;

public class ToIntlistIterate {

public static final Symbol SYMBOL = RuntimeContext.symbol("to-intlist-iterate");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v6914, final Object v6915) throws Exception {
return defined(v6914, v6915);
}};
public static Object defined(final Object v6914, final Object v6915) throws Exception {

final Object i6997;
if ((boolean)Lang.equals(Nil.NIL, v6915)) {

i6997 = Nil.NIL;
} else {

final Object i6996;
if ((boolean)true) {




i6996 = new Cons(Integer.valueOf(((String) v6915).charAt(0)), v6914);
} else {

throw new SimpleError((String)"True condition not found.");


}
i6997 = i6996;

}
    return i6997;

}
}
