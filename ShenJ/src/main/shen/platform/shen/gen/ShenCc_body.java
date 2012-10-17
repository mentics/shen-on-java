package shen.gen;



import com.mentics.shen.*;

public class ShenCc_body {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cc_body");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v317) throws Exception {
return defined(v317);
}};
public static Object defined(final Object v317) throws Exception {


final Object i4041;
if ((boolean)(v317 instanceof Cons)) {



final Object i4039;
if ((boolean)(((Cons)v317).tail instanceof Cons)) {



final Object i4038;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v317).tail).tail)) {

i4038 = true;
} else {

i4038 = false;

}
i4039 = i4038;
} else {

i4039 = false;

}
final Object i4040;
if ((boolean)i4039) {

i4040 = true;
} else {

i4040 = false;

}
i4041 = i4040;
} else {

i4041 = false;

}
final Object i4045;
if ((boolean)i4041) {



final Object f4042 = ShenSyntax.LAMBDA.apply(((Cons)v317).head, RuntimeContext.symbol("Stream"), ((Cons)((Cons)v317).tail).head);

i4045 = f4042;
} else {

final Object i4044;
if ((boolean)true) {
final Object f4043 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-cc_body"));

i4044 = f4043;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4045 = i4044;

}
    return i4045;

}
}
