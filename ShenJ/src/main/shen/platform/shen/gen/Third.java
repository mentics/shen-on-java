package shen.gen;



import com.mentics.shen.*;

public class Third {

public static final Symbol SYMBOL = RuntimeContext.symbol("third");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v6925) throws Exception {
return defined(v6925);
}};
public static Object defined(final Object v6925) throws Exception {
final Object f7122 = TupleQ.LAMBDA.apply(v6925);

final Object i7131;
if ((boolean)f7122) {
final Object f7123 = Snd.LAMBDA.apply(v6925);
final Object f7124 = TupleQ.LAMBDA.apply(f7123);

final Object i7129;
if ((boolean)f7124) {
final Object f7125 = Snd.LAMBDA.apply(v6925);
final Object f7126 = Snd.LAMBDA.apply(f7125);
final Object f7127 = TupleQ.LAMBDA.apply(f7126);

final Object i7128;
if ((boolean)f7127) {

i7128 = true;
} else {

i7128 = false;

}
i7129 = i7128;
} else {

i7129 = false;

}
final Object i7130;
if ((boolean)i7129) {

i7130 = true;
} else {

i7130 = false;

}
i7131 = i7130;
} else {

i7131 = false;

}
final Object i7145;
if ((boolean)i7131) {
final Object f7132 = Snd.LAMBDA.apply(v6925);
final Object f7133 = Snd.LAMBDA.apply(f7132);
final Object f7134 = Fst.LAMBDA.apply(f7133);

i7145 = f7134;
} else {
final Object f7135 = TupleQ.LAMBDA.apply(v6925);

final Object i7139;
if ((boolean)f7135) {
final Object f7136 = Snd.LAMBDA.apply(v6925);
final Object f7137 = TupleQ.LAMBDA.apply(f7136);

final Object i7138;
if ((boolean)f7137) {

i7138 = true;
} else {

i7138 = false;

}
i7139 = i7138;
} else {

i7139 = false;

}
final Object i7144;
if ((boolean)i7139) {
final Object f7140 = Snd.LAMBDA.apply(v6925);
final Object f7141 = Snd.LAMBDA.apply(f7140);

i7144 = f7141;
} else {

final Object i7143;
if ((boolean)true) {
final Object f7142 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("third"));

i7143 = f7142;
} else {

throw new SimpleError((String)"True condition not found.");


}
i7144 = i7143;

}
i7145 = i7144;

}
    return i7145;

}
}
