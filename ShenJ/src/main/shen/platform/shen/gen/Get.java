package shen.gen;



import com.mentics.shen.*;

public class Get {

public static final Symbol SYMBOL = RuntimeContext.symbol("get");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v826, final Object v827, final Object v828) throws Exception {
return defined(v826, v827, v828);
}};
public static Object defined(final Object v826, final Object v827, final Object v828) throws Exception {
final Object f940 = Limit.LAMBDA.apply(v828);
final Object f941 = Hash.LAMBDA.apply(v826, f940);

final Object n939 = f941;
Object t946;
try {
final Object f943 = Ahvector.LAMBDA.apply(v828, n939);

t946 = f943;
} catch (Throwable t) {
final Lambda l945 = new Lambda1() {
  public Object apply(final Object e) throws Exception {
    final Object f944 = Interror.LAMBDA.apply("pointer not found~%", Nil.NIL);

    return f944;
  }
};
t946 = l945.apply(t);
}
final Object t947 = t946;

final Object entry942 = t947;




final Object f949 = Assoc.LAMBDA.apply(new Cons(v826, new Cons(v827, Nil.NIL)), entry942);

final Object result948 = f949;
final Object f950 = EmptyQ.LAMBDA.apply(result948);

final Object i952;
if ((boolean)f950) {
final Object f951 = Interror.LAMBDA.apply("value not found~%", Nil.NIL);

i952 = f951;
} else {


i952 = ((Cons)result948).tail;

}



    return i952;

}
}
