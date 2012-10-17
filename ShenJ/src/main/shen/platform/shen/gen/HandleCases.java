package shen.gen;



import com.mentics.shen.*;

public class HandleCases {

public static final Symbol SYMBOL = RuntimeContext.symbol("handle-cases");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v7287) throws Exception {
return defined(v7287);
}};
public static Object defined(final Object v7287) throws Exception {


final Object i8944;
if ((boolean)(v7287 instanceof Cons)) {


final Object i8943;
if ((boolean)Lang.equals(true, ((Cons)v7287).head)) {

i8943 = true;
} else {

i8943 = false;

}
i8944 = i8943;
} else {

i8944 = false;

}
final Object i8954;
if ((boolean)i8944) {


i8954 = ((Cons)v7287).tail;
} else {


final Object i8946;
if ((boolean)(v7287 instanceof Cons)) {


final Object i8945;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)v7287).tail)) {

i8945 = true;
} else {

i8945 = false;

}
i8946 = i8945;
} else {

i8946 = false;

}
final Object i8953;
if ((boolean)i8946) {





final Object f8947 = HandleCase.LAMBDA.apply(((Cons)v7287).head, new Cons(RuntimeContext.symbol("simple-error"), new Cons("True condition not found.", Nil.NIL)));

i8953 = f8947;
} else {


final Object i8952;
if ((boolean)(v7287 instanceof Cons)) {


final Object f8948 = HandleCases.LAMBDA.apply(((Cons)v7287).tail);
final Object f8949 = HandleCase.LAMBDA.apply(((Cons)v7287).head, f8948);

i8952 = f8949;
} else {

final Object i8951;
if ((boolean)true) {
final Object f8950 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("handle-cases"));

i8951 = f8950;
} else {

throw new SimpleError((String)"True condition not found.");


}
i8952 = i8951;

}
i8953 = i8952;

}
i8954 = i8953;

}
    return i8954;

}
}
