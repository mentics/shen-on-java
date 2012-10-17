package shen.gen;



import com.mentics.shen.*;

public class ToEval {
  public static Object run() throws Exception {
final Object f1013 = Nl.LAMBDA.apply(1);
final Object f1014 = Intoutput.LAMBDA.apply("type checking the N queens", Nil.NIL);


final Object start1015 = Lang.getTime(RuntimeContext.symbol("run"));
final Object f1017 = Load.LAMBDA.apply("N queens.shen");

final Object result1016 = f1017;


final Object finish1018 = Lang.getTime(RuntimeContext.symbol("run"));



final Object time1019 = Primitives.minus.apply(finish1018, start1015);
final Object f1021 = Atp.LAMBDA.apply(time1019, Nil.NIL);
final Object f1022 = Intoutput.LAMBDA.apply("~%run time: ~A secs~%", f1021);

final Object message1020 = f1022;





final Object f1023 = Do.LAMBDA.apply(f1014, result1016);
final Object f1024 = Do.LAMBDA.apply(f1013, f1023);
;
    return f1024;
  }
}
