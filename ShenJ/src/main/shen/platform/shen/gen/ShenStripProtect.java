package shen.gen;



import com.mentics.shen.*;

public class ShenStripProtect {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-strip-protect");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v440) throws Exception {
return defined(v440);
}};
public static Object defined(final Object v440) throws Exception {


final Object i1983;
if ((boolean)(v440 instanceof Cons)) {


final Object i1981;
if ((boolean)Lang.equals(RuntimeContext.symbol("protect"), ((Cons)v440).head)) {



final Object i1979;
if ((boolean)(((Cons)v440).tail instanceof Cons)) {



final Object i1978;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v440).tail).tail)) {

i1978 = true;
} else {

i1978 = false;

}
i1979 = i1978;
} else {

i1979 = false;

}
final Object i1980;
if ((boolean)i1979) {

i1980 = true;
} else {

i1980 = false;

}
i1981 = i1980;
} else {

i1981 = false;

}
final Object i1982;
if ((boolean)i1981) {

i1982 = true;
} else {

i1982 = false;

}
i1983 = i1982;
} else {

i1983 = false;

}
final Object i1988;
if ((boolean)i1983) {



i1988 = ((Cons)((Cons)v440).tail).head;
} else {


final Object i1987;
if ((boolean)(v440 instanceof Cons)) {

final Object f1984 = ShenStripProtect.LAMBDA.apply(((Cons)v440).head);


final Object f1985 = ShenStripProtect.LAMBDA.apply(((Cons)v440).tail);


i1987 = new Cons(f1984, f1985);
} else {

final Object i1986;
if ((boolean)true) {

i1986 = v440;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1987 = i1986;

}
i1988 = i1987;

}
    return i1988;

}
}
