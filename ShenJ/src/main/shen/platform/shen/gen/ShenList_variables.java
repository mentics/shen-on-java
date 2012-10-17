package shen.gen;



import com.mentics.shen.*;

public class ShenList_variables {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-list_variables");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v439) throws Exception {
return defined(v439);
}};
public static Object defined(final Object v439) throws Exception {


final Object i1972;
if ((boolean)(v439 instanceof Cons)) {


final Object i1971;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v439).tail)) {

i1971 = true;
} else {

i1971 = false;

}
i1972 = i1971;
} else {

i1972 = false;

}
final Object i1977;
if ((boolean)i1972) {





i1977 = ((String)String.valueOf(((Cons)v439).head) + (String)".");
} else {


final Object i1976;
if ((boolean)(v439 instanceof Cons)) {





final Object f1973 = ShenList_variables.LAMBDA.apply(((Cons)v439).tail);



i1976 = ((String)String.valueOf(((Cons)v439).head) + (String)((String)", " + (String)f1973));
} else {

final Object i1975;
if ((boolean)true) {
final Object f1974 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-list_variables"));

i1975 = f1974;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1976 = i1975;

}
i1977 = i1976;

}
    return i1977;

}
}
