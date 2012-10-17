package shen.gen;



import com.mentics.shen.*;

public class ShenAritycheck {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-aritycheck");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v458, final Object v459) throws Exception {
return defined(v458, v459);
}};
public static Object defined(final Object v458, final Object v459) throws Exception {


final Object i2034;
if ((boolean)(v459 instanceof Cons)) {



final Object i2032;
if ((boolean)(((Cons)v459).head instanceof Cons)) {




final Object i2030;
if ((boolean)(((Cons)((Cons)v459).head).tail instanceof Cons)) {




final Object i2028;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v459).head).tail).tail)) {


final Object i2027;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v459).tail)) {

i2027 = true;
} else {

i2027 = false;

}
i2028 = i2027;
} else {

i2028 = false;

}
final Object i2029;
if ((boolean)i2028) {

i2029 = true;
} else {

i2029 = false;

}
i2030 = i2029;
} else {

i2030 = false;

}
final Object i2031;
if ((boolean)i2030) {

i2031 = true;
} else {

i2031 = false;

}
i2032 = i2031;
} else {

i2032 = false;

}
final Object i2033;
if ((boolean)i2032) {

i2033 = true;
} else {

i2033 = false;

}
i2034 = i2033;
} else {

i2034 = false;

}
final Object i2065;
if ((boolean)i2034) {



final Object f2035 = ShenAritycheckAction.LAMBDA.apply(((Cons)((Cons)((Cons)v459).head).tail).head);
final Object f2036 = Arity.LAMBDA.apply(v458);


final Object f2037 = Length.LAMBDA.apply(((Cons)((Cons)v459).head).head);
final Object f2038 = ShenAritycheckName.LAMBDA.apply(v458, f2036, f2037);
final Object f2039 = Do.LAMBDA.apply(f2035, f2038);

i2065 = f2039;
} else {


final Object i2053;
if ((boolean)(v459 instanceof Cons)) {



final Object i2051;
if ((boolean)(((Cons)v459).head instanceof Cons)) {




final Object i2049;
if ((boolean)(((Cons)((Cons)v459).head).tail instanceof Cons)) {




final Object i2047;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v459).head).tail).tail)) {



final Object i2045;
if ((boolean)(((Cons)v459).tail instanceof Cons)) {




final Object i2043;
if ((boolean)(((Cons)((Cons)v459).tail).head instanceof Cons)) {





final Object i2041;
if ((boolean)(((Cons)((Cons)((Cons)v459).tail).head).tail instanceof Cons)) {





final Object i2040;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v459).tail).head).tail).tail)) {

i2040 = true;
} else {

i2040 = false;

}
i2041 = i2040;
} else {

i2041 = false;

}
final Object i2042;
if ((boolean)i2041) {

i2042 = true;
} else {

i2042 = false;

}
i2043 = i2042;
} else {

i2043 = false;

}
final Object i2044;
if ((boolean)i2043) {

i2044 = true;
} else {

i2044 = false;

}
i2045 = i2044;
} else {

i2045 = false;

}
final Object i2046;
if ((boolean)i2045) {

i2046 = true;
} else {

i2046 = false;

}
i2047 = i2046;
} else {

i2047 = false;

}
final Object i2048;
if ((boolean)i2047) {

i2048 = true;
} else {

i2048 = false;

}
i2049 = i2048;
} else {

i2049 = false;

}
final Object i2050;
if ((boolean)i2049) {

i2050 = true;
} else {

i2050 = false;

}
i2051 = i2050;
} else {

i2051 = false;

}
final Object i2052;
if ((boolean)i2051) {

i2052 = true;
} else {

i2052 = false;

}
i2053 = i2052;
} else {

i2053 = false;

}
final Object i2064;
if ((boolean)i2053) {


final Object f2054 = Length.LAMBDA.apply(((Cons)((Cons)v459).head).head);



final Object f2055 = Length.LAMBDA.apply(((Cons)((Cons)((Cons)v459).tail).head).head);

final Object i2061;
if ((boolean)Lang.equals(f2054, f2055)) {
final Object f2056 = ShenAritycheckAction.LAMBDA.apply(RuntimeContext.symbol("Action"));

final Object f2057 = ShenAritycheck.LAMBDA.apply(v458, ((Cons)v459).tail);
final Object f2058 = Do.LAMBDA.apply(f2056, f2057);

i2061 = f2058;
} else {
final Object f2059 = Atp.LAMBDA.apply(v458, Nil.NIL);
final Object f2060 = Interror.LAMBDA.apply("arity error in ~A~%", f2059);

i2061 = f2060;

}
i2064 = i2061;
} else {

final Object i2063;
if ((boolean)true) {
final Object f2062 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-aritycheck"));

i2063 = f2062;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2064 = i2063;

}
i2065 = i2064;

}
    return i2065;

}
}
