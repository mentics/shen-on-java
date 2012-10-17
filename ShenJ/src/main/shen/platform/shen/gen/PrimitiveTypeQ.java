package shen.gen;



import com.mentics.shen.*;

public class PrimitiveTypeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("primitive-type?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7259) throws Exception {
return defined(v7259);
}};
public static Object defined(final Object v7259) throws Exception {

final Object i8789;
if ((boolean)Lang.equals(v7259, RuntimeContext.symbol("number"))) {

i8789 = true;
} else {

final Object i8788;
if ((boolean)Lang.equals(v7259, RuntimeContext.symbol("boolean"))) {

i8788 = true;
} else {

i8788 = false;

}
i8789 = i8788;

}
    return i8789;

}
}
