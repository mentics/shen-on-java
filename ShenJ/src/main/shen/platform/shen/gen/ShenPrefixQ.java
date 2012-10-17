package shen.gen;



import com.mentics.shen.*;

public class ShenPrefixQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-prefix?");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v619, final Object v620) throws Exception {
return defined(v619, v620);
}};
public static Object defined(final Object v619, final Object v620) throws Exception {

final Object i6653;
if ((boolean)Lang.equals(Nil.NIL, v619)) {

i6653 = true;
} else {


final Object i6649;
if ((boolean)(v619 instanceof Cons)) {


final Object i6647;
if ((boolean)(v620 instanceof Cons)) {



final Object i6646;
if ((boolean)Lang.equals(((Cons)v620).head, ((Cons)v619).head)) {

i6646 = true;
} else {

i6646 = false;

}
i6647 = i6646;
} else {

i6647 = false;

}
final Object i6648;
if ((boolean)i6647) {

i6648 = true;
} else {

i6648 = false;

}
i6649 = i6648;
} else {

i6649 = false;

}
final Object i6652;
if ((boolean)i6649) {


final Object f6650 = ShenPrefixQ.LAMBDA.apply(((Cons)v619).tail, ((Cons)v620).tail);

i6652 = f6650;
} else {

final Object i6651;
if ((boolean)true) {

i6651 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i6652 = i6651;

}
i6653 = i6652;

}
    return i6653;

}
}
