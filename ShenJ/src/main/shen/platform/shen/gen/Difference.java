package shen.gen;



import com.mentics.shen.*;

public class Difference {

public static final Symbol SYMBOL = RuntimeContext.symbol("difference");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v782, final Object v783) throws Exception {
return defined(v782, v783);
}};
public static Object defined(final Object v782, final Object v783) throws Exception {

final Object i893;
if ((boolean)Lang.equals(Nil.NIL, v782)) {

i893 = Nil.NIL;
} else {


final Object i892;
if ((boolean)(v782 instanceof Cons)) {

final Object f886 = ElementQ.LAMBDA.apply(((Cons)v782).head, v783);

final Object i889;
if ((boolean)f886) {

final Object f887 = Difference.LAMBDA.apply(((Cons)v782).tail, v783);

i889 = f887;
} else {



final Object f888 = Difference.LAMBDA.apply(((Cons)v782).tail, v783);


i889 = new Cons(((Cons)v782).head, f888);

}
i892 = i889;
} else {

final Object i891;
if ((boolean)true) {
final Object f890 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("difference"));

i891 = f890;
} else {

throw new SimpleError((String)"True condition not found.");


}
i892 = i891;

}
i893 = i892;

}
    return i893;

}
}
