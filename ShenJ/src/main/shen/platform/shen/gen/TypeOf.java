package shen.gen;



import com.mentics.shen.*;

public class TypeOf {

public static final Symbol SYMBOL = RuntimeContext.symbol("type-of");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6926) throws Exception {
return defined(v6926);
}};
public static Object defined(final Object v6926) throws Exception {
final Object f7146 = IntegerQ.LAMBDA.apply(v6926);

final Object i7158;
if ((boolean)f7146) {

i7158 = RuntimeContext.symbol("integer");
} else {
final Object f7147 = FloatQ.LAMBDA.apply(v6926);

final Object i7157;
if ((boolean)f7147) {

i7157 = RuntimeContext.symbol("float");
} else {


final Object i7156;
if ((boolean)(v6926 instanceof String)) {

i7156 = RuntimeContext.symbol("string");
} else {
final Object f7148 = BooleanQ.LAMBDA.apply(v6926);

final Object i7155;
if ((boolean)f7148) {

i7155 = RuntimeContext.symbol("boolean");
} else {
final Object f7149 = SymbolQ.LAMBDA.apply(v6926);

final Object i7154;
if ((boolean)f7149) {

i7154 = RuntimeContext.symbol("symbol");
} else {
final Object f7150 = TupleQ.LAMBDA.apply(v6926);

final Object i7153;
if ((boolean)f7150) {

i7153 = RuntimeContext.symbol("tuple");
} else {


final Object i7152;
if ((boolean)(v6926 instanceof Cons)) {

i7152 = RuntimeContext.symbol("cons");
} else {

final Object i7151;
if ((boolean)true) {

i7151 = RuntimeContext.symbol("object");
} else {

throw new SimpleError((String)"True condition not found.");


}
i7152 = i7151;

}
i7153 = i7152;

}
i7154 = i7153;

}
i7155 = i7154;

}
i7156 = i7155;

}
i7157 = i7156;

}
i7158 = i7157;

}
    return i7158;

}
}
