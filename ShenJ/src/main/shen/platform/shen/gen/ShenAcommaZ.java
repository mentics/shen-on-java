package shen.gen;



import com.mentics.shen.*;

public class ShenAcommaZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<comma>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v988) throws Exception {
return defined(v988);
}};
public static Object defined(final Object v988) throws Exception {
final Object f5022 = Fst.LAMBDA.apply(v988);


final Object i5030;
if ((boolean)(f5022 instanceof Cons)) {
final Object f5023 = Fst.LAMBDA.apply(v988);

final Object f5024 = Snd.LAMBDA.apply(v988);
final Object f5025 = ShenReassemble.LAMBDA.apply(((Cons)f5023).tail, f5024);
final Object f5026 = Fst.LAMBDA.apply(f5025);
final Object f5027 = Fst.LAMBDA.apply(v988);


final Object i5028;
if ((boolean)Lang.equals(((Cons)f5027).head, 44)) {

i5028 = RuntimeContext.symbol("shen-skip");
} else {

i5028 = null;

}final Object f5029 = ShenReassemble.LAMBDA.apply(f5026, i5028);

i5030 = f5029;
} else {

i5030 = null;

}
final Object result5021 = i5030;

final Object i5031;
if ((boolean)Lang.equals(result5021, null)) {

i5031 = null;
} else {

i5031 = result5021;

}

    return i5031;

}
}
