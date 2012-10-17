package shen.gen;



import com.mentics.shen.*;

public class ShenAexprZ {

public static final Symbol SYMBOL = RuntimeContext.symbol("shen-<expr>");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v1555) throws Exception {
return defined(v1555);
}};
public static Object defined(final Object v1555) throws Exception {
final Object f5927 = Fst.LAMBDA.apply(v1555);


final Object i5946;
if ((boolean)(f5927 instanceof Cons)) {
final Object f5928 = Fst.LAMBDA.apply(v1555);

final Object f5929 = Snd.LAMBDA.apply(v1555);
final Object f5930 = ShenReassemble.LAMBDA.apply(((Cons)f5928).tail, f5929);
final Object f5931 = Fst.LAMBDA.apply(f5930);
final Object f5932 = Fst.LAMBDA.apply(v1555);





final Object f5933 = ElementQ.LAMBDA.apply(((Cons)f5932).head, new Cons(RuntimeContext.symbol(">>"), new Cons(RuntimeContext.symbol(";"), Nil.NIL)));

final Object i5941;
if ((boolean)f5933) {

i5941 = true;
} else {
final Object f5934 = Fst.LAMBDA.apply(v1555);

final Object f5935 = ShenSingleunderlineQ.LAMBDA.apply(((Cons)f5934).head);

final Object i5939;
if ((boolean)f5935) {

i5939 = true;
} else {
final Object f5936 = Fst.LAMBDA.apply(v1555);

final Object f5937 = ShenDoubleunderlineQ.LAMBDA.apply(((Cons)f5936).head);

final Object i5938;
if ((boolean)f5937) {

i5938 = true;
} else {

i5938 = false;

}
i5939 = i5938;

}
final Object i5940;
if ((boolean)i5939) {

i5940 = true;
} else {

i5940 = false;

}
i5941 = i5940;

}
final Object i5944;
if ((boolean)i5941) {

i5944 = null;
} else {
final Object f5942 = Fst.LAMBDA.apply(v1555);

final Object f5943 = ShenRemoveBar.LAMBDA.apply(((Cons)f5942).head);

i5944 = f5943;

}final Object f5945 = ShenReassemble.LAMBDA.apply(f5931, i5944);

i5946 = f5945;
} else {

i5946 = null;

}
final Object result5926 = i5946;

final Object i5947;
if ((boolean)Lang.equals(result5926, null)) {

i5947 = null;
} else {

i5947 = result5926;

}

    return i5947;

}
}
