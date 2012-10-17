package shen.gen;



import com.mentics.shen.*;

public class ShenPackageContents {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-package-contents");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v669) throws Exception {
return defined(v669);
}};
public static Object defined(final Object v669) throws Exception {


final Object i668;
if ((boolean)(v669 instanceof Cons)) {


final Object i666;
if ((boolean)Lang.equals(RuntimeContext.symbol("package"), ((Cons)v669).head)) {



final Object i664;
if ((boolean)(((Cons)v669).tail instanceof Cons)) {



final Object i662;
if ((boolean)Lang.equals(RuntimeContext.symbol("null"), ((Cons)((Cons)v669).tail).head)) {




final Object i661;
if ((boolean)(((Cons)((Cons)v669).tail).tail instanceof Cons)) {

i661 = true;
} else {

i661 = false;

}
i662 = i661;
} else {

i662 = false;

}
final Object i663;
if ((boolean)i662) {

i663 = true;
} else {

i663 = false;

}
i664 = i663;
} else {

i664 = false;

}
final Object i665;
if ((boolean)i664) {

i665 = true;
} else {

i665 = false;

}
i666 = i665;
} else {

i666 = false;

}
final Object i667;
if ((boolean)i666) {

i667 = true;
} else {

i667 = false;

}
i668 = i667;
} else {

i668 = false;

}
final Object i679;
if ((boolean)i668) {




i679 = ((Cons)((Cons)((Cons)v669).tail).tail).tail;
} else {


final Object i674;
if ((boolean)(v669 instanceof Cons)) {


final Object i672;
if ((boolean)Lang.equals(RuntimeContext.symbol("package"), ((Cons)v669).head)) {



final Object i670;
if ((boolean)(((Cons)v669).tail instanceof Cons)) {




final Object i669;
if ((boolean)(((Cons)((Cons)v669).tail).tail instanceof Cons)) {

i669 = true;
} else {

i669 = false;

}
i670 = i669;
} else {

i670 = false;

}
final Object i671;
if ((boolean)i670) {

i671 = true;
} else {

i671 = false;

}
i672 = i671;
} else {

i672 = false;

}
final Object i673;
if ((boolean)i672) {

i673 = true;
} else {

i673 = false;

}
i674 = i673;
} else {

i674 = false;

}
final Object i678;
if ((boolean)i674) {





final Object f675 = ShenPackageh.LAMBDA.apply(((Cons)((Cons)v669).tail).head, ((Cons)((Cons)((Cons)v669).tail).tail).head, RuntimeContext.symbol("Code"));

i678 = f675;
} else {

final Object i677;
if ((boolean)true) {
final Object f676 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-package-contents"));

i677 = f676;
} else {

throw new SimpleError((String)"True condition not found.");


}
i678 = i677;

}
i679 = i678;

}
    return i679;

}
}
