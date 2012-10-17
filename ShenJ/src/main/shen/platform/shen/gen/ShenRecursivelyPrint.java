package shen.gen;



import com.mentics.shen.*;

public class ShenRecursivelyPrint {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-recursively-print");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1148) throws Exception {
return defined(v1148);
}};
public static Object defined(final Object v1148) throws Exception {

final Object i6809;
if ((boolean)Lang.equals(Nil.NIL, v1148)) {
final Object f6800 = Intoutput.LAMBDA.apply(" ==>", Nil.NIL);

i6809 = f6800;
} else {


final Object i6808;
if ((boolean)(v1148 instanceof Cons)) {

final Object f6801 = Print.LAMBDA.apply(((Cons)v1148).head);
final Object f6802 = Intoutput.LAMBDA.apply(", ", Nil.NIL);

final Object f6803 = ShenRecursivelyPrint.LAMBDA.apply(((Cons)v1148).tail);
final Object f6804 = Do.LAMBDA.apply(f6802, f6803);
final Object f6805 = Do.LAMBDA.apply(f6801, f6804);

i6808 = f6805;
} else {

final Object i6807;
if ((boolean)true) {
final Object f6806 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-recursively-print"));

i6807 = f6806;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6808 = i6807;

}
i6809 = i6808;

}
    return i6809;

}
}
