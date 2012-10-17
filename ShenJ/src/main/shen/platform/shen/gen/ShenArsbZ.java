package shen.gen;



import com.mentics.shen.*;

public class ShenArsbZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<rsb>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v982) throws Exception {
return defined(v982);
}};
public static Object defined(final Object v982) throws Exception {
final Object f4956 = Fst.LAMBDA.apply(v982);


final Object i4964;
if ((boolean)(f4956 instanceof Cons)) {
final Object f4957 = Fst.LAMBDA.apply(v982);

final Object f4958 = Snd.LAMBDA.apply(v982);
final Object f4959 = ShenReassemble.LAMBDA.apply(((Cons)f4957).tail, f4958);
final Object f4960 = Fst.LAMBDA.apply(f4959);
final Object f4961 = Fst.LAMBDA.apply(v982);


final Object i4962;
if ((boolean)Lang.equals(((Cons)f4961).head, 93)) {

i4962 = RuntimeContext.symbol("shen-skip");
} else {

i4962 = null;

}final Object f4963 = ShenReassemble.LAMBDA.apply(f4960, i4962);

i4964 = f4963;
} else {

i4964 = null;

}
final Object result4955 = i4964;

final Object i4965;
if ((boolean)Lang.equals(result4955, null)) {

i4965 = null;
} else {

i4965 = result4955;

}

    return i4965;

}
}
