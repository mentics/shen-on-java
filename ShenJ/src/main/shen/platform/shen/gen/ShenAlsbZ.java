package shen.gen;



import com.mentics.shen.*;

public class ShenAlsbZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<lsb>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v981) throws Exception {
return defined(v981);
}};
public static Object defined(final Object v981) throws Exception {
final Object f4945 = Fst.LAMBDA.apply(v981);


final Object i4953;
if ((boolean)(f4945 instanceof Cons)) {
final Object f4946 = Fst.LAMBDA.apply(v981);

final Object f4947 = Snd.LAMBDA.apply(v981);
final Object f4948 = ShenReassemble.LAMBDA.apply(((Cons)f4946).tail, f4947);
final Object f4949 = Fst.LAMBDA.apply(f4948);
final Object f4950 = Fst.LAMBDA.apply(v981);


final Object i4951;
if ((boolean)Lang.equals(((Cons)f4950).head, 91)) {

i4951 = RuntimeContext.symbol("shen-skip");
} else {

i4951 = null;

}final Object f4952 = ShenReassemble.LAMBDA.apply(f4949, i4951);

i4953 = f4952;
} else {

i4953 = null;

}
final Object result4944 = i4953;

final Object i4954;
if ((boolean)Lang.equals(result4944, null)) {

i4954 = null;
} else {

i4954 = result4944;

}

    return i4954;

}
}
