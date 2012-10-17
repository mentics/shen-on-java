package shen.gen;



import com.mentics.shen.*;

public class ShenExtract_free_vars {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-extract_free_vars");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v433, final Object v434) throws Exception {
return defined(v433, v434);
}};
public static Object defined(final Object v433, final Object v434) throws Exception {


final Object i1929;
if ((boolean)(v434 instanceof Cons)) {


final Object i1927;
if ((boolean)Lang.equals(RuntimeContext.symbol("protect"), ((Cons)v434).head)) {



final Object i1925;
if ((boolean)(((Cons)v434).tail instanceof Cons)) {



final Object i1924;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)v434).tail).tail)) {

i1924 = true;
} else {

i1924 = false;

}
i1925 = i1924;
} else {

i1925 = false;

}
final Object i1926;
if ((boolean)i1925) {

i1926 = true;
} else {

i1926 = false;

}
i1927 = i1926;
} else {

i1927 = false;

}
final Object i1928;
if ((boolean)i1927) {

i1928 = true;
} else {

i1928 = false;

}
i1929 = i1928;
} else {

i1929 = false;

}
final Object i1964;
if ((boolean)i1929) {

i1964 = Nil.NIL;
} else {
final Object f1930 = VariableQ.LAMBDA.apply(v434);

final Object i1933;
if ((boolean)f1930) {
final Object f1931 = ElementQ.LAMBDA.apply(v434, v433);


final Object i1932;
if ((boolean)!((boolean)f1931)) {

i1932 = true;
} else {

i1932 = false;

}
i1933 = i1932;
} else {

i1933 = false;

}
final Object i1963;
if ((boolean)i1933) {



i1963 = new Cons(v434, Nil.NIL);
} else {


final Object i1941;
if ((boolean)(v434 instanceof Cons)) {


final Object i1939;
if ((boolean)Lang.equals(RuntimeContext.symbol("lambda"), ((Cons)v434).head)) {



final Object i1937;
if ((boolean)(((Cons)v434).tail instanceof Cons)) {




final Object i1935;
if ((boolean)(((Cons)((Cons)v434).tail).tail instanceof Cons)) {




final Object i1934;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v434).tail).tail).tail)) {

i1934 = true;
} else {

i1934 = false;

}
i1935 = i1934;
} else {

i1935 = false;

}
final Object i1936;
if ((boolean)i1935) {

i1936 = true;
} else {

i1936 = false;

}
i1937 = i1936;
} else {

i1937 = false;

}
final Object i1938;
if ((boolean)i1937) {

i1938 = true;
} else {

i1938 = false;

}
i1939 = i1938;
} else {

i1939 = false;

}
final Object i1940;
if ((boolean)i1939) {

i1940 = true;
} else {

i1940 = false;

}
i1941 = i1940;
} else {

i1941 = false;

}
final Object i1962;
if ((boolean)i1941) {







final Object f1942 = ShenExtract_free_vars.LAMBDA.apply(new Cons(((Cons)((Cons)v434).tail).head, v433), ((Cons)((Cons)((Cons)v434).tail).tail).head);

i1962 = f1942;
} else {


final Object i1952;
if ((boolean)(v434 instanceof Cons)) {


final Object i1950;
if ((boolean)Lang.equals(RuntimeContext.symbol("let"), ((Cons)v434).head)) {



final Object i1948;
if ((boolean)(((Cons)v434).tail instanceof Cons)) {




final Object i1946;
if ((boolean)(((Cons)((Cons)v434).tail).tail instanceof Cons)) {





final Object i1944;
if ((boolean)(((Cons)((Cons)((Cons)v434).tail).tail).tail instanceof Cons)) {





final Object i1943;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)((Cons)v434).tail).tail).tail).tail)) {

i1943 = true;
} else {

i1943 = false;

}
i1944 = i1943;
} else {

i1944 = false;

}
final Object i1945;
if ((boolean)i1944) {

i1945 = true;
} else {

i1945 = false;

}
i1946 = i1945;
} else {

i1946 = false;

}
final Object i1947;
if ((boolean)i1946) {

i1947 = true;
} else {

i1947 = false;

}
i1948 = i1947;
} else {

i1948 = false;

}
final Object i1949;
if ((boolean)i1948) {

i1949 = true;
} else {

i1949 = false;

}
i1950 = i1949;
} else {

i1950 = false;

}
final Object i1951;
if ((boolean)i1950) {

i1951 = true;
} else {

i1951 = false;

}
i1952 = i1951;
} else {

i1952 = false;

}
final Object i1961;
if ((boolean)i1952) {



final Object f1953 = ShenExtract_free_vars.LAMBDA.apply(v433, ((Cons)((Cons)((Cons)v434).tail).tail).head);








final Object f1954 = ShenExtract_free_vars.LAMBDA.apply(new Cons(((Cons)((Cons)v434).tail).head, v433), ((Cons)((Cons)((Cons)((Cons)v434).tail).tail).tail).head);
final Object f1955 = Union.LAMBDA.apply(f1953, f1954);

i1961 = f1955;
} else {


final Object i1960;
if ((boolean)(v434 instanceof Cons)) {

final Object f1956 = ShenExtract_free_vars.LAMBDA.apply(v433, ((Cons)v434).head);

final Object f1957 = ShenExtract_free_vars.LAMBDA.apply(v433, ((Cons)v434).tail);
final Object f1958 = Union.LAMBDA.apply(f1956, f1957);

i1960 = f1958;
} else {

final Object i1959;
if ((boolean)true) {

i1959 = Nil.NIL;
} else {

throw new SimpleError((String)"True condition not found.");


}
i1960 = i1959;

}
i1961 = i1960;

}
i1962 = i1961;

}
i1963 = i1962;

}
i1964 = i1963;

}
    return i1964;

}
}
