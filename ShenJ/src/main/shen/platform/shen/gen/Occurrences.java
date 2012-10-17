package shen.gen;



import com.mentics.shen.*;

public class Occurrences {

public static final Symbol SYMBOL = RuntimeContext.symbol("occurrences");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v898, final Object v899) throws Exception {
return defined(v898, v899);
}};
public static Object defined(final Object v898, final Object v899) throws Exception {

final Object i1052;
if ((boolean)Lang.equals(v899, v898)) {

i1052 = 1;
} else {


final Object i1051;
if ((boolean)(v899 instanceof Cons)) {

final Object f1048 = Occurrences.LAMBDA.apply(v898, ((Cons)v899).head);


final Object f1049 = Occurrences.LAMBDA.apply(v898, ((Cons)v899).tail);


i1051 = Primitives.plus.apply(f1048, f1049);
} else {

final Object i1050;
if ((boolean)true) {

i1050 = 0;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1051 = i1050;

}
i1052 = i1051;

}
    return i1052;

}
}
