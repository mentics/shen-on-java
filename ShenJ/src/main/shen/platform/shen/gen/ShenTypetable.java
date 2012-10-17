package shen.gen;



import com.mentics.shen.*;

public class ShenTypetable {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-typetable");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1668) throws Exception {
return defined(v1668);
}};
public static Object defined(final Object v1668) throws Exception {


final Object i4245;
if ((boolean)(v1668 instanceof Cons)) {


final Object i4243;
if ((boolean)Lang.equals(RuntimeContext.symbol("define"), ((Cons)v1668).head)) {



final Object i4242;
if ((boolean)(((Cons)v1668).tail instanceof Cons)) {

i4242 = true;
} else {

i4242 = false;

}
i4243 = i4242;
} else {

i4243 = false;

}
final Object i4244;
if ((boolean)i4243) {

i4244 = true;
} else {

i4244 = false;

}
i4245 = i4244;
} else {

i4245 = false;

}
final Object i4254;
if ((boolean)i4245) {
final Lambda l4248 = new Lambda1() {
  public Object apply(final Object v1669) throws Exception {
    final Object f4247 = ShenAsigPlusrestZ.LAMBDA.apply(v1669);

    return f4247;
  }
};

final Object f4249 = Compile.LAMBDA.apply(l4248, ((Cons)((Cons)v1668).tail).tail, Nil.NIL);

final Object sig4246 = f4249;

final Object i4252;
if ((boolean)Lang.equals(sig4246, null)) {


final Object f4250 = Atp.LAMBDA.apply(((Cons)((Cons)v1668).tail).head, Nil.NIL);
final Object f4251 = Interror.LAMBDA.apply("~A lacks a proper signature.~%", f4250);

i4252 = f4251;
} else {







i4252 = new Cons(new Cons(((Cons)((Cons)v1668).tail).head, sig4246), Nil.NIL);

}

i4254 = i4252;
} else {

final Object i4253;
if ((boolean)true) {

i4253 = Nil.NIL;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4254 = i4253;

}
    return i4254;

}
}
