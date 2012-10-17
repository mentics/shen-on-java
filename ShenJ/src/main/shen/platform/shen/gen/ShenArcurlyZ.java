package shen.gen;



import com.mentics.shen.*;

public class ShenArcurlyZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<rcurly>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v984) throws Exception {
return defined(v984);
}};
public static Object defined(final Object v984) throws Exception {
final Object f4978 = Fst.LAMBDA.apply(v984);


final Object i4986;
if ((boolean)(f4978 instanceof Cons)) {
final Object f4979 = Fst.LAMBDA.apply(v984);

final Object f4980 = Snd.LAMBDA.apply(v984);
final Object f4981 = ShenReassemble.LAMBDA.apply(((Cons)f4979).tail, f4980);
final Object f4982 = Fst.LAMBDA.apply(f4981);
final Object f4983 = Fst.LAMBDA.apply(v984);


final Object i4984;
if ((boolean)Lang.equals(((Cons)f4983).head, 125)) {

i4984 = RuntimeContext.symbol("shen-skip");
} else {

i4984 = null;

}final Object f4985 = ShenReassemble.LAMBDA.apply(f4982, i4984);

i4986 = f4985;
} else {

i4986 = null;

}
final Object result4977 = i4986;

final Object i4987;
if ((boolean)Lang.equals(result4977, null)) {

i4987 = null;
} else {

i4987 = result4977;

}

    return i4987;

}
}
