package shen.gen;



import com.mentics.shen.*;

public class ShenInsert_deref {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert_deref");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1223) throws Exception {
return defined(v1223);
}};
public static Object defined(final Object v1223) throws Exception {
final Object f2976 = VariableQ.LAMBDA.apply(v1223);

final Object i2981;
if ((boolean)f2976) {







i2981 = new Cons(RuntimeContext.symbol("shen-deref"), new Cons(v1223, new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL)));
} else {


final Object i2980;
if ((boolean)(v1223 instanceof Cons)) {

final Object f2977 = ShenInsert_deref.LAMBDA.apply(((Cons)v1223).head);


final Object f2978 = ShenInsert_deref.LAMBDA.apply(((Cons)v1223).tail);


i2980 = new Cons(f2977, f2978);
} else {

final Object i2979;
if ((boolean)true) {

i2979 = v1223;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2980 = i2979;

}
i2981 = i2980;

}
    return i2981;

}
}
