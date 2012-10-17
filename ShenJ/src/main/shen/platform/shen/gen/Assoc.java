package shen.gen;



import com.mentics.shen.*;

public class Assoc {

public static final Symbol SYMBOL = RuntimeContext.symbol("assoc");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v771, final Object v772) throws Exception {
return defined(v771, v772);
}};
public static Object defined(final Object v771, final Object v772) throws Exception {

final Object i877;
if ((boolean)Lang.equals(Nil.NIL, v772)) {

i877 = Nil.NIL;
} else {


final Object i871;
if ((boolean)(v772 instanceof Cons)) {



final Object i869;
if ((boolean)(((Cons)v772).head instanceof Cons)) {



final Object i868;
if ((boolean)Lang.equals(((Cons)((Cons)v772).head).head, v771)) {

i868 = true;
} else {

i868 = false;

}
i869 = i868;
} else {

i869 = false;

}
final Object i870;
if ((boolean)i869) {

i870 = true;
} else {

i870 = false;

}
i871 = i870;
} else {

i871 = false;

}
final Object i876;
if ((boolean)i871) {


i876 = ((Cons)v772).head;
} else {


final Object i875;
if ((boolean)(v772 instanceof Cons)) {

final Object f872 = Assoc.LAMBDA.apply(v771, ((Cons)v772).tail);

i875 = f872;
} else {

final Object i874;
if ((boolean)true) {
final Object f873 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("assoc"));

i874 = f873;
} else {

throw new SimpleError((String)"True condition not found.");


}
i875 = i874;

}
i876 = i875;

}
i877 = i876;

}
    return i877;

}
}
