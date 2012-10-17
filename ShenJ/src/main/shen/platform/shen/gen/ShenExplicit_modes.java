package shen.gen;



import com.mentics.shen.*;

public class ShenExplicit_modes {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-explicit_modes");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1285) throws Exception {
return defined(v1285);
}};
public static Object defined(final Object v1285) throws Exception {


final Object i3111;
if ((boolean)(v1285 instanceof Cons)) {


final Lambda l3107 = new Lambda1() {
  public Object apply(final Object v1286) throws Exception {
    final Object f3106 = ShenEm_help.LAMBDA.apply(v1286);

    return f3106;
  }
};
final Object f3108 = Map.LAMBDA.apply(l3107, ((Cons)v1285).tail);


i3111 = new Cons(((Cons)v1285).head, f3108);
} else {

final Object i3110;
if ((boolean)true) {
final Object f3109 = ShenSysError.LAMBDA.apply(RuntimeContext.symbol("shen-explicit_modes"));

i3110 = f3109;
} else {

throw new SimpleError((String)"True condition not found.");


}
i3111 = i3110;

}
    return i3111;

}
}
