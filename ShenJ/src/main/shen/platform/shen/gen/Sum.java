package shen.gen;



import com.mentics.shen.*;

public class Sum {

public static final Symbol SYMBOL = RuntimeContext.symbol("sum");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v840) throws Exception {
return defined(v840);
}};
public static Object defined(final Object v840) throws Exception {

final Object i985;
if ((boolean)Lang.equals(Nil.NIL, v840)) {

i985 = 0;
} else {


final Object i984;
if ((boolean)(v840 instanceof Cons)) {



final Object f981 = Sum.LAMBDA.apply(((Cons)v840).tail);


i984 = Primitives.plus.apply(((Cons)v840).head, f981);
} else {

final Object i983;
if ((boolean)true) {
final Object f982 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("sum"));

i983 = f982;
} else {

throw new SimpleError((String)"True condition not found.");


}
i984 = i983;

}
i985 = i984;

}
    return i985;

}
}
