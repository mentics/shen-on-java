package shen.gen;



import com.mentics.shen.*;

public class ShenCollect {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-collect");
public static final Lambda LAMBDA = new Lambda2() {
public Object apply(final Object v1229, final Object v1230) throws Exception {
return defined(v1229, v1230);
}};
public static Object defined(final Object v1229, final Object v1230) throws Exception {

final Object i3010;
if ((boolean)Lang.equals(Nil.NIL, v1230)) {

i3010 = Nil.NIL;
} else {


final Object i3009;
if ((boolean)(v1230 instanceof Cons)) {

final Object f3003 = RuntimeContext.dispatch(v1229).apply(((Cons)v1230).head);

final Object i3006;
if ((boolean)f3003) {



final Object f3004 = ShenCollect.LAMBDA.apply(v1229, ((Cons)v1230).tail);


i3006 = new Cons(((Cons)v1230).head, f3004);
} else {

final Object f3005 = ShenCollect.LAMBDA.apply(v1229, ((Cons)v1230).tail);

i3006 = f3005;

}
i3009 = i3006;
} else {

final Object i3008;
if ((boolean)true) {
final Object f3007 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-collect"));

i3008 = f3007;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3009 = i3008;

}
i3010 = i3009;

}
    return i3010;

}
}
