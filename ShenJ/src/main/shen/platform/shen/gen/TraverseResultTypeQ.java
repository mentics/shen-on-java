package shen.gen;



import com.mentics.shen.*;

public class TraverseResultTypeQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("traverse-result-type?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6949) throws Exception {
return defined(v6949);
}};
public static Object defined(final Object v6949) throws Exception {
final Object f7181 = TupleQ.LAMBDA.apply(v6949);

final Object i7185;
if ((boolean)f7181) {
final Object f7182 = Snd.LAMBDA.apply(v6949);
final Object f7183 = TupleQ.LAMBDA.apply(f7182);

final Object i7184;
if ((boolean)f7183) {

i7184 = true;
} else {

i7184 = false;

}
i7185 = i7184;
} else {

i7185 = false;

}
final Object i7197;
if ((boolean)i7185) {
final Object f7186 = Fst.LAMBDA.apply(v6949);


final Object i7195;
if ((boolean)(f7186 instanceof String)) {
final Object f7187 = Snd.LAMBDA.apply(v6949);
final Object f7188 = Fst.LAMBDA.apply(f7187);


final Object i7193;
if ((boolean)(f7188 instanceof String)) {
final Object f7189 = Snd.LAMBDA.apply(v6949);
final Object f7190 = Snd.LAMBDA.apply(f7189);
final Object f7191 = SymbolQ.LAMBDA.apply(f7190);

final Object i7192;
if ((boolean)f7191) {

i7192 = true;
} else {

i7192 = false;

}
i7193 = i7192;
} else {

i7193 = false;

}
final Object i7194;
if ((boolean)i7193) {

i7194 = true;
} else {

i7194 = false;

}
i7195 = i7194;
} else {

i7195 = false;

}
i7197 = i7195;
} else {

final Object i7196;
if ((boolean)true) {

i7196 = false;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7197 = i7196;

}
    return i7197;

}
}
