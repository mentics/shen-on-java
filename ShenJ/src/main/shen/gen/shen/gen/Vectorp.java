package shen.gen;



import com.mentics.shen.*;

public class Vectorp {

public static final Symbol SYMBOL = RuntimeContext.symbol("vectorp");
public static final Lambda LAMBDA = new Lambda1() {
public Object apply(final Object v851) throws Exception {
return defined(v851);
}};
public static Object defined(final Object v851) throws Exception {
final Object f852 = Vector.LAMBDA.apply(0);

final Object i876;
if ((boolean)Lang.equals(f852, v851)) {
final Object f853 = Vector.LAMBDA.apply(0);

i876 = f853;
} else {
final Object f854 = ShenPlusvectorQ.LAMBDA.apply(v851);

final Object i875;
if ((boolean)f854) {
final Object f855 = Hdv.LAMBDA.apply(v851);


final Object f856 = Tlv.LAMBDA.apply(v851);
final Object f857 = Vectorp.LAMBDA.apply(f856);
final Object f858 = Atv.LAMBDA.apply(Primitives.plus.apply(f855, 1), f857);

i875 = f858;
} else {
final Object f859 = ShenPlusvectorQ.LAMBDA.apply(v851);

final Object i863;
if ((boolean)f859) {
final Object f860 = Tlv.LAMBDA.apply(v851);
final Object f861 = ShenPlusvectorQ.LAMBDA.apply(f860);

final Object i862;
if ((boolean)f861) {

i862 = true;
} else {

i862 = false;

}
i863 = i862;
} else {

i863 = false;

}
final Object i874;
if ((boolean)i863) {
final Object f864 = Hdv.LAMBDA.apply(v851);


final Object f865 = Tlv.LAMBDA.apply(v851);
final Object f866 = Hdv.LAMBDA.apply(f865);


final Object f867 = Tlv.LAMBDA.apply(v851);
final Object f868 = Tlv.LAMBDA.apply(f867);
final Object f869 = Vectorp.LAMBDA.apply(f868);
final Object f870 = Atv.LAMBDA.apply(Primitives.plus.apply(f866, 2), f869);
final Object f871 = Atv.LAMBDA.apply(Primitives.plus.apply(f864, 1), f870);

i874 = f871;
} else {

final Object i873;
if ((boolean)true) {
final Object f872 = ShenF_error.LAMBDA.apply(RuntimeContext.symbol("vectorp"));

i873 = f872;
} else {

throw new SimpleError((String)"True condition not found.");


}
i874 = i873;

}
i875 = i874;

}
i876 = i875;

}
    return i876;

}
}
