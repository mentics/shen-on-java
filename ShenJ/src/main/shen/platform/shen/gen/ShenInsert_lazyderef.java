package shen.gen;



import com.mentics.shen.*;

public class ShenInsert_lazyderef {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert_lazyderef");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1224) throws Exception {
return defined(v1224);
}};
public static Object defined(final Object v1224) throws Exception {
final Object f2982 = VariableQ.LAMBDA.apply(v1224);

final Object i2987;
if ((boolean)f2982) {







i2987 = new Cons(RuntimeContext.symbol("shen-lazyderef"), new Cons(v1224, new Cons(RuntimeContext.symbol("ProcessN"), Nil.NIL)));
} else {


final Object i2986;
if ((boolean)(v1224 instanceof Cons)) {

final Object f2983 = ShenInsert_lazyderef.LAMBDA.apply(((Cons)v1224).head);


final Object f2984 = ShenInsert_lazyderef.LAMBDA.apply(((Cons)v1224).tail);


i2986 = new Cons(f2983, f2984);
} else {

final Object i2985;
if ((boolean)true) {

i2985 = v1224;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2986 = i2985;

}
i2987 = i2986;

}
    return i2987;

}
}
