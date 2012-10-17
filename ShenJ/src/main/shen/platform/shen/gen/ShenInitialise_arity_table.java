package shen.gen;



import com.mentics.shen.*;

public class ShenInitialise_arity_table {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-initialise_arity_table");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1541) throws Exception {
return defined(v1541);
}};
public static Object defined(final Object v1541) throws Exception {

final Object i4176;
if ((boolean)Lang.equals(Nil.NIL, v1541)) {

i4176 = Nil.NIL;
} else {


final Object i4169;
if ((boolean)(v1541 instanceof Cons)) {



final Object i4168;
if ((boolean)(((Cons)v1541).tail instanceof Cons)) {

i4168 = true;
} else {

i4168 = false;

}
i4169 = i4168;
} else {

i4169 = false;

}
final Object i4175;
if ((boolean)i4169) {




final Object f4171 = Put.LAMBDA.apply(((Cons)v1541).head, RuntimeContext.symbol("arity"), ((Cons)((Cons)v1541).tail).head, RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*property-vector*")));

final Object decArity4170 = f4171;


final Object f4172 = ShenInitialise_arity_table.LAMBDA.apply(((Cons)((Cons)v1541).tail).tail);


i4175 = f4172;
} else {

final Object i4174;
if ((boolean)true) {
final Object f4173 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-initialise_arity_table"));

i4174 = f4173;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4175 = i4174;

}
i4176 = i4175;

}
    return i4176;

}
}
