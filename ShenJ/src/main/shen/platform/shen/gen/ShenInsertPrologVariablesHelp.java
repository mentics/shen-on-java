package shen.gen;



import com.mentics.shen.*;

public class ShenInsertPrologVariablesHelp {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-insert-prolog-variables-help");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v1537, final Object v1538, final Object v1539) throws Exception {
return defined(v1537, v1538, v1539);
}};
public static Object defined(final Object v1537, final Object v1538, final Object v1539) throws Exception {

final Object i3936;
if ((boolean)Lang.equals(Nil.NIL, v1538)) {

i3936 = v1537;
} else {


final Object i3923;
if ((boolean)(v1538 instanceof Cons)) {

final Object f3921 = VariableQ.LAMBDA.apply(((Cons)v1538).head);

final Object i3922;
if ((boolean)f3921) {

i3922 = true;
} else {

i3922 = false;

}
i3923 = i3922;
} else {

i3923 = false;

}
final Object i3935;
if ((boolean)i3923) {
final Object f3925 = ShenNewpv.LAMBDA.apply(v1539);

final Object v3924 = f3925;

final Object f3927 = Subst.LAMBDA.apply(v3924, ((Cons)v1538).head, v1537);

final Object xVSlashY3926 = f3927;


final Object f3929 = Remove.LAMBDA.apply(((Cons)v1538).head, ((Cons)v1538).tail);

final Object zY3928 = f3929;
final Object f3930 = ShenInsertPrologVariablesHelp.LAMBDA.apply(xVSlashY3926, zY3928, v1539);




i3935 = f3930;
} else {


final Object i3934;
if ((boolean)(v1538 instanceof Cons)) {

final Object f3931 = ShenInsertPrologVariablesHelp.LAMBDA.apply(v1537, ((Cons)v1538).tail, v1539);

i3934 = f3931;
} else {

final Object i3933;
if ((boolean)true) {
final Object f3932 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-insert-prolog-variables-help"));

i3933 = f3932;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3934 = i3933;

}
i3935 = i3934;

}
i3936 = i3935;

}
    return i3936;

}
}
