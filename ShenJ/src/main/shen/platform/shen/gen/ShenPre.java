package shen.gen;



import com.mentics.shen.*;

public class ShenPre {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-pre");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1038, final Object v1039) throws Exception {
return defined(v1038, v1039);
}};
public static Object defined(final Object v1038, final Object v1039) throws Exception {

final Object i5579;
if ((boolean)Lang.equals(Nil.NIL, v1038)) {

i5579 = 0;
} else {


final Object i5578;
if ((boolean)(v1038 instanceof Cons)) {
final Object f5574 = ShenExpt.LAMBDA.apply(10, v1039);







final Object f5575 = ShenPre.LAMBDA.apply(((Cons)v1038).tail, Primitives.plus.apply(v1039, 1));


i5578 = Primitives.plus.apply(Primitives.multiply.apply(f5574, ((Cons)v1038).head), f5575);
} else {

final Object i5577;
if ((boolean)true) {
final Object f5576 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-pre"));

i5577 = f5576;
} else {

throw new SimpleError((String)"True condition not found.");


}
i5578 = i5577;

}
i5579 = i5578;

}
    return i5579;

}
}
