package shen.gen;



import com.mentics.shen.*;

public class ShenLinearise_help {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-linearise_help");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v443, final Object v444, final Object v445) throws Exception {
return defined(v443, v444, v445);
}};
public static Object defined(final Object v443, final Object v444, final Object v445) throws Exception {

final Object i2019;
if ((boolean)Lang.equals(Nil.NIL, v443)) {





i2019 = new Cons(v444, new Cons(v445, Nil.NIL));
} else {


final Object i2018;
if ((boolean)(v443 instanceof Cons)) {

final Object f2004 = VariableQ.LAMBDA.apply(((Cons)v443).head);

final Object i2007;
if ((boolean)f2004) {


final Object f2005 = ElementQ.LAMBDA.apply(((Cons)v443).head, ((Cons)v443).tail);

final Object i2006;
if ((boolean)f2005) {

i2006 = true;
} else {

i2006 = false;

}
i2007 = i2006;
} else {

i2007 = false;

}
final Object i2015;
if ((boolean)i2007) {

final Object f2009 = Gensym.LAMBDA.apply(((Cons)v443).head);

final Object var2008 = f2009;














final Object newAction2010 = new Cons(RuntimeContext.symbol("where"), new Cons(new Cons(RuntimeContext.symbol("="), new Cons(((Cons)v443).head, new Cons(var2008, Nil.NIL))), new Cons(v445, Nil.NIL)));

final Object f2012 = ShenLinearise_X.LAMBDA.apply(((Cons)v443).head, var2008, v444);

final Object newPatts2011 = f2012;

final Object f2013 = ShenLinearise_help.LAMBDA.apply(((Cons)v443).tail, newPatts2011, newAction2010);




i2015 = f2013;
} else {

final Object f2014 = ShenLinearise_help.LAMBDA.apply(((Cons)v443).tail, v444, v445);

i2015 = f2014;

}
i2018 = i2015;
} else {

final Object i2017;
if ((boolean)true) {
final Object f2016 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-linearise_help"));

i2017 = f2016;
} else {

throw new SimpleError((String)"True condition not found.");


}
i2018 = i2017;

}
i2019 = i2018;

}
    return i2019;

}
}
