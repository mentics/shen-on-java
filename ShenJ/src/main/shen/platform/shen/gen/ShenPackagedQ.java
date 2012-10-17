package shen.gen;



import com.mentics.shen.*;

public class ShenPackagedQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-packaged?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v665) throws Exception {
return defined(v665);
}};
public static Object defined(final Object v665) throws Exception {


final Object i653;
if ((boolean)(v665 instanceof Cons)) {


final Object i651;
if ((boolean)Lang.equals(RuntimeContext.symbol("package"), ((Cons)v665).head)) {



final Object i649;
if ((boolean)(((Cons)v665).tail instanceof Cons)) {




final Object i648;
if ((boolean)(((Cons)((Cons)v665).tail).tail instanceof Cons)) {

i648 = true;
} else {

i648 = false;

}
i649 = i648;
} else {

i649 = false;

}
final Object i650;
if ((boolean)i649) {

i650 = true;
} else {

i650 = false;

}
i651 = i650;
} else {

i651 = false;

}
final Object i652;
if ((boolean)i651) {

i652 = true;
} else {

i652 = false;

}
i653 = i652;
} else {

i653 = false;

}
final Object i655;
if ((boolean)i653) {

i655 = true;
} else {

final Object i654;
if ((boolean)true) {

i654 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i655 = i654;

}
    return i655;

}
}
