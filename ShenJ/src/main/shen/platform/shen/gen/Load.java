package shen.gen;



import com.mentics.shen.*;

public class Load {

public static final Symbol SYMBOL = RuntimeContext.symbol("load");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1651) throws Exception {
return defined(v1651);
}};
public static Object defined(final Object v1651) throws Exception {


final Object start4192 = Lang.getTime(RuntimeContext.symbol("run"));

final Object f4194 = ReadFile.LAMBDA.apply(v1651);
final Object f4195 = ShenLoadHelp.LAMBDA.apply(RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tc*")), f4194);

final Object result4193 = f4195;


final Object finish4196 = Lang.getTime(RuntimeContext.symbol("run"));



final Object time4197 = Primitives.minus.apply(finish4196, start4192);
final Object f4199 = Atp.LAMBDA.apply(time4197, Nil.NIL);
final Object f4200 = Intoutput.LAMBDA.apply("~%run time: ~A secs~%", f4199);

final Object message4198 = f4200;






final Object load4191 = result4193;


final Object i4205;
if ((boolean)RuntimeContext.globalProperties.get(RuntimeContext.symbol("shen-*tc*"))) {
final Object f4202 = Inferences.LAMBDA.apply(RuntimeContext.symbol("_"));
final Object f4203 = Atp.LAMBDA.apply(f4202, Nil.NIL);
final Object f4204 = Intoutput.LAMBDA.apply("~%typechecked in ~A inferences~%", f4203);

i4205 = f4204;
} else {

i4205 = RuntimeContext.symbol("shen-skip");

}
final Object infs4201 = i4205;



    return RuntimeContext.symbol("loaded");

}
}
