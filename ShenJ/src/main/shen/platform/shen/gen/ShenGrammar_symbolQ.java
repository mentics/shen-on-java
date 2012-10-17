package shen.gen;



import com.mentics.shen.*;

public class ShenGrammar_symbolQ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-grammar_symbol?");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v342) throws Exception {
return defined(v342);
}};
public static Object defined(final Object v342) throws Exception {
final Object f4091 = SymbolQ.LAMBDA.apply(v342);

final Object i4098;
if ((boolean)f4091) {
final Object f4093 = Explode.LAMBDA.apply(v342);

final Object cs4092 = f4093;


final Object i4096;
if ((boolean)Lang.equals(((Cons)cs4092).head, "<")) {
final Object f4094 = Reverse.LAMBDA.apply(cs4092);


final Object i4095;
if ((boolean)Lang.equals(((Cons)f4094).head, ">")) {

i4095 = true;
} else {

i4095 = false;

}
i4096 = i4095;
} else {

i4096 = false;

}

final Object i4097;
if ((boolean)i4096) {

i4097 = true;
} else {

i4097 = false;

}
i4098 = i4097;
} else {

i4098 = false;

}
    return i4098;

}
}
