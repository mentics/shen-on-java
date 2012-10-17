package shen.gen;



import com.mentics.shen.*;

public class ShenAwhitespaceZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<whitespace>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1062) throws Exception {
return defined(v1062);
}};
public static Object defined(final Object v1062) throws Exception {
final Object f5702 = Fst.LAMBDA.apply(v1062);


final Object i5714;
if ((boolean)(f5702 instanceof Cons)) {
final Object f5703 = Fst.LAMBDA.apply(v1062);

final Object f5704 = Snd.LAMBDA.apply(v1062);
final Object f5705 = ShenReassemble.LAMBDA.apply(((Cons)f5703).tail, f5704);
final Object f5706 = Fst.LAMBDA.apply(f5705);
final Object f5708 = Fst.LAMBDA.apply(v1062);


final Object case5707 = ((Cons)f5708).head;

final Object i5712;
if ((boolean)Lang.equals(case5707, 32)) {

i5712 = RuntimeContext.symbol("shen-skip");
} else {

final Object i5711;
if ((boolean)Lang.equals(case5707, 13)) {

i5711 = RuntimeContext.symbol("shen-skip");
} else {

final Object i5710;
if ((boolean)Lang.equals(case5707, 10)) {

i5710 = RuntimeContext.symbol("shen-skip");
} else {

final Object i5709;
if ((boolean)Lang.equals(case5707, 9)) {

i5709 = RuntimeContext.symbol("shen-skip");
} else {

i5709 = null;

}
i5710 = i5709;

}
i5711 = i5710;

}
i5712 = i5711;

}
final Object f5713 = ShenReassemble.LAMBDA.apply(f5706, i5712);

i5714 = f5713;
} else {

i5714 = null;

}
final Object result5701 = i5714;

final Object i5715;
if ((boolean)Lang.equals(result5701, null)) {

i5715 = null;
} else {

i5715 = result5701;

}

    return i5715;

}
}
