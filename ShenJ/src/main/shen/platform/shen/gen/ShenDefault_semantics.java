package shen.gen;



import com.mentics.shen.*;

public class ShenDefault_semantics {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-default_semantics");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v316) throws Exception {
return defined(v316);
}};
public static Object defined(final Object v316) throws Exception {

final Object i4037;
if ((boolean)Lang.equals(Nil.NIL, v316)) {

i4037 = Nil.NIL;
} else {


final Object i4026;
if ((boolean)(v316 instanceof Cons)) {

final Object f4024 = ShenGrammar_symbolQ.LAMBDA.apply(((Cons)v316).head);

final Object i4025;
if ((boolean)f4024) {

i4025 = true;
} else {

i4025 = false;

}
i4026 = i4025;
} else {

i4026 = false;

}
final Object i4036;
if ((boolean)i4026) {


final Object f4028 = Concat.LAMBDA.apply(RuntimeContext.symbol("Parse_"), ((Cons)v316).head);




final Object pS4027 = new Cons(RuntimeContext.symbol("snd"), new Cons(f4028, Nil.NIL));

final Object f4029 = EmptyQ.LAMBDA.apply(((Cons)v316).tail);

final Object i4031;
if ((boolean)f4029) {

i4031 = pS4027;
} else {



final Object f4030 = ShenDefault_semantics.LAMBDA.apply(((Cons)v316).tail);





i4031 = new Cons(RuntimeContext.symbol("append"), new Cons(pS4027, new Cons(f4030, Nil.NIL)));

}

i4036 = i4031;
} else {


final Object i4035;
if ((boolean)(v316 instanceof Cons)) {




final Object f4032 = ShenDefault_semantics.LAMBDA.apply(((Cons)v316).tail);





i4035 = new Cons(RuntimeContext.symbol("cons"), new Cons(((Cons)v316).head, new Cons(f4032, Nil.NIL)));
} else {

final Object i4034;
if ((boolean)true) {
final Object f4033 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-default_semantics"));

i4034 = f4033;
} else {

throw new SimpleError((String)"True condition not found.");


}
i4035 = i4034;

}
i4036 = i4035;

}
i4037 = i4036;

}
    return i4037;

}
}
