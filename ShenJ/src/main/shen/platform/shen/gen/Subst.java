package shen.gen;



import com.mentics.shen.*;

public class Subst {

public static final Symbol SYMBOL = RuntimeContext.symbol("subst");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v875, final Object v876, final Object v877) throws Exception {
return defined(v875, v876, v877);
}};
public static Object defined(final Object v875, final Object v876, final Object v877) throws Exception {

final Object i1032;
if ((boolean)Lang.equals(v877, v876)) {

i1032 = v875;
} else {


final Object i1031;
if ((boolean)(v877 instanceof Cons)) {

final Object f1028 = Subst.LAMBDA.apply(v875, v876, ((Cons)v877).head);


final Object f1029 = Subst.LAMBDA.apply(v875, v876, ((Cons)v877).tail);


i1031 = new Cons(f1028, f1029);
} else {

final Object i1030;
if ((boolean)true) {

i1030 = v877;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1031 = i1030;

}
i1032 = i1031;

}
    return i1032;

}
}
