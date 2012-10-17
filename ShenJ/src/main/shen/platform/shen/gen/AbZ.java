package shen.gen;



import com.mentics.shen.*;

public class AbZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("<!>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v379) throws Exception {
return defined(v379);
}};
public static Object defined(final Object v379) throws Exception {
final Object f4159 = TupleQ.LAMBDA.apply(v379);

final Object i4164;
if ((boolean)f4159) {
final Object f4160 = Fst.LAMBDA.apply(v379);
final Object f4161 = Atp.LAMBDA.apply(Nil.NIL, f4160);

i4164 = f4161;
} else {

final Object i4163;
if ((boolean)true) {
final Object f4162 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("<!>"));

i4163 = f4162;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4164 = i4163;

}
    return i4164;

}
}
