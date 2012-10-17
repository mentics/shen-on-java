package shen.gen;



import com.mentics.shen.*;

public class ShenVectorMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-vector-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v550) throws Exception {
return defined(v550);
}};
public static Object defined(final Object v550) throws Exception {

final Object i4552;
if ((boolean)Lang.equals(RuntimeContext.symbol("<>"), v550)) {





i4552 = new Cons(RuntimeContext.symbol("vector"), new Cons(0, Nil.NIL));
} else {

final Object i4551;
if ((boolean)true) {

i4551 = v550;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4552 = i4551;

}
    return i4552;

}
}
