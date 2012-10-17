package shen.gen;



import com.mentics.shen.*;

public class ShenCnAll {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-cn-all");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1102) throws Exception {
return defined(v1102);
}};
public static Object defined(final Object v1102) throws Exception {

final Object i1238;
if ((boolean)Lang.equals(Nil.NIL, v1102)) {

i1238 = "";
} else {


final Object i1237;
if ((boolean)(v1102 instanceof Cons)) {



final Object f1234 = ShenCnAll.LAMBDA.apply(((Cons)v1102).tail);


i1237 = ((String)((Cons)v1102).head + (String)f1234);
} else {

final Object i1236;
if ((boolean)true) {
final Object f1235 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-cn-all"));

i1236 = f1235;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1237 = i1236;

}
i1238 = i1237;

}
    return i1238;

}
}
