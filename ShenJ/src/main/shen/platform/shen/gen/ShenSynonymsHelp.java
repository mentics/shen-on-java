package shen.gen;



import com.mentics.shen.*;

public class ShenSynonymsHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-synonyms-help");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1648) throws Exception {
return defined(v1648);
}};
public static Object defined(final Object v1648) throws Exception {

final Object i6425;
if ((boolean)Lang.equals(Nil.NIL, v1648)) {

i6425 = RuntimeContext.symbol("synonyms");
} else {


final Object i6417;
if ((boolean)(v1648 instanceof Cons)) {



final Object i6416;
if ((boolean)(((Cons)v1648).tail instanceof Cons)) {

i6416 = true;
} else {

i6416 = false;

}
i6417 = i6416;
} else {

i6417 = false;

}
final Object i6424;
if ((boolean)i6417) {





final Object f6418 = ShenPushnew.LAMBDA.apply(new Cons(((Cons)v1648).head, ((Cons)((Cons)v1648).tail).head), RuntimeContext.symbol("shen-*synonyms*"));


final Object f6419 = ShenSynonymsHelp.LAMBDA.apply(((Cons)((Cons)v1648).tail).tail);
final Object f6420 = Do.LAMBDA.apply(f6418, f6419);

i6424 = f6420;
} else {

final Object i6423;
if ((boolean)true) {
final Object f6421 = Atp.LAMBDA.apply(Nil.NIL, Nil.NIL);
final Object f6422 = Interror.LAMBDA.apply("odd number of synonyms~%", f6421);

i6423 = f6422;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6424 = i6423;

}
i6425 = i6424;

}
    return i6425;

}
}
