package shen.gen;



import com.mentics.shen.*;

public class ShenDecons {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-decons");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v330) throws Exception {
return defined(v330);
}};
public static Object defined(final Object v330) throws Exception {


final Object i4078;
if ((boolean)(v330 instanceof Cons)) {


final Object i4076;
if ((boolean)Lang.equals(RuntimeContext.symbol("cons"), ((Cons)v330).head)) {



final Object i4074;
if ((boolean)(((Cons)v330).tail instanceof Cons)) {




final Object i4072;
if ((boolean)(((Cons)((Cons)v330).tail).tail instanceof Cons)) {




final Object i4071;
if ((boolean)Lang.equals(Nil.NIL, ((Cons)((Cons)((Cons)v330).tail).tail).tail)) {

i4071 = true;
} else {

i4071 = false;

}
i4072 = i4071;
} else {

i4072 = false;

}
final Object i4073;
if ((boolean)i4072) {

i4073 = true;
} else {

i4073 = false;

}
i4074 = i4073;
} else {

i4074 = false;

}
final Object i4075;
if ((boolean)i4074) {

i4075 = true;
} else {

i4075 = false;

}
i4076 = i4075;
} else {

i4076 = false;

}
final Object i4077;
if ((boolean)i4076) {

i4077 = true;
} else {

i4077 = false;

}
i4078 = i4077;
} else {

i4078 = false;

}
final Object i4081;
if ((boolean)i4078) {






final Object f4079 = ShenDecons.LAMBDA.apply(((Cons)((Cons)((Cons)v330).tail).tail).head);


i4081 = new Cons(((Cons)((Cons)v330).tail).head, f4079);
} else {

final Object i4080;
if ((boolean)true) {

i4080 = v330;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4081 = i4080;

}
    return i4081;

}
}
