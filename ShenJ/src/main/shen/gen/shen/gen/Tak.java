package shen.gen;



import com.mentics.shen.*;

public class Tak {

public static final Symbol SYMBOL = RuntimeContext.symbol("tak");
public static final Lambda LAMBDA = new Lambda3() {
public Object apply(final Object v889, final Object v890, final Object v891) throws Exception {
return defined(v889, v890, v891);
}};
public static Object defined(final Object v889, final Object v890, final Object v891) throws Exception {




final Object i897;
if ((boolean)!((boolean)(((Number)(v890)).doubleValue() < ((Number)(v889)).doubleValue()))) {

i897 = v891;
} else {

final Object i896;
if ((boolean)true) {


final Object f892 = Tak.LAMBDA.apply(Primitives.minus.apply(v889, 1), v890, v891);


final Object f893 = Tak.LAMBDA.apply(Primitives.minus.apply(v890, 1), v891, v889);


final Object f894 = Tak.LAMBDA.apply(Primitives.minus.apply(v891, 1), v889, v890);
final Object f895 = Tak.LAMBDA.apply(f892, f893, f894);

i896 = f895;
} else {

throw new SimpleError((String)"True condition not found.");


}
i897 = i896;

}
    return i897;

}
}
