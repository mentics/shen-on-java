package shen.gen;



import com.mentics.shen.*;

public class ShenSplit_cc_rules {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-split_cc_rules");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v312, final Object v313) throws Exception {
return defined(v312, v313);
}};
public static Object defined(final Object v312, final Object v313) throws Exception {

final Object i3978;
if ((boolean)Lang.equals(Nil.NIL, v312)) {

final Object i3977;
if ((boolean)Lang.equals(Nil.NIL, v313)) {

i3977 = true;
} else {

i3977 = false;

}
i3978 = i3977;
} else {

i3978 = false;

}
final Object i3992;
if ((boolean)i3978) {

i3992 = Nil.NIL;
} else {

final Object i3991;
if ((boolean)Lang.equals(Nil.NIL, v312)) {
final Object f3979 = Reverse.LAMBDA.apply(v313);
final Object f3980 = ShenSplit_cc_rule.LAMBDA.apply(f3979, Nil.NIL);



i3991 = new Cons(f3980, Nil.NIL);
} else {


final Object i3982;
if ((boolean)(v312 instanceof Cons)) {


final Object i3981;
if ((boolean)Lang.equals(RuntimeContext.symbol(";"), ((Cons)v312).head)) {

i3981 = true;
} else {

i3981 = false;

}
i3982 = i3981;
} else {

i3982 = false;

}
final Object i3990;
if ((boolean)i3982) {
final Object f3983 = Reverse.LAMBDA.apply(v313);
final Object f3984 = ShenSplit_cc_rule.LAMBDA.apply(f3983, Nil.NIL);


final Object f3985 = ShenSplit_cc_rules.LAMBDA.apply(((Cons)v312).tail, Nil.NIL);


i3990 = new Cons(f3984, f3985);
} else {


final Object i3989;
if ((boolean)(v312 instanceof Cons)) {




final Object f3986 = ShenSplit_cc_rules.LAMBDA.apply(((Cons)v312).tail, new Cons(((Cons)v312).head, v313));

i3989 = f3986;
} else {

final Object i3988;
if ((boolean)true) {
final Object f3987 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-split_cc_rules"));

i3988 = f3987;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3989 = i3988;

}
i3990 = i3989;

}
i3991 = i3990;

}
i3992 = i3991;

}
    return i3992;

}
}
