package shen.gen;



import com.mentics.shen.*;

public class ShenSynonymsMacro {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-synonyms-macro");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v548) throws Exception {
return defined(v548);
}};
public static Object defined(final Object v548) throws Exception {


final Object i4541;
if ((boolean)(v548 instanceof Cons)) {


final Object i4540;
if ((boolean)Lang.equals(RuntimeContext.symbol("synonyms"), ((Cons)v548).head)) {

i4540 = true;
} else {

i4540 = false;

}
i4541 = i4540;
} else {

i4541 = false;

}
final Object i4544;
if ((boolean)i4541) {


final Object f4542 = ShenRcons_form.LAMBDA.apply(((Cons)v548).tail);




i4544 = new Cons(RuntimeContext.symbol("shen-synonyms-help"), new Cons(f4542, Nil.NIL));
} else {

final Object i4543;
if ((boolean)true) {

i4543 = v548;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4544 = i4543;

}
    return i4544;

}
}
